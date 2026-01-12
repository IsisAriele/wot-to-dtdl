/**
 */
package wot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see wot.WotFactory
 * @model kind="package"
 * @generated
 */
public interface WotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/wot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WotPackage eINSTANCE = wot.impl.WotPackageImpl.init();

	/**
	 * The meta object id for the '{@link wot.impl.ThingImpl <em>Thing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.ThingImpl
	 * @see wot.impl.WotPackageImpl#getThing()
	 * @generated
	 */
	int THING = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__BASE = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__ACTIONS = 5;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__EVENTS = 6;

	/**
	 * The feature id for the '<em><b>Security Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__SECURITY_DEFINITIONS = 7;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING__LINKS = 8;

	/**
	 * The number of structural features of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Thing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.InteractionAffordanceImpl
	 * @see wot.impl.WotPackageImpl#getInteractionAffordance()
	 * @generated
	 */
	int INTERACTION_AFFORDANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE__FORMS = 3;

	/**
	 * The number of structural features of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interaction Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_AFFORDANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.PropertyAffordanceImpl
	 * @see wot.impl.WotPackageImpl#getPropertyAffordance()
	 * @generated
	 */
	int PROPERTY_AFFORDANCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__NAME = INTERACTION_AFFORDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__OBSERVABLE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__READ_ONLY = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__WRITE_ONLY = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE__SCHEMA = INTERACTION_AFFORDANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wot.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.ActionAffordanceImpl
	 * @see wot.impl.WotPackageImpl#getActionAffordance()
	 * @generated
	 */
	int ACTION_AFFORDANCE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__NAME = INTERACTION_AFFORDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__SAFE = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__IDEMPOTENT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__INPUT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE__OUTPUT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Action Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wot.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.EventAffordanceImpl
	 * @see wot.impl.WotPackageImpl#getEventAffordance()
	 * @generated
	 */
	int EVENT_AFFORDANCE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__NAME = INTERACTION_AFFORDANCE__NAME;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__TITLE = INTERACTION_AFFORDANCE__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__DESCRIPTION = INTERACTION_AFFORDANCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__FORMS = INTERACTION_AFFORDANCE__FORMS;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE__DATA = INTERACTION_AFFORDANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_FEATURE_COUNT = INTERACTION_AFFORDANCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Affordance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_AFFORDANCE_OPERATION_COUNT = INTERACTION_AFFORDANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wot.impl.DataSchemaImpl <em>Data Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.DataSchemaImpl
	 * @see wot.impl.WotPackageImpl#getDataSchema()
	 * @generated
	 */
	int DATA_SCHEMA = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__UNIT = 3;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__READ_ONLY = 4;

	/**
	 * The feature id for the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__WRITE_ONLY = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA__ITEMS = 7;

	/**
	 * The number of structural features of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Data Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.SecuritySchemeImpl
	 * @see wot.impl.WotPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 6;

	/**
	 * The feature id for the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCHEME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.FormImpl
	 * @see wot.impl.WotPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 7;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__HREF = 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__CONTENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__OP = 2;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.LinkImpl
	 * @see wot.impl.WotPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__HREF = 0;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REL = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Anchor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANCHOR = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wot.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wot.impl.FieldImpl
	 * @see wot.impl.WotPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__SCHEMA = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link wot.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thing</em>'.
	 * @see wot.Thing
	 * @generated
	 */
	EClass getThing();

	/**
	 * Returns the meta object for the attribute '{@link wot.Thing#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see wot.Thing#getId()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Id();

	/**
	 * Returns the meta object for the attribute '{@link wot.Thing#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wot.Thing#getTitle()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Title();

	/**
	 * Returns the meta object for the attribute '{@link wot.Thing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wot.Thing#getDescription()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Description();

	/**
	 * Returns the meta object for the attribute '{@link wot.Thing#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base</em>'.
	 * @see wot.Thing#getBase()
	 * @see #getThing()
	 * @generated
	 */
	EAttribute getThing_Base();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.Thing#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see wot.Thing#getProperties()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.Thing#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see wot.Thing#getActions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.Thing#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see wot.Thing#getEvents()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Events();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.Thing#getSecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Definitions</em>'.
	 * @see wot.Thing#getSecurityDefinitions()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_SecurityDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.Thing#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see wot.Thing#getLinks()
	 * @see #getThing()
	 * @generated
	 */
	EReference getThing_Links();

	/**
	 * Returns the meta object for class '{@link wot.InteractionAffordance <em>Interaction Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Affordance</em>'.
	 * @see wot.InteractionAffordance
	 * @generated
	 */
	EClass getInteractionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link wot.InteractionAffordance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wot.InteractionAffordance#getName()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Name();

	/**
	 * Returns the meta object for the attribute '{@link wot.InteractionAffordance#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wot.InteractionAffordance#getTitle()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Title();

	/**
	 * Returns the meta object for the attribute '{@link wot.InteractionAffordance#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wot.InteractionAffordance#getDescription()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EAttribute getInteractionAffordance_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.InteractionAffordance#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see wot.InteractionAffordance#getForms()
	 * @see #getInteractionAffordance()
	 * @generated
	 */
	EReference getInteractionAffordance_Forms();

	/**
	 * Returns the meta object for class '{@link wot.PropertyAffordance <em>Property Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Affordance</em>'.
	 * @see wot.PropertyAffordance
	 * @generated
	 */
	EClass getPropertyAffordance();

	/**
	 * Returns the meta object for the attribute '{@link wot.PropertyAffordance#isObservable <em>Observable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Observable</em>'.
	 * @see wot.PropertyAffordance#isObservable()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_Observable();

	/**
	 * Returns the meta object for the attribute '{@link wot.PropertyAffordance#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see wot.PropertyAffordance#isReadOnly()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link wot.PropertyAffordance#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see wot.PropertyAffordance#isWriteOnly()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EAttribute getPropertyAffordance_WriteOnly();

	/**
	 * Returns the meta object for the containment reference '{@link wot.PropertyAffordance#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see wot.PropertyAffordance#getSchema()
	 * @see #getPropertyAffordance()
	 * @generated
	 */
	EReference getPropertyAffordance_Schema();

	/**
	 * Returns the meta object for class '{@link wot.ActionAffordance <em>Action Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Affordance</em>'.
	 * @see wot.ActionAffordance
	 * @generated
	 */
	EClass getActionAffordance();

	/**
	 * Returns the meta object for the attribute '{@link wot.ActionAffordance#isSafe <em>Safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe</em>'.
	 * @see wot.ActionAffordance#isSafe()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Safe();

	/**
	 * Returns the meta object for the attribute '{@link wot.ActionAffordance#isIdempotent <em>Idempotent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idempotent</em>'.
	 * @see wot.ActionAffordance#isIdempotent()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EAttribute getActionAffordance_Idempotent();

	/**
	 * Returns the meta object for the containment reference '{@link wot.ActionAffordance#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see wot.ActionAffordance#getInput()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EReference getActionAffordance_Input();

	/**
	 * Returns the meta object for the containment reference '{@link wot.ActionAffordance#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see wot.ActionAffordance#getOutput()
	 * @see #getActionAffordance()
	 * @generated
	 */
	EReference getActionAffordance_Output();

	/**
	 * Returns the meta object for class '{@link wot.EventAffordance <em>Event Affordance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Affordance</em>'.
	 * @see wot.EventAffordance
	 * @generated
	 */
	EClass getEventAffordance();

	/**
	 * Returns the meta object for the containment reference '{@link wot.EventAffordance#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see wot.EventAffordance#getData()
	 * @see #getEventAffordance()
	 * @generated
	 */
	EReference getEventAffordance_Data();

	/**
	 * Returns the meta object for class '{@link wot.DataSchema <em>Data Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Schema</em>'.
	 * @see wot.DataSchema
	 * @generated
	 */
	EClass getDataSchema();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wot.DataSchema#getType()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Type();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see wot.DataSchema#getTitle()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wot.DataSchema#getDescription()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Description();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see wot.DataSchema#getUnit()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_Unit();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see wot.DataSchema#isReadOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_ReadOnly();

	/**
	 * Returns the meta object for the attribute '{@link wot.DataSchema#isWriteOnly <em>Write Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Write Only</em>'.
	 * @see wot.DataSchema#isWriteOnly()
	 * @see #getDataSchema()
	 * @generated
	 */
	EAttribute getDataSchema_WriteOnly();

	/**
	 * Returns the meta object for the containment reference list '{@link wot.DataSchema#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see wot.DataSchema#getProperties()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link wot.DataSchema#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Items</em>'.
	 * @see wot.DataSchema#getItems()
	 * @see #getDataSchema()
	 * @generated
	 */
	EReference getDataSchema_Items();

	/**
	 * Returns the meta object for class '{@link wot.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see wot.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link wot.SecurityScheme#getScheme <em>Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheme</em>'.
	 * @see wot.SecurityScheme#getScheme()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Scheme();

	/**
	 * Returns the meta object for the attribute '{@link wot.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see wot.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for class '{@link wot.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see wot.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link wot.Form#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see wot.Form#getHref()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Href();

	/**
	 * Returns the meta object for the attribute '{@link wot.Form#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see wot.Form#getContentType()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_ContentType();

	/**
	 * Returns the meta object for the attribute list '{@link wot.Form#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Op</em>'.
	 * @see wot.Form#getOp()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Op();

	/**
	 * Returns the meta object for class '{@link wot.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see wot.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the attribute '{@link wot.Link#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see wot.Link#getHref()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Href();

	/**
	 * Returns the meta object for the attribute '{@link wot.Link#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see wot.Link#getRel()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Rel();

	/**
	 * Returns the meta object for the attribute '{@link wot.Link#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see wot.Link#getType()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link wot.Link#getAnchor <em>Anchor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anchor</em>'.
	 * @see wot.Link#getAnchor()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Anchor();

	/**
	 * Returns the meta object for class '{@link wot.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see wot.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link wot.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wot.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the containment reference '{@link wot.Field#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see wot.Field#getSchema()
	 * @see #getField()
	 * @generated
	 */
	EReference getField_Schema();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WotFactory getWotFactory();

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
		 * The meta object literal for the '{@link wot.impl.ThingImpl <em>Thing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.ThingImpl
		 * @see wot.impl.WotPackageImpl#getThing()
		 * @generated
		 */
		EClass THING = eINSTANCE.getThing();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__ID = eINSTANCE.getThing_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__TITLE = eINSTANCE.getThing_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__DESCRIPTION = eINSTANCE.getThing_Description();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THING__BASE = eINSTANCE.getThing_Base();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__ACTIONS = eINSTANCE.getThing_Actions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__EVENTS = eINSTANCE.getThing_Events();

		/**
		 * The meta object literal for the '<em><b>Security Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__SECURITY_DEFINITIONS = eINSTANCE.getThing_SecurityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THING__LINKS = eINSTANCE.getThing_Links();

		/**
		 * The meta object literal for the '{@link wot.impl.InteractionAffordanceImpl <em>Interaction Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.InteractionAffordanceImpl
		 * @see wot.impl.WotPackageImpl#getInteractionAffordance()
		 * @generated
		 */
		EClass INTERACTION_AFFORDANCE = eINSTANCE.getInteractionAffordance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__NAME = eINSTANCE.getInteractionAffordance_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__TITLE = eINSTANCE.getInteractionAffordance_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_AFFORDANCE__DESCRIPTION = eINSTANCE.getInteractionAffordance_Description();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_AFFORDANCE__FORMS = eINSTANCE.getInteractionAffordance_Forms();

		/**
		 * The meta object literal for the '{@link wot.impl.PropertyAffordanceImpl <em>Property Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.PropertyAffordanceImpl
		 * @see wot.impl.WotPackageImpl#getPropertyAffordance()
		 * @generated
		 */
		EClass PROPERTY_AFFORDANCE = eINSTANCE.getPropertyAffordance();

		/**
		 * The meta object literal for the '<em><b>Observable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_AFFORDANCE__OBSERVABLE = eINSTANCE.getPropertyAffordance_Observable();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_AFFORDANCE__READ_ONLY = eINSTANCE.getPropertyAffordance_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_AFFORDANCE__WRITE_ONLY = eINSTANCE.getPropertyAffordance_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_AFFORDANCE__SCHEMA = eINSTANCE.getPropertyAffordance_Schema();

		/**
		 * The meta object literal for the '{@link wot.impl.ActionAffordanceImpl <em>Action Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.ActionAffordanceImpl
		 * @see wot.impl.WotPackageImpl#getActionAffordance()
		 * @generated
		 */
		EClass ACTION_AFFORDANCE = eINSTANCE.getActionAffordance();

		/**
		 * The meta object literal for the '<em><b>Safe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__SAFE = eINSTANCE.getActionAffordance_Safe();

		/**
		 * The meta object literal for the '<em><b>Idempotent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_AFFORDANCE__IDEMPOTENT = eINSTANCE.getActionAffordance_Idempotent();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_AFFORDANCE__INPUT = eINSTANCE.getActionAffordance_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_AFFORDANCE__OUTPUT = eINSTANCE.getActionAffordance_Output();

		/**
		 * The meta object literal for the '{@link wot.impl.EventAffordanceImpl <em>Event Affordance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.EventAffordanceImpl
		 * @see wot.impl.WotPackageImpl#getEventAffordance()
		 * @generated
		 */
		EClass EVENT_AFFORDANCE = eINSTANCE.getEventAffordance();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_AFFORDANCE__DATA = eINSTANCE.getEventAffordance_Data();

		/**
		 * The meta object literal for the '{@link wot.impl.DataSchemaImpl <em>Data Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.DataSchemaImpl
		 * @see wot.impl.WotPackageImpl#getDataSchema()
		 * @generated
		 */
		EClass DATA_SCHEMA = eINSTANCE.getDataSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TYPE = eINSTANCE.getDataSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__TITLE = eINSTANCE.getDataSchema_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__DESCRIPTION = eINSTANCE.getDataSchema_Description();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__UNIT = eINSTANCE.getDataSchema_Unit();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__READ_ONLY = eINSTANCE.getDataSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Write Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SCHEMA__WRITE_ONLY = eINSTANCE.getDataSchema_WriteOnly();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__PROPERTIES = eINSTANCE.getDataSchema_Properties();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SCHEMA__ITEMS = eINSTANCE.getDataSchema_Items();

		/**
		 * The meta object literal for the '{@link wot.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.SecuritySchemeImpl
		 * @see wot.impl.WotPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Scheme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__SCHEME = eINSTANCE.getSecurityScheme_Scheme();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '{@link wot.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.FormImpl
		 * @see wot.impl.WotPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__HREF = eINSTANCE.getForm_Href();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__CONTENT_TYPE = eINSTANCE.getForm_ContentType();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__OP = eINSTANCE.getForm_Op();

		/**
		 * The meta object literal for the '{@link wot.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.LinkImpl
		 * @see wot.impl.WotPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__HREF = eINSTANCE.getLink_Href();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__REL = eINSTANCE.getLink_Rel();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__TYPE = eINSTANCE.getLink_Type();

		/**
		 * The meta object literal for the '<em><b>Anchor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__ANCHOR = eINSTANCE.getLink_Anchor();

		/**
		 * The meta object literal for the '{@link wot.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wot.impl.FieldImpl
		 * @see wot.impl.WotPackageImpl#getField()
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

	}

} //WotPackage
