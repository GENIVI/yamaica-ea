/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.StereotypeAttributeType;
import xmei.StereotypeType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stereotype Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.StereotypeAttributeTypeImpl#getStereotype <em>Stereotype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StereotypeAttributeTypeImpl extends MinimalEObjectImpl.Container implements StereotypeAttributeType
{
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
    protected StereotypeAttributeTypeImpl()
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
        return XmeiPackage.Literals.STEREOTYPE_ATTRIBUTE_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE, oldStereotype, stereotype, !oldStereotypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE, oldStereotype, STEREOTYPE_EDEFAULT, oldStereotypeESet));
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
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE:
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
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE:
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
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE:
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
            case XmeiPackage.STEREOTYPE_ATTRIBUTE_TYPE__STEREOTYPE:
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
        result.append(" (stereotype: ");
        if (stereotypeESet) result.append(stereotype); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //StereotypeAttributeTypeImpl
