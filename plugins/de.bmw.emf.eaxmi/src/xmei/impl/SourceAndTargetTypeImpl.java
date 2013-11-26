/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorModifiersType;
import xmei.DocumentationType;
import xmei.OperationTagsType;
import xmei.SourceAndTargetModelType;
import xmei.SourceAndTargetRoleType;
import xmei.SourceAndTargetType;
import xmei.SourceAndTargetTypeType;
import xmei.XmeiPackage;
import xmei.XrefsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source And Target Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getXrefs <em>Xrefs</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link xmei.impl.SourceAndTargetTypeImpl#getIdref <em>Idref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SourceAndTargetTypeImpl extends MinimalEObjectImpl.Container implements SourceAndTargetType
{
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected SourceAndTargetModelType model;

    /**
     * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRole()
     * @generated
     * @ordered
     */
    protected SourceAndTargetRoleType role;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected SourceAndTargetTypeType type;

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
     * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected DocumentationType style;

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
    protected SourceAndTargetTypeImpl()
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
        return XmeiPackage.Literals.SOURCE_AND_TARGET_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetModelType getModel()
    {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(SourceAndTargetModelType newModel, NotificationChain msgs)
    {
        SourceAndTargetModelType oldModel = model;
        model = newModel;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(SourceAndTargetModelType newModel)
    {
        if (newModel != model)
        {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetRoleType getRole()
    {
        return role;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRole(SourceAndTargetRoleType newRole, NotificationChain msgs)
    {
        SourceAndTargetRoleType oldRole = role;
        role = newRole;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE, oldRole, newRole);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRole(SourceAndTargetRoleType newRole)
    {
        if (newRole != role)
        {
            NotificationChain msgs = null;
            if (role != null)
                msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE, null, msgs);
            if (newRole != null)
                msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE, null, msgs);
            msgs = basicSetRole(newRole, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE, newRole, newRole));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SourceAndTargetTypeType getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(SourceAndTargetTypeType newType, NotificationChain msgs)
    {
        SourceAndTargetTypeType oldType = type;
        type = newType;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(SourceAndTargetTypeType newType)
    {
        if (newType != type)
        {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE, newType, newType));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS, oldModifiers, newModifiers);
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
                msgs = ((InternalEObject)modifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS, null, msgs);
            if (newModifiers != null)
                msgs = ((InternalEObject)newModifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS, null, msgs);
            msgs = basicSetModifiers(newModifiers, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS, newModifiers, newModifiers));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE, oldStyle, newStyle);
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
                msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE, null, msgs);
            if (newStyle != null)
                msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE, null, msgs);
            msgs = basicSetStyle(newStyle, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE, newStyle, newStyle));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
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
                msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION, null, msgs);
            if (newDocumentation != null)
                msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDocumentation(newDocumentation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS, oldXrefs, newXrefs);
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
                msgs = ((InternalEObject)xrefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS, null, msgs);
            if (newXrefs != null)
                msgs = ((InternalEObject)newXrefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS, null, msgs);
            msgs = basicSetXrefs(newXrefs, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS, newXrefs, newXrefs));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS, oldTags, newTags);
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
                msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS, null, msgs);
            if (newTags != null)
                msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS, null, msgs);
            msgs = basicSetTags(newTags, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS, newTags, newTags));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.SOURCE_AND_TARGET_TYPE__IDREF, oldIdref, idref));
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE:
                return basicSetRole(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE:
                return basicSetType(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS:
                return basicSetModifiers(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE:
                return basicSetStyle(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS:
                return basicSetXrefs(null, msgs);
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS:
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL:
                return getModel();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE:
                return getRole();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE:
                return getType();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS:
                return getModifiers();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE:
                return getStyle();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS:
                return getXrefs();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS:
                return getTags();
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__IDREF:
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL:
                setModel((SourceAndTargetModelType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE:
                setRole((SourceAndTargetRoleType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE:
                setType((SourceAndTargetTypeType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS:
                setModifiers((ConnectorModifiersType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE:
                setStyle((DocumentationType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS:
                setXrefs((XrefsType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS:
                setTags((OperationTagsType)newValue);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__IDREF:
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL:
                setModel((SourceAndTargetModelType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE:
                setRole((SourceAndTargetRoleType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE:
                setType((SourceAndTargetTypeType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS:
                setModifiers((ConnectorModifiersType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE:
                setStyle((DocumentationType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION:
                setDocumentation((DocumentationType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS:
                setXrefs((XrefsType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS:
                setTags((OperationTagsType)null);
                return;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__IDREF:
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
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODEL:
                return model != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__ROLE:
                return role != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TYPE:
                return type != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__MODIFIERS:
                return modifiers != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__STYLE:
                return style != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__DOCUMENTATION:
                return documentation != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__XREFS:
                return xrefs != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__TAGS:
                return tags != null;
            case XmeiPackage.SOURCE_AND_TARGET_TYPE__IDREF:
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

} //SourceAndTargetTypeImpl
