# Guia Completo: Criar Projeto Acceleo M2T (Model-to-Text)

Este guia documenta o processo de criação de uma transformação Model-to-Text usando Eclipse Acceleo, baseado no projeto `wot2dtdl.m2t` que transforma modelos DTDL (XMI) em arquivos JSON.

---

## Visão Geral do Fluxo MDD

```
Modelo XMI (entrada) → [Acceleo Template] → Arquivo Texto (saída)
     ↓                        ↓                      ↓
 dtdl.xmi              generateDTDL.mtl         dtdl.json
```

---

## Parte 1: Pré-requisitos

### 1.1 Software Necessário
- **Eclipse IDE for Java and DSL Developers** (2023-12 ou mais recente)
- **Acceleo** (plugin Eclipse)
- **EMF** (Eclipse Modeling Framework - já incluso no Eclipse Modeling)

### 1.2 Verificar/Instalar Acceleo
1. `Help → Eclipse Marketplace...`
2. Buscar "Acceleo"
3. Instalar "Acceleo" (versão 3.7.x)
4. Reiniciar Eclipse

### 1.3 Ter um Metamodelo Disponível
Você precisa de um metamodelo `.ecore` registrado no workspace. Neste projeto usamos:
- **URI**: `http://example.org/dtdl`
- **Arquivo**: `/wot_dtdl/metamodels/dtdl.ecore`

---

## Parte 2: Criar o Projeto Acceleo

### 2.1 Novo Projeto
1. `File → New → Project...`
2. Expandir `Acceleo` → Selecionar `Acceleo Project`
3. Clicar `Next`

### 2.2 Configurar o Projeto
- **Project name**: `wot2dtdl.m2t` (ou nome desejado)
- **Use default location**: ✓
- Clicar `Next`

### 2.3 Configurar o Módulo Acceleo
- **Module Name**: `generateDTDL`
- **Metamodel URI**: Clicar `+` e selecionar `http://example.org/dtdl`
- **Module File Template**: `Default template`
- **Type**: `Interface` (classe raiz do metamodelo)
- **Generate file**: ✓
- Clicar `Finish`

### 2.4 Estrutura do Projeto Criado
```
wot2dtdl.m2t/
├── src/
│   └── generator/
│       ├── generateDTDL.mtl    ← Template Acceleo
│       └── GenerateDTDL.java   ← Classe Java para execução
├── META-INF/
│   └── MANIFEST.MF             ← Dependências do plugin
├── build.properties
└── .project
```

---

## Parte 3: Estrutura do Template Acceleo (.mtl)

### 3.1 Anatomia de um Arquivo .mtl

```acceleo
[comment encoding = UTF-8 /]
[module generateDTDL('http://example.org/dtdl')/]

[comment ========= QUERIES (Funções Auxiliares) ========= /]

[query public minhaFuncao(s : String) : String =
    s.substituteAll(':', '_')
/]

[comment ========= TEMPLATE PRINCIPAL ========= /]

[template public generateElement(i : Interface)]
[comment @main /]
[file (i.id.concat('.json'), false, 'UTF-8')]
Conteúdo do arquivo aqui
[/file]
[/template]

[comment ========= TEMPLATES AUXILIARES ========= /]

[template public outroTemplate(p : Property)]
...
[/template]
```

### 3.2 Elementos Essenciais

| Elemento | Sintaxe | Descrição |
|----------|---------|-----------|
| Módulo | `[module nome('uri')/]` | Declara o módulo e metamodelo |
| Template | `[template public nome(param : Tipo)]` | Define um template |
| Query | `[query public nome(p : Tipo) : TipoRetorno = expr/]` | Função auxiliar |
| Arquivo | `[file (nome, append, encoding)]...[/file]` | Gera arquivo de saída |
| Loop | `[for (item \| colecao)]...[/for]` | Itera sobre coleção |
| Condicional | `[if (cond)]...[elseif]...[else]...[/if]` | Condicional |
| Impressão | `[valor/]` | Imprime valor no output |
| Separador | `[for (x \| col) separator(',')]` | Separador entre iterações |

### 3.3 O Marcador @main

**CRÍTICO**: O `[comment @main /]` deve estar **dentro** do template principal, logo após a declaração:

```acceleo
[template public generateElement(i : Interface)]
[comment @main /]    ← AQUI, dentro do template!
[file ...]
```

Se estiver fora do template, o Acceleo não encontrará o ponto de entrada.

