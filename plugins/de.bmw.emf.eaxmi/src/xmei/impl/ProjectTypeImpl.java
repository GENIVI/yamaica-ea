/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ProjectType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ProjectTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link xmei.impl.ProjectTypeImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link xmei.impl.ProjectTypeImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link xmei.impl.ProjectTypeImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link xmei.impl.ProjectTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectTypeImpl extends MinimalEObjectImpl.Container implements ProjectType
{
    /**
     * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected static final String AUTHOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAuthor()
     * @generated
     * @ordered
     */
    protected String author = AUTHOR_EDEFAULT;

    /**
     * The default value of the '{@link #getCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreated()
     * @generated
     * @ordered
     */
    protected static final String CREATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreated() <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreated()
     * @generated
     * @ordered
     */
    protected String created = CREATED_EDEFAULT;

    /**
     * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModified()
     * @generated
     * @ordered
     */
    protected static final String MODIFIED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModified()
     * @generated
     * @ordered
     */
    protected String modified = MODIFIED_EDEFAULT;

    /**
     * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected static final String PHASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhase()
     * @generated
     * @ordered
     */
    protected String phase = PHASE_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProjectTypeImpl()
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
        return XmeiPackage.Literals.PROJECT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAuthor()
    {
        return author;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAuthor(String newAuthor)
    {
        String oldAuthor = author;
        author = newAuthor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROJECT_TYPE__AUTHOR, oldAuthor, author));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCreated()
    {
        return created;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreated(String newCreated)
    {
        String oldCreated = created;
        created = newCreated;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROJECT_TYPE__CREATED, oldCreated, created));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getModified()
    {
        return modified;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModified(String newModified)
    {
        String oldModified = modified;
        modified = newModified;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROJECT_TYPE__MODIFIED, oldModified, modified));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPhase()
    {
        return phase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPhase(String newPhase)
    {
        String oldPhase = phase;
        phase = newPhase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROJECT_TYPE__PHASE, oldPhase, phase));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.PROJECT_TYPE__VERSION, oldVersion, version));
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
            case XmeiPackage.PROJECT_TYPE__AUTHOR:
                return getAuthor();
            case XmeiPackage.PROJECT_TYPE__CREATED:
                return getCreated();
            case XmeiPackage.PROJECT_TYPE__MODIFIED:
                return getModified();
            case XmeiPackage.PROJECT_TYPE__PHASE:
                return getPhase();
            case XmeiPackage.PROJECT_TYPE__VERSION:
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
            case XmeiPackage.PROJECT_TYPE__AUTHOR:
                setAuthor((String)newValue);
                return;
            case XmeiPackage.PROJECT_TYPE__CREATED:
                setCreated((String)newValue);
                return;
            case XmeiPackage.PROJECT_TYPE__MODIFIED:
                setModified((String)newValue);
                return;
            case XmeiPackage.PROJECT_TYPE__PHASE:
                setPhase((String)newValue);
                return;
            case XmeiPackage.PROJECT_TYPE__VERSION:
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
            case XmeiPackage.PROJECT_TYPE__AUTHOR:
                setAuthor(AUTHOR_EDEFAULT);
                return;
            case XmeiPackage.PROJECT_TYPE__CREATED:
                setCreated(CREATED_EDEFAULT);
                return;
            case XmeiPackage.PROJECT_TYPE__MODIFIED:
                setModified(MODIFIED_EDEFAULT);
                return;
            case XmeiPackage.PROJECT_TYPE__PHASE:
                setPhase(PHASE_EDEFAULT);
                return;
            case XmeiPackage.PROJECT_TYPE__VERSION:
                setVersion(VERSION_EDEFAULT);
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
            case XmeiPackage.PROJECT_TYPE__AUTHOR:
                return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
            case XmeiPackage.PROJECT_TYPE__CREATED:
                return CREATED_EDEFAULT == null ? created != null : !CREATED_EDEFAULT.equals(created);
            case XmeiPackage.PROJECT_TYPE__MODIFIED:
                return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
            case XmeiPackage.PROJECT_TYPE__PHASE:
                return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
            case XmeiPackage.PROJECT_TYPE__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
        result.append(" (author: ");
        result.append(author);
        result.append(", created: ");
        result.append(created);
        result.append(", modified: ");
        result.append(modified);
        result.append(", phase: ");
        result.append(phase);
        result.append(", version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} //ProjectTypeImpl
