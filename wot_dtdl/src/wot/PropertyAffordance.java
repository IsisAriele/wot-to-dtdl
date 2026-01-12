/**
 */
package wot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.PropertyAffordance#isObservable <em>Observable</em>}</li>
 *   <li>{@link wot.PropertyAffordance#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link wot.PropertyAffordance#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link wot.PropertyAffordance#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getPropertyAffordance()
 * @model
 * @generated
 */
public interface PropertyAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Observable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observable</em>' attribute.
	 * @see #setObservable(boolean)
	 * @see wot.WotPackage#getPropertyAffordance_Observable()
	 * @model
	 * @generated
	 */
	boolean isObservable();

	/**
	 * Sets the value of the '{@link wot.PropertyAffordance#isObservable <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observable</em>' attribute.
	 * @see #isObservable()
	 * @generated
	 */
	void setObservable(boolean value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see wot.WotPackage#getPropertyAffordance_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link wot.PropertyAffordance#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see wot.WotPackage#getPropertyAffordance_WriteOnly()
	 * @model
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link wot.PropertyAffordance#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(DataSchema)
	 * @see wot.WotPackage#getPropertyAffordance_Schema()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getSchema();

	/**
	 * Sets the value of the '{@link wot.PropertyAffordance#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(DataSchema value);

} // PropertyAffordance
