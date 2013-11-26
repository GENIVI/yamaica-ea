/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.DiagramModelType#getLocalID <em>Local ID</em>}</li>
 *   <li>{@link xmei.DiagramModelType#getOwner <em>Owner</em>}</li>
 *   <li>{@link xmei.DiagramModelType#getPackage <em>Package</em>}</li>
 *   <li>{@link xmei.DiagramModelType#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDiagramModelType()
 * @model extendedMetaData="name='diagramModelType' kind='empty'"
 * @generated
 */
public interface DiagramModelType extends EObject
{
    /**
     * Returns the value of the '<em><b>Local ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Local ID</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Local ID</em>' attribute.
     * @see #isSetLocalID()
     * @see #unsetLocalID()
     * @see #setLocalID(int)
     * @see xmei.XmeiPackage#getDiagramModelType_LocalID()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
     *        extendedMetaData="kind='attribute' name='localID'"
     * @generated
     */
    int getLocalID();

    /**
     * Sets the value of the '{@link xmei.DiagramModelType#getLocalID <em>Local ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Local ID</em>' attribute.
     * @see #isSetLocalID()
     * @see #unsetLocalID()
     * @see #getLocalID()
     * @generated
     */
    void setLocalID(int value);

    /**
     * Unsets the value of the '{@link xmei.DiagramModelType#getLocalID <em>Local ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocalID()
     * @see #getLocalID()
     * @see #setLocalID(int)
     * @generated
     */
    void unsetLocalID();

    /**
     * Returns whether the value of the '{@link xmei.DiagramModelType#getLocalID <em>Local ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Local ID</em>' attribute is set.
     * @see #unsetLocalID()
     * @see #getLocalID()
     * @see #setLocalID(int)
     * @generated
     */
    boolean isSetLocalID();

    /**
     * Returns the value of the '<em><b>Owner</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Owner</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Owner</em>' attribute.
     * @see #setOwner(String)
     * @see xmei.XmeiPackage#getDiagramModelType_Owner()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='owner'"
     * @generated
     */
    String getOwner();

    /**
     * Sets the value of the '{@link xmei.DiagramModelType#getOwner <em>Owner</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Owner</em>' attribute.
     * @see #getOwner()
     * @generated
     */
    void setOwner(String value);

    /**
     * Returns the value of the '<em><b>Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package</em>' attribute.
     * @see #setPackage(String)
     * @see xmei.XmeiPackage#getDiagramModelType_Package()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='package'"
     * @generated
     */
    String getPackage();

    /**
     * Sets the value of the '{@link xmei.DiagramModelType#getPackage <em>Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Package</em>' attribute.
     * @see #getPackage()
     * @generated
     */
    void setPackage(String value);

    /**
     * Returns the value of the '<em><b>Parent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parent</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parent</em>' attribute.
     * @see #setParent(String)
     * @see xmei.XmeiPackage#getDiagramModelType_Parent()
     * @model dataType="xmei.IdType"
     *        extendedMetaData="kind='attribute' name='parent'"
     * @generated
     */
    String getParent();

    /**
     * Sets the value of the '{@link xmei.DiagramModelType#getParent <em>Parent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parent</em>' attribute.
     * @see #getParent()
     * @generated
     */
    void setParent(String value);

} // DiagramModelType
