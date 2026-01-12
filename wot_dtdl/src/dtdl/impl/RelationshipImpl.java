/**
 */
package dtdl.impl;

import dtdl.DtdlPackage;
import dtdl.Interface;
import dtdl.Relationship;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dtdl.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dtdl.impl.RelationshipImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link dtdl.impl.RelationshipImpl#getMinMultiplicity <em>Min Multiplicity</em>}</li>
 *   <li>{@link dtdl.impl.RelationshipImpl#getMaxMultiplicity <em>Max Multiplicity</em>}</li>
 *   <li>{@link dtdl.impl.RelationshipImpl#isWritable <em>Writable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends ContentElementImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Interface target;

	/**
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected String targetId = TARGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinMultiplicity() <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinMultiplicity() <em>Min Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int minMultiplicity = MIN_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxMultiplicity() <em>Max Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int maxMultiplicity = MAX_MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWritable() <em>Writable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWritable()
	 * @generated
	 * @ordered
	 */
	protected boolean writable = WRITABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtdlPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interface getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Interface)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtdlPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Interface newTarget) {
		Interface oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetId(String newTargetId) {
		String oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.RELATIONSHIP__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinMultiplicity() {
		return minMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinMultiplicity(int newMinMultiplicity) {
		int oldMinMultiplicity = minMultiplicity;
		minMultiplicity = newMinMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.RELATIONSHIP__MIN_MULTIPLICITY, oldMinMultiplicity, minMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxMultiplicity() {
		return maxMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxMultiplicity(int newMaxMultiplicity) {
		int oldMaxMultiplicity = maxMultiplicity;
		maxMultiplicity = newMaxMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.RELATIONSHIP__MAX_MULTIPLICITY, oldMaxMultiplicity, maxMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWritable() {
		return writable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWritable(boolean newWritable) {
		boolean oldWritable = writable;
		writable = newWritable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtdlPackage.RELATIONSHIP__WRITABLE, oldWritable, writable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DtdlPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case DtdlPackage.RELATIONSHIP__TARGET_ID:
				return getTargetId();
			case DtdlPackage.RELATIONSHIP__MIN_MULTIPLICITY:
				return getMinMultiplicity();
			case DtdlPackage.RELATIONSHIP__MAX_MULTIPLICITY:
				return getMaxMultiplicity();
			case DtdlPackage.RELATIONSHIP__WRITABLE:
				return isWritable();
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
			case DtdlPackage.RELATIONSHIP__TARGET:
				setTarget((Interface)newValue);
				return;
			case DtdlPackage.RELATIONSHIP__TARGET_ID:
				setTargetId((String)newValue);
				return;
			case DtdlPackage.RELATIONSHIP__MIN_MULTIPLICITY:
				setMinMultiplicity((Integer)newValue);
				return;
			case DtdlPackage.RELATIONSHIP__MAX_MULTIPLICITY:
				setMaxMultiplicity((Integer)newValue);
				return;
			case DtdlPackage.RELATIONSHIP__WRITABLE:
				setWritable((Boolean)newValue);
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
			case DtdlPackage.RELATIONSHIP__TARGET:
				setTarget((Interface)null);
				return;
			case DtdlPackage.RELATIONSHIP__TARGET_ID:
				setTargetId(TARGET_ID_EDEFAULT);
				return;
			case DtdlPackage.RELATIONSHIP__MIN_MULTIPLICITY:
				setMinMultiplicity(MIN_MULTIPLICITY_EDEFAULT);
				return;
			case DtdlPackage.RELATIONSHIP__MAX_MULTIPLICITY:
				setMaxMultiplicity(MAX_MULTIPLICITY_EDEFAULT);
				return;
			case DtdlPackage.RELATIONSHIP__WRITABLE:
				setWritable(WRITABLE_EDEFAULT);
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
			case DtdlPackage.RELATIONSHIP__TARGET:
				return target != null;
			case DtdlPackage.RELATIONSHIP__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
			case DtdlPackage.RELATIONSHIP__MIN_MULTIPLICITY:
				return minMultiplicity != MIN_MULTIPLICITY_EDEFAULT;
			case DtdlPackage.RELATIONSHIP__MAX_MULTIPLICITY:
				return maxMultiplicity != MAX_MULTIPLICITY_EDEFAULT;
			case DtdlPackage.RELATIONSHIP__WRITABLE:
				return writable != WRITABLE_EDEFAULT;
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
		result.append(" (targetId: ");
		result.append(targetId);
		result.append(", minMultiplicity: ");
		result.append(minMultiplicity);
		result.append(", maxMultiplicity: ");
		result.append(maxMultiplicity);
		result.append(", writable: ");
		result.append(writable);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
