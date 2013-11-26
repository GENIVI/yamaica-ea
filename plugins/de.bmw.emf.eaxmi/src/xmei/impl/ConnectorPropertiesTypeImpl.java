/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorPropertiesType;
import xmei.DirectionType;
import xmei.EaTypesType;
import xmei.StereotypeType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorPropertiesTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link xmei.impl.ConnectorPropertiesTypeImpl#getEaType <em>Ea Type</em>}</li>
 *   <li>{@link xmei.impl.ConnectorPropertiesTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmei.impl.ConnectorPropertiesTypeImpl#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ConnectorPropertiesType
{
    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.DESTINATION_SOURCE;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected DirectionType direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getEaType() <em>Ea Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaType()
     * @generated
     * @ordered
     */
    protected static final EaTypesType EA_TYPE_EDEFAULT = EaTypesType.ASSOCIATION;

    /**
     * The cached value of the '{@link #getEaType() <em>Ea Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaType()
     * @generated
     * @ordered
     */
    protected EaTypesType eaType = EA_TYPE_EDEFAULT;

    /**
     * This is true if the Ea Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eaTypeESet;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected static final StereotypeType STEREOTYPE_EDEFAULT = StereotypeType.ARRAY;

    /**
     * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected StereotypeType stereotype = STEREOTYPE_EDEFAULT;

    /**
     * This is true if the Stereotype attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stereotypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorPropertiesTypeImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return XmeiPackage.Literals.CONNECTOR_PROPERTIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectionType getDirection()
    {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(DirectionType newDirection)
    {
        DirectionType oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDirection()
    {
        DirectionType oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDirection()
    {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EaTypesType getEaType()
    {
        return eaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEaType(EaTypesType newEaType)
    {
        EaTypesType oldEaType = eaType;
        eaType = newEaType == null ? EA_TYPE_EDEFAULT : newEaType;
        boolean oldEaTypeESet = eaTypeESet;
        eaTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE, oldEaType, eaType, !oldEaTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEaType()
    {
        EaTypesType oldEaType = eaType;
        boolean oldEaTypeESet = eaTypeESet;
        eaType = EA_TYPE_EDEFAULT;
        eaTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE, oldEaType, EA_TYPE_EDEFAULT, oldEaTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEaType()
    {
        return eaTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName()
    {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName)
    {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeType getStereotype()
    {
        return stereotype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStereotype(StereotypeType newStereotype)
    {
        StereotypeType oldStereotype = stereotype;
        stereotype = newStereotype == null ? STEREOTYPE_EDEFAULT : newStereotype;
        boolean oldStereotypeESet = stereotypeESet;
        stereotypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE, oldStereotype, stereotype, !oldStereotypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStereotype()
    {
        StereotypeType oldStereotype = stereotype;
        boolean oldStereotypeESet = stereotypeESet;
        stereotype = STEREOTYPE_EDEFAULT;
        stereotypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE, oldStereotype, STEREOTYPE_EDEFAULT, oldStereotypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStereotype()
    {
        return stereotypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION:
                return getDirection();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE:
                return getEaType();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME:
                return getName();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE:
                return getStereotype();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue)
    {
        switch (featureID)
        {
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION:
                setDirection((DirectionType)newValue);
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE:
                setEaType((EaTypesType)newValue);
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME:
                setName((String)newValue);
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE:
                setStereotype((StereotypeType)newValue);
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
    public void eUnset(int featureID)
    {
        switch (featureID)
        {
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION:
                unsetDirection();
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE:
                unsetEaType();
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE:
                unsetStereotype();
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
    public boolean eIsSet(int featureID)
    {
        switch (featureID)
        {
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__DIRECTION:
                return isSetDirection();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__EA_TYPE:
                return isSetEaType();
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XmeiPackage.CONNECTOR_PROPERTIES_TYPE__STEREOTYPE:
                return isSetStereotype();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString()
    {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (direction: ");
        if (directionESet) result.append(direction); else result.append("<unset>");
        result.append(", eaType: ");
        if (eaTypeESet) result.append(eaType); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", stereotype: ");
        if (stereotypeESet) result.append(stereotype); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConnectorPropertiesTypeImpl
