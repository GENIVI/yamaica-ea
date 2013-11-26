/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.AsyncSyncType;
import xmei.ExtendedPropertiesType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extended Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getPrivatedata1 <em>Privatedata1</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getPrivatedata2 <em>Privatedata2</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getPrivatedata3 <em>Privatedata3</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getPrivatedata4 <em>Privatedata4</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getPrivatedata5 <em>Privatedata5</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getSequencePoints <em>Sequence Points</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getStateflags <em>Stateflags</em>}</li>
 *   <li>{@link xmei.impl.ExtendedPropertiesTypeImpl#getVirtualInheritance <em>Virtual Inheritance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtendedPropertiesTypeImpl extends MinimalEObjectImpl.Container implements ExtendedPropertiesType
{
    /**
     * The default value of the '{@link #getConditional() <em>Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditional()
     * @generated
     * @ordered
     */
    protected static final String CONDITIONAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConditional() <em>Conditional</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConditional()
     * @generated
     * @ordered
     */
    protected String conditional = CONDITIONAL_EDEFAULT;

    /**
     * The default value of the '{@link #getDiagram() <em>Diagram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagram()
     * @generated
     * @ordered
     */
    protected static final String DIAGRAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagram()
     * @generated
     * @ordered
     */
    protected String diagram = DIAGRAM_EDEFAULT;

    /**
     * The default value of the '{@link #getPrivatedata1() <em>Privatedata1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata1()
     * @generated
     * @ordered
     */
    protected static final AsyncSyncType PRIVATEDATA1_EDEFAULT = AsyncSyncType.SYNCHRONOUS;

    /**
     * The cached value of the '{@link #getPrivatedata1() <em>Privatedata1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata1()
     * @generated
     * @ordered
     */
    protected AsyncSyncType privatedata1 = PRIVATEDATA1_EDEFAULT;

    /**
     * This is true if the Privatedata1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean privatedata1ESet;

    /**
     * The default value of the '{@link #getPrivatedata2() <em>Privatedata2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata2()
     * @generated
     * @ordered
     */
    protected static final String PRIVATEDATA2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivatedata2() <em>Privatedata2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata2()
     * @generated
     * @ordered
     */
    protected String privatedata2 = PRIVATEDATA2_EDEFAULT;

    /**
     * The default value of the '{@link #getPrivatedata3() <em>Privatedata3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata3()
     * @generated
     * @ordered
     */
    protected static final String PRIVATEDATA3_EDEFAULT = "Call";

    /**
     * The cached value of the '{@link #getPrivatedata3() <em>Privatedata3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata3()
     * @generated
     * @ordered
     */
    protected String privatedata3 = PRIVATEDATA3_EDEFAULT;

    /**
     * This is true if the Privatedata3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean privatedata3ESet;

    /**
     * The default value of the '{@link #getPrivatedata4() <em>Privatedata4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata4()
     * @generated
     * @ordered
     */
    protected static final int PRIVATEDATA4_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPrivatedata4() <em>Privatedata4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata4()
     * @generated
     * @ordered
     */
    protected int privatedata4 = PRIVATEDATA4_EDEFAULT;

    /**
     * This is true if the Privatedata4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean privatedata4ESet;

    /**
     * The default value of the '{@link #getPrivatedata5() <em>Privatedata5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata5()
     * @generated
     * @ordered
     */
    protected static final String PRIVATEDATA5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPrivatedata5() <em>Privatedata5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrivatedata5()
     * @generated
     * @ordered
     */
    protected String privatedata5 = PRIVATEDATA5_EDEFAULT;

    /**
     * The default value of the '{@link #getSequencePoints() <em>Sequence Points</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequencePoints()
     * @generated
     * @ordered
     */
    protected static final String SEQUENCE_POINTS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequencePoints() <em>Sequence Points</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequencePoints()
     * @generated
     * @ordered
     */
    protected String sequencePoints = SEQUENCE_POINTS_EDEFAULT;

    /**
     * The default value of the '{@link #getStateflags() <em>Stateflags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateflags()
     * @generated
     * @ordered
     */
    protected static final String STATEFLAGS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStateflags() <em>Stateflags</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStateflags()
     * @generated
     * @ordered
     */
    protected String stateflags = STATEFLAGS_EDEFAULT;

    /**
     * The default value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtualInheritance()
     * @generated
     * @ordered
     */
    protected static final int VIRTUAL_INHERITANCE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getVirtualInheritance() <em>Virtual Inheritance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVirtualInheritance()
     * @generated
     * @ordered
     */
    protected int virtualInheritance = VIRTUAL_INHERITANCE_EDEFAULT;

    /**
     * This is true if the Virtual Inheritance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean virtualInheritanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtendedPropertiesTypeImpl()
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
        return XmeiPackage.Literals.EXTENDED_PROPERTIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getConditional()
    {
        return conditional;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConditional(String newConditional)
    {
        String oldConditional = conditional;
        conditional = newConditional;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL, oldConditional, conditional));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDiagram()
    {
        return diagram;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagram(String newDiagram)
    {
        String oldDiagram = diagram;
        diagram = newDiagram;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM, oldDiagram, diagram));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsyncSyncType getPrivatedata1()
    {
        return privatedata1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivatedata1(AsyncSyncType newPrivatedata1)
    {
        AsyncSyncType oldPrivatedata1 = privatedata1;
        privatedata1 = newPrivatedata1 == null ? PRIVATEDATA1_EDEFAULT : newPrivatedata1;
        boolean oldPrivatedata1ESet = privatedata1ESet;
        privatedata1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1, oldPrivatedata1, privatedata1, !oldPrivatedata1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPrivatedata1()
    {
        AsyncSyncType oldPrivatedata1 = privatedata1;
        boolean oldPrivatedata1ESet = privatedata1ESet;
        privatedata1 = PRIVATEDATA1_EDEFAULT;
        privatedata1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1, oldPrivatedata1, PRIVATEDATA1_EDEFAULT, oldPrivatedata1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPrivatedata1()
    {
        return privatedata1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivatedata2()
    {
        return privatedata2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivatedata2(String newPrivatedata2)
    {
        String oldPrivatedata2 = privatedata2;
        privatedata2 = newPrivatedata2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2, oldPrivatedata2, privatedata2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivatedata3()
    {
        return privatedata3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivatedata3(String newPrivatedata3)
    {
        String oldPrivatedata3 = privatedata3;
        privatedata3 = newPrivatedata3;
        boolean oldPrivatedata3ESet = privatedata3ESet;
        privatedata3ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3, oldPrivatedata3, privatedata3, !oldPrivatedata3ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPrivatedata3()
    {
        String oldPrivatedata3 = privatedata3;
        boolean oldPrivatedata3ESet = privatedata3ESet;
        privatedata3 = PRIVATEDATA3_EDEFAULT;
        privatedata3ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3, oldPrivatedata3, PRIVATEDATA3_EDEFAULT, oldPrivatedata3ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPrivatedata3()
    {
        return privatedata3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPrivatedata4()
    {
        return privatedata4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivatedata4(int newPrivatedata4)
    {
        int oldPrivatedata4 = privatedata4;
        privatedata4 = newPrivatedata4;
        boolean oldPrivatedata4ESet = privatedata4ESet;
        privatedata4ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4, oldPrivatedata4, privatedata4, !oldPrivatedata4ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetPrivatedata4()
    {
        int oldPrivatedata4 = privatedata4;
        boolean oldPrivatedata4ESet = privatedata4ESet;
        privatedata4 = PRIVATEDATA4_EDEFAULT;
        privatedata4ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4, oldPrivatedata4, PRIVATEDATA4_EDEFAULT, oldPrivatedata4ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetPrivatedata4()
    {
        return privatedata4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPrivatedata5()
    {
        return privatedata5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrivatedata5(String newPrivatedata5)
    {
        String oldPrivatedata5 = privatedata5;
        privatedata5 = newPrivatedata5;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5, oldPrivatedata5, privatedata5));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSequencePoints()
    {
        return sequencePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequencePoints(String newSequencePoints)
    {
        String oldSequencePoints = sequencePoints;
        sequencePoints = newSequencePoints;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS, oldSequencePoints, sequencePoints));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStateflags()
    {
        return stateflags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStateflags(String newStateflags)
    {
        String oldStateflags = stateflags;
        stateflags = newStateflags;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS, oldStateflags, stateflags));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getVirtualInheritance()
    {
        return virtualInheritance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVirtualInheritance(int newVirtualInheritance)
    {
        int oldVirtualInheritance = virtualInheritance;
        virtualInheritance = newVirtualInheritance;
        boolean oldVirtualInheritanceESet = virtualInheritanceESet;
        virtualInheritanceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE, oldVirtualInheritance, virtualInheritance, !oldVirtualInheritanceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVirtualInheritance()
    {
        int oldVirtualInheritance = virtualInheritance;
        boolean oldVirtualInheritanceESet = virtualInheritanceESet;
        virtualInheritance = VIRTUAL_INHERITANCE_EDEFAULT;
        virtualInheritanceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE, oldVirtualInheritance, VIRTUAL_INHERITANCE_EDEFAULT, oldVirtualInheritanceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVirtualInheritance()
    {
        return virtualInheritanceESet;
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
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL:
                return getConditional();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM:
                return getDiagram();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1:
                return getPrivatedata1();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2:
                return getPrivatedata2();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3:
                return getPrivatedata3();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4:
                return getPrivatedata4();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5:
                return getPrivatedata5();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS:
                return getSequencePoints();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS:
                return getStateflags();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE:
                return getVirtualInheritance();
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
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL:
                setConditional((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM:
                setDiagram((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1:
                setPrivatedata1((AsyncSyncType)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2:
                setPrivatedata2((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3:
                setPrivatedata3((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4:
                setPrivatedata4((Integer)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5:
                setPrivatedata5((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS:
                setSequencePoints((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS:
                setStateflags((String)newValue);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE:
                setVirtualInheritance((Integer)newValue);
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
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL:
                setConditional(CONDITIONAL_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM:
                setDiagram(DIAGRAM_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1:
                unsetPrivatedata1();
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2:
                setPrivatedata2(PRIVATEDATA2_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3:
                unsetPrivatedata3();
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4:
                unsetPrivatedata4();
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5:
                setPrivatedata5(PRIVATEDATA5_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS:
                setSequencePoints(SEQUENCE_POINTS_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS:
                setStateflags(STATEFLAGS_EDEFAULT);
                return;
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE:
                unsetVirtualInheritance();
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
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__CONDITIONAL:
                return CONDITIONAL_EDEFAULT == null ? conditional != null : !CONDITIONAL_EDEFAULT.equals(conditional);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__DIAGRAM:
                return DIAGRAM_EDEFAULT == null ? diagram != null : !DIAGRAM_EDEFAULT.equals(diagram);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA1:
                return isSetPrivatedata1();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA2:
                return PRIVATEDATA2_EDEFAULT == null ? privatedata2 != null : !PRIVATEDATA2_EDEFAULT.equals(privatedata2);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA3:
                return isSetPrivatedata3();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA4:
                return isSetPrivatedata4();
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__PRIVATEDATA5:
                return PRIVATEDATA5_EDEFAULT == null ? privatedata5 != null : !PRIVATEDATA5_EDEFAULT.equals(privatedata5);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__SEQUENCE_POINTS:
                return SEQUENCE_POINTS_EDEFAULT == null ? sequencePoints != null : !SEQUENCE_POINTS_EDEFAULT.equals(sequencePoints);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__STATEFLAGS:
                return STATEFLAGS_EDEFAULT == null ? stateflags != null : !STATEFLAGS_EDEFAULT.equals(stateflags);
            case XmeiPackage.EXTENDED_PROPERTIES_TYPE__VIRTUAL_INHERITANCE:
                return isSetVirtualInheritance();
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
        result.append(" (conditional: ");
        result.append(conditional);
        result.append(", diagram: ");
        result.append(diagram);
        result.append(", privatedata1: ");
        if (privatedata1ESet) result.append(privatedata1); else result.append("<unset>");
        result.append(", privatedata2: ");
        result.append(privatedata2);
        result.append(", privatedata3: ");
        if (privatedata3ESet) result.append(privatedata3); else result.append("<unset>");
        result.append(", privatedata4: ");
        if (privatedata4ESet) result.append(privatedata4); else result.append("<unset>");
        result.append(", privatedata5: ");
        result.append(privatedata5);
        result.append(", sequencePoints: ");
        result.append(sequencePoints);
        result.append(", stateflags: ");
        result.append(stateflags);
        result.append(", virtualInheritance: ");
        if (virtualInheritanceESet) result.append(virtualInheritance); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ExtendedPropertiesTypeImpl
