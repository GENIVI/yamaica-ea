/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.franca;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.resource.SynchronizedXtextResourceSet;
import org.franca.core.dsl.FrancaIDLRuntimeModule;
import org.franca.core.franca.FModel;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.bmw.yamaica.ea.core.EAInstance;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.exceptions.EAException;
import de.bmw.yamaica.ea.core.franca.EA2FrancaTransformation;
import de.bmw.yamaica.ea.core.franca.exceptions.EA2FrancaTransformationException;
import de.bmw.yamaica.ea.ui.internal.Activator;
import de.bmw.yamaica.franca.common.core.FrancaResourceSetContainer;

public class EA2FrancaImportOperation extends WorkspaceModifyOperation
{
    protected IPath                    containerPath           = null;
    protected EAInstance               eaInstance              = null;
    protected List<EAPackageContainer> packages                = null;
    protected Injector                 injector                = null;
    protected EA2FrancaTransformation  ea2FrancaTransformation = null;

    public EA2FrancaImportOperation(IPath containerPath, EAInstance eaInstance, List<EAPackageContainer> packages)
    {
        Assert.isNotNull(containerPath);
        Assert.isNotNull(eaInstance);
        Assert.isNotNull(packages);

        this.containerPath = containerPath;
        this.eaInstance = eaInstance;
        this.packages = packages;
        this.injector = Guice.createInjector(new FrancaIDLRuntimeModule());
        this.ea2FrancaTransformation = injector.getInstance(EA2FrancaTransformation.class);
    }

    @Override
    protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
    {
        FrancaResourceSetContainer resourceSetContainer = new FrancaResourceSetContainer(new SynchronizedXtextResourceSet(), containerPath);

        monitor.beginTask("", 7);
        monitor.setTaskName("Transforming EA project to Franca IDL");

        try
        {
            monitor.subTask("Analysing package dependencies");

            Collection<FModel> models = ea2FrancaTransformation.transformModels(packages);

            resourceSetContainer.addModels(models);

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming imports");

            ea2FrancaTransformation.transformImports((resourceSetContainer).getModelSavePaths());

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming types");

            ea2FrancaTransformation.transformTypes();

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming type cross references");

            ea2FrancaTransformation.transformTypeCrossReferences();

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming interfaces");

            ea2FrancaTransformation.transformInterfaces();

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming interface contents");

            ea2FrancaTransformation.transformInterfaceContents();

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);
            monitor.subTask("Transforming interface cross references");

            ea2FrancaTransformation.transformInterfaceCrossReferences();

            checkCancelState(monitor);
            resourceSetContainer.save();
            checkCancelState(monitor);

            monitor.worked(1);

            Collection<String> logMessages = ea2FrancaTransformation.getLogMessages();

            if (logMessages.size() > 0)
            {
                Iterator<String> logMessagesIterator = logMessages.iterator();
                String logMessage = logMessages.size() + " warning(s) emerged while transforming EA project to Franca code!";

                for (int i = 0; logMessagesIterator.hasNext(); i++)
                {
                    logMessage += String.format("%n%d: %s", i + 1, logMessagesIterator.next());
                }

                IStatus status = new Status(IStatus.WARNING, Activator.PLUGIN_ID, logMessage);
                Platform.getLog(Activator.getDefault().getBundle()).log(status);
            }
        }
        catch (InterruptedException e)
        {
            throw e;
        }
        catch (EAException e)
        {
            // Enterprise Architect Exceptions
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
            Platform.getLog(Activator.getDefault().getBundle()).log(status);

            throw new InvocationTargetException(e);
        }
        catch (EA2FrancaTransformationException e)
        {
            // Transformation Exceptions
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
            Platform.getLog(Activator.getDefault().getBundle()).log(status);

            throw new InvocationTargetException(e);
        }
        catch (Exception e)
        {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
            Platform.getLog(Activator.getDefault().getBundle()).log(status);

            throw new InvocationTargetException(e);
        }
        finally
        {
            monitor.done();
        }
    }

    protected void checkCancelState(IProgressMonitor monitor) throws InterruptedException
    {
        if (monitor.isCanceled())
        {
            throw new InterruptedException("EA Import was canceled!");
        }
    }
}
