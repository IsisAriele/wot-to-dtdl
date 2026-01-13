# WoT to DTDL

Ferramenta de transformação baseada em Model-Driven Development (MDD) que converte descrições W3C Web of Things (WoT) Thing Description em modelos Digital Twins Definition Language (DTDL).

## Contexto

Este projeto foi desenvolvido como parte da disciplina de Tópicos Avançados em Sistemas Integrados e Distribuídos do Mestrado em Sistemas e Computação da UFRN. O objetivo é viabilizar a interoperabilidade entre o padrão WoT TD, amplamente utilizado para descrever dispositivos IoT, e a linguagem DTDL, utilizada para modelagem de gêmeos digitais.

## Estrutura do Projeto
```
wot-to-dtdl/
├── wot_dtdl/            # Projeto de transformação Model-to-Model (M2M)
└── wot2dtdl.m2t/        # Projeto de geração Model-to-Text (M2T)
```

### wot_dtdl

Projeto Eclipse contendo os metamodelos e a transformação ATL:

- **metamodels/**: Metamodelos Ecore (`wot.ecore` e `dtdl.ecore`)
- **models/**: Instâncias de modelos WoT e DTDL em XMI
- **transformations/**: Módulo ATL (`wot2dtdl.atl`) com as regras de transformação

### wot2dtdl.m2t

Projeto Acceleo para geração dos arquivos JSON-LD:

- **output/**: Arquivos DTDL em JSON-LD gerados pela transformação

## Tecnologias

- Eclipse Modeling Framework (EMF)
- ATL (Atlas Transformation Language)
- Acceleo

## Exemplo

O projeto inclui um cenário de casa inteligente com as seguintes entidades:

- **House**: Casa com nome e endereço
- **Room**: Cômodo com tamanho e sensor de temperatura
- **LightBulb**: Lâmpada inteligente
- **AirConditioner**: Ar-condicionado inteligente
