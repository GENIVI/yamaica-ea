/**
 */
package xmei;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Links Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link xmei.LinksType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link xmei.LinksType#getRealisation <em>Realisation</em>}</li>
 *   <li>{@link xmei.LinksType#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link xmei.LinksType#getDependency <em>Dependency</em>}</li>
 *   <li>{@link xmei.LinksType#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see xmei.XmeiPackage#getLinksType()
 * @model extendedMetaData="name='linksType' kind='elementOnly'"
 * @generated
 */
public interface LinksType extends EObject
{
    /**
     * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConcreteLinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sequence</em>' containment reference list.
     * @see xmei.XmeiPackage#getLinksType_Sequence()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Sequence'"
     * @generated
     */
    EList<ConcreteLinkType> getSequence();

    /**
     * Returns the value of the '<em><b>Realisation</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConcreteLinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Realisation</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Realisation</em>' containment reference list.
     * @see xmei.XmeiPackage#getLinksType_Realisation()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Realisation'"
     * @generated
     */
    EList<ConcreteLinkType> getRealisation();

    /**
     * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConcreteLinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Generalization</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Generalization</em>' containment reference list.
     * @see xmei.XmeiPackage#getLinksType_Generalization()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Generalization'"
     * @generated
     */
    EList<ConcreteLinkType> getGeneralization();

    /**
     * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConcreteLinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependency</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependency</em>' containment reference list.
     * @see xmei.XmeiPackage#getLinksType_Dependency()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Dependency'"
     * @generated
     */
    EList<ConcreteLinkType> getDependency();

    /**
     * Returns the value of the '<em><b>Association</b></em>' containment reference list.
     * The list contents are of type {@link xmei.ConcreteLinkType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Association</em>' containment reference list.
     * @see xmei.XmeiPackage#getLinksType_Association()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='Association'"
     * @generated
     */
    EList<ConcreteLinkType> getAssociation();

} // LinksType
