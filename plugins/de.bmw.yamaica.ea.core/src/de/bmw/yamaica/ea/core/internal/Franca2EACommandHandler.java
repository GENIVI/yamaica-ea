/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;

import de.bmw.yamaica.common.console.AbstractCommandLineHandler;
import de.bmw.yamaica.common.console.ICommandLineHandler;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class Franca2EACommandHandler extends AbstractCommandLineHandler implements ICommandLineHandler
{
    private final static String CLI_EA_PROJECT_PATH = "e";
    private final static String CLI_EA_FRANCA_PATH  = "erp";
    private final static String CLI_EA_ROOT_PACKAGE = "efp";
    private final static String CLI_FRANCA_FILES    = "efm";
    private final static String CLI_NO_VALIDATE     = "nv";
    private String              eaProject           = null;
    private String              rootPackage         = null;
    private String              francaPath          = null;
    private String              francaModels        = null;
    private boolean             validateInput       = true;
    private static Logger       jlog                = Logger.getLogger(Franca2EACommandHandler.class.getName());

    public Franca2EACommandHandler()
    {
    }

    private void setOptionValues(CommandLine line)
    {
        if (line.hasOption(CLI_EA_PROJECT_PATH))
        {
            eaProject = line.getOptionValue(CLI_EA_PROJECT_PATH);
        }
        if (line.hasOption(CLI_EA_FRANCA_PATH))
        {
            rootPackage = line.getOptionValue(CLI_EA_FRANCA_PATH);
        }
        if (line.hasOption(CLI_EA_ROOT_PACKAGE))
        {
            francaPath = line.getOptionValue(CLI_EA_ROOT_PACKAGE);
            if (!FileHelper.isFilenameValid(francaPath))
            {
                jlog.log(Level.INFO, String.format("Specified %s [%s] is not valid", CLI_EA_ROOT_PACKAGE, francaPath));
                francaPath = null;
            }
        }

        if (line.hasOption(CLI_FRANCA_FILES))
        {
            francaModels = line.getOptionValue(CLI_FRANCA_FILES);
        }

        if (line.hasOption(CLI_NO_VALIDATE))
        {
            validateInput = false;
        }
    }

    public OperationStatus doImport()
    {
        OperationStatus opStatus = new OperationStatus(true);
        // Read the runtime configuration parameter
        if (eaProject != null && rootPackage != null && (francaPath != null || francaModels != null))
        {
            opStatus = runFranca2EATransformation();
        }
        else
        {
            opStatus.setStatus(false);
            opStatus.setMessage("Please specify import parameter");
            opStatus.setExitResult(-2);
        }

        return opStatus;
    }

    private OperationStatus runFranca2EATransformation()
    {
        OperationStatus opStatus = new OperationStatus(true);
        EAProjectLoader eaProjectLoader = null;
        try
        {
            jlog.log(Level.INFO, "EA project file : " + eaProject);

            eaProjectLoader = FrancaHandlerTransformationAdapter.createEAProjectLoader(eaProject, true);
            EARepositoryContainer eaRepository = eaProjectLoader.getRepository();

            List<File> francaFidlFiles = new ArrayList<File>();
            if (francaPath != null)
            {
                francaFidlFiles = FileHelper.listInPath(francaPath);
            }
            else if (francaModels != null)
            {
                francaFidlFiles = FileHelper.getFilesFromList(francaModels);
            }

            if (francaFidlFiles.size() > 0)
            {
                FrancaHandlerTransformationAdapter.transformFranca2EA(eaRepository, rootPackage, francaFidlFiles, validateInput);
            }
            else
            {
                jlog.log(Level.INFO, "Files for export could not be found");
            }

            opStatus.setMessage("Export is finished");
            opStatus.setExitResult(0);
        }
        catch (ValidationException ex)
        {
            opStatus = OperationStatus.CreateFromException("Export processing failed", ex);
            opStatus.setExitResult(-2);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            opStatus = OperationStatus.CreateFromException("Export processing failed", ex);
            opStatus.setExitResult(-1);
        }
        finally
        {
            if (null != eaProjectLoader)
            {
                eaProjectLoader.dispose();
                eaProjectLoader = null;
            }
        }
        return opStatus;
    }

    @Override
    public int excute(CommandLine parsedArguments)
    {
        setOptionValues(parsedArguments);
        OperationStatus result = doImport();
        if (result.getMessage() != null && !result.getMessage().equals(""))
        {
            if (result.getStatus())
            {
                jlog.log(Level.INFO, result.getMessage());
            }
            else
            {
                jlog.log(Level.SEVERE, result.getMessage());
            }
        }
        return result.getExitResult();
    }
}
