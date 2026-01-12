/**
 */
package wot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.Thing#getId <em>Id</em>}</li>
 *   <li>{@link wot.Thing#getTitle <em>Title</em>}</li>
 *   <li>{@link wot.Thing#getDescription <em>Description</em>}</li>
 *   <li>{@link wot.Thing#getBase <em>Base</em>}</li>
 *   <li>{@link wot.Thing#getProperties <em>Properties</em>}</li>
 *   <li>{@link wot.Thing#getActions <em>Actions</em>}</li>
 *   <li>{@link wot.Thing#getEvents <em>Events</em>}</li>
 *   <li>{@link wot.Thing#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link wot.Thing#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see wot.WotPackage#getThing_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link wot.Thing#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wot.WotPackage#getThing_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wot.Thing#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wot.WotPackage#getThing_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wot.Thing#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(String)
	 * @see wot.WotPackage#getThing_Base()
	 * @model
	 * @generated
	 */
	String getBase();

	/**
	 * Sets the value of the '{@link wot.Thing#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link wot.PropertyAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see wot.WotPackage#getThing_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyAffordance> getProperties();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link wot.ActionAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see wot.WotPackage#getThing_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionAffordance> getActions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link wot.EventAffordance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see wot.WotPackage#getThing_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventAffordance> getEvents();

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link wot.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference list.
	 * @see wot.WotPackage#getThing_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScheme> getSecurityDefinitions();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link wot.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see wot.WotPackage#getThing_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // Thing
