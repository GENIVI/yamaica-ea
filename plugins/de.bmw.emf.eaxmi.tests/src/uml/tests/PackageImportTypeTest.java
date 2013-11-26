/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.PackageImportType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Package Import Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageImportTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(PackageImportTypeTest.class);
    }

    /**
     * Constructs a new Package Import Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageImportTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Package Import Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackageImportType getFixture()
    {
        return (PackageImportType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createPackageImportType());
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

} //PackageImportTypeTest
