/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packaged Element Package Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.PackagedElementPackageType#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.PackagedElementPackageType#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.PackagedElementPackageType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackagedElementPackageType()
 * @model extendedMetaData="name='packagedElementPackageType' kind='elementOnly'"
 * @generated
 */
public interface PackagedElementPackageType extends PackagedElementBaseType
{
    /**
     * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
     * The list contents are of type {@link uml.PackageImportType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Package Import</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Package Import</em>' containment reference list.
     * @see uml.UmlPackage#getPackagedElementPackageType_PackageImport()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='packageImport'"
     * @generated
     */
    EList<PackageImportType> getPackageImport();

    /**
     * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
     * The list contents are of type {@link uml.PackagedElementBaseType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Packaged Element</em>' containment reference list.
     * @see uml.UmlPackage#getPackagedElementPackageType_PackagedElement()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='packagedElement'"
     * @generated
     */
    EList<PackagedElementBaseType> getPackagedElement();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see uml.UmlPackage#getPackagedElementPackageType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link uml.PackagedElementPackageType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // PackagedElementPackageType
