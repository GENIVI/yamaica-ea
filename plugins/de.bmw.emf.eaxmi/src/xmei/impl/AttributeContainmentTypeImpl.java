/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.AttributeContainmentType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Containment Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.AttributeContainmentTypeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.impl.AttributeContainmentTypeImpl#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeContainmentTypeImpl extends MinimalEObjectImpl.Container implements AttributeContainmentType
{
    /**
     * The default value of the '{@link #getContainment() <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected static final String CONTAINMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getContainment() <em>Containment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected String containment = CONTAINMENT_EDEFAULT;

    /**
     * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected static final int POSITION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPosition()
     * @generated
     * @ordered
     */
    protected int position = POSITION_EDEFAULT;

    /**
     * This is true if the Position attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeContainmentTypeImpl()
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
        return XmeiPackage.Literals.ATTRIBUTE_CONTAINMENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContainment()
    {
        return containment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainment(String newContainment)
    {
        String oldContainment = containment;
        containment = newContainment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT, oldContainment, containment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPosition()
    {
        return position;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPosition(int newPosition)
    {
        int oldPosition = position;
        position = newPosition;
        boolean oldPositionESet = positionESet;
        positionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION, oldPosition, position, !oldPositionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPosition()
    {
        int oldPosition = position;
        boolean oldPositionESet = positionESet;
        position = POSITION_EDEFAULT;
        positionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION, oldPosition, POSITION_EDEFAULT, oldPositionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPosition()
    {
        return positionESet;
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
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT:
                return getContainment();
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION:
                return getPosition();
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
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT:
                setContainment((String)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION:
                setPosition((Integer)newValue);
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
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT:
                setContainment(CONTAINMENT_EDEFAULT);
                return;
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION:
                unsetPosition();
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
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__CONTAINMENT:
                return CONTAINMENT_EDEFAULT == null ? containment != null : !CONTAINMENT_EDEFAULT.equals(containment);
            case XmeiPackage.ATTRIBUTE_CONTAINMENT_TYPE__POSITION:
                return isSetPosition();
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
        result.append(" (containment: ");
        result.append(containment);
        result.append(", position: ");
        if (positionESet) result.append(position); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AttributeContainmentTypeImpl
