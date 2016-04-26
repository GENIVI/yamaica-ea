/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaIDLRuntimeModule;
import org.franca.core.dsl.FrancaImportsProvider;
import org.franca.core.franca.FModel;
import org.franca.core.utils.ModelPersistenceHandler;
import org.junit.Assert;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.yamaica.common.tests.utils.EMFHelper;
import de.bmw.yamaica.common.tests.utils.PathHelper;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.EA2FrancaTransformation;
import de.bmw.yamaica.ea.core.franca.EAFrancaConstants;
import de.bmw.yamaica.ea.core.franca.Franca2EATransformation;
import de.bmw.yamaica.franca.common.core.FrancaResourceSetContainer;
import de.bmw.yamaica.franca.common.core.FrancaUtils;

public class TransformationAdapter
{
    private static final Logger LOGGER = Logger.getLogger(TransformationAdapter.class.getName());

    private TransformationAdapter()
    {
    }

    public static EAProjectLoader createEAProjectLoader(String pluginId, String eaInputFile) throws Exception
    {
        File eaFile = new File(PathHelper.getFileUriFromBundleRelativePath(pluginId, eaInputFile).toFileString());
        EAProjectLoader eaProjectLoader = new EAProjectLoader(eaFile, true);
        eaProjectLoader.run(new NullProgressMonitor());

        return eaProjectLoader;
    }

    public static void transformFranca2EA(EARepositoryContainer eaRepository, String namespacePrefix, List<File> francaFidlFiles)
            throws Exception
    {
        LOGGER.log(Level.FINEST, "Starting Franca to EA transformations..");

        ModelPersistenceHandler.registerFileExtensionHandler(FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION, new FrancaImportsProvider());
        ModelPersistenceHandler modelPersistenceHandler = new ModelPersistenceHandler(new SynchronizedXtextResourceSet());

        // Holding origin file names mapped to its lower case version (last segment of the package name).
        final Map<String, String> fileNamesCache = new HashMap<>();

        for (File francaFidlFile : francaFidlFiles)
        {
            URI fidlFileUri = URI.createFileURI(francaFidlFile.toString());
            URI fidlRootUri = URI.createFileURI(francaFidlFile.getParent().toString());
            modelPersistenceHandler.loadModel(fidlFileUri, fidlRootUri);

            final String fileNameWithoutFileExt = new Path(francaFidlFile.getAbsolutePath()).removeFileExtension().lastSegment();
            fileNamesCache.put(fileNameWithoutFileExt.toLowerCase(), fileNameWithoutFileExt);
        }

        List<FModel> models = new ArrayList<>();

        for (Resource resource : modelPersistenceHandler.getResourceSet().getResources())
        {
            for (EObject eObject : resource.getContents())
            {
                if (eObject instanceof FModel)
                {
                    models.add((FModel) eObject);
                }
            }
        }

        Franca2EATransformation franca2eaTransformation = new Franca2EATransformation(models, eaRepository, new Path(namespacePrefix),
                fileNamesCache);
        franca2eaTransformation.transformModels();
        franca2eaTransformation.transformDataTypes();
        franca2eaTransformation.transformCrossReferences();
        franca2eaTransformation.generateDiagrams();
    }

    public static void executeEARunnable(EARepositoryContainer eaRepository, String namespacePrefix, List<String> eaFidlPackagePaths,
            Runnable runnable) throws Exception
    {
        IPath prefixPath = new Path(namespacePrefix);
        EAPackageContainer eaPrefixPackage = getOrCreateEAPackageContainer(eaRepository, prefixPath);

        List<EAPackageContainer> eaFidlPackages = new ArrayList<>();

        for (String eaFidlPackagePath : eaFidlPackagePaths)
        {
            IPath fidlPath = new Path(eaFidlPackagePath);
            IPath relativePath = fidlPath.makeRelativeTo(prefixPath);

            if (relativePath.segmentCount() == 1)
            {
                EAPackageContainer eaFidlPackage = getOrCreateEAPackageContainer(eaPrefixPackage, relativePath);
                eaFidlPackage.setStereotypes(EAFrancaConstants.STEREOTYPE_ROOT, EAFrancaConstants.STEREOTYPE_FIDL);
                eaFidlPackage.setIsNamespaceRoot(true);
                eaFidlPackages.add(eaFidlPackage);
            }
            else
            {
                EAPackageContainer eaRootPackage = getOrCreateEAPackageContainer(eaPrefixPackage, relativePath.uptoSegment(1));
                eaRootPackage.setStereotypes(EAFrancaConstants.STEREOTYPE_ROOT);
                eaRootPackage.setIsNamespaceRoot(true);

                EAPackageContainer eaFidlPackage = getOrCreateEAPackageContainer(eaRootPackage, relativePath.removeFirstSegments(1));
                eaFidlPackage.setStereotypes(EAFrancaConstants.STEREOTYPE_FIDL);
                eaFidlPackages.add(eaFidlPackage);
            }
        }

        runnable.run(eaFidlPackages);
    }

