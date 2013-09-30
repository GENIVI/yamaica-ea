/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.jface.operation.IRunnableWithProgress;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.EAInstance.State;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class EAProjectLoader implements Runnable, IRunnableWithProgress
{
    protected final File eaProject;
    protected boolean    isDisposed             = false;
    protected boolean    executionStarted       = false;
    protected EAInstance eaInstance             = null;
    protected boolean    fileOpenedSuccessfully = false;

    public EAProjectLoader(File eaProject)
    {
        Assert.isNotNull(eaProject);

        this.eaProject = eaProject;
    }

    public File getFile()
    {
        return eaProject;
    }

    public EARepositoryContainer getRepository()
    {
        return (null != eaInstance && !isDisposed) ? eaInstance.getRepository() : null;
    }

    @Override
    public void run()
    {
        if (null != eaInstance)
        {
            fileOpenedSuccessfully = eaInstance.getRepository().openFile(eaProject.getAbsolutePath());
        }
    }

    @Override
    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
    {
        if (isDisposed)
        {
            throw new InvocationTargetException(new Exception("EAProjectLoader instance is disposed."));
        }

        if (executionStarted)
        {
            throw new InvocationTargetException(new Exception("EAProjectLoader instance may run only once."));
        }

        executionStarted = true;

        try
        {
            monitor.beginTask("Opening EA project...", IProgressMonitor.UNKNOWN);
            monitor.subTask("Initializing Enterprise Architect");

            eaInstance = new EAInstance();

            State state = eaInstance.getState();
            long startTime = System.currentTimeMillis();

            while (!monitor.isCanceled() && (state == State.NEW || state == State.STARTING || System.currentTimeMillis() < startTime + 500))
            {
                Thread.sleep(100);

                state = eaInstance.getState();
            }

            if (monitor.isCanceled())
            {
                dispose();

                throw new InterruptedException("Opening Enterprise Architect project file was canceled.");
            }
            else if (state != State.STARTED)
            {
                dispose();

                throw new OperationCanceledException("Enterprise Architect initialization error.");
            }

            monitor.subTask("Loading project file");

            Thread loadingThread = new Thread(this, "EA project loading thread");
            loadingThread.start();

            while (!monitor.isCanceled() && loadingThread.isAlive())
            {
                Thread.sleep(100);
            }

            if (monitor.isCanceled())
            {
                dispose();

                throw new InterruptedException("Opening Enterprise Architect project file was canceled.");
            }
            else if (false == fileOpenedSuccessfully)
            {
                dispose();

                throw new IllegalArgumentException("The specified EA project file is not valid.");
            }
        }
        finally
        {
            monitor.done();
        }
    }

    public void dispose()
    {
        isDisposed = true;

        if (null != eaInstance)
        {
            if (eaInstance.getState() == State.STARTED && true == fileOpenedSuccessfully)
            {
                eaInstance.getRepository().closeFile();
            }

            eaInstance.close();
            eaInstance = null;
        }
    }
}
