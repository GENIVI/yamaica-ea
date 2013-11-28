/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.positive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.XMLSave.XMLTypeInfo;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaImportsProvider;
import org.franca.core.franca.FModel;
import org.franca.core.utils.ModelPersistenceHandler;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import xmei.DocumentRoot;
import xmei.XmeiPackage;
import xmei.util.XmeiResourceFactoryImpl;
import xmei.util.XmeiResourceImpl;
import de.bmw.yamaica.ea.core.franca.Franca2EATransformation;
import de.bmw.yamaica.ea.tests.utils.NoOutputCreatedException;
import de.bmw.yamaica.ea.tests.utils.PathHelper;

public class Franca2EATest
{

    private static final String      FIDL_FOLDER = "C:\\Users\\bauer\\yamaica_git\\ascgit048.yamaica-ea\\tests\\de.bmw.yamaica.ea.tests\\models\\franca\\input\\test";

    private static List<String>      refList     = new ArrayList<String>();
    // private static ResourceSet referenceResourceSet;
    private static ArrayList<FModel> modelList   = new ArrayList<FModel>();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    @Before
    public void setUp() throws Exception
    {
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void test() throws NoOutputCreatedException, IOException
    {
        Franca2EATransformation trafo = new Franca2EATransformation();

        FrancaImportsProvider francaImportsProvider = new FrancaImportsProvider();
        ModelPersistenceHandler.registerFileExtensionHandler("fidl", francaImportsProvider);
        ModelPersistenceHandler persistenceManager = new ModelPersistenceHandler(new SynchronizedXtextResourceSet());

        refList = PathHelper.listOfFilesInPath(FIDL_FOLDER);

        for (String refPath : refList)
        {
            URI testUri = URI.createFileURI(refPath);
            FModel testModel = (FModel) persistenceManager.loadModel(testUri, testUri);
            modelList.add(testModel);

        }

        DocumentRoot xmi = trafo.transform(modelList);
        Franca2EATest.saveModel(xmi,
                "file:///C:\\Users\\bauer\\yamaica_git\\ascgit048.yamaica-ea\\tests\\de.bmw.yamaica.ea.tests\\demo2.xmi");
    }

    public static boolean saveModel(DocumentRoot model, String filename)
    {
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XmeiResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(XmeiPackage.eNS_URI, XmeiPackage.eINSTANCE);

        URI uri = URI.createURI(filename);
        XmeiResourceImpl res = (XmeiResourceImpl) resourceSet.createResource(uri);
        res.setEncoding("UTF-8");
        res.getContents().add(model);

        XMLTypeInfo typeInfo = new XMLSave.XMLTypeInfo()
        {

            public boolean shouldSaveType(EClass arg0, EClassifier arg1, EStructuralFeature arg2)
            {
                return false;
            }

            public boolean shouldSaveType(EClass arg0, EClass arg1, EStructuralFeature arg2)
            {
                return false;
            }

        };

        HashMap<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION, typeInfo);
        try
        {
            // res.save(Collections.EMPTY_MAP);
            res.save(options);
        }
        catch (IOException e)
        {
            e.printStackTrace();

            return false;
        }

        return true;
    }
}
