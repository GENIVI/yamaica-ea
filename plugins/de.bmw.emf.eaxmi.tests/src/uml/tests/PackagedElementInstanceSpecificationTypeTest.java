/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.PackagedElementInstanceSpecificationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packaged Element Instance Specification Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagedElementInstanceSpecificationTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(PackagedElementInstanceSpecificationTypeTest.class);
    }

    /**
     * Constructs a new Packaged Element Instance Specification Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementInstanceSpecificationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Packaged Element Instance Specification Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackagedElementInstanceSpecificationType getFixture()
    {
        return (PackagedElementInstanceSpecificationType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createPackagedElementInstanceSpecificationType());
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

} //PackagedElementInstanceSpecificationTypeTest
