/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.CommandPayload#isNullable <em>Nullable</em>}</li>
 *   <li>{@link dtdl.CommandPayload#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getCommandPayload()
 * @model
 * @generated
 */
public interface CommandPayload extends Element {
	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see dtdl.DtdlPackage#getCommandPayload_Nullable()
	 * @model
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link dtdl.CommandPayload#isNullable <em>Nullable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see dtdl.DtdlPackage#getCommandPayload_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link dtdl.CommandPayload#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // CommandPayload
