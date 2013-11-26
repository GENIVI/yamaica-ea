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
import uml.DirectionType;
import uml.MultiplicityValueType;
import uml.OwnedParameterType;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owned Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.OwnedParameterTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OwnedParameterTypeImpl extends MinimalEObjectImpl.Container implements OwnedParameterType
{
    /**
     * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultValue()
     * @generated
     * @ordered
     */
    protected DefaultValueType defaultValue;

    /**
     * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerValue()
     * @generated
     * @ordered
     */
    protected MultiplicityValueType lowerValue;

    /**
     * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpperValue()
     * @generated
     * @ordered
     */
    protected MultiplicityValueType upperValue;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final DirectionType DIRECTION_EDEFAULT = DirectionType.IN;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected DirectionType direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

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
     * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsException()
     * @generated
     * @ordered
     */
    protected static final boolean IS_EXCEPTION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsException()
     * @generated
     * @ordered
     */
    protected boolean isException = IS_EXCEPTION_EDEFAULT;

    /**
     * This is true if the Is Exception attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExceptionESet;

    /**
     * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ORDERED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsOrdered()
     * @generated
     * @ordered
     */
    protected boolean isOrdered = IS_ORDERED_EDEFAULT;

    /**
     * This is true if the Is Ordered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isOrderedESet;

    /**
     * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStream()
     * @generated
     * @ordered
     */
    protected static final boolean IS_STREAM_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsStream()
     * @generated
     * @ordered
     */
    protected boolean isStream = IS_STREAM_EDEFAULT;

    /**
     * This is true if the Is Stream attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isStreamESet;

    /**
     * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected static final boolean IS_UNIQUE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsUnique()
     * @generated
     * @ordered
     */
    protected boolean isUnique = IS_UNIQUE_EDEFAULT;

    /**
     * This is true if the Is Unique attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isUniqueESet;

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
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedParameterTypeImpl()
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
        return UmlPackage.Literals.OWNED_PARAMETER_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultValueType getDefaultValue()
    {
        return defaultValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultValue(DefaultValueType newDefaultValue, NotificationChain msgs)
    {
        DefaultValueType oldDefaultValue = defaultValue;
        defaultValue = newDefaultValue;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultValue(DefaultValueType newDefaultValue)
    {
        if (newDefaultValue != defaultValue)
        {
            NotificationChain msgs = null;
            if (defaultValue != null)
                msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE, null, msgs);
            if (newDefaultValue != null)
                msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE, null, msgs);
            msgs = basicSetDefaultValue(newDefaultValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityValueType getLowerValue()
    {
        return lowerValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLowerValue(MultiplicityValueType newLowerValue, NotificationChain msgs)
    {
        MultiplicityValueType oldLowerValue = lowerValue;
        lowerValue = newLowerValue;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE, oldLowerValue, newLowerValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLowerValue(MultiplicityValueType newLowerValue)
    {
        if (newLowerValue != lowerValue)
        {
            NotificationChain msgs = null;
            if (lowerValue != null)
                msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE, null, msgs);
            if (newLowerValue != null)
                msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE, null, msgs);
            msgs = basicSetLowerValue(newLowerValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE, newLowerValue, newLowerValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiplicityValueType getUpperValue()
    {
        return upperValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUpperValue(MultiplicityValueType newUpperValue, NotificationChain msgs)
    {
        MultiplicityValueType oldUpperValue = upperValue;
        upperValue = newUpperValue;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE, oldUpperValue, newUpperValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpperValue(MultiplicityValueType newUpperValue)
    {
        if (newUpperValue != upperValue)
        {
            NotificationChain msgs = null;
            if (upperValue != null)
                msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE, null, msgs);
            if (newUpperValue != null)
                msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE, null, msgs);
            msgs = basicSetUpperValue(newUpperValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE, newUpperValue, newUpperValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DirectionType getDirection()
    {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(DirectionType newDirection)
    {
        DirectionType oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION, oldDirection, direction, !oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDirection()
    {
        DirectionType oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION, oldDirection, DIRECTION_EDEFAULT, oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDirection()
    {
        return directionESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsException()
    {
        return isException;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsException(boolean newIsException)
    {
        boolean oldIsException = isException;
        isException = newIsException;
        boolean oldIsExceptionESet = isExceptionESet;
        isExceptionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION, oldIsException, isException, !oldIsExceptionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsException()
    {
        boolean oldIsException = isException;
        boolean oldIsExceptionESet = isExceptionESet;
        isException = IS_EXCEPTION_EDEFAULT;
        isExceptionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION, oldIsException, IS_EXCEPTION_EDEFAULT, oldIsExceptionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsException()
    {
        return isExceptionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsOrdered()
    {
        return isOrdered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsOrdered(boolean newIsOrdered)
    {
        boolean oldIsOrdered = isOrdered;
        isOrdered = newIsOrdered;
        boolean oldIsOrderedESet = isOrderedESet;
        isOrderedESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED, oldIsOrdered, isOrdered, !oldIsOrderedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsOrdered()
    {
        boolean oldIsOrdered = isOrdered;
        boolean oldIsOrderedESet = isOrderedESet;
        isOrdered = IS_ORDERED_EDEFAULT;
        isOrderedESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED, oldIsOrdered, IS_ORDERED_EDEFAULT, oldIsOrderedESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsOrdered()
    {
        return isOrderedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsStream()
    {
        return isStream;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsStream(boolean newIsStream)
    {
        boolean oldIsStream = isStream;
        isStream = newIsStream;
        boolean oldIsStreamESet = isStreamESet;
        isStreamESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM, oldIsStream, isStream, !oldIsStreamESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsStream()
    {
        boolean oldIsStream = isStream;
        boolean oldIsStreamESet = isStreamESet;
        isStream = IS_STREAM_EDEFAULT;
        isStreamESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM, oldIsStream, IS_STREAM_EDEFAULT, oldIsStreamESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsStream()
    {
        return isStreamESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsUnique()
    {
        return isUnique;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsUnique(boolean newIsUnique)
    {
        boolean oldIsUnique = isUnique;
        isUnique = newIsUnique;
        boolean oldIsUniqueESet = isUniqueESet;
        isUniqueESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE, oldIsUnique, isUnique, !oldIsUniqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetIsUnique()
    {
        boolean oldIsUnique = isUnique;
        boolean oldIsUniqueESet = isUniqueESet;
        isUnique = IS_UNIQUE_EDEFAULT;
        isUniqueESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE, oldIsUnique, IS_UNIQUE_EDEFAULT, oldIsUniqueESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetIsUnique()
    {
        return isUniqueESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType()
    {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType)
    {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNED_PARAMETER_TYPE__TYPE, oldType, type));
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
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
                return basicSetDefaultValue(null, msgs);
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
                return basicSetLowerValue(null, msgs);
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
                return basicSetUpperValue(null, msgs);
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
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
                return getDefaultValue();
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
                return getLowerValue();
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
                return getUpperValue();
            case UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION:
                return getDirection();
            case UmlPackage.OWNED_PARAMETER_TYPE__ID:
                return getId();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION:
                return isIsException();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED:
                return isIsOrdered();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM:
                return isIsStream();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE:
                return isIsUnique();
            case UmlPackage.OWNED_PARAMETER_TYPE__NAME:
                return getName();
            case UmlPackage.OWNED_PARAMETER_TYPE__TYPE:
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
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
                setDefaultValue((DefaultValueType)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
                setLowerValue((MultiplicityValueType)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
                setUpperValue((MultiplicityValueType)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION:
                setDirection((DirectionType)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__ID:
                setId((String)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION:
                setIsException((Boolean)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED:
                setIsOrdered((Boolean)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM:
                setIsStream((Boolean)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE:
                setIsUnique((Boolean)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__NAME:
                setName((String)newValue);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__TYPE:
                setType((String)newValue);
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
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
                setDefaultValue((DefaultValueType)null);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
                setLowerValue((MultiplicityValueType)null);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
                setUpperValue((MultiplicityValueType)null);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION:
                unsetDirection();
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION:
                unsetIsException();
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED:
                unsetIsOrdered();
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM:
                unsetIsStream();
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE:
                unsetIsUnique();
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case UmlPackage.OWNED_PARAMETER_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
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
            case UmlPackage.OWNED_PARAMETER_TYPE__DEFAULT_VALUE:
                return defaultValue != null;
            case UmlPackage.OWNED_PARAMETER_TYPE__LOWER_VALUE:
                return lowerValue != null;
            case UmlPackage.OWNED_PARAMETER_TYPE__UPPER_VALUE:
                return upperValue != null;
            case UmlPackage.OWNED_PARAMETER_TYPE__DIRECTION:
                return isSetDirection();
            case UmlPackage.OWNED_PARAMETER_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_EXCEPTION:
                return isSetIsException();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_ORDERED:
                return isSetIsOrdered();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_STREAM:
                return isSetIsStream();
            case UmlPackage.OWNED_PARAMETER_TYPE__IS_UNIQUE:
                return isSetIsUnique();
            case UmlPackage.OWNED_PARAMETER_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case UmlPackage.OWNED_PARAMETER_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
        result.append(" (direction: ");
        if (directionESet) result.append(direction); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", isException: ");
        if (isExceptionESet) result.append(isException); else result.append("<unset>");
        result.append(", isOrdered: ");
        if (isOrderedESet) result.append(isOrdered); else result.append("<unset>");
        result.append(", isStream: ");
        if (isStreamESet) result.append(isStream); else result.append("<unset>");
        result.append(", isUnique: ");
        if (isUniqueESet) result.append(isUnique); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(", type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //OwnedParameterTypeImpl
