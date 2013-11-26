/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.PackagedElementPackageType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packaged Element Package Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagedElementPackageTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(PackagedElementPackageTypeTest.class);
    }

    /**
     * Constructs a new Packaged Element Package Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementPackageTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Packaged Element Package Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackagedElementPackageType getFixture()
    {
        return (PackagedElementPackageType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createPackagedElementPackageType());
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

} //PackagedElementPackageTypeTest
