/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.PackagedElementAssociationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packaged Element Association Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagedElementAssociationTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(PackagedElementAssociationTypeTest.class);
    }

    /**
     * Constructs a new Packaged Element Association Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementAssociationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Packaged Element Association Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackagedElementAssociationType getFixture()
    {
        return (PackagedElementAssociationType)fixture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#setUp()
     * @generated
     */
    @Override
    protected void setUp() throws Exception
    {
        setFixture(UmlFactory.eINSTANCE.createPackagedElementAssociationType());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception
    {
        setFixture(null);
    }

} //PackagedElementAssociationTypeTest
