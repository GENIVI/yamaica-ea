/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackageImportType#getImportedPackage <em>Imported Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackageImportType()
 * @model extendedMetaData="name='packageImportType' kind='empty'"
 * @generated
 */
public interface PackageImportType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Imported Package</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Imported Package</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Imported Package</em>' attribute.
     * @see #setImportedPackage(String)
     * @see uml.UmlPackage#getPackageImportType_ImportedPackage()
     * @model dataType="xmei.IdType" required="true"
     *        extendedMetaData="kind='attribute' name='importedPackage'"
     * @generated
     */
    String getImportedPackage();

    /**
     * Sets the value of the '{@link uml.PackageImportType#getImportedPackage <em>Imported Package</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imported Package</em>' attribute.
     * @see #getImportedPackage()
     * @generated
     */
    void setImportedPackage(String value);

} // PackageImportType
