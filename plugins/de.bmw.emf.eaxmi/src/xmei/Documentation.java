/**
 */
package xmei;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.Documentation#getExporter <em>Exporter</em>}</li>
 *   <li>{@link xmei.Documentation#getExporterVersion <em>Exporter Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getDocumentation()
 * @model extendedMetaData="name='Documentation' kind='empty'"
 * @generated
 */
public interface Documentation extends EObject
{
    /**
     * Returns the value of the '<em><b>Exporter</b></em>' attribute.
     * The default value is <code>"Enterprise Architect"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exporter</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exporter</em>' attribute.
     * @see #isSetExporter()
     * @see #unsetExporter()
     * @see #setExporter(String)
     * @see xmei.XmeiPackage#getDocumentation_Exporter()
     * @model default="Enterprise Architect" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='exporter'"
     * @generated
     */
    String getExporter();

    /**
     * Sets the value of the '{@link xmei.Documentation#getExporter <em>Exporter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exporter</em>' attribute.
     * @see #isSetExporter()
     * @see #unsetExporter()
     * @see #getExporter()
     * @generated
     */
    void setExporter(String value);

    /**
     * Unsets the value of the '{@link xmei.Documentation#getExporter <em>Exporter</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExporter()
     * @see #getExporter()
     * @see #setExporter(String)
     * @generated
     */
    void unsetExporter();

    /**
     * Returns whether the value of the '{@link xmei.Documentation#getExporter <em>Exporter</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exporter</em>' attribute is set.
     * @see #unsetExporter()
     * @see #getExporter()
     * @see #setExporter(String)
     * @generated
     */
    boolean isSetExporter();

    /**
     * Returns the value of the '<em><b>Exporter Version</b></em>' attribute.
     * The default value is <code>"6.5"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exporter Version</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exporter Version</em>' attribute.
     * @see #isSetExporterVersion()
     * @see #unsetExporterVersion()
     * @see #setExporterVersion(String)
     * @see xmei.XmeiPackage#getDocumentation_ExporterVersion()
     * @model default="6.5" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
     *        extendedMetaData="kind='attribute' name='exporterVersion'"
     * @generated
     */
    String getExporterVersion();

    /**
     * Sets the value of the '{@link xmei.Documentation#getExporterVersion <em>Exporter Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exporter Version</em>' attribute.
     * @see #isSetExporterVersion()
     * @see #unsetExporterVersion()
     * @see #getExporterVersion()
     * @generated
     */
    void setExporterVersion(String value);

    /**
     * Unsets the value of the '{@link xmei.Documentation#getExporterVersion <em>Exporter Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetExporterVersion()
     * @see #getExporterVersion()
     * @see #setExporterVersion(String)
     * @generated
     */
    void unsetExporterVersion();

    /**
     * Returns whether the value of the '{@link xmei.Documentation#getExporterVersion <em>Exporter Version</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Exporter Version</em>' attribute is set.
     * @see #unsetExporterVersion()
     * @see #getExporterVersion()
     * @see #setExporterVersion(String)
     * @generated
     */
    boolean isSetExporterVersion();

} // Documentation
