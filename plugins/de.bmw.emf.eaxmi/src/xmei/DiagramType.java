/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.DiagramType#getModel <em>Model</em>}</li>
 *   <li>{@link xmei.DiagramType#getProperties <em>Properties</em>}</li>
 *   <li>{@link xmei.DiagramType#getProject <em>Project</em>}</li>
 *   <li>{@link xmei.DiagramType#getStyle1 <em>Style1</em>}</li>
 *   <li>{@link xmei.DiagramType#getStyle2 <em>Style2</em>}</li>
 *   <li>{@link xmei.DiagramType#getSwimlanes <em>Swimlanes</em>}</li>
 *   <li>{@link xmei.DiagramType#getMatrixitems <em>Matrixitems</em>}</li>
 *   <li>{@link xmei.DiagramType#getElements <em>Elements</em>}</li>
 *   <li>{@link xmei.DiagramType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDiagramType()
 * @model extendedMetaData="name='diagramType' kind='elementOnly'"
 * @generated
 */
public interface DiagramType extends EObject
{
    /**
     * Returns the value of the '<em><b>Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model</em>' containment reference.
     * @see #setModel(DiagramModelType)
     * @see xmei.XmeiPackage#getDiagramType_Model()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='model'"
     * @generated
     */
    DiagramModelType getModel();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getModel <em>Model</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' containment reference.
     * @see #getModel()
     * @generated
     */
    void setModel(DiagramModelType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference.
     * @see #setProperties(DiagramPropertiesType)
     * @see xmei.XmeiPackage#getDiagramType_Properties()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='properties'"
     * @generated
     */
    DiagramPropertiesType getProperties();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getProperties <em>Properties</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Properties</em>' containment reference.
     * @see #getProperties()
     * @generated
     */
    void setProperties(DiagramPropertiesType value);

    /**
     * Returns the value of the '<em><b>Project</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Project</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Project</em>' containment reference.
     * @see #setProject(ProjectType)
     * @see xmei.XmeiPackage#getDiagramType_Project()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='project'"
     * @generated
     */
    ProjectType getProject();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getProject <em>Project</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Project</em>' containment reference.
     * @see #getProject()
     * @generated
     */
    void setProject(ProjectType value);

    /**
     * Returns the value of the '<em><b>Style1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style1</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style1</em>' containment reference.
     * @see #setStyle1(DocumentationType)
     * @see xmei.XmeiPackage#getDiagramType_Style1()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='style1'"
     * @generated
     */
    DocumentationType getStyle1();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getStyle1 <em>Style1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style1</em>' containment reference.
     * @see #getStyle1()
     * @generated
     */
    void setStyle1(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Style2</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style2</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style2</em>' containment reference.
     * @see #setStyle2(DocumentationType)
     * @see xmei.XmeiPackage#getDiagramType_Style2()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='style2'"
     * @generated
     */
    DocumentationType getStyle2();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getStyle2 <em>Style2</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style2</em>' containment reference.
     * @see #getStyle2()
     * @generated
     */
    void setStyle2(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Swimlanes</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Swimlanes</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Swimlanes</em>' containment reference.
     * @see #setSwimlanes(DocumentationType)
     * @see xmei.XmeiPackage#getDiagramType_Swimlanes()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='swimlanes'"
     * @generated
     */
    DocumentationType getSwimlanes();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getSwimlanes <em>Swimlanes</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Swimlanes</em>' containment reference.
     * @see #getSwimlanes()
     * @generated
     */
    void setSwimlanes(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Matrixitems</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Matrixitems</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Matrixitems</em>' containment reference.
     * @see #setMatrixitems(DocumentationType)
     * @see xmei.XmeiPackage#getDiagramType_Matrixitems()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='matrixitems'"
     * @generated
     */
    DocumentationType getMatrixitems();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getMatrixitems <em>Matrixitems</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Matrixitems</em>' containment reference.
     * @see #getMatrixitems()
     * @generated
     */
    void setMatrixitems(DocumentationType value);

    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference.
     * @see #setElements(DiagramElementsType)
     * @see xmei.XmeiPackage#getDiagramType_Elements()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='elements'"
     * @generated
     */
    DiagramElementsType getElements();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getElements <em>Elements</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Elements</em>' containment reference.
     * @see #getElements()
     * @generated
     */
    void setElements(DiagramElementsType value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see xmei.XmeiPackage#getDiagramType_Id()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link xmei.DiagramType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // DiagramType
