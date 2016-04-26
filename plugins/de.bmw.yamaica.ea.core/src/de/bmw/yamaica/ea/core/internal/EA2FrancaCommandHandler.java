/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.cli.CommandLine;

import de.bmw.yamaica.common.console.AbstractCommandLineHandler;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class EA2FrancaCommandHandler extends AbstractCommandLineHandler
{
    private final static String CLI_EA_PROJECT_PATH = "e";
    private final static String CLI_EA_IMPORT_PATH  = "eip";
    private final static String CLI_EA_DEST_PATH    = "edp";
    private final static String CLI_EA_NODE_PATH    = "enp";
    private String              eaProject           = null;
    private String              rootPackage         = null;
    private String              francaPath          = null;
    private String              nodePath            = null;
    private static Logger       jlog                = Logger.getLogger(EA2FrancaCommandHandler.class.getName());

    public EA2FrancaCommandHandler()
    {
    }

    /*
     * Expected command line syntax: -eap <arg> [-nodepath <arg> | -rp <arg>] -output <arg>
     * See plugin.xml for command definition
     */
    private void setOptionValues(CommandLine line)
    {
        if (line.hasOption(CLI_EA_PROJECT_PATH))
        {
            eaProject = line.getOptionValue(CLI_EA_PROJECT_PATH);
        }
        if (line.hasOption(CLI_EA_IMPORT_PATH))
        {
            rootPackage = line.getOptionValue(CLI_EA_IMPORT_PATH);
        }
        if (line.hasOption(CLI_EA_DEST_PATH))
        {
            francaPath = line.getOptionValue(CLI_EA_DEST_PATH);
            if (!FileHelper.isFilenameValid(francaPath))
            {
                jlog.log(Level.INFO, String.format("Specified %s [%s] is not valid", CLI_EA_DEST_PATH, francaPath));
                francaPath = null;
            }

        }
        if (line.hasOption(CLI_EA_NODE_PATH))
        {
            nodePath = line.getOptionValue(CLI_EA_NODE_PATH);
        }
    }

    public OperationStatus doImport()
    {
        OperationStatus opStatus = new OperationStatus(true);
        // Read the runtime configuration parameter
        if (eaProject != null && francaPath != null)
        {
            opStatus = runEA2FrancaTransformation();
        }
        else
        {
            opStatus.setStatus(false);
            opStatus.setMessage("Please specify import parameter");
            opStatus.setExitResult(-2);
        }

        return opStatus;
    }

    private OperationStatus runEA2FrancaTransformation()
    {
        OperationStatus opStatus = new OperationStatus(true);
        EAProjectLoader eaProjectLoader = null;
        try
        {
            jlog.log(Level.INFO, "EA project file : " + eaProject);

            eaProjectLoader = FrancaHandlerTransformationAdapter.createEAProjectLoader(eaProject);
            EARepositoryContainer eaRepository = eaProjectLoader.getRepository();

            if (rootPackage != null)
            {
                FrancaHandlerTransformationAdapter.startEA2FrancaSimpleTransformation(rootPackage, francaPath, eaRepository);
            }
            else
            {
                FrancaHandlerTransformationAdapter.startEA2FrancaMainTransformation(nodePath, francaPath, eaRepository);
            }
            opStatus.setMessage("Import is finished");
            opStatus.setExitResult(0);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            opStatus = OperationStatus.CreateFromException("Import processing failed", ex);
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
