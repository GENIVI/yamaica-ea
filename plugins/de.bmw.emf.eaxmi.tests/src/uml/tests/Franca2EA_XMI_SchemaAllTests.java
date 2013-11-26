/**
 */
package uml.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import xmei.tests.XmeiTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Franca2EA_XMI_Schema</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class Franca2EA_XMI_SchemaAllTests extends TestSuite
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(suite());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Test suite()
    {
        TestSuite suite = new Franca2EA_XMI_SchemaAllTests("Franca2EA_XMI_Schema Tests");
        suite.addTest(UmlTests.suite());
        suite.addTest(XmeiTests.suite());
        return suite;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Franca2EA_XMI_SchemaAllTests(String name)
    {
        super(name);
    }

} //Franca2EA_XMI_SchemaAllTests
