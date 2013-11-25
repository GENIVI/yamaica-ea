/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.positive;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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

    private static final String      FIDL_PATH   = "C:\\Users\\bauer\\yamaica_git\\ascgit048.yamaica-ea\\tests\\de.bmw.yamaica.ea.tests\\input\\test3.fidl";
    // private static final String FIDL_FOLDER = "input";
    private static final String      FIDL_FOLDER = "C:\\Users\\bauer\\yamaica_git\\ascgit048.yamaica-ea\\tests\\de.bmw.yamaica.ea.tests\\input\\test";

    private static List<String>      refList     = new ArrayList<String>();
    private static ResourceSet       referenceResourceSet;
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
        referenceResourceSet = new SynchronizedXtextResourceSet();

        for (String refPath : refList)
        {
            // URI genURI = URI.createURI(PathHelper.getPlatformPath() + refPath);
            // referenceResourceSet.getResource(genURI, true).load(Collections.EMPTY_MAP);
            URI testUri = URI.createFileURI(refPath);
            FModel testModel = (FModel) persistenceManager.loadModel(testUri, testUri);
            modelList.add(testModel);

        }
        for (Resource rec : referenceResourceSet.getResources())
        {
            System.out.println(rec.toString());
        }

        // FModel francaModel = (FModel) persistenceManager.loadModel(fidlUri, fidlUri);
        // FModel[] francaModels = new FModel[] { francaModel };
        // FModel[] francaModels = new FModel[modelList.size()];
        // for (int i = 0; i < modelList.size(); i++)
        // {
        // francaModels[i] = modelList.get(i);
        // }
        DocumentRoot xmi = trafo.transform(modelList);
        Franca2EATest.saveModel(xmi, "demo.xmi");
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

        try
        {
            res.save(Collections.EMPTY_MAP);

            // System.out.println("Created FIBEX Service file " + filename);
        }
        catch (IOException e)
        {
            e.printStackTrace();

            return false;
        }

        return true;
    }
}
