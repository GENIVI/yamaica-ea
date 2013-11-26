/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element Instance Specification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackagedElementInstanceSpecificationType#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.PackagedElementInstanceSpecificationType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackagedElementInstanceSpecificationType()
 * @model extendedMetaData="name='packagedElementInstanceSpecificationType' kind='empty'"
 * @generated
 */
public interface PackagedElementInstanceSpecificationType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Classifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Classifier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classifier</em>' attribute.
     * @see #setClassifier(String)
     * @see uml.UmlPackage#getPackagedElementInstanceSpecificationType_Classifier()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='classifier'"
     * @generated
     */
    String getClassifier();

    /**
     * Sets the value of the '{@link uml.PackagedElementInstanceSpecificationType#getClassifier <em>Classifier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Classifier</em>' attribute.
     * @see #getClassifier()
     * @generated
     */
    void setClassifier(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * The default value is <code>""</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see uml.UmlPackage#getPackagedElementInstanceSpecificationType_Name()
     * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.PackagedElementInstanceSpecificationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Unsets the value of the '{@link uml.PackagedElementInstanceSpecificationType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link uml.PackagedElementInstanceSpecificationType#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

} // PackagedElementInstanceSpecificationType
