/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element Relation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackagedElementRelationType#getClient <em>Client</em>}</li>
 *   <li>{@link uml.PackagedElementRelationType#getSupplier <em>Supplier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackagedElementRelationType()
 * @model extendedMetaData="name='packagedElementRelationType' kind='empty'"
 * @generated
 */
public interface PackagedElementRelationType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Client</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Client</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Client</em>' attribute.
     * @see #setClient(String)
     * @see uml.UmlPackage#getPackagedElementRelationType_Client()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='client'"
     * @generated
     */
    String getClient();

    /**
     * Sets the value of the '{@link uml.PackagedElementRelationType#getClient <em>Client</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Client</em>' attribute.
     * @see #getClient()
     * @generated
     */
    void setClient(String value);

    /**
     * Returns the value of the '<em><b>Supplier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Supplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Supplier</em>' attribute.
     * @see #setSupplier(String)
     * @see uml.UmlPackage#getPackagedElementRelationType_Supplier()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='supplier'"
     * @generated
     */
    String getSupplier();

    /**
     * Sets the value of the '{@link uml.PackagedElementRelationType#getSupplier <em>Supplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Supplier</em>' attribute.
     * @see #getSupplier()
     * @generated
     */
    void setSupplier(String value);

} // PackagedElementRelationType
