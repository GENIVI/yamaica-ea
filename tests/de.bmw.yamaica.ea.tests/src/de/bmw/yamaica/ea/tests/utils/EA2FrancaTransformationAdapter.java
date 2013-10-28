/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaIDLRuntimeModule;
import org.franca.core.franca.FModel;
import org.osgi.framework.Bundle;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.EA2FrancaTransformation;
import de.bmw.yamaica.franca.base.core.FrancaResourceSetContainer;

public class EA2FrancaTransformationAdapter
{
    private static EAProjectLoader eaProjectLoader;

    /* private constructor */
    private EA2FrancaTransformationAdapter()
    {
    }

    public static void setUpAdapter(String eaInputFile) throws Exception
    {
        File eaFile = new File(getFileUriFromBundleRelativePath(EATestConstants.PLUGIN_ID, eaInputFile));
        eaProjectLoader = new EAProjectLoader(eaFile);
        eaProjectLoader.run(new NullProgressMonitor());
    }

    public static void tearDownAdapter()
    {
        eaProjectLoader.dispose();
        eaProjectLoader = null;
    }

    public static void transformEAPackages(String[] eaPackagePaths, String genPath) throws Exception
    {
        EARepositoryContainer repository = eaProjectLoader.getRepository();
        List<EAPackageContainer> packages = getEAPackageContainers(repository.getModels(), eaPackagePaths);

        IPath rootSavePath = new Path(getFileUriFromBundleRelativePath(EATestConstants.PLUGIN_ID, genPath).toString());
        Injector injector = Guice.createInjector(new FrancaIDLRuntimeModule());
        EA2FrancaTransformation ea2FrancaTransformation = injector.getInstance(EA2FrancaTransformation.class);

        FrancaResourceSetContainer resourceSetContainer = new FrancaResourceSetContainer(new SynchronizedXtextResourceSet(), rootSavePath);

        FModel[] models = ea2FrancaTransformation.transformModels(packages.toArray(new EAPackageContainer[packages.size()]));
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

        String[] logMessages = ea2FrancaTransformation.getLogMessages();

        if (logMessages.length > 0)
        {
            String logMessage = logMessages.length + " warning(s) emerged while transforming EA project to Franca code!";

            for (int i = 0; i < logMessages.length; i++)
            {
                logMessage += String.format("%n%d: %s", i + 1, logMessages[i]);
            }

            System.out.println(logMessage);
        }
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

    private static URI getFileUriFromBundleRelativePath(String bundleId, String bundleRelativePath) throws URISyntaxException, IOException
    {
        Bundle bundle = Platform.getBundle(bundleId);
        URL url = FileLocator.find(bundle, new Path(""), null);

        // Append bundle relative path after resolving URL to allow the creation of URI to an non existing file or folder.
        return URI.create(FileLocator.resolve(url).toURI().toString() + "/" + bundleRelativePath);
    }
}
