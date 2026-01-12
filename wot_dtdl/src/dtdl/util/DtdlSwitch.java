/**
 */
package dtdl.util;

import dtdl.Array;
import dtdl.Command;
import dtdl.CommandPayload;
import dtdl.ComplexSchema;
import dtdl.ContentElement;
import dtdl.DtdlPackage;
import dtdl.Element;
import dtdl.EnumValue;
import dtdl.Field;
import dtdl.Interface;
import dtdl.PrimitiveSchema;
import dtdl.Property;
import dtdl.Relationship;
import dtdl.Schema;
import dtdl.Telemetry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dtdl.DtdlPackage
 * @generated
 */
public class DtdlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DtdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtdlSwitch() {
		if (modelPackage == null) {
			modelPackage = DtdlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DtdlPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.CONTENT_ELEMENT: {
				ContentElement contentElement = (ContentElement)theEObject;
				T result = caseContentElement(contentElement);
				if (result == null) result = caseElement(contentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseElement(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.TELEMETRY: {
				Telemetry telemetry = (Telemetry)theEObject;
				T result = caseTelemetry(telemetry);
				if (result == null) result = caseContentElement(telemetry);
				if (result == null) result = caseElement(telemetry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = caseContentElement(property);
				if (result == null) result = caseElement(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.COMMAND: {
				Command command = (Command)theEObject;
				T result = caseCommand(command);
				if (result == null) result = caseContentElement(command);
				if (result == null) result = caseElement(command);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseContentElement(relationship);
				if (result == null) result = caseElement(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.COMMAND_PAYLOAD: {
				CommandPayload commandPayload = (CommandPayload)theEObject;
				T result = caseCommandPayload(commandPayload);
				if (result == null) result = caseElement(commandPayload);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseElement(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.PRIMITIVE_SCHEMA: {
				PrimitiveSchema primitiveSchema = (PrimitiveSchema)theEObject;
				T result = casePrimitiveSchema(primitiveSchema);
				if (result == null) result = caseSchema(primitiveSchema);
				if (result == null) result = caseElement(primitiveSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.COMPLEX_SCHEMA: {
				ComplexSchema complexSchema = (ComplexSchema)theEObject;
				T result = caseComplexSchema(complexSchema);
				if (result == null) result = caseSchema(complexSchema);
				if (result == null) result = caseElement(complexSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = caseComplexSchema(array);
				if (result == null) result = caseSchema(array);
				if (result == null) result = caseElement(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.OBJECT: {
				dtdl.Object object = (dtdl.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseComplexSchema(object);
				if (result == null) result = caseSchema(object);
				if (result == null) result = caseElement(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = caseElement(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.ENUM: {
				dtdl.Enum enum_ = (dtdl.Enum)theEObject;
				T result = caseEnum(enum_);
				if (result == null) result = caseComplexSchema(enum_);
				if (result == null) result = caseSchema(enum_);
				if (result == null) result = caseElement(enum_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DtdlPackage.ENUM_VALUE: {
				EnumValue enumValue = (EnumValue)theEObject;
				T result = caseEnumValue(enumValue);
				if (result == null) result = caseElement(enumValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentElement(ContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Telemetry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Telemetry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTelemetry(Telemetry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommand(Command object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Payload</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Payload</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandPayload(CommandPayload object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveSchema(PrimitiveSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexSchema(ComplexSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(dtdl.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnum(dtdl.Enum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumValue(EnumValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DtdlSwitch
