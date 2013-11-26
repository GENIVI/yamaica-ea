/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorLabelsType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Labels Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorLabelsTypeImpl#getLb <em>Lb</em>}</li>
 *   <li>{@link xmei.impl.ConnectorLabelsTypeImpl#getMb <em>Mb</em>}</li>
 *   <li>{@link xmei.impl.ConnectorLabelsTypeImpl#getMt <em>Mt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorLabelsTypeImpl extends MinimalEObjectImpl.Container implements ConnectorLabelsType
{
    /**
     * The default value of the '{@link #getLb() <em>Lb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLb()
     * @generated
     * @ordered
     */
    protected static final String LB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLb() <em>Lb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLb()
     * @generated
     * @ordered
     */
    protected String lb = LB_EDEFAULT;

    /**
     * The default value of the '{@link #getMb() <em>Mb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMb()
     * @generated
     * @ordered
     */
    protected static final String MB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMb() <em>Mb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMb()
     * @generated
     * @ordered
     */
    protected String mb = MB_EDEFAULT;

    /**
     * The default value of the '{@link #getMt() <em>Mt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMt()
     * @generated
     * @ordered
     */
    protected static final String MT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMt() <em>Mt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMt()
     * @generated
     * @ordered
     */
    protected String mt = MT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorLabelsTypeImpl()
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
        return XmeiPackage.Literals.CONNECTOR_LABELS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLb()
    {
        return lb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLb(String newLb)
    {
        String oldLb = lb;
        lb = newLb;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_LABELS_TYPE__LB, oldLb, lb));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMb()
    {
        return mb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMb(String newMb)
    {
        String oldMb = mb;
        mb = newMb;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_LABELS_TYPE__MB, oldMb, mb));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMt()
    {
        return mt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMt(String newMt)
    {
        String oldMt = mt;
        mt = newMt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_LABELS_TYPE__MT, oldMt, mt));
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
            case XmeiPackage.CONNECTOR_LABELS_TYPE__LB:
                return getLb();
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MB:
                return getMb();
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MT:
                return getMt();
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
            case XmeiPackage.CONNECTOR_LABELS_TYPE__LB:
                setLb((String)newValue);
                return;
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MB:
                setMb((String)newValue);
                return;
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MT:
                setMt((String)newValue);
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
            case XmeiPackage.CONNECTOR_LABELS_TYPE__LB:
                setLb(LB_EDEFAULT);
                return;
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MB:
                setMb(MB_EDEFAULT);
                return;
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MT:
                setMt(MT_EDEFAULT);
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
            case XmeiPackage.CONNECTOR_LABELS_TYPE__LB:
                return LB_EDEFAULT == null ? lb != null : !LB_EDEFAULT.equals(lb);
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MB:
                return MB_EDEFAULT == null ? mb != null : !MB_EDEFAULT.equals(mb);
            case XmeiPackage.CONNECTOR_LABELS_TYPE__MT:
                return MT_EDEFAULT == null ? mt != null : !MT_EDEFAULT.equals(mt);
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
        result.append(" (lb: ");
        result.append(lb);
        result.append(", mb: ");
        result.append(mb);
        result.append(", mt: ");
        result.append(mt);
        result.append(')');
        return result.toString();
    }

} //ConnectorLabelsTypeImpl
