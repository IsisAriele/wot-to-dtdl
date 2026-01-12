/**
 */
package wot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.ActionAffordance#isSafe <em>Safe</em>}</li>
 *   <li>{@link wot.ActionAffordance#isIdempotent <em>Idempotent</em>}</li>
 *   <li>{@link wot.ActionAffordance#getInput <em>Input</em>}</li>
 *   <li>{@link wot.ActionAffordance#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getActionAffordance()
 * @model
 * @generated
 */
public interface ActionAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Safe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' attribute.
	 * @see #setSafe(boolean)
	 * @see wot.WotPackage#getActionAffordance_Safe()
	 * @model
	 * @generated
	 */
	boolean isSafe();

	/**
	 * Sets the value of the '{@link wot.ActionAffordance#isSafe <em>Safe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' attribute.
	 * @see #isSafe()
	 * @generated
	 */
	void setSafe(boolean value);

	/**
	 * Returns the value of the '<em><b>Idempotent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent</em>' attribute.
	 * @see #setIdempotent(boolean)
	 * @see wot.WotPackage#getActionAffordance_Idempotent()
	 * @model
	 * @generated
	 */
	boolean isIdempotent();

	/**
	 * Sets the value of the '{@link wot.ActionAffordance#isIdempotent <em>Idempotent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent</em>' attribute.
	 * @see #isIdempotent()
	 * @generated
	 */
	void setIdempotent(boolean value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference.
	 * @see #setInput(DataSchema)
	 * @see wot.WotPackage#getActionAffordance_Input()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getInput();

	/**
	 * Sets the value of the '{@link wot.ActionAffordance#getInput <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' containment reference.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(DataSchema value);

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(DataSchema)
	 * @see wot.WotPackage#getActionAffordance_Output()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getOutput();

	/**
	 * Sets the value of the '{@link wot.ActionAffordance#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(DataSchema value);

} // ActionAffordance
