/**
 */
package wot;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wot.DataSchema#getType <em>Type</em>}</li>
 *   <li>{@link wot.DataSchema#getTitle <em>Title</em>}</li>
 *   <li>{@link wot.DataSchema#getDescription <em>Description</em>}</li>
 *   <li>{@link wot.DataSchema#getUnit <em>Unit</em>}</li>
 *   <li>{@link wot.DataSchema#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link wot.DataSchema#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link wot.DataSchema#getProperties <em>Properties</em>}</li>
 *   <li>{@link wot.DataSchema#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see wot.WotPackage#getDataSchema()
 * @model
 * @generated
 */
public interface DataSchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see wot.WotPackage#getDataSchema_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link wot.DataSchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see wot.WotPackage#getDataSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link wot.DataSchema#getTitle <em>Title</em>}' attribute.
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
	 * @see wot.WotPackage#getDataSchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wot.DataSchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see wot.WotPackage#getDataSchema_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link wot.DataSchema#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see wot.WotPackage#getDataSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link wot.DataSchema#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Write Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Only</em>' attribute.
	 * @see #setWriteOnly(boolean)
	 * @see wot.WotPackage#getDataSchema_WriteOnly()
	 * @model
	 * @generated
	 */
	boolean isWriteOnly();

	/**
	 * Sets the value of the '{@link wot.DataSchema#isWriteOnly <em>Write Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Only</em>' attribute.
	 * @see #isWriteOnly()
	 * @generated
	 */
	void setWriteOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link wot.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see wot.WotPackage#getDataSchema_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getProperties();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(DataSchema)
	 * @see wot.WotPackage#getDataSchema_Items()
	 * @model containment="true"
	 * @generated
	 */
	DataSchema getItems();

	/**
	 * Sets the value of the '{@link wot.DataSchema#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(DataSchema value);

} // DataSchema
