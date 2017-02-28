/* Copyright (C) 2013-2016 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.TrayDialog;
import org.eclipse.jface.operation.ModalContext;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.PlatformUI;

import de.bmw.yamaica.common.ui.utils.ViewerToolBar;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;

public class EAElementSelectionDialog extends TrayDialog implements Runnable, ModifyListener, ISelectionChangedListener,
        IDoubleClickListener
{
    private static final String EA_ELEMENT_SELECTION       = "EA Element Selection";
    private static final String RESOURCE_SELECTION_MESSAGE = "Enter or select the EA element:";
    private static final String LOADING_ERROR_TITLE        = "Error while opening file";
    private static final String LOADING_ERROR_MESSAGE      = "The specified EA project file is not valid.";
    private static final String HELP_SYSTEM_CONTEXT_ID     = "de.bmw.yamaica.ea.ui.ea_element_selection_dialog_context";

    private final File          eaFile;
    private final IPath         initialSelection;
    private final boolean       allowNotExistingPath;

    private Label               label;
    private Text                eaPathText;
    private TreeViewer          treeViewer;
    private ProgressMonitorPart progressMonitorPart;

    private State               state;
    private EAProjectLoader     eaProjectLoader;
    private IPath               eaPath;

    /**
     * See also GLIPCI-968: Using default username null.
     */
    private final String        username                   = null;
    /**
     * See also GLIPCI-968: Using default pasword null.
     */
    private final String        password                   = null;

    public EAElementSelectionDialog(Shell parentShell, File eaFile, IPath initialSelection, boolean allowNotExistingPath)
    {
        super(parentShell);

        this.state = State.OPENING;
        this.eaFile = eaFile;
        this.initialSelection = initialSelection;
        this.allowNotExistingPath = allowNotExistingPath;

        setShellStyle(getShellStyle() | SWT.SHEET | SWT.RESIZE);
    }

    @Override
    protected void configureShell(Shell shell)
    {
        super.configureShell(shell);

        PlatformUI.getWorkbench().getHelpSystem().setHelp(shell, HELP_SYSTEM_CONTEXT_ID);
    }

    @Override
    protected Control createDialogArea(Composite parent)
    {
        getShell().setText(EA_ELEMENT_SELECTION);

        Composite area = (Composite) super.createDialogArea(parent);

        label = new Label(area, SWT.WRAP);
        label.setText(RESOURCE_SELECTION_MESSAGE);

        eaPathText = new Text(area, SWT.SINGLE | SWT.BORDER);
        GridData textGridData = new GridData(GridData.FILL_HORIZONTAL);
        textGridData.widthHint = 320;
        eaPathText.setLayoutData(textGridData);
        eaPathText.addModifyListener(this);

        EAContentProvider contentProvider = new EAContentProvider();
        EALabelProvider labelProvider = new EALabelProvider();
        EAComparer comparer = new EAComparer();

        GridData gridData = new GridData(SWT.FILL, SWT.FILL, true, true);
        gridData.widthHint = 320;
        gridData.heightHint = 300;

        ViewerToolBar viewerToolBar = new ViewerToolBar(area, SWT.BORDER, ViewerToolBar.DRILL_DOWN | ViewerToolBar.REFRESH);
        viewerToolBar.setLayoutData(gridData);

        treeViewer = new TreeViewer(viewerToolBar, SWT.NONE);
        treeViewer.setContentProvider(contentProvider);
        treeViewer.setLabelProvider(labelProvider);
        treeViewer.setComparator(comparer);
        treeViewer.setUseHashlookup(true);
        treeViewer.addSelectionChangedListener(this);
        treeViewer.addDoubleClickListener(this);

        viewerToolBar.setViewer(treeViewer);

        progressMonitorPart = new ProgressMonitorPart(parent, new GridLayout(), true);
        progressMonitorPart.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        progressMonitorPart.attachToCancelComponent(getButton(IDialogConstants.CANCEL_ID));

        Label separator = new Label(parent, SWT.HORIZONTAL | SWT.SEPARATOR);
        separator.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

        setWidgetEnablements(false);

        applyDialogFont(progressMonitorPart);

        getShell().getDisplay().asyncExec(this);

        return dialogArea;
    }

    @Override
    protected void createButtonsForButtonBar(Composite parent)
    {
        super.createButtonsForButtonBar(parent);

        // Disable OK button after it has been created.
        setButtonEnablement(IDialogConstants.OK_ID, false);
    }

    public IPath getSelection()
    {
        return eaPath;
    }

    @Override
    public boolean close()
    {
        if (state == State.SELECTING)
        {
            boolean closed = super.close();

            if (closed)
            {
                state = State.CLOSING;
                disposeEAProjectLoader();
            }

            return closed;
        }
        else
        {
            // Just cancel loading if it hasn't finish yet (state is not "selecting").
            // The EAProjectLoader will then throw an interrupted exception which
            // will lead to calling this method again (state is "selecting").
            progressMonitorPart.setCanceled(true);

            return false;
        }
    }

    @Override
    public void run()
    {
        try
        {
            state = State.LOADING;

            if (null == eaFile || !eaFile.isFile())
            {
                MessageDialog.openError(getShell(), LOADING_ERROR_TITLE, LOADING_ERROR_MESSAGE);

                cancelAndClose();

                return;
            }

            eaProjectLoader = new EAProjectLoader(eaFile, username, password);

            ModalContext.run(eaProjectLoader, true, progressMonitorPart, getShell().getDisplay());

            if (null != eaProjectLoader && treeViewer.getTree().isDisposed() == false)
            {
                treeViewer.setInput(eaProjectLoader.getRepository());
            }

            setWidgetEnablements(true);
            setPath(initialSelection);
            updateTreeSelection();
        }
        catch (InvocationTargetException e)
        {
            disposeEAProjectLoader();

            MessageDialog.openError(getShell(), LOADING_ERROR_TITLE, e.getTargetException().getMessage());

            cancelAndClose();
        }
        catch (InterruptedException e)
        {
            disposeEAProjectLoader();

            cancelAndClose();
        }
        finally
        {
            state = State.SELECTING;
        }
    }

    @Override
    public void modifyText(ModifyEvent e)
    {
        if (e.widget == eaPathText)
        {
            treeViewer.removeSelectionChangedListener(this);
            setPath(new Path(eaPathText.getText()));
            updateTreeSelection();
            treeViewer.addSelectionChangedListener(this);
        }
    }

    @Override
    public void selectionChanged(SelectionChangedEvent event)
    {
        IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        EAContainerWithNamespace selectedElement = (EAContainerWithNamespace) selection.getFirstElement();

        if (null != selectedElement)
        {
            eaPathText.removeModifyListener(EAElementSelectionDialog.this);
            setPath(selectedElement.getNamespaceAsPath());
            setButtonEnablement(IDialogConstants.OK_ID, true);
            eaPathText.addModifyListener(EAElementSelectionDialog.this);
        }
        else
        {
            setButtonEnablement(IDialogConstants.OK_ID, false);
        }
    }

    @Override
    public void doubleClick(DoubleClickEvent event)
    {
        ISelection selection = event.getSelection();

        if (selection instanceof IStructuredSelection)
        {
            Object item = ((IStructuredSelection) selection).getFirstElement();

            if (item == null)
            {
                return;
            }

            if (treeViewer.getExpandedState(item))
            {
                treeViewer.collapseToLevel(item, 1);
            }
            else
            {
                treeViewer.expandToLevel(item, 1);
            }
        }
    }

    private void setPath(IPath path)
    {
        eaPath = path;

        String pathAsString = path.toString();

        if (null != eaPathText && eaPathText.isDisposed() == false && eaPathText.getText().equals(pathAsString) == false)
        {
            eaPathText.setText(path.toString());
        }
    }

    private void updateTreeSelection()
    {
        if (null != eaProjectLoader)
        {
            EAContainerWithNamespace eaElement = findEAContainer(eaProjectLoader.getRepository(), eaPath);
            StructuredSelection selection = (null != eaElement) ? new StructuredSelection(eaElement) : null;
            treeViewer.setSelection(selection, true);
        }

        if (treeViewer.getSelection().isEmpty() == false || allowNotExistingPath == true)
        {
            setButtonEnablement(IDialogConstants.OK_ID, true);
        }
        else
        {
            setButtonEnablement(IDialogConstants.OK_ID, false);
        }
    }

    private EAContainerWithNamespace findEAContainer(EARepositoryContainer eaRepository, IPath path)
    {
        if (path.segmentCount() > 0)
        {
            String modelName = path.segment(0);

            for (EAPackageContainer eaPackage : eaRepository.getModels())
            {
                if (eaPackage.getName().equals(modelName))
                {
                    return (path.segmentCount() > 1) ? findEAContainer(eaPackage, path.removeFirstSegments(1)) : eaPackage;
                }
            }
        }

        return null;
    }

    private EAContainerWithNamespace findEAContainer(EAPackageContainer eaPackage, IPath path)
    {
        if (path.segmentCount() > 0)
        {
            String packageName = path.segment(0);

            for (EAPackageContainer eaChildPackage : eaPackage.getPackages())
            {
                if (eaChildPackage.getName().equals(packageName))
                {
                    return (path.segmentCount() > 1) ? findEAContainer(eaChildPackage, path.removeFirstSegments(1)) : eaChildPackage;
                }
            }
        }

        return null;
    }

    private void setWidgetEnablements(boolean enable)
    {
        // Do not touch widget in closing state. They may be already disposed.
        if (state != State.CLOSING)
        {
            eaPathText.setEnabled(enable);

            Tree tree = treeViewer.getTree();
            tree.setEnabled(enable);

            label.setEnabled(enable);
        }
    }

    private void setButtonEnablement(int buttonId, boolean enable)
    {
        Button button = getButton(buttonId);

        if (null != button && button.isDisposed() == false)
        {
            button.setEnabled(enable);
        }
    }

    private void disposeEAProjectLoader()
    {
        if (null != eaProjectLoader)
        {
            eaProjectLoader.dispose();

            eaProjectLoader = null;
        }
    }

    private void cancelAndClose()
    {
        // Change state to "selecting". Otherwise call of close method will not work.
        state = State.SELECTING;
        setReturnCode(CANCEL);
        close();
    }

    private enum State
    {
        OPENING, LOADING, SELECTING, CLOSING
    }
}
