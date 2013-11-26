/**
 */
package xmei.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xmei.DiagramElementsType;
import xmei.DiagramModelType;
import xmei.DiagramPropertiesType;
import xmei.DiagramType;
import xmei.DocumentationType;
import xmei.ProjectType;
import xmei.XmeiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getProject <em>Project</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getStyle2 <em>Style2</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getMatrixitems <em>Matrixitems</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link xmei.impl.DiagramTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramTypeImpl extends MinimalEObjectImpl.Container implements DiagramType
{
    /**
     * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModel()
     * @generated
     * @ordered
     */
    protected DiagramModelType model;

    /**
     * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperties()
     * @generated
     * @ordered
     */
    protected DiagramPropertiesType properties;

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
     * The cached value of the '{@link #getStyle1() <em>Style1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle1()
     * @generated
     * @ordered
     */
    protected DocumentationType style1;

    /**
     * The cached value of the '{@link #getStyle2() <em>Style2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle2()
     * @generated
     * @ordered
     */
    protected DocumentationType style2;

    /**
     * The cached value of the '{@link #getSwimlanes() <em>Swimlanes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwimlanes()
     * @generated
     * @ordered
     */
    protected DocumentationType swimlanes;

    /**
     * The cached value of the '{@link #getMatrixitems() <em>Matrixitems</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMatrixitems()
     * @generated
     * @ordered
     */
    protected DocumentationType matrixitems;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected DiagramElementsType elements;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiagramTypeImpl()
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
        return XmeiPackage.Literals.DIAGRAM_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramModelType getModel()
    {
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetModel(DiagramModelType newModel, NotificationChain msgs)
    {
        DiagramModelType oldModel = model;
        model = newModel;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__MODEL, oldModel, newModel);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setModel(DiagramModelType newModel)
    {
        if (newModel != model)
        {
            NotificationChain msgs = null;
            if (model != null)
                msgs = ((InternalEObject)model).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__MODEL, null, msgs);
            if (newModel != null)
                msgs = ((InternalEObject)newModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__MODEL, null, msgs);
            msgs = basicSetModel(newModel, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__MODEL, newModel, newModel));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramPropertiesType getProperties()
    {
        return properties;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetProperties(DiagramPropertiesType newProperties, NotificationChain msgs)
    {
        DiagramPropertiesType oldProperties = properties;
        properties = newProperties;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__PROPERTIES, oldProperties, newProperties);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperties(DiagramPropertiesType newProperties)
    {
        if (newProperties != properties)
        {
            NotificationChain msgs = null;
            if (properties != null)
                msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__PROPERTIES, null, msgs);
            if (newProperties != null)
                msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__PROPERTIES, null, msgs);
            msgs = basicSetProperties(newProperties, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__PROPERTIES, newProperties, newProperties));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__PROJECT, oldProject, newProject);
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
                msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__PROJECT, null, msgs);
            if (newProject != null)
                msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__PROJECT, null, msgs);
            msgs = basicSetProject(newProject, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__PROJECT, newProject, newProject));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getStyle1()
    {
        return style1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStyle1(DocumentationType newStyle1, NotificationChain msgs)
    {
        DocumentationType oldStyle1 = style1;
        style1 = newStyle1;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__STYLE1, oldStyle1, newStyle1);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle1(DocumentationType newStyle1)
    {
        if (newStyle1 != style1)
        {
            NotificationChain msgs = null;
            if (style1 != null)
                msgs = ((InternalEObject)style1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__STYLE1, null, msgs);
            if (newStyle1 != null)
                msgs = ((InternalEObject)newStyle1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__STYLE1, null, msgs);
            msgs = basicSetStyle1(newStyle1, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__STYLE1, newStyle1, newStyle1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getStyle2()
    {
        return style2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStyle2(DocumentationType newStyle2, NotificationChain msgs)
    {
        DocumentationType oldStyle2 = style2;
        style2 = newStyle2;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__STYLE2, oldStyle2, newStyle2);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle2(DocumentationType newStyle2)
    {
        if (newStyle2 != style2)
        {
            NotificationChain msgs = null;
            if (style2 != null)
                msgs = ((InternalEObject)style2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__STYLE2, null, msgs);
            if (newStyle2 != null)
                msgs = ((InternalEObject)newStyle2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__STYLE2, null, msgs);
            msgs = basicSetStyle2(newStyle2, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__STYLE2, newStyle2, newStyle2));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getSwimlanes()
    {
        return swimlanes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwimlanes(DocumentationType newSwimlanes, NotificationChain msgs)
    {
        DocumentationType oldSwimlanes = swimlanes;
        swimlanes = newSwimlanes;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__SWIMLANES, oldSwimlanes, newSwimlanes);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSwimlanes(DocumentationType newSwimlanes)
    {
        if (newSwimlanes != swimlanes)
        {
            NotificationChain msgs = null;
            if (swimlanes != null)
                msgs = ((InternalEObject)swimlanes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__SWIMLANES, null, msgs);
            if (newSwimlanes != null)
                msgs = ((InternalEObject)newSwimlanes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__SWIMLANES, null, msgs);
            msgs = basicSetSwimlanes(newSwimlanes, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__SWIMLANES, newSwimlanes, newSwimlanes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getMatrixitems()
    {
        return matrixitems;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMatrixitems(DocumentationType newMatrixitems, NotificationChain msgs)
    {
        DocumentationType oldMatrixitems = matrixitems;
        matrixitems = newMatrixitems;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS, oldMatrixitems, newMatrixitems);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMatrixitems(DocumentationType newMatrixitems)
    {
        if (newMatrixitems != matrixitems)
        {
            NotificationChain msgs = null;
            if (matrixitems != null)
                msgs = ((InternalEObject)matrixitems).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS, null, msgs);
            if (newMatrixitems != null)
                msgs = ((InternalEObject)newMatrixitems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS, null, msgs);
            msgs = basicSetMatrixitems(newMatrixitems, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS, newMatrixitems, newMatrixitems));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DiagramElementsType getElements()
    {
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElements(DiagramElementsType newElements, NotificationChain msgs)
    {
        DiagramElementsType oldElements = elements;
        elements = newElements;
        if (eNotificationRequired())
        {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__ELEMENTS, oldElements, newElements);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElements(DiagramElementsType newElements)
    {
        if (newElements != elements)
        {
            NotificationChain msgs = null;
            if (elements != null)
                msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__ELEMENTS, null, msgs);
            if (newElements != null)
                msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XmeiPackage.DIAGRAM_TYPE__ELEMENTS, null, msgs);
            msgs = basicSetElements(newElements, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__ELEMENTS, newElements, newElements));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XmeiPackage.DIAGRAM_TYPE__ID, oldId, id));
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
            case XmeiPackage.DIAGRAM_TYPE__MODEL:
                return basicSetModel(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__PROPERTIES:
                return basicSetProperties(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__PROJECT:
                return basicSetProject(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__STYLE1:
                return basicSetStyle1(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__STYLE2:
                return basicSetStyle2(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__SWIMLANES:
                return basicSetSwimlanes(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS:
                return basicSetMatrixitems(null, msgs);
            case XmeiPackage.DIAGRAM_TYPE__ELEMENTS:
                return basicSetElements(null, msgs);
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
            case XmeiPackage.DIAGRAM_TYPE__MODEL:
                return getModel();
            case XmeiPackage.DIAGRAM_TYPE__PROPERTIES:
                return getProperties();
            case XmeiPackage.DIAGRAM_TYPE__PROJECT:
                return getProject();
            case XmeiPackage.DIAGRAM_TYPE__STYLE1:
                return getStyle1();
            case XmeiPackage.DIAGRAM_TYPE__STYLE2:
                return getStyle2();
            case XmeiPackage.DIAGRAM_TYPE__SWIMLANES:
                return getSwimlanes();
            case XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS:
                return getMatrixitems();
            case XmeiPackage.DIAGRAM_TYPE__ELEMENTS:
                return getElements();
            case XmeiPackage.DIAGRAM_TYPE__ID:
                return getId();
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
            case XmeiPackage.DIAGRAM_TYPE__MODEL:
                setModel((DiagramModelType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__PROPERTIES:
                setProperties((DiagramPropertiesType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__PROJECT:
                setProject((ProjectType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__STYLE1:
                setStyle1((DocumentationType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__STYLE2:
                setStyle2((DocumentationType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__SWIMLANES:
                setSwimlanes((DocumentationType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS:
                setMatrixitems((DocumentationType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__ELEMENTS:
                setElements((DiagramElementsType)newValue);
                return;
            case XmeiPackage.DIAGRAM_TYPE__ID:
                setId((String)newValue);
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
            case XmeiPackage.DIAGRAM_TYPE__MODEL:
                setModel((DiagramModelType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__PROPERTIES:
                setProperties((DiagramPropertiesType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__PROJECT:
                setProject((ProjectType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__STYLE1:
                setStyle1((DocumentationType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__STYLE2:
                setStyle2((DocumentationType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__SWIMLANES:
                setSwimlanes((DocumentationType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS:
                setMatrixitems((DocumentationType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__ELEMENTS:
                setElements((DiagramElementsType)null);
                return;
            case XmeiPackage.DIAGRAM_TYPE__ID:
                setId(ID_EDEFAULT);
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
            case XmeiPackage.DIAGRAM_TYPE__MODEL:
                return model != null;
            case XmeiPackage.DIAGRAM_TYPE__PROPERTIES:
                return properties != null;
            case XmeiPackage.DIAGRAM_TYPE__PROJECT:
                return project != null;
            case XmeiPackage.DIAGRAM_TYPE__STYLE1:
                return style1 != null;
            case XmeiPackage.DIAGRAM_TYPE__STYLE2:
                return style2 != null;
            case XmeiPackage.DIAGRAM_TYPE__SWIMLANES:
                return swimlanes != null;
            case XmeiPackage.DIAGRAM_TYPE__MATRIXITEMS:
                return matrixitems != null;
            case XmeiPackage.DIAGRAM_TYPE__ELEMENTS:
                return elements != null;
            case XmeiPackage.DIAGRAM_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //DiagramTypeImpl
