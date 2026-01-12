/**
 */
package wot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wot.DataSchema;
import wot.EventAffordance;
import wot.WotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wot.impl.EventAffordanceImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventAffordanceImpl extends InteractionAffordanceImpl implements EventAffordance {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataSchema data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WotPackage.Literals.EVENT_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(DataSchema newData, NotificationChain msgs) {
		DataSchema oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WotPackage.EVENT_AFFORDANCE__DATA, oldData, newData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(DataSchema newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WotPackage.EVENT_AFFORDANCE__DATA, null, msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WotPackage.EVENT_AFFORDANCE__DATA, null, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.EVENT_AFFORDANCE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WotPackage.EVENT_AFFORDANCE__DATA:
				return basicSetData(null, msgs);
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
			case WotPackage.EVENT_AFFORDANCE__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WotPackage.EVENT_AFFORDANCE__DATA:
				setData((DataSchema)newValue);
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
			case WotPackage.EVENT_AFFORDANCE__DATA:
				setData((DataSchema)null);
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
			case WotPackage.EVENT_AFFORDANCE__DATA:
				return data != null;
		}
		return super.eIsSet(featureID);
	}

} //EventAffordanceImpl
