/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.AttributeModelType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.AttributeModelTypeImpl#getEaGuid <em>Ea Guid</em>}</li>
 *   <li>{@link xmei.impl.AttributeModelTypeImpl#getEaLocalid <em>Ea Localid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeModelTypeImpl extends MinimalEObjectImpl.Container implements AttributeModelType
{
    /**
     * The default value of the '{@link #getEaGuid() <em>Ea Guid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaGuid()
     * @generated
     * @ordered
     */
    protected static final String EA_GUID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEaGuid() <em>Ea Guid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaGuid()
     * @generated
     * @ordered
     */
    protected String eaGuid = EA_GUID_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeModelTypeImpl()
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
        return XmeiPackage.Literals.ATTRIBUTE_MODEL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEaGuid()
    {
        return eaGuid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEaGuid(String newEaGuid)
    {
        String oldEaGuid = eaGuid;
        eaGuid = newEaGuid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_GUID, oldEaGuid, eaGuid));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID, oldEaLocalid, eaLocalid, !oldEaLocalidESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID, oldEaLocalid, EA_LOCALID_EDEFAULT, oldEaLocalidESet));
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType)
    {
        switch (featureID)
        {
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_GUID:
                return getEaGuid();
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID:
                return getEaLocalid();
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
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_GUID:
                setEaGuid((String)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID:
                setEaLocalid((Integer)newValue);
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
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_GUID:
                setEaGuid(EA_GUID_EDEFAULT);
                return;
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID:
                unsetEaLocalid();
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
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_GUID:
                return EA_GUID_EDEFAULT == null ? eaGuid != null : !EA_GUID_EDEFAULT.equals(eaGuid);
            case XmeiPackage.ATTRIBUTE_MODEL_TYPE__EA_LOCALID:
                return isSetEaLocalid();
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
        result.append(" (eaGuid: ");
        result.append(eaGuid);
        result.append(", eaLocalid: ");
        if (eaLocalidESet) result.append(eaLocalid); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AttributeModelTypeImpl
