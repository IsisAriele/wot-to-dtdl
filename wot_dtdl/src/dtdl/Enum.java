/**
 */
package dtdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Enum#getEnumValues <em>Enum Values</em>}</li>
 *   <li>{@link dtdl.Enum#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Enum Values</b></em>' containment reference list.
	 * The list contents are of type {@link dtdl.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Values</em>' containment reference list.
	 * @see dtdl.DtdlPackage#getEnum_EnumValues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumValue> getEnumValues();

	/**
	 * Returns the value of the '<em><b>Value Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dtdl.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type</em>' attribute.
	 * @see dtdl.PrimitiveType
	 * @see #setValueType(PrimitiveType)
	 * @see dtdl.DtdlPackage#getEnum_ValueType()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveType getValueType();

	/**
	 * Sets the value of the '{@link dtdl.Enum#getValueType <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type</em>' attribute.
	 * @see dtdl.PrimitiveType
	 * @see #getValueType()
	 * @generated
	 */
	void setValueType(PrimitiveType value);

} // Enum
