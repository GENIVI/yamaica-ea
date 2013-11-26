/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.UmlClassType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Class Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlClassTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(UmlClassTypeTest.class);
    }

    /**
     * Constructs a new Class Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlClassTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Class Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected UmlClassType getFixture()
    {
        return (UmlClassType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createUmlClassType());
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

} //UmlClassTypeTest
