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

import xmei.AttributeModelType;
import xmei.DocumentationType;
import xmei.OperationParametersType;
import xmei.OperationPropertiesType;
import xmei.OperationTagsType;
import xmei.OperationType;
import xmei.OperationTypeType;
import xmei.StereotypeAttributeType;
import xmei.XmeiPackage;
import xmei.XrefsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.OperationTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getStereotype <em>Stereotype</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmei.impl.OperationTypeImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationTypeImpl extends MinimalEObjectImpl.Container implements OperationType
{
    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected OperationPropertiesType properties;

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
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected AttributeModelType model;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected OperationTypeType type;

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
     * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTags()
     * @generated
     * @ordered
     */
    protected OperationTagsType tags;

    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected OperationParametersType parameters;

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
    protected OperationTypeImpl()
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
        return XmeiPackage.Literals.OPERATION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationPropertiesType getProperties()
    {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(OperationPropertiesType newProperties, NotificationChain msgs)
    {
        OperationPropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(OperationPropertiesType newProperties)
    {
        if (newProperties != properties)
        {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__PROPERTIES, newProperties, newProperties));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__STEREOTYPE, oldStereotype, newStereotype);
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
                msgs = ((InternalEObject)stereotype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__STEREOTYPE, null, msgs);
            if (newStereotype != null)
                msgs = ((InternalEObject)newStereotype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__STEREOTYPE, null, msgs);
            msgs = basicSetStereotype(newStereotype, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__STEREOTYPE, newStereotype, newStereotype));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__MODEL, oldModel, newModel);
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
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationTypeType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(OperationTypeType newType, NotificationChain msgs)
    {
        OperationTypeType oldType = type;
        type = newType;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(OperationTypeType newType)
    {
        if (newType != type)
        {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__TYPE, newType, newType));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
                msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__DOCUMENTATION, null, msgs);
            if (newDocumentation != null)
                msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDocumentation(newDocumentation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationTagsType getTags()
    {
        return tags;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTags(OperationTagsType newTags, NotificationChain msgs)
    {
        OperationTagsType oldTags = tags;
        tags = newTags;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__TAGS, oldTags, newTags);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTags(OperationTagsType newTags)
    {
        if (newTags != tags)
        {
            NotificationChain msgs = null;
            if (tags != null)
                msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__TAGS, null, msgs);
            if (newTags != null)
                msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__TAGS, null, msgs);
            msgs = basicSetTags(newTags, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__TAGS, newTags, newTags));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationParametersType getParameters()
    {
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetParameters(OperationParametersType newParameters, NotificationChain msgs)
    {
        OperationParametersType oldParameters = parameters;
        parameters = newParameters;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__PARAMETERS, oldParameters, newParameters);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParameters(OperationParametersType newParameters)
    {
        if (newParameters != parameters)
        {
            NotificationChain msgs = null;
            if (parameters != null)
                msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__PARAMETERS, null, msgs);
            if (newParameters != null)
                msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__PARAMETERS, null, msgs);
            msgs = basicSetParameters(newParameters, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__PARAMETERS, newParameters, newParameters));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__XREFS, oldXrefs, newXrefs);
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
                msgs = ((InternalEObject)xrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__XREFS, null, msgs);
            if (newXrefs != null)
                msgs = ((InternalEObject)newXrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.OPERATION_TYPE__XREFS, null, msgs);
            msgs = basicSetXrefs(newXrefs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__XREFS, newXrefs, newXrefs));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__IDREF, oldIdref, idref));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.OPERATION_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.OPERATION_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
            case XmeiPackage.OPERATION_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case XmeiPackage.OPERATION_TYPE__STEREOTYPE:
                return basicSetStereotype(null, msgs);
            case XmeiPackage.OPERATION_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.OPERATION_TYPE__TYPE:
                return basicSetType(null, msgs);
            case XmeiPackage.OPERATION_TYPE__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case XmeiPackage.OPERATION_TYPE__TAGS:
                return basicSetTags(null, msgs);
            case XmeiPackage.OPERATION_TYPE__PARAMETERS:
                return basicSetParameters(null, msgs);
            case XmeiPackage.OPERATION_TYPE__XREFS:
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
            case XmeiPackage.OPERATION_TYPE__PROPERTIES:
                return getProperties();
            case XmeiPackage.OPERATION_TYPE__STEREOTYPE:
                return getStereotype();
            case XmeiPackage.OPERATION_TYPE__MODEL:
                return getModel();
            case XmeiPackage.OPERATION_TYPE__TYPE:
                return getType();
            case XmeiPackage.OPERATION_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.OPERATION_TYPE__TAGS:
                return getTags();
            case XmeiPackage.OPERATION_TYPE__PARAMETERS:
                return getParameters();
            case XmeiPackage.OPERATION_TYPE__XREFS:
                return getXrefs();
            case XmeiPackage.OPERATION_TYPE__IDREF:
                return getIdref();
            case XmeiPackage.OPERATION_TYPE__NAME:
                return getName();
            case XmeiPackage.OPERATION_TYPE__SCOPE:
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
            case XmeiPackage.OPERATION_TYPE__PROPERTIES:
                setProperties((OperationPropertiesType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__STEREOTYPE:
                setStereotype((StereotypeAttributeType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__MODEL:
                setModel((AttributeModelType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__TYPE:
                setType((OperationTypeType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__TAGS:
                setTags((OperationTagsType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__PARAMETERS:
                setParameters((OperationParametersType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__XREFS:
                setXrefs((XrefsType)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__IDREF:
                setIdref((String)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__NAME:
                setName((String)newValue);
                return;
            case XmeiPackage.OPERATION_TYPE__SCOPE:
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
            case XmeiPackage.OPERATION_TYPE__PROPERTIES:
                setProperties((OperationPropertiesType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__STEREOTYPE:
                setStereotype((StereotypeAttributeType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__MODEL:
                setModel((AttributeModelType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__TYPE:
                setType((OperationTypeType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__TAGS:
                setTags((OperationTagsType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__PARAMETERS:
                setParameters((OperationParametersType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__XREFS:
                setXrefs((XrefsType)null);
                return;
            case XmeiPackage.OPERATION_TYPE__IDREF:
                setIdref(IDREF_EDEFAULT);
                return;
            case XmeiPackage.OPERATION_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XmeiPackage.OPERATION_TYPE__SCOPE:
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
            case XmeiPackage.OPERATION_TYPE__PROPERTIES:
                return properties != null;
            case XmeiPackage.OPERATION_TYPE__STEREOTYPE:
                return stereotype != null;
            case XmeiPackage.OPERATION_TYPE__MODEL:
                return model != null;
            case XmeiPackage.OPERATION_TYPE__TYPE:
                return type != null;
            case XmeiPackage.OPERATION_TYPE__DOCUMENTATION:
                return documentation != null;
            case XmeiPackage.OPERATION_TYPE__TAGS:
                return tags != null;
            case XmeiPackage.OPERATION_TYPE__PARAMETERS:
                return parameters != null;
            case XmeiPackage.OPERATION_TYPE__XREFS:
                return xrefs != null;
            case XmeiPackage.OPERATION_TYPE__IDREF:
                return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
            case XmeiPackage.OPERATION_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XmeiPackage.OPERATION_TYPE__SCOPE:
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

} //OperationTypeImpl
