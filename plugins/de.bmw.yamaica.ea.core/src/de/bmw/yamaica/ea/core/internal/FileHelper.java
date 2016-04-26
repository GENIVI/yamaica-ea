/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.internal;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;

import de.bmw.yamaica.franca.common.core.FrancaUtils;

public class FileHelper
{
    public static URI getFileUri(String filePath) throws URISyntaxException, IOException
    {
        File file = new File(filePath);
        return createFileUri(file);
    }

    public static boolean deleteFolder(File folder)
    {
        if (!folder.exists())
        {
            return true;
        }

        for (File childFile : folder.listFiles())
        {
            if (childFile.isDirectory())
            {
                deleteFolder(childFile);
            }
            else
            {
                childFile.delete();
            }
        }

        return folder.delete();
    }

    public static URI createFileUri(File file)
    {
        return URI.createFileURI(file.getAbsolutePath());
    }

    /**
     * http://www.rgagnon.com/javadetails/java-check-if-a-filename-is-valid.html
     */
    public static boolean isFilenameValid(String file)
    {
        File f = new File(file);
        try
        {
            f.getCanonicalPath();
            return true;
        }
        catch (IOException e)
        {
            return false;
        }
    }

    public static List<File> listInPath(String path) throws Exception
    {
        List<File> targetList = new ArrayList<>();

        File rootDir = new File(path);

        File[] content = rootDir.listFiles();
        if (content == null)
        {
            throw new IllegalArgumentException("Path " + path + " does not exist");
        }
        for (File fileInDir : content)
        {
            if (fileInDir.isDirectory())
            {
                targetList.addAll(listInPath(fileInDir.getPath()));
            }
            else
            {
                Path filePath = new Path(fileInDir.getAbsolutePath());
                if (filePath.getFileExtension().equals(FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION)) // ".fidl"
                {
                    targetList.add(fileInDir);
                }
            }
        }
        return targetList;
    }

    /**
     * Retrieves all the the filenames from a given list of franca models to
     * load, separated by ','
     */
    public static List<File> getFilesFromList(String filesList)
    {
        List<File> fileNames = new ArrayList<>();
        String[] francaModels = filesList.split(",");
        List<String> fileModelsList = Arrays.asList(francaModels);
        for (String fname : fileModelsList)
        {
            if (fname.toLowerCase().endsWith(FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION))
            {
                File francaFile = new File(fname.trim());
                if (francaFile.exists())
                {
                    fileNames.add(francaFile);
                }
            }
        }
        return fileNames;
    }
}
