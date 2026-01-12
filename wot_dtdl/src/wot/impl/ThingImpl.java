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

import wot.ActionAffordance;
import wot.EventAffordance;
import wot.Link;
import wot.PropertyAffordance;
import wot.SecurityScheme;
import wot.Thing;
import wot.WotPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wot.impl.ThingImpl#getId <em>Id</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getBase <em>Base</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link wot.impl.ThingImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends MinimalEObjectImpl.Container implements Thing {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected String base = BASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAffordance> properties;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionAffordance> actions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<EventAffordance> events;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScheme> securityDefinitions;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WotPackage.Literals.THING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.THING__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.THING__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.THING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase(String newBase) {
		String oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WotPackage.THING__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertyAffordance> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertyAffordance>(PropertyAffordance.class, this, WotPackage.THING__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionAffordance> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<ActionAffordance>(ActionAffordance.class, this, WotPackage.THING__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventAffordance> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<EventAffordance>(EventAffordance.class, this, WotPackage.THING__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScheme> getSecurityDefinitions() {
		if (securityDefinitions == null) {
			securityDefinitions = new EObjectContainmentEList<SecurityScheme>(SecurityScheme.class, this, WotPackage.THING__SECURITY_DEFINITIONS);
		}
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, WotPackage.THING__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WotPackage.THING__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case WotPackage.THING__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case WotPackage.THING__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case WotPackage.THING__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
			case WotPackage.THING__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case WotPackage.THING__ID:
				return getId();
			case WotPackage.THING__TITLE:
				return getTitle();
			case WotPackage.THING__DESCRIPTION:
				return getDescription();
			case WotPackage.THING__BASE:
				return getBase();
			case WotPackage.THING__PROPERTIES:
				return getProperties();
			case WotPackage.THING__ACTIONS:
				return getActions();
			case WotPackage.THING__EVENTS:
				return getEvents();
			case WotPackage.THING__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case WotPackage.THING__LINKS:
				return getLinks();
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
			case WotPackage.THING__ID:
				setId((String)newValue);
				return;
			case WotPackage.THING__TITLE:
				setTitle((String)newValue);
				return;
			case WotPackage.THING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WotPackage.THING__BASE:
				setBase((String)newValue);
				return;
			case WotPackage.THING__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertyAffordance>)newValue);
				return;
			case WotPackage.THING__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionAffordance>)newValue);
				return;
			case WotPackage.THING__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends EventAffordance>)newValue);
				return;
			case WotPackage.THING__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				getSecurityDefinitions().addAll((Collection<? extends SecurityScheme>)newValue);
				return;
			case WotPackage.THING__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
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
			case WotPackage.THING__ID:
				setId(ID_EDEFAULT);
				return;
			case WotPackage.THING__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WotPackage.THING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WotPackage.THING__BASE:
				setBase(BASE_EDEFAULT);
				return;
			case WotPackage.THING__PROPERTIES:
				getProperties().clear();
				return;
			case WotPackage.THING__ACTIONS:
				getActions().clear();
				return;
			case WotPackage.THING__EVENTS:
				getEvents().clear();
				return;
			case WotPackage.THING__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
			case WotPackage.THING__LINKS:
				getLinks().clear();
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
			case WotPackage.THING__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case WotPackage.THING__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case WotPackage.THING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WotPackage.THING__BASE:
				return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
			case WotPackage.THING__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case WotPackage.THING__ACTIONS:
				return actions != null && !actions.isEmpty();
			case WotPackage.THING__EVENTS:
				return events != null && !events.isEmpty();
			case WotPackage.THING__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
			case WotPackage.THING__LINKS:
				return links != null && !links.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", base: ");
		result.append(base);
		result.append(')');
		return result.toString();
	}

} //ThingImpl
