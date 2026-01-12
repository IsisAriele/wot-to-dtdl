/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link dtdl.Relationship#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link dtdl.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}</li>
 *   <li>{@link dtdl.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 *   <li>{@link dtdl.Relationship#isWritable <em>Writable</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ContentElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Interface)
	 * @see dtdl.DtdlPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	Interface getTarget();

	/**
	 * Sets the value of the '{@link dtdl.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Interface value);

	/**
	 * Returns the value of the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Id</em>' attribute.
	 * @see #setTargetId(String)
	 * @see dtdl.DtdlPackage#getRelationship_TargetId()
	 * @model
	 * @generated
	 */
	String getTargetId();

	/**
	 * Sets the value of the '{@link dtdl.Relationship#getTargetId <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Id</em>' attribute.
	 * @see #getTargetId()
	 * @generated
	 */
	void setTargetId(String value);

	/**
	 * Returns the value of the '<em><b>Min Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Multiplicity</em>' attribute.
	 * @see #setMinMultiplicity(int)
	 * @see dtdl.DtdlPackage#getRelationship_MinMultiplicity()
	 * @model
	 * @generated
	 */
	int getMinMultiplicity();

	/**
	 * Sets the value of the '{@link dtdl.Relationship#getMinMultiplicity <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Multiplicity</em>' attribute.
	 * @see #getMinMultiplicity()
	 * @generated
	 */
	void setMinMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Max Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #setMaxMultiplicity(int)
	 * @see dtdl.DtdlPackage#getRelationship_MaxMultiplicity()
	 * @model
	 * @generated
	 */
	int getMaxMultiplicity();

	/**
	 * Sets the value of the '{@link dtdl.Relationship#getMaxMultiplicity <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Multiplicity</em>' attribute.
	 * @see #getMaxMultiplicity()
	 * @generated
	 */
	void setMaxMultiplicity(int value);

	/**
	 * Returns the value of the '<em><b>Writable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writable</em>' attribute.
	 * @see #setWritable(boolean)
	 * @see dtdl.DtdlPackage#getRelationship_Writable()
	 * @model
	 * @generated
	 */
	boolean isWritable();

	/**
	 * Sets the value of the '{@link dtdl.Relationship#isWritable <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writable</em>' attribute.
	 * @see #isWritable()
	 * @generated
	 */
	void setWritable(boolean value);

} // Relationship
