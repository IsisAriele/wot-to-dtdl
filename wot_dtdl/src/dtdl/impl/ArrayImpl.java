/**
 */
package dtdl.impl;

import dtdl.Array;
import dtdl.DtdlPackage;
import dtdl.Schema;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtdl.impl.ArrayImpl#getElementSchema <em>Element Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayImpl extends ComplexSchemaImpl implements Array {
	/**
	 * The cached value of the '{@link #getElementSchema() <em>Element Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema elementSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtdlPackage.Literals.ARRAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema getElementSchema() {
		return elementSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementSchema(Schema newElementSchema, NotificationChain msgs) {
		Schema oldElementSchema = elementSchema;
		elementSchema = newElementSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtdlPackage.ARRAY__ELEMENT_SCHEMA, oldElementSchema, newElementSchema);
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
	public void setElementSchema(Schema newElementSchema) {
		if (newElementSchema != elementSchema) {
			NotificationChain msgs = null;
			if (elementSchema != null)
				msgs = ((InternalEObject)elementSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DtdlPackage.ARRAY__ELEMENT_SCHEMA, null, msgs);
			if (newElementSchema != null)
				msgs = ((InternalEObject)newElementSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DtdlPackage.ARRAY__ELEMENT_SCHEMA, null, msgs);
			msgs = basicSetElementSchema(newElementSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.ARRAY__ELEMENT_SCHEMA, newElementSchema, newElementSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtdlPackage.ARRAY__ELEMENT_SCHEMA:
				return basicSetElementSchema(null, msgs);
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
			case DtdlPackage.ARRAY__ELEMENT_SCHEMA:
				return getElementSchema();
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
			case DtdlPackage.ARRAY__ELEMENT_SCHEMA:
				setElementSchema((Schema)newValue);
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
			case DtdlPackage.ARRAY__ELEMENT_SCHEMA:
				setElementSchema((Schema)null);
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
			case DtdlPackage.ARRAY__ELEMENT_SCHEMA:
				return elementSchema != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayImpl
