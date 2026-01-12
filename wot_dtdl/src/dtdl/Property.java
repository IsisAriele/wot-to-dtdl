/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Property#isWritable <em>Writable</em>}</li>
 *   <li>{@link dtdl.Property#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see dtdl.DtdlPackage#getProperty_Writable()
	 * @model
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link dtdl.Property#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see dtdl.DtdlPackage#getProperty_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link dtdl.Property#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Property
