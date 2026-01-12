/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Array#getElementSchema <em>Element Schema</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getArray()
 * @model
 * @generated
 */
public interface Array extends ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Element Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Schema</em>' containment reference.
	 * @see #setElementSchema(Schema)
	 * @see dtdl.DtdlPackage#getArray_ElementSchema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getElementSchema();

	/**
	 * Sets the value of the '{@link dtdl.Array#getElementSchema <em>Element Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Schema</em>' containment reference.
	 * @see #getElementSchema()
	 * @generated
	 */
	void setElementSchema(Schema value);

} // Array
