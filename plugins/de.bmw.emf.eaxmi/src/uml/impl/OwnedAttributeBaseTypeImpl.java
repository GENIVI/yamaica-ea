/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.OwnedAttributeBaseType;
import uml.TypeType;
import uml.UmlPackage;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Attribute Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedAttributeBaseTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeBaseTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeBaseTypeImpl#getType1 <em>Type1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedAttributeBaseTypeImpl extends MinimalEObjectImpl.Container implements OwnedAttributeBaseType
{
    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected TypeType type;

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
     * The default value of the '{@link #getType1() <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType1()
     * @generated
     * @ordered
     */
    protected static final TypeBaseType TYPE1_EDEFAULT = TypeBaseType.UML_PROPERTY;

    /**
     * The cached value of the '{@link #getType1() <em>Type1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType1()
     * @generated
     * @ordered
     */
    protected TypeBaseType type1 = TYPE1_EDEFAULT;

    /**
     * This is true if the Type1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean type1ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedAttributeBaseTypeImpl()
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
        return UmlPackage.Literals.OWNED_ATTRIBUTE_BASE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(TypeType newType, NotificationChain msgs)
    {
        TypeType oldType = type;
        type = newType;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(TypeType newType)
    {
        if (newType != type)
        {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId)
    {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeBaseType getType1()
    {
        return type1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType1(TypeBaseType newType1)
    {
        TypeBaseType oldType1 = type1;
        type1 = newType1 == null ? TYPE1_EDEFAULT : newType1;
        boolean oldType1ESet = type1ESet;
        type1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1, oldType1, type1, !oldType1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType1()
    {
        TypeBaseType oldType1 = type1;
        boolean oldType1ESet = type1ESet;
        type1 = TYPE1_EDEFAULT;
        type1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1, oldType1, TYPE1_EDEFAULT, oldType1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType1()
    {
        return type1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE:
                return basicSetType(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE:
                return getType();
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__ID:
                return getId();
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1:
                return getType1();
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
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE:
                setType((TypeType)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__ID:
                setId((String)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1:
                setType1((TypeBaseType)newValue);
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
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE:
                setType((TypeType)null);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1:
                unsetType1();
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
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE:
                return type != null;
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case UmlPackage.OWNED_ATTRIBUTE_BASE_TYPE__TYPE1:
                return isSetType1();
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
        result.append(" (id: ");
        result.append(id);
        result.append(", type1: ");
        if (type1ESet) result.append(type1); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //OwnedAttributeBaseTypeImpl