---

## Parte 4: Template Completo (Exemplo Real)

### 4.1 Arquivo: `generateDTDL.mtl`

```acceleo
[comment encoding = UTF-8 /]
[module generateDTDL('http://example.org/dtdl')/]

[comment ========= HELPERS ========= /]

[query public esc(s : String) : String =
  if s.oclIsUndefined() then ''
  else
    s.substituteAll('\\', '\\\\')
     .substituteAll('"', '\\"')
     .substituteAll('\n', '\\n')
  endif
/]

[query public safeFileName(id : String) : String =
  id.substituteAll(':', '_').substituteAll(';', '_')
/]

[query public primTypeToJson(t : PrimitiveType) : String =
  if t = PrimitiveType::BOOLEAN then 'boolean'
  else if t = PrimitiveType::INTEGER then 'integer'
  else if t = PrimitiveType::DOUBLE then 'double'
  else 'string'
  endif endif endif
/]

[comment ========= TEMPLATE PRINCIPAL ========= /]

[template public generateElement(i : Interface)]
[comment @main /]
[file (i.id.safeFileName().concat('.json'), false, 'UTF-8')]
{
  "@context": "dtmi:dtdl:context;3",
  "@id": "[i.id.esc()/]",
  "@type": "Interface",
  "displayName": "[i.displayName.esc()/]",
  "contents": ['['/]
[for (c : ContentElement | i.contents) separator(',')]
    [c.toJson()/]
[/for]
  [']'/]
}
[/file]
[/template]

[comment ========= DISPATCHER POLIMÓRFICO ========= /]

[template public toJson(c : ContentElement)]
[if (c.oclIsKindOf(Property))]
[c.oclAsType(Property).propertyToJson()/]
[elseif (c.oclIsKindOf(Telemetry))]
[c.oclAsType(Telemetry).telemetryToJson()/]
[elseif (c.oclIsKindOf(Relationship))]
[c.oclAsType(Relationship).relationshipToJson()/]
[/if]
[/template]

[comment ========= TEMPLATES ESPECÍFICOS ========= /]

[template public propertyToJson(p : Property)]
{
  "@type": "Property",
  "name": "[p.name.esc()/]",
  "schema": "[p.schema.oclAsType(PrimitiveSchema).type.primTypeToJson()/]"
}
[/template]

[template public telemetryToJson(t : Telemetry)]
{
  "@type": "Telemetry",
  "name": "[t.name.esc()/]",
  "schema": "[t.schema.oclAsType(PrimitiveSchema).type.primTypeToJson()/]"
}
[/template]

[template public relationshipToJson(r : Relationship)]
{
  "@type": "Relationship",
  "name": "[r.name.esc()/]",
  "target": "[r.targetId.esc()/]"
}
[/template]
```

---

## Parte 5: Configurar a Classe Java

### 5.1 Registrar o Metamodelo (GenerateDTDL.java)

O Acceleo gera uma classe Java. Para execução standalone, você precisa registrar o metamodelo.

Localizar o método `registerPackages` e modificar:

```java
/**
 * @generated NOT
 */
@Override
public void registerPackages(ResourceSet resourceSet) {
    super.registerPackages(resourceSet);

    // Registrar factories
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
        .put("ecore", new EcoreResourceFactoryImpl());
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
        .put("xmi", new XMIResourceFactoryImpl());

    // Carregar e registrar o metamodelo
    try {
        URI ecoreURI = URI.createFileURI(
            "/caminho/absoluto/para/metamodelo.ecore"
        );

        Resource ecoreResource = resourceSet.getResource(ecoreURI, true);
        ecoreResource.load(null);

        for (EObject obj : ecoreResource.getContents()) {
            if (obj instanceof EPackage) {
                EPackage pkg = (EPackage) obj;
                EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
                resourceSet.getPackageRegistry().put(pkg.getNsURI(), pkg);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
```

**IMPORTANTE**: Mudar `@generated` para `@generated NOT` no JavaDoc para evitar que o Acceleo sobrescreva suas modificações.

---

## Parte 6: Executar a Transformação

### 6.1 Criar Run Configuration

1. `Run → Run Configurations...`
2. Clique direito em `Java Application` → `New Configuration`
3. Configure:
   - **Name**: `GenerateDTDL`
   - **Project**: `wot2dtdl.m2t`
   - **Main class**: `generator.GenerateDTDL`

