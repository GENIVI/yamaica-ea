/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorModifiersType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Modifiers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorModifiersTypeImpl#getChangeable <em>Changeable</em>}</li>
 *   <li>{@link xmei.impl.ConnectorModifiersTypeImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link xmei.impl.ConnectorModifiersTypeImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link xmei.impl.ConnectorModifiersTypeImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link xmei.impl.ConnectorModifiersTypeImpl#isIsRoot <em>Is Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorModifiersTypeImpl extends MinimalEObjectImpl.Container implements ConnectorModifiersType
{
    /**
     * The default value of the '{@link #getChangeable() <em>Changeable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected static final String CHANGEABLE_EDEFAULT = "none";

    /**
     * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected String changeable = CHANGEABLE_EDEFAULT;

    /**
     * This is true if the Changeable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean changeableESet;

    /**
     * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected static final boolean IS_LEAF_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsLeaf()
     * @generated
     * @ordered
     */
    protected boolean isLeaf = IS_LEAF_EDEFAULT;

    /**
     * This is true if the Is Leaf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isLeafESet;

    /**
     * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsNavigable()
     * @generated
     * @ordered
     */
    protected static final boolean IS_NAVIGABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsNavigable()
     * @generated
     * @ordered
     */
    protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

    /**
     * This is true if the Is Navigable attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isNavigableESet;

    /**
     * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ORDERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected boolean isOrdered = IS_ORDERED_EDEFAULT;

    /**
     * This is true if the Is Ordered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isOrderedESet;

    /**
     * The default value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRoot()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ROOT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsRoot() <em>Is Root</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsRoot()
     * @generated
     * @ordered
     */
    protected boolean isRoot = IS_ROOT_EDEFAULT;

    /**
     * This is true if the Is Root attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isRootESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorModifiersTypeImpl()
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
        return XmeiPackage.Literals.CONNECTOR_MODIFIERS_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getChangeable()
    {
        return changeable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChangeable(String newChangeable)
    {
        String oldChangeable = changeable;
        changeable = newChangeable;
        boolean oldChangeableESet = changeableESet;
        changeableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE, oldChangeable, changeable, !oldChangeableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetChangeable()
    {
        String oldChangeable = changeable;
        boolean oldChangeableESet = changeableESet;
        changeable = CHANGEABLE_EDEFAULT;
        changeableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE, oldChangeable, CHANGEABLE_EDEFAULT, oldChangeableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetChangeable()
    {
        return changeableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsLeaf()
    {
        return isLeaf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsLeaf(boolean newIsLeaf)
    {
        boolean oldIsLeaf = isLeaf;
        isLeaf = newIsLeaf;
        boolean oldIsLeafESet = isLeafESet;
        isLeafESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF, oldIsLeaf, isLeaf, !oldIsLeafESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsLeaf()
    {
        boolean oldIsLeaf = isLeaf;
        boolean oldIsLeafESet = isLeafESet;
        isLeaf = IS_LEAF_EDEFAULT;
        isLeafESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF, oldIsLeaf, IS_LEAF_EDEFAULT, oldIsLeafESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsLeaf()
    {
        return isLeafESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsNavigable()
    {
        return isNavigable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsNavigable(boolean newIsNavigable)
    {
        boolean oldIsNavigable = isNavigable;
        isNavigable = newIsNavigable;
        boolean oldIsNavigableESet = isNavigableESet;
        isNavigableESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE, oldIsNavigable, isNavigable, !oldIsNavigableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsNavigable()
    {
        boolean oldIsNavigable = isNavigable;
        boolean oldIsNavigableESet = isNavigableESet;
        isNavigable = IS_NAVIGABLE_EDEFAULT;
        isNavigableESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE, oldIsNavigable, IS_NAVIGABLE_EDEFAULT, oldIsNavigableESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsNavigable()
    {
        return isNavigableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOrdered()
    {
        return isOrdered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOrdered(boolean newIsOrdered)
    {
        boolean oldIsOrdered = isOrdered;
        isOrdered = newIsOrdered;
        boolean oldIsOrderedESet = isOrderedESet;
        isOrderedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED, oldIsOrdered, isOrdered, !oldIsOrderedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsOrdered()
    {
        boolean oldIsOrdered = isOrdered;
        boolean oldIsOrderedESet = isOrderedESet;
        isOrdered = IS_ORDERED_EDEFAULT;
        isOrderedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED, oldIsOrdered, IS_ORDERED_EDEFAULT, oldIsOrderedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsOrdered()
    {
        return isOrderedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsRoot()
    {
        return isRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsRoot(boolean newIsRoot)
    {
        boolean oldIsRoot = isRoot;
        isRoot = newIsRoot;
        boolean oldIsRootESet = isRootESet;
        isRootESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT, oldIsRoot, isRoot, !oldIsRootESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsRoot()
    {
        boolean oldIsRoot = isRoot;
        boolean oldIsRootESet = isRootESet;
        isRoot = IS_ROOT_EDEFAULT;
        isRootESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT, oldIsRoot, IS_ROOT_EDEFAULT, oldIsRootESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsRoot()
    {
        return isRootESet;
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
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE:
                return getChangeable();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF:
                return isIsLeaf();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE:
                return isIsNavigable();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED:
                return isIsOrdered();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT:
                return isIsRoot();
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
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE:
                setChangeable((String)newValue);
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE:
                setIsNavigable((Boolean)newValue);
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT:
                setIsRoot((Boolean)newValue);
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
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE:
                unsetChangeable();
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF:
                unsetIsLeaf();
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE:
                unsetIsNavigable();
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED:
                unsetIsOrdered();
                return;
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT:
                unsetIsRoot();
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
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__CHANGEABLE:
                return isSetChangeable();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_LEAF:
                return isSetIsLeaf();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_NAVIGABLE:
                return isSetIsNavigable();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ORDERED:
                return isSetIsOrdered();
            case XmeiPackage.CONNECTOR_MODIFIERS_TYPE__IS_ROOT:
                return isSetIsRoot();
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
        result.append(" (changeable: ");
        if (changeableESet) result.append(changeable); else result.append("<unset>");
        result.append(", isLeaf: ");
        if (isLeafESet) result.append(isLeaf); else result.append("<unset>");
        result.append(", isNavigable: ");
        if (isNavigableESet) result.append(isNavigable); else result.append("<unset>");
        result.append(", isOrdered: ");
        if (isOrderedESet) result.append(isOrdered); else result.append("<unset>");
        result.append(", isRoot: ");
        if (isRootESet) result.append(isRoot); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ConnectorModifiersTypeImpl
