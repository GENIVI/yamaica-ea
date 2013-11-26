/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.VisibilityType;

import xmei.AttributeContainmentType;
import xmei.AttributeModelType;
import xmei.AttributePropertiesType;
import xmei.AttributeType;
import xmei.BoundsType;
import xmei.DocumentationType;
import xmei.InitialType;
import xmei.StereotypeAttributeType;
import xmei.StyleexType;
import xmei.XmeiPackage;
import xmei.XrefsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getContainment <em>Containment</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getStyleex <em>Styleex</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmei.impl.AttributeTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeTypeImpl extends MinimalEObjectImpl.Container implements AttributeType
{
    /**
     * The cached value of the '{@link #getInitial() <em>Initial</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitial()
     * @generated
     * @ordered
     */
    protected InitialType initial;

    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected DocumentationType documentation;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected AttributeModelType model;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected AttributePropertiesType properties;

    /**
     * The cached value of the '{@link #getContainment() <em>Containment</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected AttributeContainmentType containment;

    /**
     * The cached value of the '{@link #getStereotype() <em>Stereotype</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStereotype()
     * @generated
     * @ordered
     */
    protected StereotypeAttributeType stereotype;

    /**
     * The cached value of the '{@link #getBounds() <em>Bounds</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBounds()
     * @generated
     * @ordered
     */
    protected BoundsType bounds;

    /**
     * The cached value of the '{@link #getStyleex() <em>Styleex</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyleex()
     * @generated
     * @ordered
     */
    protected StyleexType styleex;

    /**
     * The cached value of the '{@link #getXrefs() <em>Xrefs</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXrefs()
     * @generated
     * @ordered
     */
    protected XrefsType xrefs;

    /**
     * The default value of the '{@link #getIdref() <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdref()
     * @generated
     * @ordered
     */
    protected static final String IDREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIdref() <em>Idref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIdref()
     * @generated
     * @ordered
     */
    protected String idref = IDREF_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeTypeImpl()
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
        return XmeiPackage.Literals.ATTRIBUTE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitialType getInitial()
    {
        return initial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitial(InitialType newInitial, NotificationChain msgs)
    {
        InitialType oldInitial = initial;
        initial = newInitial;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__INITIAL, oldInitial, newInitial);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitial(InitialType newInitial)
    {
        if (newInitial != initial)
        {
            NotificationChain msgs = null;
            if (initial != null)
                msgs = ((InternalEObject)initial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__INITIAL, null, msgs);
            if (newInitial != null)
                msgs = ((InternalEObject)newInitial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__INITIAL, null, msgs);
            msgs = basicSetInitial(newInitial, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__INITIAL, newInitial, newInitial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getDocumentation()
    {
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocumentation(DocumentationType newDocumentation, NotificationChain msgs)
    {
        DocumentationType oldDocumentation = documentation;
        documentation = newDocumentation;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(DocumentationType newDocumentation)
    {
        if (newDocumentation != documentation)
        {
            NotificationChain msgs = null;
            if (documentation != null)
                msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION, null, msgs);
            if (newDocumentation != null)
                msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDocumentation(newDocumentation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeModelType getModel()
    {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(AttributeModelType newModel, NotificationChain msgs)
    {
        AttributeModelType oldModel = model;
        model = newModel;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(AttributeModelType newModel)
    {
        if (newModel != model)
        {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributePropertiesType getProperties()
    {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(AttributePropertiesType newProperties, NotificationChain msgs)
    {
        AttributePropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(AttributePropertiesType newProperties)
    {
        if (newProperties != properties)
        {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeContainmentType getContainment()
    {
        return containment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetContainment(AttributeContainmentType newContainment, NotificationChain msgs)
    {
        AttributeContainmentType oldContainment = containment;
        containment = newContainment;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT, oldContainment, newContainment);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainment(AttributeContainmentType newContainment)
    {
        if (newContainment != containment)
        {
            NotificationChain msgs = null;
            if (containment != null)
                msgs = ((InternalEObject)containment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT, null, msgs);
            if (newContainment != null)
                msgs = ((InternalEObject)newContainment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT, null, msgs);
            msgs = basicSetContainment(newContainment, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT, newContainment, newContainment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StereotypeAttributeType getStereotype()
    {
        return stereotype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStereotype(StereotypeAttributeType newStereotype, NotificationChain msgs)
    {
        StereotypeAttributeType oldStereotype = stereotype;
        stereotype = newStereotype;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE, oldStereotype, newStereotype);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStereotype(StereotypeAttributeType newStereotype)
    {
        if (newStereotype != stereotype)
        {
            NotificationChain msgs = null;
            if (stereotype != null)
                msgs = ((InternalEObject)stereotype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE, null, msgs);
            if (newStereotype != null)
                msgs = ((InternalEObject)newStereotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE, null, msgs);
            msgs = basicSetStereotype(newStereotype, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE, newStereotype, newStereotype));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundsType getBounds()
    {
        return bounds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBounds(BoundsType newBounds, NotificationChain msgs)
    {
        BoundsType oldBounds = bounds;
        bounds = newBounds;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__BOUNDS, oldBounds, newBounds);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBounds(BoundsType newBounds)
    {
        if (newBounds != bounds)
        {
            NotificationChain msgs = null;
            if (bounds != null)
                msgs = ((InternalEObject)bounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__BOUNDS, null, msgs);
            if (newBounds != null)
                msgs = ((InternalEObject)newBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__BOUNDS, null, msgs);
            msgs = basicSetBounds(newBounds, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__BOUNDS, newBounds, newBounds));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StyleexType getStyleex()
    {
        return styleex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStyleex(StyleexType newStyleex, NotificationChain msgs)
    {
        StyleexType oldStyleex = styleex;
        styleex = newStyleex;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__STYLEEX, oldStyleex, newStyleex);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyleex(StyleexType newStyleex)
    {
        if (newStyleex != styleex)
        {
            NotificationChain msgs = null;
            if (styleex != null)
                msgs = ((InternalEObject)styleex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__STYLEEX, null, msgs);
            if (newStyleex != null)
                msgs = ((InternalEObject)newStyleex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__STYLEEX, null, msgs);
            msgs = basicSetStyleex(newStyleex, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__STYLEEX, newStyleex, newStyleex));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XrefsType getXrefs()
    {
        return xrefs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetXrefs(XrefsType newXrefs, NotificationChain msgs)
    {
        XrefsType oldXrefs = xrefs;
        xrefs = newXrefs;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__XREFS, oldXrefs, newXrefs);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXrefs(XrefsType newXrefs)
    {
        if (newXrefs != xrefs)
        {
            NotificationChain msgs = null;
            if (xrefs != null)
                msgs = ((InternalEObject)xrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__XREFS, null, msgs);
            if (newXrefs != null)
                msgs = ((InternalEObject)newXrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ATTRIBUTE_TYPE__XREFS, null, msgs);
            msgs = basicSetXrefs(newXrefs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__XREFS, newXrefs, newXrefs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getIdref()
    {
        return idref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIdref(String newIdref)
    {
        String oldIdref = idref;
        idref = newIdref;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__IDREF, oldIdref, idref));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ATTRIBUTE_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.ATTRIBUTE_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case XmeiPackage.ATTRIBUTE_TYPE__INITIAL:
                return basicSetInitial(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT:
                return basicSetContainment(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE:
                return basicSetStereotype(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__BOUNDS:
                return basicSetBounds(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__STYLEEX:
                return basicSetStyleex(null, msgs);
            case XmeiPackage.ATTRIBUTE_TYPE__XREFS:
                return basicSetXrefs(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
            case XmeiPackage.ATTRIBUTE_TYPE__INITIAL:
                return getInitial();
            case XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.ATTRIBUTE_TYPE__MODEL:
                return getModel();
            case XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES:
                return getProperties();
            case XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT:
                return getContainment();
            case XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE:
                return getStereotype();
            case XmeiPackage.ATTRIBUTE_TYPE__BOUNDS:
                return getBounds();
            case XmeiPackage.ATTRIBUTE_TYPE__STYLEEX:
                return getStyleex();
            case XmeiPackage.ATTRIBUTE_TYPE__XREFS:
                return getXrefs();
            case XmeiPackage.ATTRIBUTE_TYPE__IDREF:
                return getIdref();
            case XmeiPackage.ATTRIBUTE_TYPE__NAME:
                return getName();
            case XmeiPackage.ATTRIBUTE_TYPE__SCOPE:
                return getScope();
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
            case XmeiPackage.ATTRIBUTE_TYPE__INITIAL:
                setInitial((InitialType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__MODEL:
                setModel((AttributeModelType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES:
                setProperties((AttributePropertiesType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT:
                setContainment((AttributeContainmentType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE:
                setStereotype((StereotypeAttributeType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__BOUNDS:
                setBounds((BoundsType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__STYLEEX:
                setStyleex((StyleexType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__XREFS:
                setXrefs((XrefsType)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__IDREF:
                setIdref((String)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__NAME:
                setName((String)newValue);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__SCOPE:
                setScope((VisibilityType)newValue);
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
            case XmeiPackage.ATTRIBUTE_TYPE__INITIAL:
                setInitial((InitialType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__MODEL:
                setModel((AttributeModelType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES:
                setProperties((AttributePropertiesType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT:
                setContainment((AttributeContainmentType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE:
                setStereotype((StereotypeAttributeType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__BOUNDS:
                setBounds((BoundsType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__STYLEEX:
                setStyleex((StyleexType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__XREFS:
                setXrefs((XrefsType)null);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__IDREF:
                setIdref(IDREF_EDEFAULT);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XmeiPackage.ATTRIBUTE_TYPE__SCOPE:
                unsetScope();
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
            case XmeiPackage.ATTRIBUTE_TYPE__INITIAL:
                return initial != null;
            case XmeiPackage.ATTRIBUTE_TYPE__DOCUMENTATION:
                return documentation != null;
            case XmeiPackage.ATTRIBUTE_TYPE__MODEL:
                return model != null;
            case XmeiPackage.ATTRIBUTE_TYPE__PROPERTIES:
                return properties != null;
            case XmeiPackage.ATTRIBUTE_TYPE__CONTAINMENT:
                return containment != null;
            case XmeiPackage.ATTRIBUTE_TYPE__STEREOTYPE:
                return stereotype != null;
            case XmeiPackage.ATTRIBUTE_TYPE__BOUNDS:
                return bounds != null;
            case XmeiPackage.ATTRIBUTE_TYPE__STYLEEX:
                return styleex != null;
            case XmeiPackage.ATTRIBUTE_TYPE__XREFS:
                return xrefs != null;
            case XmeiPackage.ATTRIBUTE_TYPE__IDREF:
                return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
            case XmeiPackage.ATTRIBUTE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XmeiPackage.ATTRIBUTE_TYPE__SCOPE:
                return isSetScope();
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
        result.append(" (idref: ");
        result.append(idref);
        result.append(", name: ");
        result.append(name);
        result.append(", scope: ");
        if (scopeESet) result.append(scope); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //AttributeTypeImpl
