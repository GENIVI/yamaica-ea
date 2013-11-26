/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.UmlEnumerationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlEnumerationTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(UmlEnumerationTypeTest.class);
    }

    /**
     * Constructs a new Enumeration Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlEnumerationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Enumeration Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected UmlEnumerationType getFixture()
    {
        return (UmlEnumerationType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createUmlEnumerationType());
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

} //UmlEnumerationTypeTest
