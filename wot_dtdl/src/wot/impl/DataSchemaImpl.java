/**
 */
package wot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wot.DataSchema;
import wot.Field;
import wot.WotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wot.impl.DataSchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#isWriteOnly <em>Write Only</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link wot.impl.DataSchemaImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataSchemaImpl extends MinimalEObjectImpl.Container implements DataSchema {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> properties;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected DataSchema items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataSchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WotPackage.Literals.DATA_SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__UNIT, oldUnit, unit));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__READ_ONLY, oldReadOnly, readOnly));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__WRITE_ONLY, oldWriteOnly, writeOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Field> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Field>(Field.class, this, WotPackage.DATA_SCHEMA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataSchema getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(DataSchema newItems, NotificationChain msgs) {
		DataSchema oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__ITEMS, oldItems, newItems);
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
	public void setItems(DataSchema newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WotPackage.DATA_SCHEMA__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WotPackage.DATA_SCHEMA__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.DATA_SCHEMA__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WotPackage.DATA_SCHEMA__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case WotPackage.DATA_SCHEMA__ITEMS:
				return basicSetItems(null, msgs);
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
			case WotPackage.DATA_SCHEMA__TYPE:
				return getType();
			case WotPackage.DATA_SCHEMA__TITLE:
				return getTitle();
			case WotPackage.DATA_SCHEMA__DESCRIPTION:
				return getDescription();
			case WotPackage.DATA_SCHEMA__UNIT:
				return getUnit();
			case WotPackage.DATA_SCHEMA__READ_ONLY:
				return isReadOnly();
			case WotPackage.DATA_SCHEMA__WRITE_ONLY:
				return isWriteOnly();
			case WotPackage.DATA_SCHEMA__PROPERTIES:
				return getProperties();
			case WotPackage.DATA_SCHEMA__ITEMS:
				return getItems();
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
			case WotPackage.DATA_SCHEMA__TYPE:
				setType((String)newValue);
				return;
			case WotPackage.DATA_SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case WotPackage.DATA_SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WotPackage.DATA_SCHEMA__UNIT:
				setUnit((String)newValue);
				return;
			case WotPackage.DATA_SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WotPackage.DATA_SCHEMA__WRITE_ONLY:
				setWriteOnly((Boolean)newValue);
				return;
			case WotPackage.DATA_SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Field>)newValue);
				return;
			case WotPackage.DATA_SCHEMA__ITEMS:
				setItems((DataSchema)newValue);
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
			case WotPackage.DATA_SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__WRITE_ONLY:
				setWriteOnly(WRITE_ONLY_EDEFAULT);
				return;
			case WotPackage.DATA_SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case WotPackage.DATA_SCHEMA__ITEMS:
				setItems((DataSchema)null);
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
			case WotPackage.DATA_SCHEMA__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case WotPackage.DATA_SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WotPackage.DATA_SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WotPackage.DATA_SCHEMA__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case WotPackage.DATA_SCHEMA__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WotPackage.DATA_SCHEMA__WRITE_ONLY:
				return writeOnly != WRITE_ONLY_EDEFAULT;
			case WotPackage.DATA_SCHEMA__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case WotPackage.DATA_SCHEMA__ITEMS:
				return items != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", unit: ");
		result.append(unit);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", writeOnly: ");
		result.append(writeOnly);
		result.append(')');
		return result.toString();
	}

} //DataSchemaImpl
