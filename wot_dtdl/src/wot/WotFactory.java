/**
 */
package wot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wot.WotPackage
 * @generated
 */
public interface WotFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WotFactory eINSTANCE = wot.impl.WotFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thing</em>'.
	 * @generated
	 */
	Thing createThing();

	/**
	 * Returns a new object of class '<em>Property Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Affordance</em>'.
	 * @generated
	 */
	PropertyAffordance createPropertyAffordance();

	/**
	 * Returns a new object of class '<em>Action Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Affordance</em>'.
	 * @generated
	 */
	ActionAffordance createActionAffordance();

	/**
	 * Returns a new object of class '<em>Event Affordance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Affordance</em>'.
	 * @generated
	 */
	EventAffordance createEventAffordance();

	/**
	 * Returns a new object of class '<em>Data Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Schema</em>'.
	 * @generated
	 */
	DataSchema createDataSchema();

	/**
	 * Returns a new object of class '<em>Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Scheme</em>'.
	 * @generated
	 */
	SecurityScheme createSecurityScheme();

	/**
	 * Returns a new object of class '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form</em>'.
	 * @generated
	 */
	Form createForm();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WotPackage getWotPackage();

} //WotFactory
