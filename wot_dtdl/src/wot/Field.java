/**
 */
package wot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.Field#getName <em>Name</em>}</li>
 *   <li>{@link wot.Field#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wot.WotPackage#getField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wot.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(DataSchema)
	 * @see wot.WotPackage#getField_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataSchema getSchema();

	/**
	 * Sets the value of the '{@link wot.Field#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(DataSchema value);

} // Field
