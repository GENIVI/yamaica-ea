/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.UmlFactory;
import uml.UmlInterfaceType;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlInterfaceTypeTest extends PackagedElementPackageTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(UmlInterfaceTypeTest.class);
    }

    /**
     * Constructs a new Interface Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlInterfaceTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Interface Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected UmlInterfaceType getFixture()
    {
        return (UmlInterfaceType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createUmlInterfaceType());
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

} //UmlInterfaceTypeTest
