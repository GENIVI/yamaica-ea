/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagrams Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.DiagramsType#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDiagramsType()
 * @model extendedMetaData="name='diagramsType' kind='elementOnly'"
 * @generated
 */
public interface DiagramsType extends EObject
{
    /**
     * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
     * The list contents are of type {@link xmei.DiagramType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Diagram</em>' containment reference list.
     * @see xmei.XmeiPackage#getDiagramsType_Diagram()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='diagram'"
     * @generated
     */
    EList<DiagramType> getDiagram();

} // DiagramsType
