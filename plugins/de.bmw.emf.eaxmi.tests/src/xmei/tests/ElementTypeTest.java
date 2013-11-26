/**
 */
package xmei.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import xmei.ElementType;
import xmei.XmeiFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementTypeTest extends TestCase
{

    /**
     * The fixture for this Element Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementType fixture = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(ElementTypeTest.class);
    }

    /**
     * Constructs a new Element Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementTypeTest(String name)
    {
        super(name);
    }

    /**
     * Sets the fixture for this Element Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void setFixture(ElementType fixture)
    {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this Element Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ElementType getFixture()
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
        setFixture(XmeiFactory.eINSTANCE.createElementType());
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

} //ElementTypeTest
