/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.internal.franca;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaImportsProvider;
import org.franca.core.franca.FModel;
import org.franca.core.utils.ModelPersistenceHandler;

import xmei.DocumentRoot;
import xmei.XmeiPackage;
import xmei.util.XmeiResourceFactoryImpl;
import xmei.util.XmeiResourceImpl;
import de.bmw.yamaica.ea.core.franca.Franca2EATransformation;

public class EaXmiExportOperation implements IRunnableWithProgress
{

    protected IPath           directoryPath;
    protected IContainer      source;
    protected IOverwriteQuery overwriteImplementor;
    protected List<IResource> resources;

    protected boolean         showOverwriteQuery = true;
    protected boolean         overwrite          = false;

    public EaXmiExportOperation(IPath directoryPath, IContainer source, IOverwriteQuery overwriteImplementor, List<IResource> resources)
    {
        Assert.isNotNull(directoryPath);
        Assert.isNotNull(source);
        Assert.isNotNull(overwriteImplementor);
        Assert.isNotNull(resources);

        this.directoryPath = directoryPath;
        this.source = source;
        this.overwriteImplementor = overwriteImplementor;
        this.resources = resources;
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
    {
        Franca2EATransformation trafo = new Franca2EATransformation();

        FrancaImportsProvider francaImportsProvider = new FrancaImportsProvider();
        ModelPersistenceHandler.registerFileExtensionHandler("fidl", francaImportsProvider);
        ModelPersistenceHandler persistenceManager = new ModelPersistenceHandler(new SynchronizedXtextResourceSet());

        ArrayList<FModel> modelList = new ArrayList<FModel>();

        for (IResource res : resources)
        {
            URI sourceUri = URI.createPlatformResourceURI(res.getFullPath().toString(), false);
            FModel testModel = (FModel) persistenceManager.loadModel(sourceUri, sourceUri);
            modelList.add(testModel);
        }

        DocumentRoot xmi = trafo.transform(modelList);
        this.saveModel(xmi, "file:///" + directoryPath.toString());
    }

    public void setOverwriteFiles(boolean value)
    {
        showOverwriteQuery = !value;
        overwrite = value;
    }

    public boolean saveModel(DocumentRoot model, String filename)
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
        }
        catch (IOException e)
        {
            e.printStackTrace();

            return false;
        }

        return true;
    }
}
