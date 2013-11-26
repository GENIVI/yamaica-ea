/**
 */
package uml.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import uml.GeneralizationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generalization Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralizationTypeTest extends TestCase
{

    /**
     * The fixture for this Generalization Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralizationType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(GeneralizationTypeTest.class);
    }

    /**
     * Constructs a new Generalization Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralizationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Generalization Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(GeneralizationType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Generalization Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneralizationType getFixture()
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
        setFixture(UmlFactory.eINSTANCE.createGeneralizationType());
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

} //GeneralizationTypeTest
