/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Telemetry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Telemetry#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getTelemetry()
 * @model
 * @generated
 */
public interface Telemetry extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(Schema)
	 * @see dtdl.DtdlPackage#getTelemetry_Schema()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link dtdl.Telemetry#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

} // Telemetry
