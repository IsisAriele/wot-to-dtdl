/**
 */
package wot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WotFactoryImpl extends EFactoryImpl implements WotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WotFactory init() {
		try {
			WotFactory theWotFactory = (WotFactory)EPackage.Registry.INSTANCE.getEFactory(WotPackage.eNS_URI);
			if (theWotFactory != null) {
				return theWotFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WotPackage.THING: return createThing();
			case WotPackage.PROPERTY_AFFORDANCE: return createPropertyAffordance();
			case WotPackage.ACTION_AFFORDANCE: return createActionAffordance();
			case WotPackage.EVENT_AFFORDANCE: return createEventAffordance();
			case WotPackage.DATA_SCHEMA: return createDataSchema();
			case WotPackage.SECURITY_SCHEME: return createSecurityScheme();
			case WotPackage.FORM: return createForm();
			case WotPackage.LINK: return createLink();
			case WotPackage.FIELD: return createField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Thing createThing() {
		ThingImpl thing = new ThingImpl();
		return thing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyAffordance createPropertyAffordance() {
		PropertyAffordanceImpl propertyAffordance = new PropertyAffordanceImpl();
		return propertyAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionAffordance createActionAffordance() {
		ActionAffordanceImpl actionAffordance = new ActionAffordanceImpl();
		return actionAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventAffordance createEventAffordance() {
		EventAffordanceImpl eventAffordance = new EventAffordanceImpl();
		return eventAffordance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema createDataSchema() {
		DataSchemaImpl dataSchema = new DataSchemaImpl();
		return dataSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScheme createSecurityScheme() {
		SecuritySchemeImpl securityScheme = new SecuritySchemeImpl();
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WotPackage getWotPackage() {
		return (WotPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WotPackage getPackage() {
		return WotPackage.eINSTANCE;
	}

} //WotFactoryImpl
