/**
 */
package wot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.Form#getHref <em>Href</em>}</li>
 *   <li>{@link wot.Form#getContentType <em>Content Type</em>}</li>
 *   <li>{@link wot.Form#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends EObject {
	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see wot.WotPackage#getForm_Href()
	 * @model required="true"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link wot.Form#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Type</em>' attribute.
	 * @see #setContentType(String)
	 * @see wot.WotPackage#getForm_ContentType()
	 * @model
	 * @generated
	 */
	String getContentType();

	/**
	 * Sets the value of the '{@link wot.Form#getContentType <em>Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Type</em>' attribute.
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(String value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute list.
	 * @see wot.WotPackage#getForm_Op()
	 * @model
	 * @generated
	 */
	EList<String> getOp();

} // Form
