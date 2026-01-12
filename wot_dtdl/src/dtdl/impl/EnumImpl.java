/**
 */
package dtdl.impl;

import dtdl.DtdlPackage;
import dtdl.EnumValue;
import dtdl.PrimitiveType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtdl.impl.EnumImpl#getEnumValues <em>Enum Values</em>}</li>
 *   <li>{@link dtdl.impl.EnumImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumImpl extends ComplexSchemaImpl implements dtdl.Enum {
	/**
	 * The cached value of the '{@link #getEnumValues() <em>Enum Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> enumValues;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final PrimitiveType VALUE_TYPE_EDEFAULT = PrimitiveType.STRING;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtdlPackage.Literals.ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumValue> getEnumValues() {
		if (enumValues == null) {
			enumValues = new EObjectContainmentEList<EnumValue>(EnumValue.class, this, DtdlPackage.ENUM__ENUM_VALUES);
		}
		return enumValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(PrimitiveType newValueType) {
		PrimitiveType oldValueType = valueType;
		valueType = newValueType == null ? VALUE_TYPE_EDEFAULT : newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.ENUM__VALUE_TYPE, oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtdlPackage.ENUM__ENUM_VALUES:
				return ((InternalEList<?>)getEnumValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtdlPackage.ENUM__ENUM_VALUES:
				return getEnumValues();
			case DtdlPackage.ENUM__VALUE_TYPE:
				return getValueType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DtdlPackage.ENUM__ENUM_VALUES:
				getEnumValues().clear();
				getEnumValues().addAll((Collection<? extends EnumValue>)newValue);
				return;
			case DtdlPackage.ENUM__VALUE_TYPE:
				setValueType((PrimitiveType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DtdlPackage.ENUM__ENUM_VALUES:
				getEnumValues().clear();
				return;
			case DtdlPackage.ENUM__VALUE_TYPE:
				setValueType(VALUE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DtdlPackage.ENUM__ENUM_VALUES:
				return enumValues != null && !enumValues.isEmpty();
			case DtdlPackage.ENUM__VALUE_TYPE:
				return valueType != VALUE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (valueType: ");
		result.append(valueType);
		result.append(')');
		return result.toString();
	}

} //EnumImpl