    public static void transformEA2Franca(EARepositoryContainer eaRepository, List<EAPackageContainer> eaPackageContainers,
            String pluginId, String destinationPath) throws Exception
    {
        IPath rootSavePath = new Path(PathHelper.getFileUriFromBundleRelativePath(pluginId, destinationPath).toString());
        Injector injector = Guice.createInjector(new FrancaIDLRuntimeModule());
        EA2FrancaTransformation ea2FrancaTransformation = injector.getInstance(EA2FrancaTransformation.class);

        FrancaResourceSetContainer resourceSetContainer = new FrancaResourceSetContainer(new SynchronizedXtextResourceSet(), rootSavePath);

        Collection<FModel> models = ea2FrancaTransformation.transformModels(eaPackageContainers);

        // Add all origin file names.
        resourceSetContainer.addOriginFileNames(ea2FrancaTransformation.getOriginFileNames());

        resourceSetContainer.addModels(models);
        resourceSetContainer.save();

        ea2FrancaTransformation.transformDataTypes();
        resourceSetContainer.save();

        ea2FrancaTransformation.transformCrossReferences(resourceSetContainer.getModelSavePaths());
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
    }

    public static void compareModels(String refModelpath, String pluginId, String genModelpath, boolean ignoreFileNameComparison)
            throws Exception
    {
        URI refModelUri = PathHelper.getFileUriFromBundleRelativePath(pluginId, refModelpath);
        URI genModelUri = PathHelper.getFileUriFromBundleRelativePath(pluginId, genModelpath);

        List<URI> refFileUris = PathHelper.toFileUriList(PathHelper.getFilesOfDirectory(new File(refModelUri.toFileString())));
        List<URI> genFileUris = PathHelper.toFileUriList(PathHelper.getFilesOfDirectory(new File(genModelUri.toFileString())));

        if (refFileUris.isEmpty() || genFileUris.isEmpty())
        {
            Assert.fail("Expecting ref-files as well as gen-files.");
        }

        // Comparing the folder structure (detection of missing subfolders).
        compareFolderStructure(refModelUri, refFileUris, genModelUri, genFileUris, ignoreFileNameComparison);

        String[] fileExtensions = new String[] { FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION,
                FrancaUtils.DEPLOYMENT_DEFINITION_FILE_EXTENSION };

        ResourceSet refResourceSet = EMFHelper.loadFilesIntoResourceSet(new SynchronizedXtextResourceSet(), refFileUris, fileExtensions);
        ResourceSet genResourceSet = EMFHelper.loadFilesIntoResourceSet(new SynchronizedXtextResourceSet(), genFileUris, fileExtensions);

        List<Diff> diffs = EMFHelper.compareResourceSets(refResourceSet, genResourceSet);
        EMFHelper.printDifferences(diffs);
    }

