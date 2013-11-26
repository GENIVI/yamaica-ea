/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ParameterPropertiesType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ParameterPropertiesTypeImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link xmei.impl.ParameterPropertiesTypeImpl#isConst <em>Const</em>}</li>
 *   <li>{@link xmei.impl.ParameterPropertiesTypeImpl#getEaGuid <em>Ea Guid</em>}</li>
 *   <li>{@link xmei.impl.ParameterPropertiesTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link xmei.impl.ParameterPropertiesTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ParameterPropertiesType
{
    /**
     * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected static final String CLASSIFIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected String classifier = CLASSIFIER_EDEFAULT;

    /**
     * The default value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected static final boolean CONST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isConst() <em>Const</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isConst()
     * @generated
     * @ordered
     */
    protected boolean const_ = CONST_EDEFAULT;

    /**
     * This is true if the Const attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean constESet;

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
     * The default value of the '{@link #getPos() <em>Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPos()
     * @generated
     * @ordered
     */
    protected static final int POS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPos() <em>Pos</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPos()
     * @generated
     * @ordered
     */
    protected int pos = POS_EDEFAULT;

    /**
     * This is true if the Pos attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean posESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterPropertiesTypeImpl()
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
        return XmeiPackage.Literals.PARAMETER_PROPERTIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClassifier()
    {
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClassifier(String newClassifier)
    {
        String oldClassifier = classifier;
        classifier = newClassifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__CLASSIFIER, oldClassifier, classifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isConst()
    {
        return const_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConst(boolean newConst)
    {
        boolean oldConst = const_;
        const_ = newConst;
        boolean oldConstESet = constESet;
        constESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST, oldConst, const_, !oldConstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetConst()
    {
        boolean oldConst = const_;
        boolean oldConstESet = constESet;
        const_ = CONST_EDEFAULT;
        constESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST, oldConst, CONST_EDEFAULT, oldConstESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetConst()
    {
        return constESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__EA_GUID, oldEaGuid, eaGuid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPos()
    {
        return pos;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPos(int newPos)
    {
        int oldPos = pos;
        pos = newPos;
        boolean oldPosESet = posESet;
        posESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS, oldPos, pos, !oldPosESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPos()
    {
        int oldPos = pos;
        boolean oldPosESet = posESet;
        pos = POS_EDEFAULT;
        posESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS, oldPos, POS_EDEFAULT, oldPosESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPos()
    {
        return posESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType)
    {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PARAMETER_PROPERTIES_TYPE__TYPE, oldType, type));
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
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CLASSIFIER:
                return getClassifier();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST:
                return isConst();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__EA_GUID:
                return getEaGuid();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS:
                return getPos();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__TYPE:
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
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CLASSIFIER:
                setClassifier((String)newValue);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST:
                setConst((Boolean)newValue);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__EA_GUID:
                setEaGuid((String)newValue);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS:
                setPos((Integer)newValue);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__TYPE:
                setType((String)newValue);
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
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CLASSIFIER:
                setClassifier(CLASSIFIER_EDEFAULT);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST:
                unsetConst();
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__EA_GUID:
                setEaGuid(EA_GUID_EDEFAULT);
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS:
                unsetPos();
                return;
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CLASSIFIER:
                return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__CONST:
                return isSetConst();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__EA_GUID:
                return EA_GUID_EDEFAULT == null ? eaGuid != null : !EA_GUID_EDEFAULT.equals(eaGuid);
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__POS:
                return isSetPos();
            case XmeiPackage.PARAMETER_PROPERTIES_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(" (classifier: ");
        result.append(classifier);
        result.append(", const: ");
        if (constESet) result.append(const_); else result.append("<unset>");
        result.append(", eaGuid: ");
        result.append(eaGuid);
        result.append(", pos: ");
        if (posESet) result.append(pos); else result.append("<unset>");
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //ParameterPropertiesTypeImpl
