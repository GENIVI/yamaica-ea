/**
 */
package uml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uml.OwnedParameterType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Owned Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OwnedParameterTypeTest extends TestCase
{

    /**
     * The fixture for this Owned Parameter Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedParameterType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(OwnedParameterTypeTest.class);
    }

    /**
     * Constructs a new Owned Parameter Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OwnedParameterTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Owned Parameter Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(OwnedParameterType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Owned Parameter Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OwnedParameterType getFixture()
    {
        return fixture;
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
        setFixture(UmlFactory.eINSTANCE.createOwnedParameterType());
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

} //OwnedParameterTypeTest
