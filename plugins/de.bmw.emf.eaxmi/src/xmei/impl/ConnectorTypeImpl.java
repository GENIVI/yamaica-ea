/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorAppearanceType;
import xmei.ConnectorLabelsType;
import xmei.ConnectorModelType;
import xmei.ConnectorModifiersType;
import xmei.ConnectorPropertiesType;
import xmei.ConnectorType;
import xmei.DocumentationType;
import xmei.ExtendedPropertiesType;
import xmei.OperationTagsType;
import xmei.SourceAndTargetType;
import xmei.XmeiPackage;
import xmei.XrefsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getAppearance <em>Appearance</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getExtendedProperties <em>Extended Properties</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.impl.ConnectorTypeImpl#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorTypeImpl extends MinimalEObjectImpl.Container implements ConnectorType
{
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected SourceAndTargetType source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected SourceAndTargetType target;

    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected ConnectorModelType model;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected ConnectorPropertiesType properties;

    /**
     * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModifiers()
     * @generated
     * @ordered
     */
    protected ConnectorModifiersType modifiers;

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
     * The cached value of the '{@link #getAppearance() <em>Appearance</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAppearance()
     * @generated
     * @ordered
     */
    protected ConnectorAppearanceType appearance;

    /**
     * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLabels()
     * @generated
     * @ordered
     */
    protected ConnectorLabelsType labels;

    /**
     * The cached value of the '{@link #getExtendedProperties() <em>Extended Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtendedProperties()
     * @generated
     * @ordered
     */
    protected ExtendedPropertiesType extendedProperties;

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected DocumentationType style;

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
     * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTags()
     * @generated
     * @ordered
     */
    protected OperationTagsType tags;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectorTypeImpl()
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
        return XmeiPackage.Literals.CONNECTOR_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetType getSource()
    {
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSource(SourceAndTargetType newSource, NotificationChain msgs)
    {
        SourceAndTargetType oldSource = source;
        source = newSource;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__SOURCE, oldSource, newSource);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSource(SourceAndTargetType newSource)
    {
        if (newSource != source)
        {
            NotificationChain msgs = null;
            if (source != null)
                msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__SOURCE, null, msgs);
            if (newSource != null)
                msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__SOURCE, null, msgs);
            msgs = basicSetSource(newSource, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__SOURCE, newSource, newSource));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetType getTarget()
    {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTarget(SourceAndTargetType newTarget, NotificationChain msgs)
    {
        SourceAndTargetType oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__TARGET, oldTarget, newTarget);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(SourceAndTargetType newTarget)
    {
        if (newTarget != target)
        {
            NotificationChain msgs = null;
            if (target != null)
                msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__TARGET, null, msgs);
            if (newTarget != null)
                msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__TARGET, null, msgs);
            msgs = basicSetTarget(newTarget, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__TARGET, newTarget, newTarget));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorModelType getModel()
    {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(ConnectorModelType newModel, NotificationChain msgs)
    {
        ConnectorModelType oldModel = model;
        model = newModel;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(ConnectorModelType newModel)
    {
        if (newModel != model)
        {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorPropertiesType getProperties()
    {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(ConnectorPropertiesType newProperties, NotificationChain msgs)
    {
        ConnectorPropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(ConnectorPropertiesType newProperties)
    {
        if (newProperties != properties)
        {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__PROPERTIES, newProperties, newProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorModifiersType getModifiers()
    {
        return modifiers;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModifiers(ConnectorModifiersType newModifiers, NotificationChain msgs)
    {
        ConnectorModifiersType oldModifiers = modifiers;
        modifiers = newModifiers;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__MODIFIERS, oldModifiers, newModifiers);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModifiers(ConnectorModifiersType newModifiers)
    {
        if (newModifiers != modifiers)
        {
            NotificationChain msgs = null;
            if (modifiers != null)
                msgs = ((InternalEObject)modifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__MODIFIERS, null, msgs);
            if (newModifiers != null)
                msgs = ((InternalEObject)newModifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__MODIFIERS, null, msgs);
            msgs = basicSetModifiers(newModifiers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__MODIFIERS, newModifiers, newModifiers));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
                msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION, null, msgs);
            if (newDocumentation != null)
                msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDocumentation(newDocumentation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorAppearanceType getAppearance()
    {
        return appearance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAppearance(ConnectorAppearanceType newAppearance, NotificationChain msgs)
    {
        ConnectorAppearanceType oldAppearance = appearance;
        appearance = newAppearance;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__APPEARANCE, oldAppearance, newAppearance);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAppearance(ConnectorAppearanceType newAppearance)
    {
        if (newAppearance != appearance)
        {
            NotificationChain msgs = null;
            if (appearance != null)
                msgs = ((InternalEObject)appearance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__APPEARANCE, null, msgs);
            if (newAppearance != null)
                msgs = ((InternalEObject)newAppearance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__APPEARANCE, null, msgs);
            msgs = basicSetAppearance(newAppearance, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__APPEARANCE, newAppearance, newAppearance));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorLabelsType getLabels()
    {
        return labels;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLabels(ConnectorLabelsType newLabels, NotificationChain msgs)
    {
        ConnectorLabelsType oldLabels = labels;
        labels = newLabels;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__LABELS, oldLabels, newLabels);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLabels(ConnectorLabelsType newLabels)
    {
        if (newLabels != labels)
        {
            NotificationChain msgs = null;
            if (labels != null)
                msgs = ((InternalEObject)labels).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__LABELS, null, msgs);
            if (newLabels != null)
                msgs = ((InternalEObject)newLabels).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__LABELS, null, msgs);
            msgs = basicSetLabels(newLabels, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__LABELS, newLabels, newLabels));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtendedPropertiesType getExtendedProperties()
    {
        return extendedProperties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtendedProperties(ExtendedPropertiesType newExtendedProperties, NotificationChain msgs)
    {
        ExtendedPropertiesType oldExtendedProperties = extendedProperties;
        extendedProperties = newExtendedProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES, oldExtendedProperties, newExtendedProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtendedProperties(ExtendedPropertiesType newExtendedProperties)
    {
        if (newExtendedProperties != extendedProperties)
        {
            NotificationChain msgs = null;
            if (extendedProperties != null)
                msgs = ((InternalEObject)extendedProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES, null, msgs);
            if (newExtendedProperties != null)
                msgs = ((InternalEObject)newExtendedProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES, null, msgs);
            msgs = basicSetExtendedProperties(newExtendedProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES, newExtendedProperties, newExtendedProperties));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getStyle()
    {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStyle(DocumentationType newStyle, NotificationChain msgs)
    {
        DocumentationType oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__STYLE, oldStyle, newStyle);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(DocumentationType newStyle)
    {
        if (newStyle != style)
        {
            NotificationChain msgs = null;
            if (style != null)
                msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__STYLE, null, msgs);
            if (newStyle != null)
                msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__STYLE, null, msgs);
            msgs = basicSetStyle(newStyle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__STYLE, newStyle, newStyle));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__XREFS, oldXrefs, newXrefs);
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
                msgs = ((InternalEObject)xrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__XREFS, null, msgs);
            if (newXrefs != null)
                msgs = ((InternalEObject)newXrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__XREFS, null, msgs);
            msgs = basicSetXrefs(newXrefs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__XREFS, newXrefs, newXrefs));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__TAGS, oldTags, newTags);
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
                msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__TAGS, null, msgs);
            if (newTags != null)
                msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.CONNECTOR_TYPE__TAGS, null, msgs);
            msgs = basicSetTags(newTags, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__TAGS, newTags, newTags));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.CONNECTOR_TYPE__IDREF, oldIdref, idref));
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
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
                return basicSetSource(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
                return basicSetTarget(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
                return basicSetModifiers(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
                return basicSetAppearance(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
                return basicSetLabels(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
                return basicSetExtendedProperties(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
                return basicSetStyle(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
                return basicSetXrefs(null, msgs);
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                return basicSetTags(null, msgs);
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
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
                return getSource();
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
                return getTarget();
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
                return getModel();
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
                return getProperties();
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
                return getModifiers();
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
                return getAppearance();
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
                return getLabels();
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
                return getExtendedProperties();
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
                return getStyle();
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
                return getXrefs();
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                return getTags();
            case XmeiPackage.CONNECTOR_TYPE__IDREF:
                return getIdref();
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
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
                setSource((SourceAndTargetType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
                setTarget((SourceAndTargetType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
                setModel((ConnectorModelType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
                setProperties((ConnectorPropertiesType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
                setModifiers((ConnectorModifiersType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
                setAppearance((ConnectorAppearanceType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
                setLabels((ConnectorLabelsType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
                setExtendedProperties((ExtendedPropertiesType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
                setStyle((DocumentationType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
                setXrefs((XrefsType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                setTags((OperationTagsType)newValue);
                return;
            case XmeiPackage.CONNECTOR_TYPE__IDREF:
                setIdref((String)newValue);
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
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
                setSource((SourceAndTargetType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
                setTarget((SourceAndTargetType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
                setModel((ConnectorModelType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
                setProperties((ConnectorPropertiesType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
                setModifiers((ConnectorModifiersType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
                setAppearance((ConnectorAppearanceType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
                setLabels((ConnectorLabelsType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
                setExtendedProperties((ExtendedPropertiesType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
                setStyle((DocumentationType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
                setXrefs((XrefsType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                setTags((OperationTagsType)null);
                return;
            case XmeiPackage.CONNECTOR_TYPE__IDREF:
                setIdref(IDREF_EDEFAULT);
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
            case XmeiPackage.CONNECTOR_TYPE__SOURCE:
                return source != null;
            case XmeiPackage.CONNECTOR_TYPE__TARGET:
                return target != null;
            case XmeiPackage.CONNECTOR_TYPE__MODEL:
                return model != null;
            case XmeiPackage.CONNECTOR_TYPE__PROPERTIES:
                return properties != null;
            case XmeiPackage.CONNECTOR_TYPE__MODIFIERS:
                return modifiers != null;
            case XmeiPackage.CONNECTOR_TYPE__DOCUMENTATION:
                return documentation != null;
            case XmeiPackage.CONNECTOR_TYPE__APPEARANCE:
                return appearance != null;
            case XmeiPackage.CONNECTOR_TYPE__LABELS:
                return labels != null;
            case XmeiPackage.CONNECTOR_TYPE__EXTENDED_PROPERTIES:
                return extendedProperties != null;
            case XmeiPackage.CONNECTOR_TYPE__STYLE:
                return style != null;
            case XmeiPackage.CONNECTOR_TYPE__XREFS:
                return xrefs != null;
            case XmeiPackage.CONNECTOR_TYPE__TAGS:
                return tags != null;
            case XmeiPackage.CONNECTOR_TYPE__IDREF:
                return IDREF_EDEFAULT == null ? idref != null : !IDREF_EDEFAULT.equals(idref);
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
        result.append(')');
        return result.toString();
    }

} //ConnectorTypeImpl
