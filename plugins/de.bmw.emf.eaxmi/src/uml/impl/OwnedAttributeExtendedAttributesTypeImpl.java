/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.OwnedAttributeExtendedAttributesType;
import uml.UmlPackage;
import uml.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Attribute Extended Attributes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.OwnedAttributeExtendedAttributesTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedAttributeExtendedAttributesTypeImpl extends OwnedAttributeBaseTypeImpl implements OwnedAttributeExtendedAttributesType
{
    /**
     * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected static final String AGGREGATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregation()
     * @generated
     * @ordered
     */
    protected String aggregation = AGGREGATION_EDEFAULT;

    /**
     * The default value of the '{@link #getAssociation() <em>Association</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected static final String ASSOCIATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAssociation() <em>Association</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssociation()
     * @generated
     * @ordered
     */
    protected String association = ASSOCIATION_EDEFAULT;

    /**
     * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DERIVED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerived()
     * @generated
     * @ordered
     */
    protected boolean isDerived = IS_DERIVED_EDEFAULT;

    /**
     * This is true if the Is Derived attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isDerivedESet;

    /**
     * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerivedUnion()
     * @generated
     * @ordered
     */
    protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsDerivedUnion()
     * @generated
     * @ordered
     */
    protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

    /**
     * This is true if the Is Derived Union attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isDerivedUnionESet;

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
     * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected static final boolean IS_READ_ONLY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsReadOnly()
     * @generated
     * @ordered
     */
    protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

    /**
     * This is true if the Is Read Only attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isReadOnlyESet;

    /**
     * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStatic()
     * @generated
     * @ordered
     */
    protected boolean isStatic = IS_STATIC_EDEFAULT;

    /**
     * This is true if the Is Static attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isStaticESet;

    /**
     * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected boolean isUnique = IS_UNIQUE_EDEFAULT;

    /**
     * This is true if the Is Unique attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isUniqueESet;

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
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.PUBLIC;

    /**
     * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected VisibilityType visibility = VISIBILITY_EDEFAULT;

    /**
     * This is true if the Visibility attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean visibilityESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedAttributeExtendedAttributesTypeImpl()
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
        return UmlPackage.Literals.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAggregation()
    {
        return aggregation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAggregation(String newAggregation)
    {
        String oldAggregation = aggregation;
        aggregation = newAggregation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION, oldAggregation, aggregation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAssociation()
    {
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssociation(String newAssociation)
    {
        String oldAssociation = association;
        association = newAssociation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION, oldAssociation, association));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDerived()
    {
        return isDerived;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDerived(boolean newIsDerived)
    {
        boolean oldIsDerived = isDerived;
        isDerived = newIsDerived;
        boolean oldIsDerivedESet = isDerivedESet;
        isDerivedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED, oldIsDerived, isDerived, !oldIsDerivedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsDerived()
    {
        boolean oldIsDerived = isDerived;
        boolean oldIsDerivedESet = isDerivedESet;
        isDerived = IS_DERIVED_EDEFAULT;
        isDerivedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED, oldIsDerived, IS_DERIVED_EDEFAULT, oldIsDerivedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsDerived()
    {
        return isDerivedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsDerivedUnion()
    {
        return isDerivedUnion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsDerivedUnion(boolean newIsDerivedUnion)
    {
        boolean oldIsDerivedUnion = isDerivedUnion;
        isDerivedUnion = newIsDerivedUnion;
        boolean oldIsDerivedUnionESet = isDerivedUnionESet;
        isDerivedUnionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion, !oldIsDerivedUnionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsDerivedUnion()
    {
        boolean oldIsDerivedUnion = isDerivedUnion;
        boolean oldIsDerivedUnionESet = isDerivedUnionESet;
        isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;
        isDerivedUnionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION, oldIsDerivedUnion, IS_DERIVED_UNION_EDEFAULT, oldIsDerivedUnionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsDerivedUnion()
    {
        return isDerivedUnionESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED, oldIsOrdered, isOrdered, !oldIsOrderedESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED, oldIsOrdered, IS_ORDERED_EDEFAULT, oldIsOrderedESet));
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
    public boolean isIsReadOnly()
    {
        return isReadOnly;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsReadOnly(boolean newIsReadOnly)
    {
        boolean oldIsReadOnly = isReadOnly;
        isReadOnly = newIsReadOnly;
        boolean oldIsReadOnlyESet = isReadOnlyESet;
        isReadOnlyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY, oldIsReadOnly, isReadOnly, !oldIsReadOnlyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsReadOnly()
    {
        boolean oldIsReadOnly = isReadOnly;
        boolean oldIsReadOnlyESet = isReadOnlyESet;
        isReadOnly = IS_READ_ONLY_EDEFAULT;
        isReadOnlyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY, oldIsReadOnly, IS_READ_ONLY_EDEFAULT, oldIsReadOnlyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsReadOnly()
    {
        return isReadOnlyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStatic()
    {
        return isStatic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStatic(boolean newIsStatic)
    {
        boolean oldIsStatic = isStatic;
        isStatic = newIsStatic;
        boolean oldIsStaticESet = isStaticESet;
        isStaticESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC, oldIsStatic, isStatic, !oldIsStaticESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsStatic()
    {
        boolean oldIsStatic = isStatic;
        boolean oldIsStaticESet = isStaticESet;
        isStatic = IS_STATIC_EDEFAULT;
        isStaticESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC, oldIsStatic, IS_STATIC_EDEFAULT, oldIsStaticESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsStatic()
    {
        return isStaticESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnique()
    {
        return isUnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnique(boolean newIsUnique)
    {
        boolean oldIsUnique = isUnique;
        isUnique = newIsUnique;
        boolean oldIsUniqueESet = isUniqueESet;
        isUniqueESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE, oldIsUnique, isUnique, !oldIsUniqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsUnique()
    {
        boolean oldIsUnique = isUnique;
        boolean oldIsUniqueESet = isUniqueESet;
        isUnique = IS_UNIQUE_EDEFAULT;
        isUniqueESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE, oldIsUnique, IS_UNIQUE_EDEFAULT, oldIsUniqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsUnique()
    {
        return isUniqueESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityType getVisibility()
    {
        return visibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(VisibilityType newVisibility)
    {
        VisibilityType oldVisibility = visibility;
        visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
        boolean oldVisibilityESet = visibilityESet;
        visibilityESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVisibility()
    {
        VisibilityType oldVisibility = visibility;
        boolean oldVisibilityESet = visibilityESet;
        visibility = VISIBILITY_EDEFAULT;
        visibilityESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVisibility()
    {
        return visibilityESet;
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION:
                return getAggregation();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION:
                return getAssociation();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED:
                return isIsDerived();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION:
                return isIsDerivedUnion();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED:
                return isIsOrdered();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY:
                return isIsReadOnly();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC:
                return isIsStatic();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE:
                return isIsUnique();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME:
                return getName();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY:
                return getVisibility();
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION:
                setAggregation((String)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION:
                setAssociation((String)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED:
                setIsDerived((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION:
                setIsDerivedUnion((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY:
                setIsReadOnly((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC:
                setIsStatic((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE:
                setIsUnique((Boolean)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME:
                setName((String)newValue);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY:
                setVisibility((VisibilityType)newValue);
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION:
                setAggregation(AGGREGATION_EDEFAULT);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION:
                setAssociation(ASSOCIATION_EDEFAULT);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED:
                unsetIsDerived();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION:
                unsetIsDerivedUnion();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED:
                unsetIsOrdered();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY:
                unsetIsReadOnly();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC:
                unsetIsStatic();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE:
                unsetIsUnique();
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY:
                unsetVisibility();
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
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__AGGREGATION:
                return AGGREGATION_EDEFAULT == null ? aggregation != null : !AGGREGATION_EDEFAULT.equals(aggregation);
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__ASSOCIATION:
                return ASSOCIATION_EDEFAULT == null ? association != null : !ASSOCIATION_EDEFAULT.equals(association);
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED:
                return isSetIsDerived();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_DERIVED_UNION:
                return isSetIsDerivedUnion();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_ORDERED:
                return isSetIsOrdered();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_READ_ONLY:
                return isSetIsReadOnly();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_STATIC:
                return isSetIsStatic();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__IS_UNIQUE:
                return isSetIsUnique();
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case UmlPackage.OWNED_ATTRIBUTE_EXTENDED_ATTRIBUTES_TYPE__VISIBILITY:
                return isSetVisibility();
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
        result.append(" (aggregation: ");
        result.append(aggregation);
        result.append(", association: ");
        result.append(association);
        result.append(", isDerived: ");
        if (isDerivedESet) result.append(isDerived); else result.append("<unset>");
        result.append(", isDerivedUnion: ");
        if (isDerivedUnionESet) result.append(isDerivedUnion); else result.append("<unset>");
        result.append(", isOrdered: ");
        if (isOrderedESet) result.append(isOrdered); else result.append("<unset>");
        result.append(", isReadOnly: ");
        if (isReadOnlyESet) result.append(isReadOnly); else result.append("<unset>");
        result.append(", isStatic: ");
        if (isStaticESet) result.append(isStatic); else result.append("<unset>");
        result.append(", isUnique: ");
        if (isUniqueESet) result.append(isUnique); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", visibility: ");
        if (visibilityESet) result.append(visibility); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //OwnedAttributeExtendedAttributesTypeImpl
