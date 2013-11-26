/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.VisibilityType;

import xmei.PropertiesType;
import xmei.STypeType;
import xmei.StereotypeType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getGenlinks <em>Genlinks</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#isIsSpecification <em>Is Specification</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.impl.PropertiesTypeImpl#getSType <em>SType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertiesTypeImpl extends MinimalEObjectImpl.Container implements PropertiesType
{
    /**
     * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassName()
     * @generated
     * @ordered
     */
    protected static final String CLASS_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassName()
     * @generated
     * @ordered
     */
    protected String className = CLASS_NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected static final String DOCUMENTATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected String documentation = DOCUMENTATION_EDEFAULT;

    /**
     * The default value of the '{@link #getGenlinks() <em>Genlinks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenlinks()
     * @generated
     * @ordered
     */
    protected static final String GENLINKS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGenlinks() <em>Genlinks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenlinks()
     * @generated
     * @ordered
     */
    protected String genlinks = GENLINKS_EDEFAULT;

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
     * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsActive()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ACTIVE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsActive()
     * @generated
     * @ordered
     */
    protected boolean isActive = IS_ACTIVE_EDEFAULT;

    /**
     * This is true if the Is Active attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isActiveESet;

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
     * The default value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSpecification()
     * @generated
     * @ordered
     */
    protected static final boolean IS_SPECIFICATION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsSpecification() <em>Is Specification</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsSpecification()
     * @generated
     * @ordered
     */
    protected boolean isSpecification = IS_SPECIFICATION_EDEFAULT;

    /**
     * This is true if the Is Specification attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isSpecificationESet;

    /**
     * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected static final VisibilityType SCOPE_EDEFAULT = VisibilityType.PUBLIC;

    /**
     * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScope()
     * @generated
     * @ordered
     */
    protected VisibilityType scope = SCOPE_EDEFAULT;

    /**
     * This is true if the Scope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean scopeESet;

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
     * The default value of the '{@link #getSType() <em>SType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSType()
     * @generated
     * @ordered
     */
    protected static final STypeType STYPE_EDEFAULT = STypeType.CLASS;

    /**
     * The cached value of the '{@link #getSType() <em>SType</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSType()
     * @generated
     * @ordered
     */
    protected STypeType sType = STYPE_EDEFAULT;

    /**
     * This is true if the SType attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertiesTypeImpl()
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
        return XmeiPackage.Literals.PROPERTIES_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClassName()
    {
        return className;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClassName(String newClassName)
    {
        String oldClassName = className;
        className = newClassName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__CLASS_NAME, oldClassName, className));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDocumentation()
    {
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(String newDocumentation)
    {
        String oldDocumentation = documentation;
        documentation = newDocumentation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION, oldDocumentation, documentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGenlinks()
    {
        return genlinks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGenlinks(String newGenlinks)
    {
        String oldGenlinks = genlinks;
        genlinks = newGenlinks;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__GENLINKS, oldGenlinks, genlinks));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT, oldIsAbstract, isAbstract, !oldIsAbstractESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT, oldIsAbstract, IS_ABSTRACT_EDEFAULT, oldIsAbstractESet));
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
    public boolean isIsActive()
    {
        return isActive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsActive(boolean newIsActive)
    {
        boolean oldIsActive = isActive;
        isActive = newIsActive;
        boolean oldIsActiveESet = isActiveESet;
        isActiveESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE, oldIsActive, isActive, !oldIsActiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsActive()
    {
        boolean oldIsActive = isActive;
        boolean oldIsActiveESet = isActiveESet;
        isActive = IS_ACTIVE_EDEFAULT;
        isActiveESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE, oldIsActive, IS_ACTIVE_EDEFAULT, oldIsActiveESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsActive()
    {
        return isActiveESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__IS_LEAF, oldIsLeaf, isLeaf, !oldIsLeafESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__IS_LEAF, oldIsLeaf, IS_LEAF_EDEFAULT, oldIsLeafESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__IS_ROOT, oldIsRoot, isRoot, !oldIsRootESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__IS_ROOT, oldIsRoot, IS_ROOT_EDEFAULT, oldIsRootESet));
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
    public boolean isIsSpecification()
    {
        return isSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsSpecification(boolean newIsSpecification)
    {
        boolean oldIsSpecification = isSpecification;
        isSpecification = newIsSpecification;
        boolean oldIsSpecificationESet = isSpecificationESet;
        isSpecificationESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION, oldIsSpecification, isSpecification, !oldIsSpecificationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsSpecification()
    {
        boolean oldIsSpecification = isSpecification;
        boolean oldIsSpecificationESet = isSpecificationESet;
        isSpecification = IS_SPECIFICATION_EDEFAULT;
        isSpecificationESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION, oldIsSpecification, IS_SPECIFICATION_EDEFAULT, oldIsSpecificationESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsSpecification()
    {
        return isSpecificationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityType getScope()
    {
        return scope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScope(VisibilityType newScope)
    {
        VisibilityType oldScope = scope;
        scope = newScope == null ? SCOPE_EDEFAULT : newScope;
        boolean oldScopeESet = scopeESet;
        scopeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetScope()
    {
        VisibilityType oldScope = scope;
        boolean oldScopeESet = scopeESet;
        scope = SCOPE_EDEFAULT;
        scopeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetScope()
    {
        return scopeESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__STEREOTYPE, oldStereotype, stereotype, !oldStereotypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__STEREOTYPE, oldStereotype, STEREOTYPE_EDEFAULT, oldStereotypeESet));
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
    public STypeType getSType()
    {
        return sType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSType(STypeType newSType)
    {
        STypeType oldSType = sType;
        sType = newSType == null ? STYPE_EDEFAULT : newSType;
        boolean oldSTypeESet = sTypeESet;
        sTypeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROPERTIES_TYPE__STYPE, oldSType, sType, !oldSTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetSType()
    {
        STypeType oldSType = sType;
        boolean oldSTypeESet = sTypeESet;
        sType = STYPE_EDEFAULT;
        sTypeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.PROPERTIES_TYPE__STYPE, oldSType, STYPE_EDEFAULT, oldSTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetSType()
    {
        return sTypeESet;
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
            case XmeiPackage.PROPERTIES_TYPE__CLASS_NAME:
                return getClassName();
            case XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.PROPERTIES_TYPE__GENLINKS:
                return getGenlinks();
            case XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT:
                return isIsAbstract();
            case XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE:
                return isIsActive();
            case XmeiPackage.PROPERTIES_TYPE__IS_LEAF:
                return isIsLeaf();
            case XmeiPackage.PROPERTIES_TYPE__IS_ROOT:
                return isIsRoot();
            case XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION:
                return isIsSpecification();
            case XmeiPackage.PROPERTIES_TYPE__SCOPE:
                return getScope();
            case XmeiPackage.PROPERTIES_TYPE__STEREOTYPE:
                return getStereotype();
            case XmeiPackage.PROPERTIES_TYPE__STYPE:
                return getSType();
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
            case XmeiPackage.PROPERTIES_TYPE__CLASS_NAME:
                setClassName((String)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION:
                setDocumentation((String)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__GENLINKS:
                setGenlinks((String)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT:
                setIsAbstract((Boolean)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE:
                setIsActive((Boolean)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_LEAF:
                setIsLeaf((Boolean)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ROOT:
                setIsRoot((Boolean)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION:
                setIsSpecification((Boolean)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__SCOPE:
                setScope((VisibilityType)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__STEREOTYPE:
                setStereotype((StereotypeType)newValue);
                return;
            case XmeiPackage.PROPERTIES_TYPE__STYPE:
                setSType((STypeType)newValue);
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
            case XmeiPackage.PROPERTIES_TYPE__CLASS_NAME:
                setClassName(CLASS_NAME_EDEFAULT);
                return;
            case XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION:
                setDocumentation(DOCUMENTATION_EDEFAULT);
                return;
            case XmeiPackage.PROPERTIES_TYPE__GENLINKS:
                setGenlinks(GENLINKS_EDEFAULT);
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT:
                unsetIsAbstract();
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE:
                unsetIsActive();
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_LEAF:
                unsetIsLeaf();
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_ROOT:
                unsetIsRoot();
                return;
            case XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION:
                unsetIsSpecification();
                return;
            case XmeiPackage.PROPERTIES_TYPE__SCOPE:
                unsetScope();
                return;
            case XmeiPackage.PROPERTIES_TYPE__STEREOTYPE:
                unsetStereotype();
                return;
            case XmeiPackage.PROPERTIES_TYPE__STYPE:
                unsetSType();
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
            case XmeiPackage.PROPERTIES_TYPE__CLASS_NAME:
                return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
            case XmeiPackage.PROPERTIES_TYPE__DOCUMENTATION:
                return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
            case XmeiPackage.PROPERTIES_TYPE__GENLINKS:
                return GENLINKS_EDEFAULT == null ? genlinks != null : !GENLINKS_EDEFAULT.equals(genlinks);
            case XmeiPackage.PROPERTIES_TYPE__IS_ABSTRACT:
                return isSetIsAbstract();
            case XmeiPackage.PROPERTIES_TYPE__IS_ACTIVE:
                return isSetIsActive();
            case XmeiPackage.PROPERTIES_TYPE__IS_LEAF:
                return isSetIsLeaf();
            case XmeiPackage.PROPERTIES_TYPE__IS_ROOT:
                return isSetIsRoot();
            case XmeiPackage.PROPERTIES_TYPE__IS_SPECIFICATION:
                return isSetIsSpecification();
            case XmeiPackage.PROPERTIES_TYPE__SCOPE:
                return isSetScope();
            case XmeiPackage.PROPERTIES_TYPE__STEREOTYPE:
                return isSetStereotype();
            case XmeiPackage.PROPERTIES_TYPE__STYPE:
                return isSetSType();
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
        result.append(" (className: ");
        result.append(className);
        result.append(", documentation: ");
        result.append(documentation);
        result.append(", genlinks: ");
        result.append(genlinks);
        result.append(", isAbstract: ");
        if (isAbstractESet) result.append(isAbstract); else result.append("<unset>");
        result.append(", isActive: ");
        if (isActiveESet) result.append(isActive); else result.append("<unset>");
        result.append(", isLeaf: ");
        if (isLeafESet) result.append(isLeaf); else result.append("<unset>");
        result.append(", isRoot: ");
        if (isRootESet) result.append(isRoot); else result.append("<unset>");
        result.append(", isSpecification: ");
        if (isSpecificationESet) result.append(isSpecification); else result.append("<unset>");
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(", stereotype: ");
        if (stereotypeESet) result.append(stereotype); else result.append("<unset>");
        result.append(", sType: ");
        if (sTypeESet) result.append(sType); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //PropertiesTypeImpl
