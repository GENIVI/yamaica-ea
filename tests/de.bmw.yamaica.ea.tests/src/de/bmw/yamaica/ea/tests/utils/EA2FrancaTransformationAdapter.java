/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaIDLRuntimeModule;
import org.franca.core.franca.FModel;
import org.junit.Assert;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.yamaica.common.tests.utils.EMFHelper;
import de.bmw.yamaica.common.tests.utils.PathHelper;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.EA2FrancaTransformation;
import de.bmw.yamaica.franca.common.core.FrancaResourceSetContainer;
import de.bmw.yamaica.franca.common.core.FrancaUtils;

public class EA2FrancaTransformationAdapter
{
    // private constructor
    private EA2FrancaTransformationAdapter()
    {
    }

    public static EAProjectLoader createEAProjectLoader(String eaInputFile) throws Exception
    {
        File eaFile = new File(PathHelper.getFileUriFromBundleRelativePath(EATestConstants.TESTS_PLUGIN_ID, eaInputFile).toFileString());
        EAProjectLoader eaProjectLoader = new EAProjectLoader(eaFile);
        eaProjectLoader.run(new NullProgressMonitor());

        return eaProjectLoader;
    }

    public static ResourceSet transformEAPackages(EARepositoryContainer eaRepository, String[] eaPackagePaths, String destinationPath)
            throws Exception
    {
        List<EAPackageContainer> packages = getEAPackageContainers(eaRepository.getModels(), eaPackagePaths);

        IPath rootSavePath = new Path(PathHelper.getFileUriFromBundleRelativePath(EATestConstants.TESTS_PLUGIN_ID, destinationPath)
                .toString());
        Injector injector = Guice.createInjector(new FrancaIDLRuntimeModule());
        EA2FrancaTransformation ea2FrancaTransformation = injector.getInstance(EA2FrancaTransformation.class);

        FrancaResourceSetContainer resourceSetContainer = new FrancaResourceSetContainer(new SynchronizedXtextResourceSet(), rootSavePath);

        Collection<FModel> models = ea2FrancaTransformation.transformModels(packages);
        resourceSetContainer.addModels(models);
        resourceSetContainer.save();

        ea2FrancaTransformation.transformImports((resourceSetContainer).getModelSavePaths());
        resourceSetContainer.save();

        ea2FrancaTransformation.transformTypes();
        resourceSetContainer.save();

        ea2FrancaTransformation.transformTypeCrossReferences();
        resourceSetContainer.save();

        ea2FrancaTransformation.transformInterfaces();
        resourceSetContainer.save();

        ea2FrancaTransformation.transformInterfaceContents();
        resourceSetContainer.save();

        ea2FrancaTransformation.transformInterfaceCrossReferences();
        resourceSetContainer.save();

        Collection<String> logMessages = ea2FrancaTransformation.getLogMessages();

        if (logMessages.size() > 0)
        {
            Iterator<String> logMessagesIterator = logMessages.iterator();
            String logMessage = logMessages.size() + " warning(s) emerged while transforming EA project to Franca code!";

            for (int i = 0; logMessagesIterator.hasNext(); i++)
            {
                logMessage += String.format("%n%d: %s", i + 1, logMessagesIterator.next());
            }

            System.out.println(logMessage);
        }

        return resourceSetContainer.getResourceSet();
    }

    public static void compareModels(String refModelpath, String genModelpath) throws Exception
    {
        URI refModelUri = PathHelper.getFileUriFromBundleRelativePath(EATestConstants.TESTS_PLUGIN_ID, refModelpath);
        URI genModelUri = PathHelper.getFileUriFromBundleRelativePath(EATestConstants.TESTS_PLUGIN_ID, genModelpath);

        List<URI> refFileUris = PathHelper.toFileUriList(PathHelper.getFilesOfDirectory(new File(refModelUri.toFileString())));
        List<URI> genFileUris = PathHelper.toFileUriList(PathHelper.getFilesOfDirectory(new File(genModelUri.toFileString())));

        String[] fileExtensions = new String[] { FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION,
                FrancaUtils.DEPLOYMENT_DEFINITION_FILE_EXTENSION };

        ResourceSet refResourceSet = EMFHelper.loadFilesIntoResourceSet(new SynchronizedXtextResourceSet(), refFileUris, fileExtensions);
        ResourceSet genResourceSet = EMFHelper.loadFilesIntoResourceSet(new SynchronizedXtextResourceSet(), genFileUris, fileExtensions);

        List<Diff> diffs = EMFHelper.compareResourceSets(refResourceSet, genResourceSet);
        EMFHelper.printDifferences(diffs);
    }

    private static List<EAPackageContainer> getEAPackageContainers(List<EAPackageContainer> eaPackageContainers, String[] namespaces)
    {
        List<EAPackageContainer> targetContainers = new ArrayList<EAPackageContainer>();

        for (String namespace : namespaces)
        {
            EAPackageContainer targetContainer = getEAPackageContainer(eaPackageContainers, namespace);

            if (null != targetContainer)
            {
                targetContainers.add(targetContainer);
            }
        }

        Assert.assertEquals("Not all required EA packages could be found!", namespaces.length, targetContainers.size());

        return targetContainers;
    }

    private static EAPackageContainer getEAPackageContainer(List<EAPackageContainer> eaPackageContainers, String namespace)
    {
        int dotIndex = namespace.indexOf(".");
        String packageName = null;

        if (-1 == dotIndex)
        {
            packageName = namespace;
        }
        else
        {
            packageName = namespace.substring(0, dotIndex);
        }

        for (EAPackageContainer eaPackageContainer : eaPackageContainers)
        {
            if (eaPackageContainer.getName().equals(packageName))
            {
                if (-1 == dotIndex)
                {
                    return eaPackageContainer;
                }
                else
                {
                    return getEAPackageContainer(eaPackageContainer.getPackages(), namespace.substring(dotIndex + 1));
                }
            }
        }

        return null;
    }
}
