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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dtdl.DtdlPackage
 * @generated
 */
public class DtdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DtdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DtdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DtdlSwitch<Adapter> modelSwitch =
		new DtdlSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseContentElement(ContentElement object) {
				return createContentElementAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseTelemetry(Telemetry object) {
				return createTelemetryAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseCommand(Command object) {
				return createCommandAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseCommandPayload(CommandPayload object) {
				return createCommandPayloadAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter casePrimitiveSchema(PrimitiveSchema object) {
				return createPrimitiveSchemaAdapter();
			}
			@Override
			public Adapter caseComplexSchema(ComplexSchema object) {
				return createComplexSchemaAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseObject(dtdl.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseEnum(dtdl.Enum object) {
				return createEnumAdapter();
			}
			@Override
			public Adapter caseEnumValue(EnumValue object) {
				return createEnumValueAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Telemetry <em>Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Telemetry
	 * @generated
	 */
	public Adapter createTelemetryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.CommandPayload <em>Command Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.CommandPayload
	 * @generated
	 */
	public Adapter createCommandPayloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.PrimitiveSchema <em>Primitive Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.PrimitiveSchema
	 * @generated
	 */
	public Adapter createPrimitiveSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.ComplexSchema <em>Complex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.ComplexSchema
	 * @generated
	 */
	public Adapter createComplexSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dtdl.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dtdl.EnumValue
	 * @generated
	 */
	public Adapter createEnumValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DtdlAdapterFactory
