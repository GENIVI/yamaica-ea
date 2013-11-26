/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.OwnedOperationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Owned Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnedOperationTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(OwnedOperationTypeTest.class);
    }

    /**
     * Constructs a new Owned Operation Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedOperationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Owned Operation Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected OwnedOperationType getFixture()
    {
        return (OwnedOperationType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createOwnedOperationType());
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

} //OwnedOperationTypeTest
