/**
 */
package wot;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Affordance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.EventAffordance#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getEventAffordance()
 * @model
 * @generated
 */
public interface EventAffordance extends InteractionAffordance {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(DataSchema)
	 * @see wot.WotPackage#getEventAffordance_Data()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getData();

	/**
	 * Sets the value of the '{@link wot.EventAffordance#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(DataSchema value);

} // EventAffordance
