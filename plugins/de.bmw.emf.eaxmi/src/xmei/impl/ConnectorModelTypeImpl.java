/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorModelType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorModelTypeImpl#getEaLocalid <em>Ea Localid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorModelTypeImpl extends MinimalEObjectImpl.Container implements ConnectorModelType
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorModelTypeImpl()
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
        return XmeiPackage.Literals.CONNECTOR_MODEL_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID, oldEaLocalid, eaLocalid, !oldEaLocalidESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID, oldEaLocalid, EA_LOCALID_EDEFAULT, oldEaLocalidESet));
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
            case XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID:
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
            case XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID:
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
            case XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID:
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
            case XmeiPackage.CONNECTOR_MODEL_TYPE__EA_LOCALID:
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
        result.append(" (eaLocalid: ");
        if (eaLocalidESet) result.append(eaLocalid); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConnectorModelTypeImpl
