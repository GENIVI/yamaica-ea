/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.ModelType;

import xmei.Documentation;
import xmei.Extension;
import xmei.XMIType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMI Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.XMITypeImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link xmei.impl.XMITypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.XMITypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link xmei.impl.XMITypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMITypeImpl extends MinimalEObjectImpl.Container implements XMIType
{
    /**
     * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDocumentation()
     * @generated
     * @ordered
     */
    protected Documentation documentation;

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
     * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtension()
     * @generated
     * @ordered
     */
    protected Extension extension;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = "2.1";

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * This is true if the Version attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean versionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMITypeImpl()
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
        return XmeiPackage.Literals.XMI_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Documentation getDocumentation()
    {
        return documentation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDocumentation(Documentation newDocumentation, NotificationChain msgs)
    {
        Documentation oldDocumentation = documentation;
        documentation = newDocumentation;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__DOCUMENTATION, oldDocumentation, newDocumentation);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(Documentation newDocumentation)
    {
        if (newDocumentation != documentation)
        {
            NotificationChain msgs = null;
            if (documentation != null)
                msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__DOCUMENTATION, null, msgs);
            if (newDocumentation != null)
                msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__DOCUMENTATION, null, msgs);
            msgs = basicSetDocumentation(newDocumentation, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__DOCUMENTATION, newDocumentation, newDocumentation));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__MODEL, oldModel, newModel);
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
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension getExtension()
    {
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExtension(Extension newExtension, NotificationChain msgs)
    {
        Extension oldExtension = extension;
        extension = newExtension;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__EXTENSION, oldExtension, newExtension);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(Extension newExtension)
    {
        if (newExtension != extension)
        {
            NotificationChain msgs = null;
            if (extension != null)
                msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__EXTENSION, null, msgs);
            if (newExtension != null)
                msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.XMI_TYPE__EXTENSION, null, msgs);
            msgs = basicSetExtension(newExtension, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__EXTENSION, newExtension, newExtension));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion()
    {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion)
    {
        String oldVersion = version;
        version = newVersion;
        boolean oldVersionESet = versionESet;
        versionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.XMI_TYPE__VERSION, oldVersion, version, !oldVersionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetVersion()
    {
        String oldVersion = version;
        boolean oldVersionESet = versionESet;
        version = VERSION_EDEFAULT;
        versionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.XMI_TYPE__VERSION, oldVersion, VERSION_EDEFAULT, oldVersionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetVersion()
    {
        return versionESet;
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
            case XmeiPackage.XMI_TYPE__DOCUMENTATION:
                return basicSetDocumentation(null, msgs);
            case XmeiPackage.XMI_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.XMI_TYPE__EXTENSION:
                return basicSetExtension(null, msgs);
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
            case XmeiPackage.XMI_TYPE__DOCUMENTATION:
                return getDocumentation();
            case XmeiPackage.XMI_TYPE__MODEL:
                return getModel();
            case XmeiPackage.XMI_TYPE__EXTENSION:
                return getExtension();
            case XmeiPackage.XMI_TYPE__VERSION:
                return getVersion();
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
            case XmeiPackage.XMI_TYPE__DOCUMENTATION:
                setDocumentation((Documentation)newValue);
                return;
            case XmeiPackage.XMI_TYPE__MODEL:
                setModel((ModelType)newValue);
                return;
            case XmeiPackage.XMI_TYPE__EXTENSION:
                setExtension((Extension)newValue);
                return;
            case XmeiPackage.XMI_TYPE__VERSION:
                setVersion((String)newValue);
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
            case XmeiPackage.XMI_TYPE__DOCUMENTATION:
                setDocumentation((Documentation)null);
                return;
            case XmeiPackage.XMI_TYPE__MODEL:
                setModel((ModelType)null);
                return;
            case XmeiPackage.XMI_TYPE__EXTENSION:
                setExtension((Extension)null);
                return;
            case XmeiPackage.XMI_TYPE__VERSION:
                unsetVersion();
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
            case XmeiPackage.XMI_TYPE__DOCUMENTATION:
                return documentation != null;
            case XmeiPackage.XMI_TYPE__MODEL:
                return model != null;
            case XmeiPackage.XMI_TYPE__EXTENSION:
                return extension != null;
            case XmeiPackage.XMI_TYPE__VERSION:
                return isSetVersion();
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
        result.append(" (version: ");
        if (versionESet) result.append(version); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //XMITypeImpl
