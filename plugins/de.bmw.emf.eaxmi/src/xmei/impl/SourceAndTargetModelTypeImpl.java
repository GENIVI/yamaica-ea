/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.STypeType;
import xmei.SourceAndTargetModelType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Target Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.SourceAndTargetModelTypeImpl#getEaLocalid <em>Ea Localid</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetModelTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetModelTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceAndTargetModelTypeImpl extends MinimalEObjectImpl.Container implements SourceAndTargetModelType
{
    /**
     * The default value of the '{@link #getEaLocalid() <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaLocalid()
     * @generated
     * @ordered
     */
    protected static final int EA_LOCALID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getEaLocalid() <em>Ea Localid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaLocalid()
     * @generated
     * @ordered
     */
    protected int eaLocalid = EA_LOCALID_EDEFAULT;

    /**
     * This is true if the Ea Localid attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eaLocalidESet;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final STypeType TYPE_EDEFAULT = STypeType.CLASS;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected STypeType type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SourceAndTargetModelTypeImpl()
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
        return XmeiPackage.Literals.SOURCE_AND_TARGET_MODEL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getEaLocalid()
    {
        return eaLocalid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEaLocalid(int newEaLocalid)
    {
        int oldEaLocalid = eaLocalid;
        eaLocalid = newEaLocalid;
        boolean oldEaLocalidESet = eaLocalidESet;
        eaLocalidESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID, oldEaLocalid, eaLocalid, !oldEaLocalidESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetEaLocalid()
    {
        int oldEaLocalid = eaLocalid;
        boolean oldEaLocalidESet = eaLocalidESet;
        eaLocalid = EA_LOCALID_EDEFAULT;
        eaLocalidESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID, oldEaLocalid, EA_LOCALID_EDEFAULT, oldEaLocalidESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetEaLocalid()
    {
        return eaLocalidESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public STypeType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(STypeType newType)
    {
        STypeType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType()
    {
        STypeType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType()
    {
        return typeESet;
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
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID:
                return getEaLocalid();
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__NAME:
                return getName();
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE:
                return getType();
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
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID:
                setEaLocalid((Integer)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__NAME:
                setName((String)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE:
                setType((STypeType)newValue);
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
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID:
                unsetEaLocalid();
                return;
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE:
                unsetType();
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
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__EA_LOCALID:
                return isSetEaLocalid();
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XmeiPackage.SOURCE_AND_TARGET_MODEL_TYPE__TYPE:
                return isSetType();
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
        result.append(" (eaLocalid: ");
        if (eaLocalidESet) result.append(eaLocalid); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //SourceAndTargetModelTypeImpl
