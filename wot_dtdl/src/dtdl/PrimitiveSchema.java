/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.PrimitiveSchema#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getPrimitiveSchema()
 * @model
 * @generated
 */
public interface PrimitiveSchema extends Schema {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dtdl.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see dtdl.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see dtdl.DtdlPackage#getPrimitiveSchema_Type()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link dtdl.PrimitiveSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see dtdl.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // PrimitiveSchema
