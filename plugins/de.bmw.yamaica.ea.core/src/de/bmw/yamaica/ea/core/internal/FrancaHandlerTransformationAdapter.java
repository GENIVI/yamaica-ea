/* Copyright (C) 2013-2016 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.franca.core.dsl.FrancaImportsProvider;
import org.franca.core.franca.FModel;
import org.franca.core.utils.ModelPersistenceHandler;

import com.google.inject.Injector;

import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAContainerWithElements;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.EA2FrancaTransformation;
import de.bmw.yamaica.ea.core.franca.EAContainerExtensions;
import de.bmw.yamaica.ea.core.franca.Franca2EATransformation;
import de.bmw.yamaica.franca.common.core.FrancaInjector;
import de.bmw.yamaica.franca.common.core.FrancaResourceSetContainer;
import de.bmw.yamaica.franca.common.core.FrancaUtils;
import de.bmw.yamaica.franca.common.core.ValidationUtils;
import de.bmw.yamaica.franca.common.core.ValidationUtils.IIssueLogger;

public class FrancaHandlerTransformationAdapter
{
    private static final Logger LOGGER = Logger.getLogger(FrancaHandlerTransformationAdapter.class.getName());

    public static EAProjectLoader createEAProjectLoader(String eaInputFile, String username, String password) throws Exception
    {
        return createEAProjectLoader(eaInputFile, false, username, password);
    }

    public static EAProjectLoader createEAProjectLoader(String eaInputFile, boolean createFile, String username, String password)
            throws Exception
    {
        File eaFile = new File(eaInputFile);
        EAProjectLoader eaProjectLoader = new EAProjectLoader(eaFile, createFile, username, password);
        eaProjectLoader.run(new NullProgressMonitor());

        return eaProjectLoader;
    }

    public static void startEA2FrancaSimpleTransformation(String rootPackage, String francaPath, EARepositoryContainer eaRepository)
            throws Exception
    {
        // list of EA Packages to load, separated by ','
        String eaPackagePathsString = rootPackage;
        // One EA Package to load:
        String[] eaPackagePaths = eaPackagePathsString.trim().split(",");

        for (int i = 0; i < eaPackagePaths.length; i++)
        {
            String p = eaPackagePaths[i];
            LOGGER.log(Level.INFO, "EA Package for import : " + p);
        }
        if (eaPackagePaths.length > 0)
        {
            transformEAPackages(eaRepository, eaPackagePaths, francaPath);
        }
        else
        {
            LOGGER.log(Level.INFO, "Specified <<fidl>> packages for import could not be found");
        }
    }

    public static void startEA2FrancaMainTransformation(String nodePath, String francaPath, EARepositoryContainer eaRepository)
            throws Exception
    {
        Map<String, EAPackageContainer> catalogMap = parseCatalogMaster(eaRepository, nodePath);

        if (!catalogMap.isEmpty())
        {
            LOGGER.log(Level.INFO, "EA Package for import : " + catalogMap.keySet());

            transformEAPackages(eaRepository, new ArrayList<>(catalogMap.values()), francaPath);
        }
        else
        {
            LOGGER.log(Level.INFO, "<<fidl>> packages for import could not be found");
        }
    }

    private static Map<String, EAPackageContainer> parseCatalogMaster(EARepositoryContainer eaRepository, String nodePath)
    {
        Map<String, EAPackageContainer> result = new HashMap<>();
        boolean searchStatus = true;

        List<EAContainerWithElements> allElements = new ArrayList<>();
        EAContainerWithElements masterCatalog = null;

        if (nodePath == null)
        {
            masterCatalog = EAExplorer.findOneStereotype(eaRepository.getModels(), EAExplorer.STEREOTYPE_CATALOG_MASTER);
        }
        else
        {
            EAPackageContainer catalogPackage = EAExplorer.getEAPackageContainer(eaRepository.getModels(), nodePath);
            if (catalogPackage != null)
            {
                LOGGER.log(Level.INFO, String.format("EA Package [%s] for Catalog Master has been found", catalogPackage.getName()));

                masterCatalog = EAExplorer.findOneStereotype(catalogPackage, EAExplorer.STEREOTYPE_CATALOG_MASTER);
            }
            else
            {
                LOGGER.log(Level.INFO, "Package for Catalog Master could not be found");
                searchStatus = false;
            }
        }
        if (masterCatalog != null)
        {
            LOGGER.log(Level.INFO, "Catalog Master has been found");
            LOGGER.log(Level.FINEST, String.format("Catalog Master details. Name: '%s', Namespace: '%s', Author: '%s', Notes: '%s'",
                    masterCatalog.getName(), masterCatalog.getNamespace(), masterCatalog.getAuthor(), masterCatalog.getNotes()));
        }
        else
        {

            LOGGER.log(Level.INFO, "Catalog Master could not be found");
            searchStatus = false;
        }

        if (searchStatus && masterCatalog != null)
        {
            searchStatus = searchMasterCatalogMembers(allElements, masterCatalog);
            if (searchStatus && !allElements.isEmpty())
            {
                for (EAContainerWithElements e : allElements)
                {
                    EAPackageContainer fildPackage = EAContainerExtensions.getFidlPackage(e);
                    if (fildPackage != null)
                    {
                        String namespaceFidlPackage = fildPackage.getNamespace();

                        if (!result.containsKey(namespaceFidlPackage))
                        {
                            result.put(namespaceFidlPackage, fildPackage);
                        }
                    }
                    else
                    {
                        LOGGER.log(
                                Level.INFO,
                                String.format("Skipped '%s' (namespace: '%s'): Unable to get its fidl package.", e.getName(),
                                        e.getNamespace()));
                    }
                }
                for (Map.Entry<String, EAPackageContainer> entry : result.entrySet())
                {
                    LOGGER.log(Level.INFO, String.format("Package for import -> <<fidl>> %s with EA path [%s]", entry.getValue().getName(),
                            entry.getKey()));
                }
            }
            else
            {
                LOGGER.log(Level.INFO, "Elements for import could not be defined");
                searchStatus = false;
            }
        }
        return result;
    }

    private static boolean searchMasterCatalogMembers(List<EAContainerWithElements> allElements, EAContainerWithElements masterCatalog)
    {
        boolean searchStatus = true;

        List<EAElementContainer> list = EAExplorer.getImportedCatalogSection(masterCatalog);

        if (!list.isEmpty())
        {
            List<EAElementContainer> listMembers = EAExplorer.getImportedMember(list);
            listMembers.addAll(EAExplorer.getImportPackages(list));

            for (EAElementContainer member : listMembers)
            {
                if (member.getType().equals(EAElementContainer.Type.OBJECT))
                {
                    EAElementContainer classifier = EAExplorer.getElementClassifier(member);
                    if (classifier != null)
                    {
                        LOGGER.log(Level.INFO,
                                String.format("Found object element -> %s as classifier of %s ", classifier.getName(), member.getName()));
                        allElements.add(classifier);
                    }
                }
                else if (member.getType().equals(EAElementContainer.Type.INTERFACE))
                {
                    LOGGER.log(Level.INFO, String.format("Found interface element -> %s", member.getName()));
                    allElements.add(member);
                }
                else if (member.getType().equals(EAElementContainer.Type.PACKAGE))
                {
                    // Similar to EAPackageContainerImpl's getPackageOfPackageElement method.
                    EAPackageContainer packageOfPackageElement = member.getPackage();

                    for (final EAPackageContainer p : packageOfPackageElement.getPackages())
                    {
                        if (member.equals(p.getElement()))
                        {
                            LOGGER.log(Level.INFO, String.format("Found package element -> %s", member.getName()));
                            allElements.add(p);
                        }
                    }
                }
            }
        }
        else
        {
            LOGGER.log(Level.INFO, "Cannot find Catalog sections");
            searchStatus = false;
        }

        return searchStatus;
    }

    private static ResourceSet transformEAPackages(EARepositoryContainer eaRepository, String[] eaPackagePaths, String destinationPath)
            throws Exception
    {
        List<EAPackageContainer> packages = EAExplorer.getEAPackageContainers(eaRepository.getModels(), eaPackagePaths);
        return transformEAPackages(eaRepository, packages, destinationPath);
    }

    // Parameter eaRepository not used!
    private static ResourceSet transformEAPackages(EARepositoryContainer eaRepository, List<EAPackageContainer> packages,
            String destinationPath) throws Exception
    {
        FileHelper.deleteFolder(new File(destinationPath));

        IPath rootSavePath = new Path(FileHelper.getFileUri(destinationPath).toString());

        LOGGER.log(Level.INFO, "Into folder for Franca : " + rootSavePath.toString());

        Injector injector = FrancaInjector.INSTANCE;
        EA2FrancaTransformation ea2FrancaTransformation = injector.getInstance(EA2FrancaTransformation.class);

        ResourceSet resourceSet = injector.getInstance(ResourceSet.class);

        FrancaResourceSetContainer resourceSetContainer = new FrancaResourceSetContainer(resourceSet, rootSavePath);

        Collection<FModel> models = ea2FrancaTransformation.transformModels(packages);

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

            LOGGER.log(Level.INFO, logMessage);
        }

        return resourceSetContainer.getResourceSet();

    }

    public static void transformFranca2EA(EARepositoryContainer eaRepository, String namespacePrefix, List<File> francaFidlFiles)
            throws Exception
    {
        transformFranca2EA(eaRepository, namespacePrefix, francaFidlFiles, true);
    }

    public static void transformFranca2EA(EARepositoryContainer eaRepository, String namespacePrefix, List<File> francaFidlFiles,
            boolean validateInput) throws Exception
    {
        LOGGER.log(Level.FINEST, "Starting Franca to EA transformations..");

        ModelPersistenceHandler.registerFileExtensionHandler(FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION, new FrancaImportsProvider());
        ModelPersistenceHandler modelPersistenceHandler = new ModelPersistenceHandler(
                FrancaInjector.INSTANCE.getInstance(ResourceSet.class));

        for (File francaFidlFile : francaFidlFiles)
        {

            URI fidlFileUri = URI.createFileURI(francaFidlFile.toString());
            URI fidlRootUri = URI.createFileURI(francaFidlFile.getParent().toString());
            LOGGER.log(Level.INFO, "Franca file to load : " + francaFidlFile.getAbsolutePath());
            modelPersistenceHandler.loadModel(fidlFileUri, fidlRootUri);
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

        if (validateInput)
        {
            if (!validate(modelPersistenceHandler.getResourceSet()))
                throw new ValidationException("Failed to validate Franca model.");
        }

        Franca2EATransformation franca2eaTransformation = new Franca2EATransformation(models, eaRepository, new Path(namespacePrefix));
        franca2eaTransformation.transformModels();
        franca2eaTransformation.transformDataTypes();
        franca2eaTransformation.transformCrossReferences();
        franca2eaTransformation.generateDiagrams();
    }

    protected static boolean validate(ResourceSet resourceSet)
    {
        return ValidationUtils.validate(resourceSet, new IIssueLogger()
        {
            @Override
            public void info(String msg)
            {
                LOGGER.log(Level.INFO, msg);
            }

            @Override
            public void warning(String msg)
            {
                LOGGER.log(Level.WARNING, msg);
            }

            @Override
            public void error(String msg)
            {
                LOGGER.log(Level.SEVERE, msg);
            }
        });
    }
}
