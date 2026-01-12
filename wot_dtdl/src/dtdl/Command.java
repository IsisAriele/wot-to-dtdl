/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Command#getRequest <em>Request</em>}</li>
 *   <li>{@link dtdl.Command#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(CommandPayload)
	 * @see dtdl.DtdlPackage#getCommand_Request()
	 * @model containment="true"
	 * @generated
	 */
	CommandPayload getRequest();

	/**
	 * Sets the value of the '{@link dtdl.Command#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(CommandPayload value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' containment reference.
	 * @see #setResponse(CommandPayload)
	 * @see dtdl.DtdlPackage#getCommand_Response()
	 * @model containment="true"
	 * @generated
	 */
	CommandPayload getResponse();

	/**
	 * Sets the value of the '{@link dtdl.Command#getResponse <em>Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' containment reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(CommandPayload value);

} // Command
