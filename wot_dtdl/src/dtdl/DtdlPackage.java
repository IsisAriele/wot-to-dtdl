/**
 */
package dtdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dtdl.DtdlFactory
 * @model kind="package"
 * @generated
 */
public interface DtdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dtdl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/dtdl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dtdl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtdlPackage eINSTANCE = dtdl.impl.DtdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link dtdl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.ElementImpl
	 * @see dtdl.impl.DtdlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.ContentElementImpl <em>Content Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.ContentElementImpl
	 * @see dtdl.impl.DtdlPackageImpl#getContentElement()
	 * @generated
	 */
	int CONTENT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Content Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_ELEMENT_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.InterfaceImpl
	 * @see dtdl.impl.DtdlPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTENTS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.TelemetryImpl <em>Telemetry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.TelemetryImpl
	 * @see dtdl.impl.DtdlPackageImpl#getTelemetry()
	 * @generated
	 */
	int TELEMETRY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__ID = CONTENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__DISPLAY_NAME = CONTENT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__DESCRIPTION = CONTENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__NAME = CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY__SCHEMA = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Telemetry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMETRY_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.PropertyImpl
	 * @see dtdl.impl.DtdlPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__ID = CONTENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DISPLAY_NAME = CONTENT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__DESCRIPTION = CONTENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__WRITABLE = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__SCHEMA = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.CommandImpl
	 * @see dtdl.impl.DtdlPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__ID = CONTENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DISPLAY_NAME = CONTENT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DESCRIPTION = CONTENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__NAME = CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__REQUEST = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__RESPONSE = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.RelationshipImpl
	 * @see dtdl.impl.DtdlPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = CONTENT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DISPLAY_NAME = CONTENT_ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = CONTENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = CONTENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = CONTENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET_ID = CONTENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MIN_MULTIPLICITY = CONTENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__MAX_MULTIPLICITY = CONTENT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__WRITABLE = CONTENT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = CONTENT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = CONTENT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.CommandPayloadImpl <em>Command Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.CommandPayloadImpl
	 * @see dtdl.impl.DtdlPackageImpl#getCommandPayload()
	 * @generated
	 */
	int COMMAND_PAYLOAD = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__NULLABLE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD__SCHEMA = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Command Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Command Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_PAYLOAD_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.SchemaImpl
	 * @see dtdl.impl.DtdlPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.PrimitiveSchemaImpl <em>Primitive Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.PrimitiveSchemaImpl
	 * @see dtdl.impl.DtdlPackageImpl#getPrimitiveSchema()
	 * @generated
	 */
	int PRIMITIVE_SCHEMA = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA__ID = SCHEMA__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA__DISPLAY_NAME = SCHEMA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA__DESCRIPTION = SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA__TYPE = SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SCHEMA_OPERATION_COUNT = SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.ComplexSchemaImpl <em>Complex Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.ComplexSchemaImpl
	 * @see dtdl.impl.DtdlPackageImpl#getComplexSchema()
	 * @generated
	 */
	int COMPLEX_SCHEMA = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA__ID = SCHEMA__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA__DISPLAY_NAME = SCHEMA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA__DESCRIPTION = SCHEMA__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Complex Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA_FEATURE_COUNT = SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Complex Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_SCHEMA_OPERATION_COUNT = SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.ArrayImpl
	 * @see dtdl.impl.DtdlPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ID = COMPLEX_SCHEMA__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DISPLAY_NAME = COMPLEX_SCHEMA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__DESCRIPTION = COMPLEX_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Element Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__ELEMENT_SCHEMA = COMPLEX_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = COMPLEX_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_OPERATION_COUNT = COMPLEX_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.ObjectImpl
	 * @see dtdl.impl.DtdlPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ID = COMPLEX_SCHEMA__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DISPLAY_NAME = COMPLEX_SCHEMA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__DESCRIPTION = COMPLEX_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__FIELDS = COMPLEX_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = COMPLEX_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = COMPLEX_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.FieldImpl
	 * @see dtdl.impl.DtdlPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCHEMA = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.EnumImpl
	 * @see dtdl.impl.DtdlPackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ID = COMPLEX_SCHEMA__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DISPLAY_NAME = COMPLEX_SCHEMA__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__DESCRIPTION = COMPLEX_SCHEMA__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Enum Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__ENUM_VALUES = COMPLEX_SCHEMA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUE_TYPE = COMPLEX_SCHEMA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = COMPLEX_SCHEMA_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = COMPLEX_SCHEMA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.impl.EnumValueImpl
	 * @see dtdl.impl.DtdlPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DISPLAY_NAME = ELEMENT__DISPLAY_NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ENUM_VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dtdl.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dtdl.PrimitiveType
	 * @see dtdl.impl.DtdlPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link dtdl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see dtdl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dtdl.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Element#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see dtdl.Element#getDisplayName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Element#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see dtdl.Element#getDescription()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Description();

	/**
	 * Returns the meta object for class '{@link dtdl.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Element</em>'.
	 * @see dtdl.ContentElement
	 * @generated
	 */
	EClass getContentElement();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.ContentElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dtdl.ContentElement#getName()
	 * @see #getContentElement()
	 * @generated
	 */
	EAttribute getContentElement_Name();

	/**
	 * Returns the meta object for class '{@link dtdl.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see dtdl.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link dtdl.Interface#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see dtdl.Interface#getContents()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Contents();

	/**
	 * Returns the meta object for class '{@link dtdl.Telemetry <em>Telemetry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Telemetry</em>'.
	 * @see dtdl.Telemetry
	 * @generated
	 */
	EClass getTelemetry();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Telemetry#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see dtdl.Telemetry#getSchema()
	 * @see #getTelemetry()
	 * @generated
	 */
	EReference getTelemetry_Schema();

	/**
	 * Returns the meta object for class '{@link dtdl.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see dtdl.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Property#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see dtdl.Property#isWritable()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Writable();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Property#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see dtdl.Property#getSchema()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Schema();

	/**
	 * Returns the meta object for class '{@link dtdl.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see dtdl.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Command#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request</em>'.
	 * @see dtdl.Command#getRequest()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Request();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Command#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see dtdl.Command#getResponse()
	 * @see #getCommand()
	 * @generated
	 */
	EReference getCommand_Response();

	/**
	 * Returns the meta object for class '{@link dtdl.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see dtdl.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link dtdl.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dtdl.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Relationship#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see dtdl.Relationship#getTargetId()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_TargetId();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Multiplicity</em>'.
	 * @see dtdl.Relationship#getMinMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_MinMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Multiplicity</em>'.
	 * @see dtdl.Relationship#getMaxMultiplicity()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_MaxMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Relationship#isWritable <em>Writable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writable</em>'.
	 * @see dtdl.Relationship#isWritable()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Writable();

	/**
	 * Returns the meta object for class '{@link dtdl.CommandPayload <em>Command Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Payload</em>'.
	 * @see dtdl.CommandPayload
	 * @generated
	 */
	EClass getCommandPayload();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.CommandPayload#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see dtdl.CommandPayload#isNullable()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EAttribute getCommandPayload_Nullable();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.CommandPayload#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see dtdl.CommandPayload#getSchema()
	 * @see #getCommandPayload()
	 * @generated
	 */
	EReference getCommandPayload_Schema();

	/**
	 * Returns the meta object for class '{@link dtdl.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see dtdl.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for class '{@link dtdl.PrimitiveSchema <em>Primitive Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Schema</em>'.
	 * @see dtdl.PrimitiveSchema
	 * @generated
	 */
	EClass getPrimitiveSchema();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.PrimitiveSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dtdl.PrimitiveSchema#getType()
	 * @see #getPrimitiveSchema()
	 * @generated
	 */
	EAttribute getPrimitiveSchema_Type();

	/**
	 * Returns the meta object for class '{@link dtdl.ComplexSchema <em>Complex Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Schema</em>'.
	 * @see dtdl.ComplexSchema
	 * @generated
	 */
	EClass getComplexSchema();

	/**
	 * Returns the meta object for class '{@link dtdl.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see dtdl.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Array#getElementSchema <em>Element Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Schema</em>'.
	 * @see dtdl.Array#getElementSchema()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_ElementSchema();

	/**
	 * Returns the meta object for class '{@link dtdl.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see dtdl.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the containment reference list '{@link dtdl.Object#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see dtdl.Object#getFields()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Fields();

	/**
	 * Returns the meta object for class '{@link dtdl.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see dtdl.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dtdl.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link dtdl.Field#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see dtdl.Field#getSchema()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Schema();

	/**
	 * Returns the meta object for class '{@link dtdl.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see dtdl.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the containment reference list '{@link dtdl.Enum#getEnumValues <em>Enum Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Values</em>'.
	 * @see dtdl.Enum#getEnumValues()
	 * @see #getEnum()
	 * @generated
	 */
	EReference getEnum_EnumValues();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.Enum#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see dtdl.Enum#getValueType()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_ValueType();

	/**
	 * Returns the meta object for class '{@link dtdl.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see dtdl.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.EnumValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dtdl.EnumValue#getName()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link dtdl.EnumValue#getEnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Value</em>'.
	 * @see dtdl.EnumValue#getEnumValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_EnumValue();

	/**
	 * Returns the meta object for enum '{@link dtdl.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see dtdl.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtdlFactory getDtdlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dtdl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.ElementImpl
		 * @see dtdl.impl.DtdlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DISPLAY_NAME = eINSTANCE.getElement_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

		/**
		 * The meta object literal for the '{@link dtdl.impl.ContentElementImpl <em>Content Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.ContentElementImpl
		 * @see dtdl.impl.DtdlPackageImpl#getContentElement()
		 * @generated
		 */
		EClass CONTENT_ELEMENT = eINSTANCE.getContentElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT_ELEMENT__NAME = eINSTANCE.getContentElement_Name();

		/**
		 * The meta object literal for the '{@link dtdl.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.InterfaceImpl
		 * @see dtdl.impl.DtdlPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONTENTS = eINSTANCE.getInterface_Contents();

		/**
		 * The meta object literal for the '{@link dtdl.impl.TelemetryImpl <em>Telemetry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.TelemetryImpl
		 * @see dtdl.impl.DtdlPackageImpl#getTelemetry()
		 * @generated
		 */
		EClass TELEMETRY = eINSTANCE.getTelemetry();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELEMETRY__SCHEMA = eINSTANCE.getTelemetry_Schema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.PropertyImpl
		 * @see dtdl.impl.DtdlPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__WRITABLE = eINSTANCE.getProperty_Writable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__SCHEMA = eINSTANCE.getProperty_Schema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.CommandImpl
		 * @see dtdl.impl.DtdlPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__REQUEST = eINSTANCE.getCommand_Request();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND__RESPONSE = eINSTANCE.getCommand_Response();

		/**
		 * The meta object literal for the '{@link dtdl.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.RelationshipImpl
		 * @see dtdl.impl.DtdlPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Target Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TARGET_ID = eINSTANCE.getRelationship_TargetId();

		/**
		 * The meta object literal for the '<em><b>Min Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MIN_MULTIPLICITY = eINSTANCE.getRelationship_MinMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Max Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__MAX_MULTIPLICITY = eINSTANCE.getRelationship_MaxMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Writable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__WRITABLE = eINSTANCE.getRelationship_Writable();

		/**
		 * The meta object literal for the '{@link dtdl.impl.CommandPayloadImpl <em>Command Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.CommandPayloadImpl
		 * @see dtdl.impl.DtdlPackageImpl#getCommandPayload()
		 * @generated
		 */
		EClass COMMAND_PAYLOAD = eINSTANCE.getCommandPayload();

		/**
		 * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_PAYLOAD__NULLABLE = eINSTANCE.getCommandPayload_Nullable();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_PAYLOAD__SCHEMA = eINSTANCE.getCommandPayload_Schema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.SchemaImpl
		 * @see dtdl.impl.DtdlPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.PrimitiveSchemaImpl <em>Primitive Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.PrimitiveSchemaImpl
		 * @see dtdl.impl.DtdlPackageImpl#getPrimitiveSchema()
		 * @generated
		 */
		EClass PRIMITIVE_SCHEMA = eINSTANCE.getPrimitiveSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_SCHEMA__TYPE = eINSTANCE.getPrimitiveSchema_Type();

		/**
		 * The meta object literal for the '{@link dtdl.impl.ComplexSchemaImpl <em>Complex Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.ComplexSchemaImpl
		 * @see dtdl.impl.DtdlPackageImpl#getComplexSchema()
		 * @generated
		 */
		EClass COMPLEX_SCHEMA = eINSTANCE.getComplexSchema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.ArrayImpl
		 * @see dtdl.impl.DtdlPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '<em><b>Element Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__ELEMENT_SCHEMA = eINSTANCE.getArray_ElementSchema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.ObjectImpl
		 * @see dtdl.impl.DtdlPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__FIELDS = eINSTANCE.getObject_Fields();

		/**
		 * The meta object literal for the '{@link dtdl.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.FieldImpl
		 * @see dtdl.impl.DtdlPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD__SCHEMA = eINSTANCE.getField_Schema();

		/**
		 * The meta object literal for the '{@link dtdl.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.EnumImpl
		 * @see dtdl.impl.DtdlPackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Enum Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM__ENUM_VALUES = eINSTANCE.getEnum_EnumValues();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__VALUE_TYPE = eINSTANCE.getEnum_ValueType();

		/**
		 * The meta object literal for the '{@link dtdl.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.impl.EnumValueImpl
		 * @see dtdl.impl.DtdlPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__NAME = eINSTANCE.getEnumValue_Name();

		/**
		 * The meta object literal for the '<em><b>Enum Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__ENUM_VALUE = eINSTANCE.getEnumValue_EnumValue();

		/**
		 * The meta object literal for the '{@link dtdl.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dtdl.PrimitiveType
		 * @see dtdl.impl.DtdlPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //DtdlPackage
