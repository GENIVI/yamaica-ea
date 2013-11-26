/**
 */
package uml.tests;

import junit.textui.TestRunner;

import uml.PackagedElementRelationType;
import uml.UmlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Packaged Element Relation Type</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PackagedElementRelationTypeTest extends PackagedElementBaseTypeTest
{

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static void main(String[] args)
    {
        TestRunner.run(PackagedElementRelationTypeTest.class);
    }

    /**
     * Constructs a new Packaged Element Relation Type test case with the given name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackagedElementRelationTypeTest(String name)
    {
        super(name);
    }

    /**
     * Returns the fixture for this Packaged Element Relation Type test case.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected PackagedElementRelationType getFixture()
    {
        return (PackagedElementRelationType)fixture;
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
        setFixture(UmlFactory.eINSTANCE.createPackagedElementRelationType());
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

} //PackagedElementRelationTypeTest
