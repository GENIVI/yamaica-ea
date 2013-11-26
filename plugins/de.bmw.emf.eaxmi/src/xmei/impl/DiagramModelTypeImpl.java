/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.DiagramModelType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.DiagramModelTypeImpl#getLocalID <em>Local ID</em>}</li>
 *   <li>{@link xmei.impl.DiagramModelTypeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link xmei.impl.DiagramModelTypeImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link xmei.impl.DiagramModelTypeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelTypeImpl extends MinimalEObjectImpl.Container implements DiagramModelType
{
    /**
     * The default value of the '{@link #getLocalID() <em>Local ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalID()
     * @generated
     * @ordered
     */
    protected static final int LOCAL_ID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLocalID() <em>Local ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocalID()
     * @generated
     * @ordered
     */
    protected int localID = LOCAL_ID_EDEFAULT;

    /**
     * This is true if the Local ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean localIDESet;

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
     * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected static final String PARENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParent()
     * @generated
     * @ordered
     */
    protected String parent = PARENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramModelTypeImpl()
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
        return XmeiPackage.Literals.DIAGRAM_MODEL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLocalID()
    {
        return localID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLocalID(int newLocalID)
    {
        int oldLocalID = localID;
        localID = newLocalID;
        boolean oldLocalIDESet = localIDESet;
        localIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID, oldLocalID, localID, !oldLocalIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetLocalID()
    {
        int oldLocalID = localID;
        boolean oldLocalIDESet = localIDESet;
        localID = LOCAL_ID_EDEFAULT;
        localIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID, oldLocalID, LOCAL_ID_EDEFAULT, oldLocalIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetLocalID()
    {
        return localIDESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_MODEL_TYPE__OWNER, oldOwner, owner));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_MODEL_TYPE__PACKAGE, oldPackage, package_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getParent()
    {
        return parent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParent(String newParent)
    {
        String oldParent = parent;
        parent = newParent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_MODEL_TYPE__PARENT, oldParent, parent));
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
            case XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID:
                return getLocalID();
            case XmeiPackage.DIAGRAM_MODEL_TYPE__OWNER:
                return getOwner();
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PACKAGE:
                return getPackage();
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PARENT:
                return getParent();
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
            case XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID:
                setLocalID((Integer)newValue);
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__OWNER:
                setOwner((String)newValue);
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PACKAGE:
                setPackage((String)newValue);
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PARENT:
                setParent((String)newValue);
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
            case XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID:
                unsetLocalID();
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__OWNER:
                setOwner(OWNER_EDEFAULT);
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PACKAGE:
                setPackage(PACKAGE_EDEFAULT);
                return;
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PARENT:
                setParent(PARENT_EDEFAULT);
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
            case XmeiPackage.DIAGRAM_MODEL_TYPE__LOCAL_ID:
                return isSetLocalID();
            case XmeiPackage.DIAGRAM_MODEL_TYPE__OWNER:
                return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PACKAGE:
                return PACKAGE_EDEFAULT == null ? package_ != null : !PACKAGE_EDEFAULT.equals(package_);
            case XmeiPackage.DIAGRAM_MODEL_TYPE__PARENT:
                return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
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
        result.append(" (localID: ");
        if (localIDESet) result.append(localID); else result.append("<unset>");
        result.append(", owner: ");
        result.append(owner);
        result.append(", package: ");
        result.append(package_);
        result.append(", parent: ");
        result.append(parent);
        result.append(')');
        return result.toString();
    }

} //DiagramModelTypeImpl
