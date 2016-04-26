/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.franca;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.franca.core.dsl.FrancaImportsProvider;
import org.franca.core.franca.FModel;
import org.franca.core.utils.ModelPersistenceHandler;
import org.franca.deploymodel.dsl.FDeployImportsProvider;

import de.bmw.yamaica.common.core.utils.ResourceUtils;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.Franca2EATransformation;
import de.bmw.yamaica.ea.ui.internal.Activator;
import de.bmw.yamaica.franca.common.core.FrancaInjector;
import de.bmw.yamaica.franca.common.core.FrancaUtils;
import de.bmw.yamaica.franca.common.core.ValidationUtils;

public class Franca2EAExportOperation extends WorkspaceModifyOperation
{
    protected IPath           directoryPath;
    protected IPath           namespacePrefix;
    protected IContainer      source;
    protected IOverwriteQuery overwriteImplementor;
    protected List<IResource> resources;
    protected boolean         validateInput;

    public Franca2EAExportOperation(IPath directoryPath, IPath namespacePrefix, IContainer source, IOverwriteQuery overwriteImplementor,
            List<IResource> resources)
    {
        this(directoryPath, namespacePrefix, source, overwriteImplementor, resources, true);
    }

    public Franca2EAExportOperation(IPath directoryPath, IPath namespacePrefix, IContainer source, IOverwriteQuery overwriteImplementor,
            List<IResource> resources, boolean validateInput)
    {
        Assert.isNotNull(directoryPath);
        Assert.isNotNull(namespacePrefix);
        Assert.isNotNull(source);
        Assert.isNotNull(overwriteImplementor);
        Assert.isNotNull(resources);

        this.directoryPath = directoryPath;
        this.namespacePrefix = namespacePrefix;
        this.source = source;
        this.overwriteImplementor = overwriteImplementor;
        this.resources = resources;
        this.validateInput = validateInput;
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
    {
        monitor.beginTask("Transforming Franca IDL to EA project...", 6);
        monitor.subTask("Loading Franca model");

        ModelPersistenceHandler.registerFileExtensionHandler(FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION, new FrancaImportsProvider());
        ModelPersistenceHandler
                .registerFileExtensionHandler(FrancaUtils.DEPLOYMENT_DEFINITION_FILE_EXTENSION, new FDeployImportsProvider());
        ModelPersistenceHandler modelPersistenceHandler = new ModelPersistenceHandler(
                FrancaInjector.INSTANCE.getInstance(ResourceSet.class));

        for (IResource resource : resources)
        {
            URI rootPathUri = ResourceUtils.createURIForLocation(resource.getProject().getFullPath());
            URI resourcePathUri = ResourceUtils.createURIForLocation(resource.getFullPath());
            modelPersistenceHandler.loadModel(resourcePathUri, rootPathUri);
        }

        final List<FModel> models = new ArrayList<>();

        // Holding origin file names mapped to the lower case version of it (should correlates to the last package name).
        final Map<String, String> fileNamesCache = new HashMap<>();

        for (Resource resource : modelPersistenceHandler.getResourceSet().getResources())
        {
            for (EObject eObject : resource.getContents())
            {
                if (eObject instanceof FModel)
                {
                    final FModel fmodel = (FModel) eObject;
                    models.add(fmodel);

                    // Example of resource.getURI().toString():
                    // platform:/resource/FdeplGenTest/work/EA2Franca_MGU/de/bmw/environmentalmodel/Common.fidl
                    final String originFileName = new Path(resource.getURI().toString()).removeFileExtension().lastSegment();

                    // Cache all origin file names.
                    fileNamesCache.put(originFileName.toLowerCase(), originFileName);
                }
            }
        }

        if (validateInput)
        {
            if (!ValidationUtils.validate(modelPersistenceHandler.getResourceSet()))
            {
                monitor.done();
                Status status = new Status(Status.ERROR, Activator.PLUGIN_ID,
                        "Franca to EA export was aborted: Failed to validate Franca model.");
                throw new CoreException(status);
            }
        }

        checkCancelState(monitor);
        monitor.worked(1);

        EARepositoryContainer repositoryContainer = null;

        try
        {
            EAProjectLoader eaProjectLoader = new EAProjectLoader(directoryPath.toFile(), true);
            eaProjectLoader.run(new SubProgressMonitor(monitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK));
            repositoryContainer = eaProjectLoader.getRepository();

            checkCancelState(monitor);


            Franca2EATransformation transformation = new Franca2EATransformation(models, repositoryContainer, namespacePrefix,
                    fileNamesCache);

            monitor.subTask("Transforming root packages");

            transformation.transformModels();

            checkCancelState(monitor);
            monitor.worked(1);
            monitor.subTask("Transforming data types");

            transformation.transformDataTypes();

            checkCancelState(monitor);
            monitor.worked(1);
            monitor.subTask("Transforming cross references");

            transformation.transformCrossReferences();

            checkCancelState(monitor);
            monitor.worked(1);
            monitor.subTask("Generating diagrams");

            transformation.generateDiagrams();

            checkCancelState(monitor);
            monitor.worked(1);
        }
        finally
        {
            if (null != repositoryContainer)
            {
                repositoryContainer.closeFile();
                repositoryContainer.getEAInstance().close();
            }

            monitor.done();
        }
    }

    protected void checkCancelState(IProgressMonitor monitor) throws InterruptedException
    {
        if (monitor.isCanceled())
        {
            throw new InterruptedException("Franca to EA export was canceled!");
        }
    }
}