    // Assumption: Each file name must be unique!
    //
    // Sample content:
    // refModelUri
    // GIT/ascgit048.yamaica-ea/tests/de.bmw.yamaica.ea.tests/models/franca/ref/tc_203_datatypes_arrays
    // genModelUri
    // GIT/ascgit048.yamaica-ea/tests/de.bmw.yamaica.ea.tests/models/franca/output/tc_203_datatypes_arrays
    //
    // refFileUris
    // [GIT/ascgit048.yamaica-ea/tests/de.bmw.yamaica.ea.tests/models/franca/ref/tc_203_datatypes_arrays/test_cases/test_2_datatypes/Test_Case_203_Arrays.fidl]
    // genFileUris
    // [GIT/ascgit048.yamaica-ea/tests/de.bmw.yamaica.ea.tests/models/franca/output/tc_203_datatypes_arrays/test_cases/Test_Case_203_Arrays.fidl]
    private static void compareFolderStructure(URI refModelUri, List<URI> refFileUris, URI genModelUri, List<URI> genFileUris,
            boolean ignoreFileNameComparison)
    {
        // Folder structure / file name differences will be checked by this method.
        //
        // Without calling this method there is no difference between the 'output' folder (EXPECTING the subfolder 'test_2_datatypes'!):
        // \tc_208_datatypes_enumerations_derived\test_cases\Test_Case_208_Enumerations_Derived.fidl
        // and the 'ref' folder:
        // \tc_208_datatypes_enumerations_derived\test_cases\test_2_datatypes\Test_Case_208_Enumerations_Derived.fidl
        //
        // Nevertheless both files are identically.

        // TODO: Mapping is still buggy! See also test case 105/106.
        Map<String, String> mapping = new HashMap<>();

        for (URI currRefFileUri : refFileUris)
        {
            final String relativeRef = new File(refModelUri.path()).toURI().relativize(new File(currRefFileUri.path()).toURI()).getPath();
            final String refFileName = currRefFileUri.lastSegment();
            String relativeGen = null;

            for (URI currGenFileUri : genFileUris)
            {
                final String genFileName = currGenFileUri.lastSegment();

                if (refFileName.equalsIgnoreCase(genFileName))
                {
                    relativeGen = new File(genModelUri.path()).toURI().relativize(new File(currGenFileUri.path()).toURI()).getPath();
                    break;
                }
            }
            // Adding a nullable relativeGen means, that the corresponding relativeGen file could not be found / matched.
            mapping.put(relativeRef, relativeGen);
        }

        final StringBuilder errorMsg = new StringBuilder();

        // Check each entry afterwards.
        for (Entry<String, String> entrySet : mapping.entrySet())
        {
            // File names will not be checked.
            // Some 'import' test cases will fail in this case (due to import of 'TC_007.fidl' instead of
            // 'tc_007.fidl' will fail).
            if (!entrySet.getKey().equalsIgnoreCase(entrySet.getValue()))
            {
                errorMsg.append(String.format("(%s, %s)", entrySet.getKey(), entrySet.getValue()));
            }
        }

        if (errorMsg.length() > 0 && !ignoreFileNameComparison)
        {
            // TODO: This tests fails in case of two files in different subfolders have the identically name.
            Assert.fail(String.format(
                    "Folder structure may not be congruent (key := relativeRef, value := relativeGen; ignore case enabled): %s", errorMsg));
        }
    }

    public static List<EAPackageContainer> getFidlPackageContainers(List<EAPackageContainer> eaPackageContainers)
    {
        List<EAPackageContainer> fidlPackages = new ArrayList<>();

        for (EAPackageContainer eaPackageContainer : eaPackageContainers)
        {
            if (eaPackageContainer.hasStereotype(EAFrancaConstants.STEREOTYPE_FIDL))
            {
                fidlPackages.add(eaPackageContainer);
            }

            fidlPackages.addAll(getFidlPackageContainers(eaPackageContainer.getPackages()));
        }

        return fidlPackages;
    }

    public static List<EAPackageContainer> getEAPackageContainers(List<EAPackageContainer> eaPackageContainers, List<String> eaPackagePaths)
    {
        List<EAPackageContainer> targetContainers = new ArrayList<>();

        for (String eaPackagePath : eaPackagePaths)
        {
            EAPackageContainer targetContainer = getEAPackageContainer(eaPackageContainers, new Path(eaPackagePath));

            if (null != targetContainer)
            {
                targetContainers.add(targetContainer);
            }
        }

        Assert.assertEquals("Not all required EA packages could be found!", eaPackagePaths.size(), targetContainers.size());

        return targetContainers;
    }

    private static EAPackageContainer getEAPackageContainer(List<EAPackageContainer> eaPackageContainers, IPath eaPackagePath)
    {
        for (EAPackageContainer eaPackageContainer : eaPackageContainers)
        {
            if (eaPackageContainer.getName().equals(eaPackagePath.segment(0)))
            {
                if (eaPackagePath.segmentCount() > 1)
                {
                    return getEAPackageContainer(eaPackageContainer.getPackages(), eaPackagePath.removeFirstSegments(1));
                }
                else
                {
                    return eaPackageContainer;
                }
            }
        }

        return null;
    }

    private static EAPackageContainer getOrCreateEAPackageContainer(EARepositoryContainer eaRepository, IPath eaPackagePath)
    {
        if (eaPackagePath.segmentCount() > 0)
        {
            EAPackageContainer rootEAPackage = eaRepository.getOrCreateModel(eaPackagePath.segment(0));

            if (eaPackagePath.segmentCount() > 1)
            {
                return getOrCreateEAPackageContainer(rootEAPackage, eaPackagePath.removeFirstSegments(1));
            }
            else
            {
                return rootEAPackage;
            }
        }

        return null;
    }

    private static EAPackageContainer getOrCreateEAPackageContainer(EAPackageContainer eaPackage, IPath eaPackagePath)
    {
        if (eaPackagePath.segmentCount() > 0)
        {
            EAPackageContainer childEAPackage = eaPackage.getOrCreatePackage(eaPackagePath.segment(0));

            if (eaPackagePath.segmentCount() > 1)
            {
                return getOrCreateEAPackageContainer(childEAPackage, eaPackagePath.removeFirstSegments(1));
            }
            else
            {
                return childEAPackage;
            }
        }

        return eaPackage;
    }
}
