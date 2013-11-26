/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ModelType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ModelTypeImpl#getEaEleType <em>Ea Ele Type</em>}</li>
 *   <li>{@link xmei.impl.ModelTypeImpl#getEaLocalid <em>Ea Localid</em>}</li>
 *   <li>{@link xmei.impl.ModelTypeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link xmei.impl.ModelTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link xmei.impl.ModelTypeImpl#getPackage2 <em>Package2</em>}</li>
 *   <li>{@link xmei.impl.ModelTypeImpl#getTpos <em>Tpos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelTypeImpl extends MinimalEObjectImpl.Container implements ModelType
{
    /**
     * The default value of the '{@link #getEaEleType() <em>Ea Ele Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaEleType()
     * @generated
     * @ordered
     */
    protected static final String EA_ELE_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEaEleType() <em>Ea Ele Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEaEleType()
     * @generated
     * @ordered
     */
    protected String eaEleType = EA_ELE_TYPE_EDEFAULT;

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
     * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected static final String OWNER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOwner()
     * @generated
     * @ordered
     */
    protected String owner = OWNER_EDEFAULT;

    /**
     * The default value of the '{@link #getPackage() <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackage()
     * @generated
     * @ordered
     */
    protected static final String PACKAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPackage() <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackage()
     * @generated
     * @ordered
     */
    protected String package_ = PACKAGE_EDEFAULT;

    /**
     * The default value of the '{@link #getPackage2() <em>Package2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackage2()
     * @generated
     * @ordered
     */
    protected static final String PACKAGE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPackage2() <em>Package2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackage2()
     * @generated
     * @ordered
     */
    protected String package2 = PACKAGE2_EDEFAULT;

    /**
     * The default value of the '{@link #getTpos() <em>Tpos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpos()
     * @generated
     * @ordered
     */
    protected static final int TPOS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTpos() <em>Tpos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpos()
     * @generated
     * @ordered
     */
    protected int tpos = TPOS_EDEFAULT;

    /**
     * This is true if the Tpos attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tposESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelTypeImpl()
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
        return XmeiPackage.Literals.MODEL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEaEleType()
    {
        return eaEleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEaEleType(String newEaEleType)
    {
        String oldEaEleType = eaEleType;
        eaEleType = newEaEleType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__EA_ELE_TYPE, oldEaEleType, eaEleType));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__EA_LOCALID, oldEaLocalid, eaLocalid, !oldEaLocalidESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.MODEL_TYPE__EA_LOCALID, oldEaLocalid, EA_LOCALID_EDEFAULT, oldEaLocalidESet));
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
    public String getOwner()
    {
        return owner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOwner(String newOwner)
    {
        String oldOwner = owner;
        owner = newOwner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__OWNER, oldOwner, owner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPackage()
    {
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage(String newPackage)
    {
        String oldPackage = package_;
        package_ = newPackage;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__PACKAGE, oldPackage, package_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPackage2()
    {
        return package2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPackage2(String newPackage2)
    {
        String oldPackage2 = package2;
        package2 = newPackage2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__PACKAGE2, oldPackage2, package2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTpos()
    {
        return tpos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTpos(int newTpos)
    {
        int oldTpos = tpos;
        tpos = newTpos;
        boolean oldTposESet = tposESet;
        tposESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.MODEL_TYPE__TPOS, oldTpos, tpos, !oldTposESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetTpos()
    {
        int oldTpos = tpos;
        boolean oldTposESet = tposESet;
        tpos = TPOS_EDEFAULT;
        tposESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.MODEL_TYPE__TPOS, oldTpos, TPOS_EDEFAULT, oldTposESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetTpos()
    {
        return tposESet;
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
            case XmeiPackage.MODEL_TYPE__EA_ELE_TYPE:
                return getEaEleType();
            case XmeiPackage.MODEL_TYPE__EA_LOCALID:
                return getEaLocalid();
            case XmeiPackage.MODEL_TYPE__OWNER:
                return getOwner();
            case XmeiPackage.MODEL_TYPE__PACKAGE:
                return getPackage();
            case XmeiPackage.MODEL_TYPE__PACKAGE2:
                return getPackage2();
            case XmeiPackage.MODEL_TYPE__TPOS:
                return getTpos();
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
            case XmeiPackage.MODEL_TYPE__EA_ELE_TYPE:
                setEaEleType((String)newValue);
                return;
            case XmeiPackage.MODEL_TYPE__EA_LOCALID:
                setEaLocalid((Integer)newValue);
                return;
            case XmeiPackage.MODEL_TYPE__OWNER:
                setOwner((String)newValue);
                return;
            case XmeiPackage.MODEL_TYPE__PACKAGE:
                setPackage((String)newValue);
                return;
            case XmeiPackage.MODEL_TYPE__PACKAGE2:
                setPackage2((String)newValue);
                return;
            case XmeiPackage.MODEL_TYPE__TPOS:
                setTpos((Integer)newValue);
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
            case XmeiPackage.MODEL_TYPE__EA_ELE_TYPE:
                setEaEleType(EA_ELE_TYPE_EDEFAULT);
                return;
            case XmeiPackage.MODEL_TYPE__EA_LOCALID:
                unsetEaLocalid();
                return;
            case XmeiPackage.MODEL_TYPE__OWNER:
                setOwner(OWNER_EDEFAULT);
                return;
            case XmeiPackage.MODEL_TYPE__PACKAGE:
                setPackage(PACKAGE_EDEFAULT);
                return;
            case XmeiPackage.MODEL_TYPE__PACKAGE2:
                setPackage2(PACKAGE2_EDEFAULT);
                return;
            case XmeiPackage.MODEL_TYPE__TPOS:
                unsetTpos();
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
            case XmeiPackage.MODEL_TYPE__EA_ELE_TYPE:
                return EA_ELE_TYPE_EDEFAULT == null ? eaEleType != null : !EA_ELE_TYPE_EDEFAULT.equals(eaEleType);
            case XmeiPackage.MODEL_TYPE__EA_LOCALID:
                return isSetEaLocalid();
            case XmeiPackage.MODEL_TYPE__OWNER:
                return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
            case XmeiPackage.MODEL_TYPE__PACKAGE:
                return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
            case XmeiPackage.MODEL_TYPE__PACKAGE2:
                return PACKAGE2_EDEFAULT == null ? package2 != null : !PACKAGE2_EDEFAULT.equals(package2);
            case XmeiPackage.MODEL_TYPE__TPOS:
                return isSetTpos();
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
        result.append(" (eaEleType: ");
        result.append(eaEleType);
        result.append(", eaLocalid: ");
        if (eaLocalidESet) result.append(eaLocalid); else result.append("<unset>");
        result.append(", owner: ");
        result.append(owner);
        result.append(", package: ");
        result.append(package_);
        result.append(", package2: ");
        result.append(package2);
        result.append(", tpos: ");
        if (tposESet) result.append(tpos); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ModelTypeImpl
