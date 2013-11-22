/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;

import de.bmw.yamaica.franca.base.core.FrancaUtils;

public class PathHelper
{

    private static String       fidlExtension          = FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION;
    private static String       fdeplExtension         = FrancaUtils.DEPLOYMENT_DEFINITION_FILE_EXTENSION;
    private static String       platformPath           = "platform:/plugin/de.bmw.yamaica.ea.tests/";
    private static String       fibexModelInputFolder  = "models/fibex/input/";
    private static String       francaModelInputFolder = "models/franca/input";
    private static String       fibexGenFolder         = "models/fibex/gen";
    private static String       francaGenFolder        = "models/franca/gen";
    private static String       fibexBundle            = "de.bmw.yamaica.fibex.tests";

    private static final String FRANCAFILETYPE         = "franca";
    private static final String FIBEXFILETPYE          = "fibex";

    public static String getPlatformPath()
    {
        return platformPath;
    }

    public static String getFibexInputPath(String fibexInputFile)
    {
        String path = platformPath + fibexModelInputFolder + fibexInputFile;
        return path;
    }

    public static String getFrancaInputPath(String francaInputFile)
    {
        String path = platformPath + francaModelInputFolder + francaInputFile;
        return path;
    }

    public static IPath getSavePathFromFilename(String fileName, String fileType) throws URISyntaxException, IOException
    {
        /* remove file extension */
        String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf('.'));
        Bundle bundle = Platform.getBundle(fibexBundle);
        URL url = null;
        if (fileType.equals(FIBEXFILETPYE))
        {
            url = FileLocator.find(bundle, new Path(fibexGenFolder), null);
        }
        else if (fileType.equals(FRANCAFILETYPE))
        {
            url = FileLocator.find(bundle, new Path(francaGenFolder), null);
        }
        IPath savePath = new Path(FileLocator.resolve(url).toURI().toString()).append(fileNameWithoutExtension);
        return savePath;
    }

    public static List<String> listOfFilesInPath(String path) throws NoOutputCreatedException
    {
        List<String> targetList = new ArrayList<String>();
        File rootDir = new File(path);
        File[] content = rootDir.listFiles();
        if (content == null)
        {
            throw new NoOutputCreatedException();
        }
        for (File fileInDir : content)
        {
            if (fileInDir.isDirectory())
            {
                targetList.addAll(listOfFilesInPath(fileInDir.getPath()));
            }
            else
            {
                Path filePath = new Path(fileInDir.getPath());
                if (filePath.getFileExtension().equals(fidlExtension) || filePath.getFileExtension().equals(fdeplExtension))
                {
                    System.out.println(filePath.toString());
                    targetList.add(filePath.toString());
                }
            }
        }
        return targetList;
    }

}
