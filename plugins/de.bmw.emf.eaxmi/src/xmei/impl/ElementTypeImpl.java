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

import xmei.AttributesType;
import xmei.CodeType;
import xmei.ElementType;
import xmei.LinksType;
import xmei.ModelType;
import xmei.OperationsType;
import xmei.ProjectType;
import xmei.PropertiesType;
import xmei.TypeBaseType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ElementTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getProject <em>Project</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getIdref <em>Idref</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link xmei.impl.ElementTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeImpl extends MinimalEObjectImpl.Container implements ElementType
{
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected ModelType model;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected PropertiesType properties;

    /**
     * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProject()
     * @generated
     * @ordered
     */
    protected ProjectType project;

    /**
     * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCode()
     * @generated
     * @ordered
     */
    protected CodeType code;

    /**
     * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLinks()
     * @generated
     * @ordered
     */
    protected LinksType links;

    /**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
    protected AttributesType attributes;

    /**
     * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperations()
     * @generated
     * @ordered
     */
    protected OperationsType operations;

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
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final TypeBaseType TYPE_EDEFAULT = TypeBaseType.UML_ASSOCIATION;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected TypeBaseType type = TYPE_EDEFAULT;

    /**
     * This is true if the Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean typeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementTypeImpl()
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
        return XmeiPackage.Literals.ELEMENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelType getModel()
    {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ModelType newModel, NotificationChain msgs)
    {
        ModelType oldModel = model;
        model = newModel;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ModelType newModel)
    {
        if (newModel != model)
        {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertiesType getProperties()
    {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs)
    {
        PropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(PropertiesType newProperties)
    {
        if (newProperties != properties)
        {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProjectType getProject()
    {
        return project;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProject(ProjectType newProject, NotificationChain msgs)
    {
        ProjectType oldProject = project;
        project = newProject;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__PROJECT, oldProject, newProject);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProject(ProjectType newProject)
    {
        if (newProject != project)
        {
            NotificationChain msgs = null;
            if (project != null)
                msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__PROJECT, null, msgs);
            if (newProject != null)
                msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__PROJECT, null, msgs);
            msgs = basicSetProject(newProject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__PROJECT, newProject, newProject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeType getCode()
    {
        return code;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCode(CodeType newCode, NotificationChain msgs)
    {
        CodeType oldCode = code;
        code = newCode;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__CODE, oldCode, newCode);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCode(CodeType newCode)
    {
        if (newCode != code)
        {
            NotificationChain msgs = null;
            if (code != null)
                msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__CODE, null, msgs);
            if (newCode != null)
                msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__CODE, null, msgs);
            msgs = basicSetCode(newCode, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__CODE, newCode, newCode));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinksType getLinks()
    {
        return links;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLinks(LinksType newLinks, NotificationChain msgs)
    {
        LinksType oldLinks = links;
        links = newLinks;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__LINKS, oldLinks, newLinks);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLinks(LinksType newLinks)
    {
        if (newLinks != links)
        {
            NotificationChain msgs = null;
            if (links != null)
                msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__LINKS, null, msgs);
            if (newLinks != null)
                msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__LINKS, null, msgs);
            msgs = basicSetLinks(newLinks, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__LINKS, newLinks, newLinks));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributesType getAttributes()
    {
        return attributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAttributes(AttributesType newAttributes, NotificationChain msgs)
    {
        AttributesType oldAttributes = attributes;
        attributes = newAttributes;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__ATTRIBUTES, oldAttributes, newAttributes);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributes(AttributesType newAttributes)
    {
        if (newAttributes != attributes)
        {
            NotificationChain msgs = null;
            if (attributes != null)
                msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__ATTRIBUTES, null, msgs);
            if (newAttributes != null)
                msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__ATTRIBUTES, null, msgs);
            msgs = basicSetAttributes(newAttributes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__ATTRIBUTES, newAttributes, newAttributes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationsType getOperations()
    {
        return operations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOperations(OperationsType newOperations, NotificationChain msgs)
    {
        OperationsType oldOperations = operations;
        operations = newOperations;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__OPERATIONS, oldOperations, newOperations);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperations(OperationsType newOperations)
    {
        if (newOperations != operations)
        {
            NotificationChain msgs = null;
            if (operations != null)
                msgs = ((InternalEObject)operations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__OPERATIONS, null, msgs);
            if (newOperations != null)
                msgs = ((InternalEObject)newOperations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.ELEMENT_TYPE__OPERATIONS, null, msgs);
            msgs = basicSetOperations(newOperations, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__OPERATIONS, newOperations, newOperations));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__IDREF, oldIdref, idref));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.ELEMENT_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
    public TypeBaseType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(TypeBaseType newType)
    {
        TypeBaseType oldType = type;
        type = newType == null ? TYPE_EDEFAULT : newType;
        boolean oldTypeESet = typeESet;
        typeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.ELEMENT_TYPE__TYPE, oldType, type, !oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetType()
    {
        TypeBaseType oldType = type;
        boolean oldTypeESet = typeESet;
        type = TYPE_EDEFAULT;
        typeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.ELEMENT_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetType()
    {
        return typeESet;
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
            case XmeiPackage.ELEMENT_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
                return basicSetProject(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__CODE:
                return basicSetCode(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__LINKS:
                return basicSetLinks(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
                return basicSetAttributes(null, msgs);
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
                return basicSetOperations(null, msgs);
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
            case XmeiPackage.ELEMENT_TYPE__MODEL:
                return getModel();
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
                return getProperties();
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
                return getProject();
            case XmeiPackage.ELEMENT_TYPE__CODE:
                return getCode();
            case XmeiPackage.ELEMENT_TYPE__LINKS:
                return getLinks();
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
                return getAttributes();
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
                return getOperations();
            case XmeiPackage.ELEMENT_TYPE__IDREF:
                return getIdref();
            case XmeiPackage.ELEMENT_TYPE__NAME:
                return getName();
            case XmeiPackage.ELEMENT_TYPE__SCOPE:
                return getScope();
            case XmeiPackage.ELEMENT_TYPE__TYPE:
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
            case XmeiPackage.ELEMENT_TYPE__MODEL:
                setModel((ModelType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
                setProperties((PropertiesType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
                setProject((ProjectType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__CODE:
                setCode((CodeType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__LINKS:
                setLinks((LinksType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
                setAttributes((AttributesType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
                setOperations((OperationsType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__IDREF:
                setIdref((String)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__NAME:
                setName((String)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__SCOPE:
                setScope((VisibilityType)newValue);
                return;
            case XmeiPackage.ELEMENT_TYPE__TYPE:
                setType((TypeBaseType)newValue);
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
            case XmeiPackage.ELEMENT_TYPE__MODEL:
                setModel((ModelType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
                setProperties((PropertiesType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
                setProject((ProjectType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__CODE:
                setCode((CodeType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__LINKS:
                setLinks((LinksType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
                setAttributes((AttributesType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
                setOperations((OperationsType)null);
                return;
            case XmeiPackage.ELEMENT_TYPE__IDREF:
                setIdref(IDREF_EDEFAULT);
                return;
            case XmeiPackage.ELEMENT_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XmeiPackage.ELEMENT_TYPE__SCOPE:
                unsetScope();
                return;
            case XmeiPackage.ELEMENT_TYPE__TYPE:
                unsetType();
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
            case XmeiPackage.ELEMENT_TYPE__MODEL:
                return model != null;
            case XmeiPackage.ELEMENT_TYPE__PROPERTIES:
                return properties != null;
            case XmeiPackage.ELEMENT_TYPE__PROJECT:
                return project != null;
            case XmeiPackage.ELEMENT_TYPE__CODE:
                return code != null;
            case XmeiPackage.ELEMENT_TYPE__LINKS:
                return links != null;
            case XmeiPackage.ELEMENT_TYPE__ATTRIBUTES:
                return attributes != null;
            case XmeiPackage.ELEMENT_TYPE__OPERATIONS:
                return operations != null;
            case XmeiPackage.ELEMENT_TYPE__IDREF:
                return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
            case XmeiPackage.ELEMENT_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XmeiPackage.ELEMENT_TYPE__SCOPE:
                return isSetScope();
            case XmeiPackage.ELEMENT_TYPE__TYPE:
                return isSetType();
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
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ElementTypeImpl
