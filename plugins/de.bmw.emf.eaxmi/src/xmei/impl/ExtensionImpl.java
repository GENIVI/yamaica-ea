/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.ConnectorsType;
import xmei.DiagramsType;
import xmei.ElementsType;
import xmei.Extension;
import xmei.PrimitiveTypesType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.ExtensionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getPrimitivetypes <em>Primitivetypes</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getProfiles <em>Profiles</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getDiagrams <em>Diagrams</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getExtender <em>Extender</em>}</li>
 *   <li>{@link xmei.impl.ExtensionImpl#getExtenderID <em>Extender ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension
{
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected ElementsType elements;

    /**
     * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectors()
     * @generated
     * @ordered
     */
    protected ConnectorsType connectors;

    /**
     * The cached value of the '{@link #getPrimitivetypes() <em>Primitivetypes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrimitivetypes()
     * @generated
     * @ordered
     */
    protected PrimitiveTypesType primitivetypes;

    /**
     * The default value of the '{@link #getProfiles() <em>Profiles</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfiles()
     * @generated
     * @ordered
     */
    protected static final String PROFILES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getProfiles() <em>Profiles</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProfiles()
     * @generated
     * @ordered
     */
    protected String profiles = PROFILES_EDEFAULT;

    /**
     * The cached value of the '{@link #getDiagrams() <em>Diagrams</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiagrams()
     * @generated
     * @ordered
     */
    protected DiagramsType diagrams;

    /**
     * The default value of the '{@link #getExtender() <em>Extender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtender()
     * @generated
     * @ordered
     */
    protected static final String EXTENDER_EDEFAULT = "Enterprise Architect";

    /**
     * The cached value of the '{@link #getExtender() <em>Extender</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtender()
     * @generated
     * @ordered
     */
    protected String extender = EXTENDER_EDEFAULT;

    /**
     * This is true if the Extender attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extenderESet;

    /**
     * The default value of the '{@link #getExtenderID() <em>Extender ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtenderID()
     * @generated
     * @ordered
     */
    protected static final String EXTENDER_ID_EDEFAULT = "6.5";

    /**
     * The cached value of the '{@link #getExtenderID() <em>Extender ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExtenderID()
     * @generated
     * @ordered
     */
    protected String extenderID = EXTENDER_ID_EDEFAULT;

    /**
     * This is true if the Extender ID attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean extenderIDESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExtensionImpl()
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
        return XmeiPackage.Literals.EXTENSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementsType getElements()
    {
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElements(ElementsType newElements, NotificationChain msgs)
    {
        ElementsType oldElements = elements;
        elements = newElements;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__ELEMENTS, oldElements, newElements);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElements(ElementsType newElements)
    {
        if (newElements != elements)
        {
            NotificationChain msgs = null;
            if (elements != null)
                msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__ELEMENTS, null, msgs);
            if (newElements != null)
                msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__ELEMENTS, null, msgs);
            msgs = basicSetElements(newElements, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__ELEMENTS, newElements, newElements));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorsType getConnectors()
    {
        return connectors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectors(ConnectorsType newConnectors, NotificationChain msgs)
    {
        ConnectorsType oldConnectors = connectors;
        connectors = newConnectors;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__CONNECTORS, oldConnectors, newConnectors);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setConnectors(ConnectorsType newConnectors)
    {
        if (newConnectors != connectors)
        {
            NotificationChain msgs = null;
            if (connectors != null)
                msgs = ((InternalEObject)connectors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__CONNECTORS, null, msgs);
            if (newConnectors != null)
                msgs = ((InternalEObject)newConnectors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__CONNECTORS, null, msgs);
            msgs = basicSetConnectors(newConnectors, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__CONNECTORS, newConnectors, newConnectors));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveTypesType getPrimitivetypes()
    {
        return primitivetypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPrimitivetypes(PrimitiveTypesType newPrimitivetypes, NotificationChain msgs)
    {
        PrimitiveTypesType oldPrimitivetypes = primitivetypes;
        primitivetypes = newPrimitivetypes;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__PRIMITIVETYPES, oldPrimitivetypes, newPrimitivetypes);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrimitivetypes(PrimitiveTypesType newPrimitivetypes)
    {
        if (newPrimitivetypes != primitivetypes)
        {
            NotificationChain msgs = null;
            if (primitivetypes != null)
                msgs = ((InternalEObject)primitivetypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__PRIMITIVETYPES, null, msgs);
            if (newPrimitivetypes != null)
                msgs = ((InternalEObject)newPrimitivetypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__PRIMITIVETYPES, null, msgs);
            msgs = basicSetPrimitivetypes(newPrimitivetypes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__PRIMITIVETYPES, newPrimitivetypes, newPrimitivetypes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getProfiles()
    {
        return profiles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProfiles(String newProfiles)
    {
        String oldProfiles = profiles;
        profiles = newProfiles;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__PROFILES, oldProfiles, profiles));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramsType getDiagrams()
    {
        return diagrams;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiagrams(DiagramsType newDiagrams, NotificationChain msgs)
    {
        DiagramsType oldDiagrams = diagrams;
        diagrams = newDiagrams;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__DIAGRAMS, oldDiagrams, newDiagrams);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDiagrams(DiagramsType newDiagrams)
    {
        if (newDiagrams != diagrams)
        {
            NotificationChain msgs = null;
            if (diagrams != null)
                msgs = ((InternalEObject)diagrams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__DIAGRAMS, null, msgs);
            if (newDiagrams != null)
                msgs = ((InternalEObject)newDiagrams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.EXTENSION__DIAGRAMS, null, msgs);
            msgs = basicSetDiagrams(newDiagrams, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__DIAGRAMS, newDiagrams, newDiagrams));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExtender()
    {
        return extender;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtender(String newExtender)
    {
        String oldExtender = extender;
        extender = newExtender;
        boolean oldExtenderESet = extenderESet;
        extenderESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__EXTENDER, oldExtender, extender, !oldExtenderESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExtender()
    {
        String oldExtender = extender;
        boolean oldExtenderESet = extenderESet;
        extender = EXTENDER_EDEFAULT;
        extenderESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENSION__EXTENDER, oldExtender, EXTENDER_EDEFAULT, oldExtenderESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExtender()
    {
        return extenderESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getExtenderID()
    {
        return extenderID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtenderID(String newExtenderID)
    {
        String oldExtenderID = extenderID;
        extenderID = newExtenderID;
        boolean oldExtenderIDESet = extenderIDESet;
        extenderIDESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.EXTENSION__EXTENDER_ID, oldExtenderID, extenderID, !oldExtenderIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetExtenderID()
    {
        String oldExtenderID = extenderID;
        boolean oldExtenderIDESet = extenderIDESet;
        extenderID = EXTENDER_ID_EDEFAULT;
        extenderIDESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XmeiPackage.EXTENSION__EXTENDER_ID, oldExtenderID, EXTENDER_ID_EDEFAULT, oldExtenderIDESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetExtenderID()
    {
        return extenderIDESet;
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
            case XmeiPackage.EXTENSION__ELEMENTS:
                return basicSetElements(null, msgs);
            case XmeiPackage.EXTENSION__CONNECTORS:
                return basicSetConnectors(null, msgs);
            case XmeiPackage.EXTENSION__PRIMITIVETYPES:
                return basicSetPrimitivetypes(null, msgs);
            case XmeiPackage.EXTENSION__DIAGRAMS:
                return basicSetDiagrams(null, msgs);
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
            case XmeiPackage.EXTENSION__ELEMENTS:
                return getElements();
            case XmeiPackage.EXTENSION__CONNECTORS:
                return getConnectors();
            case XmeiPackage.EXTENSION__PRIMITIVETYPES:
                return getPrimitivetypes();
            case XmeiPackage.EXTENSION__PROFILES:
                return getProfiles();
            case XmeiPackage.EXTENSION__DIAGRAMS:
                return getDiagrams();
            case XmeiPackage.EXTENSION__EXTENDER:
                return getExtender();
            case XmeiPackage.EXTENSION__EXTENDER_ID:
                return getExtenderID();
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
            case XmeiPackage.EXTENSION__ELEMENTS:
                setElements((ElementsType)newValue);
                return;
            case XmeiPackage.EXTENSION__CONNECTORS:
                setConnectors((ConnectorsType)newValue);
                return;
            case XmeiPackage.EXTENSION__PRIMITIVETYPES:
                setPrimitivetypes((PrimitiveTypesType)newValue);
                return;
            case XmeiPackage.EXTENSION__PROFILES:
                setProfiles((String)newValue);
                return;
            case XmeiPackage.EXTENSION__DIAGRAMS:
                setDiagrams((DiagramsType)newValue);
                return;
            case XmeiPackage.EXTENSION__EXTENDER:
                setExtender((String)newValue);
                return;
            case XmeiPackage.EXTENSION__EXTENDER_ID:
                setExtenderID((String)newValue);
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
            case XmeiPackage.EXTENSION__ELEMENTS:
                setElements((ElementsType)null);
                return;
            case XmeiPackage.EXTENSION__CONNECTORS:
                setConnectors((ConnectorsType)null);
                return;
            case XmeiPackage.EXTENSION__PRIMITIVETYPES:
                setPrimitivetypes((PrimitiveTypesType)null);
                return;
            case XmeiPackage.EXTENSION__PROFILES:
                setProfiles(PROFILES_EDEFAULT);
                return;
            case XmeiPackage.EXTENSION__DIAGRAMS:
                setDiagrams((DiagramsType)null);
                return;
            case XmeiPackage.EXTENSION__EXTENDER:
                unsetExtender();
                return;
            case XmeiPackage.EXTENSION__EXTENDER_ID:
                unsetExtenderID();
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
            case XmeiPackage.EXTENSION__ELEMENTS:
                return elements != null;
            case XmeiPackage.EXTENSION__CONNECTORS:
                return connectors != null;
            case XmeiPackage.EXTENSION__PRIMITIVETYPES:
                return primitivetypes != null;
            case XmeiPackage.EXTENSION__PROFILES:
                return PROFILES_EDEFAULT == null ? profiles != null : !PROFILES_EDEFAULT.equals(profiles);
            case XmeiPackage.EXTENSION__DIAGRAMS:
                return diagrams != null;
            case XmeiPackage.EXTENSION__EXTENDER:
                return isSetExtender();
            case XmeiPackage.EXTENSION__EXTENDER_ID:
                return isSetExtenderID();
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
        result.append(" (profiles: ");
        result.append(profiles);
        result.append(", extender: ");
        if (extenderESet) result.append(extender); else result.append("<unset>");
        result.append(", extenderID: ");
        if (extenderIDESet) result.append(extenderID); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ExtensionImpl
