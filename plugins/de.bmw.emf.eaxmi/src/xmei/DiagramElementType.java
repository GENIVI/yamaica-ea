/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.DiagramElementType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link xmei.DiagramElementType#getSeqno <em>Seqno</em>}</li>
 *   <li>{@link xmei.DiagramElementType#getStyle <em>Style</em>}</li>
 *   <li>{@link xmei.DiagramElementType#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDiagramElementType()
 * @model extendedMetaData="name='diagramElementType' kind='empty'"
 * @generated
 */
public interface DiagramElementType extends EObject
{
    /**
     * Returns the value of the '<em><b>Geometry</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Geometry</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Geometry</em>' attribute.
     * @see #setGeometry(String)
     * @see xmei.XmeiPackage#getDiagramElementType_Geometry()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='geometry'"
     * @generated
     */
    String getGeometry();

    /**
     * Sets the value of the '{@link xmei.DiagramElementType#getGeometry <em>Geometry</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Geometry</em>' attribute.
     * @see #getGeometry()
     * @generated
     */
    void setGeometry(String value);

    /**
     * Returns the value of the '<em><b>Seqno</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Seqno</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Seqno</em>' attribute.
     * @see #isSetSeqno()
     * @see #unsetSeqno()
     * @see #setSeqno(int)
     * @see xmei.XmeiPackage#getDiagramElementType_Seqno()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
     *        extendedMetaData="kind='attribute' name='seqno'"
     * @generated
     */
    int getSeqno();

    /**
     * Sets the value of the '{@link xmei.DiagramElementType#getSeqno <em>Seqno</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seqno</em>' attribute.
     * @see #isSetSeqno()
     * @see #unsetSeqno()
     * @see #getSeqno()
     * @generated
     */
    void setSeqno(int value);

    /**
     * Unsets the value of the '{@link xmei.DiagramElementType#getSeqno <em>Seqno</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeqno()
     * @see #getSeqno()
     * @see #setSeqno(int)
     * @generated
     */
    void unsetSeqno();

    /**
     * Returns whether the value of the '{@link xmei.DiagramElementType#getSeqno <em>Seqno</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seqno</em>' attribute is set.
     * @see #unsetSeqno()
     * @see #getSeqno()
     * @see #setSeqno(int)
     * @generated
     */
    boolean isSetSeqno();

    /**
     * Returns the value of the '<em><b>Style</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Style</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Style</em>' attribute.
     * @see #setStyle(String)
     * @see xmei.XmeiPackage#getDiagramElementType_Style()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='style'"
     * @generated
     */
    String getStyle();

    /**
     * Sets the value of the '{@link xmei.DiagramElementType#getStyle <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Style</em>' attribute.
     * @see #getStyle()
     * @generated
     */
    void setStyle(String value);

    /**
     * Returns the value of the '<em><b>Subject</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Subject</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Subject</em>' attribute.
     * @see #setSubject(String)
     * @see xmei.XmeiPackage#getDiagramElementType_Subject()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='subject'"
     * @generated
     */
    String getSubject();

    /**
     * Sets the value of the '{@link xmei.DiagramElementType#getSubject <em>Subject</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subject</em>' attribute.
     * @see #getSubject()
     * @generated
     */
    void setSubject(String value);

} // DiagramElementType
