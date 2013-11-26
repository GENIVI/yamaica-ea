/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.ProjectType#getAuthor <em>Author</em>}</li>
 *   <li>{@link xmei.ProjectType#getCreated <em>Created</em>}</li>
 *   <li>{@link xmei.ProjectType#getModified <em>Modified</em>}</li>
 *   <li>{@link xmei.ProjectType#getPhase <em>Phase</em>}</li>
 *   <li>{@link xmei.ProjectType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getProjectType()
 * @model extendedMetaData="name='projectType' kind='empty'"
 * @generated
 */
public interface ProjectType extends EObject
{
    /**
     * Returns the value of the '<em><b>Author</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Author</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Author</em>' attribute.
     * @see #setAuthor(String)
     * @see xmei.XmeiPackage#getProjectType_Author()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='author'"
     * @generated
     */
    String getAuthor();

    /**
     * Sets the value of the '{@link xmei.ProjectType#getAuthor <em>Author</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Author</em>' attribute.
     * @see #getAuthor()
     * @generated
     */
    void setAuthor(String value);

    /**
     * Returns the value of the '<em><b>Created</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Created</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Created</em>' attribute.
     * @see #setCreated(String)
     * @see xmei.XmeiPackage#getProjectType_Created()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='created'"
     * @generated
     */
    String getCreated();

    /**
     * Sets the value of the '{@link xmei.ProjectType#getCreated <em>Created</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Created</em>' attribute.
     * @see #getCreated()
     * @generated
     */
    void setCreated(String value);

    /**
     * Returns the value of the '<em><b>Modified</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Modified</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Modified</em>' attribute.
     * @see #setModified(String)
     * @see xmei.XmeiPackage#getProjectType_Modified()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='modified'"
     * @generated
     */
    String getModified();

    /**
     * Sets the value of the '{@link xmei.ProjectType#getModified <em>Modified</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Modified</em>' attribute.
     * @see #getModified()
     * @generated
     */
    void setModified(String value);

    /**
     * Returns the value of the '<em><b>Phase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase</em>' attribute.
     * @see #setPhase(String)
     * @see xmei.XmeiPackage#getProjectType_Phase()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='phase'"
     * @generated
     */
    String getPhase();

    /**
     * Sets the value of the '{@link xmei.ProjectType#getPhase <em>Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase</em>' attribute.
     * @see #getPhase()
     * @generated
     */
    void setPhase(String value);

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see xmei.XmeiPackage#getProjectType_Version()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='version'"
     * @generated
     */
    String getVersion();

    /**
     * Sets the value of the '{@link xmei.ProjectType#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

} // ProjectType