### 6.2 Configurar Arguments

Na aba `Arguments`, em "Program arguments":
```
/caminho/para/modelo.xmi /caminho/para/pasta/output
```

Exemplo:
```
/Users/isisduarte/eclipse-workspace/wot_dtdl/models/house-dtdl.xmi /Users/isisduarte/eclipse-workspace/wot2dtdl.m2t/output
```

### 6.3 Executar

1. Clicar `Run`
2. Verificar o Console para mensagens de debug
3. Verificar a pasta output para o arquivo gerado

---

## Parte 7: Troubleshooting

### 7.1 Erros Comuns e Soluções

| Erro | Causa | Solução |
|------|-------|---------|
| `PackageNotFoundException` | Metamodelo não registrado | Modificar `registerPackages()` |
| `No model elements that matches` | `@main` fora do template | Mover `@main` para dentro do template |
| `NoClassDefFoundError` | Dependências faltando | Usar Java Application runner ou adicionar JARs |
| `UnsupportedClassVersionError` | Versão Java incompatível | Verificar Java Compiler compliance |
| Arquivo não gerado | Template com erro | Verificar sintaxe do `.mtl` |

### 7.2 Adicionar Debug

Para debugar, adicione prints no método `doGenerate`:

```java
@Override
public void doGenerate(Monitor monitor) throws IOException {
    System.out.println("=== ACCELEO GENERATION START ===");
    // ... código de debug ...
    super.doGenerate(monitor);
    System.out.println("=== ACCELEO GENERATION END ===");
}
```

---

## Parte 8: Sintaxe OCL no Acceleo

### 8.1 Operações Comuns

```acceleo
[comment Verificar se não é undefined /]
[if (not valor.oclIsUndefined())]

[comment Verificar tipo /]
[if (elemento.oclIsKindOf(Property))]

[comment Cast para tipo específico /]
[elemento.oclAsType(Property).nome/]

[comment Filtrar coleção /]
[colecao->select(x | x.oclIsKindOf(Property))/]

[comment Verificar se coleção não está vazia /]
[if (not colecao->isEmpty())]

[comment Tamanho da coleção /]
[colecao->size()/]

[comment Primeiro elemento /]
[colecao->first()/]
```

### 8.2 Operações de String

```acceleo
[s.concat('sufixo')/]           [comment Concatenar /]
[s.substituteAll('a', 'b')/]    [comment Substituir /]
[s.size()/]                      [comment Tamanho /]
[s.substring(1, 5)/]             [comment Substring /]
[s.toUpper()/]                   [comment Maiúsculas /]
[s.toLower()/]                   [comment Minúsculas /]
[s.trim()/]                      [comment Remover espaços /]
```

---

## Parte 9: Boas Práticas

### 9.1 Organização do Template

1. **Queries primeiro**: Defina todas as funções auxiliares no início
2. **Template principal com @main**: Um único ponto de entrada
3. **Templates auxiliares**: Separe a lógica em templates menores
4. **Dispatcher polimórfico**: Use `oclIsKindOf` para tratar tipos diferentes

### 9.2 Tratamento de Null/Undefined

Sempre verifique antes de acessar valores opcionais:

```acceleo
[if (not valor.oclIsUndefined() and valor <> '')]
  "campo": "[valor/]"
[/if]
```

### 9.3 Formatação JSON

Use `separator` para vírgulas entre elementos:

```acceleo
[for (item | colecao) separator(',')]
  [item.toJson()/]
[/for]
```

---

## Resumo: Checklist de Criação

- [ ] Instalar Acceleo no Eclipse
- [ ] Ter metamodelo `.ecore` disponível
- [ ] Criar projeto Acceleo
- [ ] Configurar módulo com URI do metamodelo
- [ ] Implementar template `.mtl` com `@main` dentro do template
- [ ] Modificar `registerPackages()` no Java (se standalone)
- [ ] Criar Run Configuration (Java Application)
- [ ] Configurar arguments (modelo e pasta output)
- [ ] Executar e validar output

---

## Referências

- [Documentação Oficial Acceleo](https://www.eclipse.org/acceleo/documentation/)
- [Acceleo User Guide](https://wiki.eclipse.org/Acceleo/User_Guide)
- [OCL Reference](https://www.omg.org/spec/OCL/)

---

*Documento criado baseado no projeto wot2dtdl.m2t - Transformação DTDL XMI → JSON*
