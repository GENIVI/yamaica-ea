/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.OperationTypeType;
import xmei.StereotypeType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#isConst <em>Const</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#getPure <em>Pure</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#getReturnarray <em>Returnarray</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeTypeImpl#getSynchronised <em>Synchronised</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationTypeTypeImpl extends MinimalEObjectImpl.Container implements OperationTypeType
{
    /**
     * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected static final String CONCURRENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConcurrency()
     * @generated
     * @ordered
     */
    protected String concurrency = CONCURRENCY_EDEFAULT;

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
     * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsAbstract()
     * @generated
     * @ordered
     */
    protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

    /**
     * This is true if the Is Abstract attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isAbstractESet;

    /**
     * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsQuery()
     * @generated
     * @ordered
     */
    protected static final boolean IS_QUERY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsQuery()
     * @generated
     * @ordered
     */
    protected boolean isQuery = IS_QUERY_EDEFAULT;

    /**
     * This is true if the Is Query attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isQueryESet;

    /**
     * The default value of the '{@link #getPure() <em>Pure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPure()
     * @generated
     * @ordered
     */
    protected static final int PURE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPure() <em>Pure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPure()
     * @generated
     * @ordered
     */
    protected int pure = PURE_EDEFAULT;

    /**
     * This is true if the Pure attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pureESet;

    /**
     * The default value of the '{@link #getReturnarray() <em>Returnarray</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnarray()
     * @generated
     * @ordered
     */
    protected static final int RETURNARRAY_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getReturnarray() <em>Returnarray</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnarray()
     * @generated
     * @ordered
     */
    protected int returnarray = RETURNARRAY_EDEFAULT;

    /**
     * This is true if the Returnarray attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean returnarrayESet;

    /**
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected boolean static_ = STATIC_EDEFAULT;

    /**
     * This is true if the Static attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean staticESet;

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
     * The default value of the '{@link #getSynchronised() <em>Synchronised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronised()
     * @generated
     * @ordered
     */
    protected static final int SYNCHRONISED_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getSynchronised() <em>Synchronised</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronised()
     * @generated
     * @ordered
     */
    protected int synchronised = SYNCHRONISED_EDEFAULT;

    /**
     * This is true if the Synchronised attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronisedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationTypeTypeImpl()
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
        return XmeiPackage.Literals.OPERATION_TYPE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConcurrency()
    {
        return concurrency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConcurrency(String newConcurrency)
    {
        String oldConcurrency = concurrency;
        concurrency = newConcurrency;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY, oldConcurrency, concurrency));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__CONST, oldConst, const_, !oldConstESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__CONST, oldConst, CONST_EDEFAULT, oldConstESet));
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
    public boolean isIsAbstract()
    {
        return isAbstract;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsAbstract(boolean newIsAbstract)
    {
        boolean oldIsAbstract = isAbstract;
        isAbstract = newIsAbstract;
        boolean oldIsAbstractESet = isAbstractESet;
        isAbstractESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsAbstract()
    {
        boolean oldIsAbstract = isAbstract;
        boolean oldIsAbstractESet = isAbstractESet;
        isAbstract = IS_ABSTRACT_EDEFAULT;
        isAbstractESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsAbstract()
    {
        return isAbstractESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsQuery()
    {
        return isQuery;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsQuery(boolean newIsQuery)
    {
        boolean oldIsQuery = isQuery;
        isQuery = newIsQuery;
        boolean oldIsQueryESet = isQueryESet;
        isQueryESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY, oldIsQuery, isQuery, !oldIsQueryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsQuery()
    {
        boolean oldIsQuery = isQuery;
        boolean oldIsQueryESet = isQueryESet;
        isQuery = IS_QUERY_EDEFAULT;
        isQueryESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY, oldIsQuery, IS_QUERY_EDEFAULT, oldIsQueryESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsQuery()
    {
        return isQueryESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPure()
    {
        return pure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPure(int newPure)
    {
        int oldPure = pure;
        pure = newPure;
        boolean oldPureESet = pureESet;
        pureESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__PURE, oldPure, pure, !oldPureESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPure()
    {
        int oldPure = pure;
        boolean oldPureESet = pureESet;
        pure = PURE_EDEFAULT;
        pureESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__PURE, oldPure, PURE_EDEFAULT, oldPureESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPure()
    {
        return pureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getReturnarray()
    {
        return returnarray;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReturnarray(int newReturnarray)
    {
        int oldReturnarray = returnarray;
        returnarray = newReturnarray;
        boolean oldReturnarrayESet = returnarrayESet;
        returnarrayESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY, oldReturnarray, returnarray, !oldReturnarrayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetReturnarray()
    {
        int oldReturnarray = returnarray;
        boolean oldReturnarrayESet = returnarrayESet;
        returnarray = RETURNARRAY_EDEFAULT;
        returnarrayESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY, oldReturnarray, RETURNARRAY_EDEFAULT, oldReturnarrayESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetReturnarray()
    {
        return returnarrayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic()
    {
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic)
    {
        boolean oldStatic = static_;
        static_ = newStatic;
        boolean oldStaticESet = staticESet;
        staticESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__STATIC, oldStatic, static_, !oldStaticESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetStatic()
    {
        boolean oldStatic = static_;
        boolean oldStaticESet = staticESet;
        static_ = STATIC_EDEFAULT;
        staticESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__STATIC, oldStatic, STATIC_EDEFAULT, oldStaticESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetStatic()
    {
        return staticESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE, oldStereotype, stereotype, !oldStereotypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE, oldStereotype, STEREOTYPE_EDEFAULT, oldStereotypeESet));
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
    public int getSynchronised()
    {
        return synchronised;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSynchronised(int newSynchronised)
    {
        int oldSynchronised = synchronised;
        synchronised = newSynchronised;
        boolean oldSynchronisedESet = synchronisedESet;
        synchronisedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED, oldSynchronised, synchronised, !oldSynchronisedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSynchronised()
    {
        int oldSynchronised = synchronised;
        boolean oldSynchronisedESet = synchronisedESet;
        synchronised = SYNCHRONISED_EDEFAULT;
        synchronisedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED, oldSynchronised, SYNCHRONISED_EDEFAULT, oldSynchronisedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSynchronised()
    {
        return synchronisedESet;
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
            case XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY:
                return getConcurrency();
            case XmeiPackage.OPERATION_TYPE_TYPE__CONST:
                return isConst();
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT:
                return isIsAbstract();
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY:
                return isIsQuery();
            case XmeiPackage.OPERATION_TYPE_TYPE__PURE:
                return getPure();
            case XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY:
                return getReturnarray();
            case XmeiPackage.OPERATION_TYPE_TYPE__STATIC:
                return isStatic();
            case XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE:
                return getStereotype();
            case XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED:
                return getSynchronised();
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
            case XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY:
                setConcurrency((String)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__CONST:
                setConst((Boolean)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY:
                setIsQuery((Boolean)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__PURE:
                setPure((Integer)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY:
                setReturnarray((Integer)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__STATIC:
                setStatic((Boolean)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE:
                setStereotype((StereotypeType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED:
                setSynchronised((Integer)newValue);
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
            case XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY:
                setConcurrency(CONCURRENCY_EDEFAULT);
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__CONST:
                unsetConst();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT:
                unsetIsAbstract();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY:
                unsetIsQuery();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__PURE:
                unsetPure();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY:
                unsetReturnarray();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__STATIC:
                unsetStatic();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE:
                unsetStereotype();
                return;
            case XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED:
                unsetSynchronised();
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
            case XmeiPackage.OPERATION_TYPE_TYPE__CONCURRENCY:
                return CONCURRENCY_EDEFAULT == null ? concurrency != null : !CONCURRENCY_EDEFAULT.equals(concurrency);
            case XmeiPackage.OPERATION_TYPE_TYPE__CONST:
                return isSetConst();
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_ABSTRACT:
                return isSetIsAbstract();
            case XmeiPackage.OPERATION_TYPE_TYPE__IS_QUERY:
                return isSetIsQuery();
            case XmeiPackage.OPERATION_TYPE_TYPE__PURE:
                return isSetPure();
            case XmeiPackage.OPERATION_TYPE_TYPE__RETURNARRAY:
                return isSetReturnarray();
            case XmeiPackage.OPERATION_TYPE_TYPE__STATIC:
                return isSetStatic();
            case XmeiPackage.OPERATION_TYPE_TYPE__STEREOTYPE:
                return isSetStereotype();
            case XmeiPackage.OPERATION_TYPE_TYPE__SYNCHRONISED:
                return isSetSynchronised();
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
        result.append(" (concurrency: ");
        result.append(concurrency);
        result.append(", const: ");
        if (constESet) result.append(const_); else result.append("<unset>");
        result.append(", isAbstract: ");
        if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
        result.append(", isQuery: ");
        if (isQueryESet) result.append(isQuery); else result.append("<unset>");
        result.append(", pure: ");
        if (pureESet) result.append(pure); else result.append("<unset>");
        result.append(", returnarray: ");
        if (returnarrayESet) result.append(returnarray); else result.append("<unset>");
        result.append(", static: ");
        if (staticESet) result.append(static_); else result.append("<unset>");
        result.append(", stereotype: ");
        if (stereotypeESet) result.append(stereotype); else result.append("<unset>");
        result.append(", synchronised: ");
        if (synchronisedESet) result.append(synchronised); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //OperationTypeTypeImpl
