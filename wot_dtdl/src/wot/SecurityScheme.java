/**
 */
package wot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.SecurityScheme#getScheme <em>Scheme</em>}</li>
 *   <li>{@link wot.SecurityScheme#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheme</em>' attribute.
	 * @see #setScheme(String)
	 * @see wot.WotPackage#getSecurityScheme_Scheme()
	 * @model required="true"
	 * @generated
	 */
	String getScheme();

	/**
	 * Sets the value of the '{@link wot.SecurityScheme#getScheme <em>Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheme</em>' attribute.
	 * @see #getScheme()
	 * @generated
	 */
	void setScheme(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wot.WotPackage#getSecurityScheme_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wot.SecurityScheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SecurityScheme
