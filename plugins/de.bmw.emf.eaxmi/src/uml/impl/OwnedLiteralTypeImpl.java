/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.DefaultValueType;
import uml.OwnedLiteralType;
import uml.UmlPackage;
import uml.VisibilityType;

import xmei.TypeBaseType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Literal Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml.impl.OwnedLiteralTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedLiteralTypeImpl extends MinimalEObjectImpl.Container implements OwnedLiteralType
{
    /**
     * The cached value of the '{@link #getSpecification() <em>Specification</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecification()
     * @generated
     * @ordered
     */
    protected DefaultValueType specification;

    /**
     * The default value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected static final String CLASSIFIER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClassifier()
     * @generated
     * @ordered
     */
    protected String classifier = CLASSIFIER_EDEFAULT;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

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
    protected OwnedLiteralTypeImpl()
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
        return UmlPackage.Literals.OWNED_LITERAL_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValueType getSpecification()
    {
        return specification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSpecification(DefaultValueType newSpecification, NotificationChain msgs)
    {
        DefaultValueType oldSpecification = specification;
        specification = newSpecification;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION, oldSpecification, newSpecification);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecification(DefaultValueType newSpecification)
    {
        if (newSpecification != specification)
        {
            NotificationChain msgs = null;
            if (specification != null)
                msgs = ((InternalEObject)specification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION, null, msgs);
            if (newSpecification != null)
                msgs = ((InternalEObject)newSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION, null, msgs);
            msgs = basicSetSpecification(newSpecification, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION, newSpecification, newSpecification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getClassifier()
    {
        return classifier;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setClassifier(String newClassifier)
    {
        String oldClassifier = classifier;
        classifier = newClassifier;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__CLASSIFIER, oldClassifier, classifier));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId()
    {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId)
    {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__ID, oldId, id));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__TYPE, oldType, type, !oldTypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_LITERAL_TYPE__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY, oldVisibility, visibility, !oldVisibilityESet));
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
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY, oldVisibility, VISIBILITY_EDEFAULT, oldVisibilityESet));
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
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
    {
        switch (featureID)
        {
            case UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION:
                return basicSetSpecification(null, msgs);
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
            case UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION:
                return getSpecification();
            case UmlPackage.OWNED_LITERAL_TYPE__CLASSIFIER:
                return getClassifier();
            case UmlPackage.OWNED_LITERAL_TYPE__ID:
                return getId();
            case UmlPackage.OWNED_LITERAL_TYPE__NAME:
                return getName();
            case UmlPackage.OWNED_LITERAL_TYPE__TYPE:
                return getType();
            case UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY:
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
            case UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION:
                setSpecification((DefaultValueType)newValue);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__CLASSIFIER:
                setClassifier((String)newValue);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__ID:
                setId((String)newValue);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__NAME:
                setName((String)newValue);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__TYPE:
                setType((TypeBaseType)newValue);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY:
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
            case UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION:
                setSpecification((DefaultValueType)null);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__CLASSIFIER:
                setClassifier(CLASSIFIER_EDEFAULT);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__TYPE:
                unsetType();
                return;
            case UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY:
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
            case UmlPackage.OWNED_LITERAL_TYPE__SPECIFICATION:
                return specification != null;
            case UmlPackage.OWNED_LITERAL_TYPE__CLASSIFIER:
                return CLASSIFIER_EDEFAULT == null ? classifier != null : !CLASSIFIER_EDEFAULT.equals(classifier);
            case UmlPackage.OWNED_LITERAL_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case UmlPackage.OWNED_LITERAL_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case UmlPackage.OWNED_LITERAL_TYPE__TYPE:
                return isSetType();
            case UmlPackage.OWNED_LITERAL_TYPE__VISIBILITY:
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
        result.append(" (classifier: ");
        result.append(classifier);
        result.append(", id: ");
        result.append(id);
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        if (typeESet) result.append(type); else result.append("<unset>");
        result.append(", visibility: ");
        if (visibilityESet) result.append(visibility); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //OwnedLiteralTypeImpl
