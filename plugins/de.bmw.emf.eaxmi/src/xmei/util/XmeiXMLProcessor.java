/**
 */
package xmei.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import xmei.XmeiPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmeiXMLProcessor extends XMLProcessor
{

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XmeiXMLProcessor()
    {
        super((EPackage.Registry.INSTANCE));
        XmeiPackage.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XmeiResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations()
    {
        if (registrations == null)
        {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XmeiResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XmeiResourceFactoryImpl());
        }
        return registrations;
    }

} //XmeiXMLProcessor
