/**
 */
package uml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uml.ModelType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Model Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelTypeTest extends TestCase
{

    /**
     * The fixture for this Model Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(ModelTypeTest.class);
    }

    /**
     * Constructs a new Model Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModelTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Model Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ModelType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Model Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModelType getFixture()
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
        setFixture(UmlFactory.eINSTANCE.createModelType());
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

} //ModelTypeTest
