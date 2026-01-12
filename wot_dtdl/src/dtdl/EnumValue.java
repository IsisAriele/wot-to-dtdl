/**
 */
package dtdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.EnumValue#getName <em>Name</em>}</li>
 *   <li>{@link dtdl.EnumValue#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getEnumValue()
 * @model
 * @generated
 */
public interface EnumValue extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dtdl.DtdlPackage#getEnumValue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dtdl.EnumValue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' attribute.
	 * @see #setEnumValue(String)
	 * @see dtdl.DtdlPackage#getEnumValue_EnumValue()
	 * @model required="true"
	 * @generated
	 */
	String getEnumValue();

	/**
	 * Sets the value of the '{@link dtdl.EnumValue#getEnumValue <em>Enum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' attribute.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(String value);

} // EnumValue
