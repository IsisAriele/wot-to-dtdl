/**
 */
package wot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wot.DataSchema;
import wot.PropertyAffordance;
import wot.WotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Affordance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wot.impl.PropertyAffordanceImpl#isObservable <em>Observable</em>}</li>
 *   <li>{@link wot.impl.PropertyAffordanceImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link wot.impl.PropertyAffordanceImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link wot.impl.PropertyAffordanceImpl#getSchema <em>Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAffordanceImpl extends InteractionAffordanceImpl implements PropertyAffordance {
	/**
	 * The default value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OBSERVABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isObservable() <em>Observable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isObservable()
	 * @generated
	 * @ordered
	 */
	protected boolean observable = OBSERVABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteOnly() <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean writeOnly = WRITE_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected DataSchema schema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyAffordanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WotPackage.Literals.PROPERTY_AFFORDANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isObservable() {
		return observable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObservable(boolean newObservable) {
		boolean oldObservable = observable;
		observable = newObservable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.PROPERTY_AFFORDANCE__OBSERVABLE, oldObservable, observable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.PROPERTY_AFFORDANCE__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWriteOnly() {
		return writeOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWriteOnly(boolean newWriteOnly) {
		boolean oldWriteOnly = writeOnly;
		writeOnly = newWriteOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.PROPERTY_AFFORDANCE__WRITE_ONLY, oldWriteOnly, writeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(DataSchema newSchema, NotificationChain msgs) {
		DataSchema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WotPackage.PROPERTY_AFFORDANCE__SCHEMA, oldSchema, newSchema);
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
	public void setSchema(DataSchema newSchema) {
		if (newSchema != schema) {
			NotificationChain msgs = null;
			if (schema != null)
				msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WotPackage.PROPERTY_AFFORDANCE__SCHEMA, null, msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WotPackage.PROPERTY_AFFORDANCE__SCHEMA, null, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.PROPERTY_AFFORDANCE__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WotPackage.PROPERTY_AFFORDANCE__SCHEMA:
				return basicSetSchema(null, msgs);
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
			case WotPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				return isObservable();
			case WotPackage.PROPERTY_AFFORDANCE__READ_ONLY:
				return isReadOnly();
			case WotPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
				return isWriteOnly();
			case WotPackage.PROPERTY_AFFORDANCE__SCHEMA:
				return getSchema();
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
			case WotPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				setObservable((Boolean)newValue);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
				setWriteOnly((Boolean)newValue);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__SCHEMA:
				setSchema((DataSchema)newValue);
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
			case WotPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				setObservable(OBSERVABLE_EDEFAULT);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
				setWriteOnly(WRITE_ONLY_EDEFAULT);
				return;
			case WotPackage.PROPERTY_AFFORDANCE__SCHEMA:
				setSchema((DataSchema)null);
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
			case WotPackage.PROPERTY_AFFORDANCE__OBSERVABLE:
				return observable != OBSERVABLE_EDEFAULT;
			case WotPackage.PROPERTY_AFFORDANCE__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WotPackage.PROPERTY_AFFORDANCE__WRITE_ONLY:
				return writeOnly != WRITE_ONLY_EDEFAULT;
			case WotPackage.PROPERTY_AFFORDANCE__SCHEMA:
				return schema != null;
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
		result.append(" (observable: ");
		result.append(observable);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", writeOnly: ");
		result.append(writeOnly);
		result.append(')');
		return result.toString();
	}

} //PropertyAffordanceImpl
