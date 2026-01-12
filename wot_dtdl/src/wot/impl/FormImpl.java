/**
 */
package wot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import wot.Form;
import wot.WotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wot.impl.FormImpl#getHref <em>Href</em>}</li>
 *   <li>{@link wot.impl.FormImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link wot.impl.FormImpl#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FormImpl extends MinimalEObjectImpl.Container implements Form {
	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected String contentType = CONTENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> op;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WotPackage.Literals.FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.FORM__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContentType(String newContentType) {
		String oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.FORM__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOp() {
		if (op == null) {
			op = new EDataTypeUniqueEList<String>(String.class, this, WotPackage.FORM__OP);
		}
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WotPackage.FORM__HREF:
				return getHref();
			case WotPackage.FORM__CONTENT_TYPE:
				return getContentType();
			case WotPackage.FORM__OP:
				return getOp();
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
			case WotPackage.FORM__HREF:
				setHref((String)newValue);
				return;
			case WotPackage.FORM__CONTENT_TYPE:
				setContentType((String)newValue);
				return;
			case WotPackage.FORM__OP:
				getOp().clear();
				getOp().addAll((Collection<? extends String>)newValue);
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
			case WotPackage.FORM__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case WotPackage.FORM__CONTENT_TYPE:
				setContentType(CONTENT_TYPE_EDEFAULT);
				return;
			case WotPackage.FORM__OP:
				getOp().clear();
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
			case WotPackage.FORM__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case WotPackage.FORM__CONTENT_TYPE:
				return CONTENT_TYPE_EDEFAULT == null ? contentType != null : !CONTENT_TYPE_EDEFAULT.equals(contentType);
			case WotPackage.FORM__OP:
				return op != null && !op.isEmpty();
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
		result.append(" (href: ");
		result.append(href);
		result.append(", contentType: ");
		result.append(contentType);
		result.append(", op: ");
		result.append(op);
		result.append(')');
		return result.toString();
	}

} //FormImpl
