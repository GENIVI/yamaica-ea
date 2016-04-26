/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.internal.franca;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.ContainerGenerator;
import org.eclipse.ui.dialogs.IOverwriteQuery;

import de.bmw.yamaica.common.core.utils.ResourceUtils;
import de.bmw.yamaica.common.ui.dialogs.YamaicaCheckedTreeViewer;
import de.bmw.yamaica.common.ui.dialogs.YamaicaWizardImportPage;
import de.bmw.yamaica.common.ui.utils.ActionRunEvent;
import de.bmw.yamaica.common.ui.utils.ViewerToolBar;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.franca.EAContainerExtensions;
import de.bmw.yamaica.ea.core.franca.EAFrancaConstants;
import de.bmw.yamaica.ea.ui.EAComparer;
import de.bmw.yamaica.ea.ui.EAContentProvider;
import de.bmw.yamaica.ea.ui.EALabelProvider;
import de.bmw.yamaica.ea.ui.franca.EA2FrancaImportOperation;
import de.bmw.yamaica.franca.common.core.FrancaUtils;

public class ImportPage extends YamaicaWizardImportPage
{
    // The wizard selection dialog of Eclipse can instantiate more than one wizard page
    // of the same type under some circumstances.
    // 1.) Open wizard selection (File -> Import...)
    // 2.) Double click a tree entry to select an import wizard
    // 3.) Press back button to return to wizard selection page
    // 4.) Double click same tree entry again (this will instantiate the same page a
    // second time without disposing the first one)
    // 5.) Pressing cancel will dispose all wizard page instances
    // Since every EAProjectLoader will start an Enterprise Architect instance, we make
    // this member static to ensure that only one EA instance is running independently
    // of the number of instantiated wizard pages

    protected static EAProjectLoader eaProjectLoader              = null;

    protected IFolder                tempFolder                   = null;
    protected Button                 importDependenciesCheckbox   = null;

    protected EAContentProvider      contentProvider              = null;
    protected EALabelProvider        labelProvider                = null;
    protected EAComparer             comparer                     = null;

    protected boolean                autoRefreshOnNextAttempt     = false;

    // dialog store id constants
    protected final static String    STORE_IMPORT_DEPENDENCIES_ID = "YamaicaWizardImportPage.STORE_IMPORT_DEPENDENCIES_ID";

    public ImportPage(IWorkbench workbench, IStructuredSelection structuredSelection)
    {
        super(workbench, structuredSelection, "EA to Franca Interface Definition Importer");

        setTitle("EA to Franca Interface Definition Importer");
        setDescription("Converts Enterprise Architect packages to Franca interface definition files.");

        disposeEAProjectLoader();
    }

    @Override
    protected void createRootDirectoryGroup(Composite parent)
    {
        Font font = parent.getFont();

        GridLayout layout = new GridLayout(3, false);
        layout.marginWidth = layout.marginHeight = 0;

        Composite sourceContainerGroup = new Composite(parent, SWT.NONE);
        sourceContainerGroup.setLayout(layout);
        sourceContainerGroup.setFont(font);
        sourceContainerGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

        Label groupLabel = new Label(sourceContainerGroup, SWT.NONE);
        groupLabel.setText("EA proje&ct file:");
        groupLabel.setFont(font);

        GridData sourceNameFieldData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        sourceNameFieldData.widthHint = SIZING_TEXT_FIELD_WIDTH;

        sourceNameField = new Combo(sourceContainerGroup, SWT.BORDER);
        sourceNameField.setLayoutData(sourceNameFieldData);
        sourceNameField.setFont(font);
        sourceNameField.addSelectionListener(new SelectionAdapter()
        {
            public void widgetSelected(SelectionEvent e)
            {
                entryChanged = false;

                updateFromSourceField();
            }
        });
        sourceNameField.addKeyListener(new KeyAdapter()
        {
            public void keyPressed(KeyEvent e)
            {
                if (e.character != SWT.CR && e.character != SWT.ESC)
                {
                    entryChanged = true;
                }
            }
        });
        sourceNameField.addFocusListener(new FocusAdapter()
        {
            public void focusLost(FocusEvent e)
            {
                if (entryChanged)
                {
                    entryChanged = false;

                    updateFromSourceField();
                }
            }
        });
        sourceNameField.addTraverseListener(new TraverseListener()
        {
            @Override
            public void keyTraversed(TraverseEvent e)
            {
                if (e.detail == SWT.TRAVERSE_RETURN)
                {
                    entryChanged = false;

                    updateFromSourceField();
                }
            }
        });

        sourceBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
        sourceBrowseButton.setText("B&rowse...");
        sourceBrowseButton.addListener(SWT.Selection, this);
        sourceBrowseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
        sourceBrowseButton.setFont(font);
        setButtonLayoutData(sourceBrowseButton);
    }

    @Override
    protected void createFileSelectionGroup(Composite parent)
    {
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = 240;

        contentProvider = new EAContentProvider();
        labelProvider = new EALabelProvider();
        comparer = new EAComparer();

        ViewerToolBar viewerToolBar = new ViewerToolBar(parent, SWT.BORDER, ViewerToolBar.DRILL_DOWN | ViewerToolBar.SELECT
                | ViewerToolBar.REFRESH);
        viewerToolBar.setLayoutData(data);

        sourceSelectionTreeViewer = new YamaicaCheckedTreeViewer(viewerToolBar, SWT.NONE);
        sourceSelectionTreeViewer.setContentProvider(contentProvider);
        sourceSelectionTreeViewer.setLabelProvider(labelProvider);
        sourceSelectionTreeViewer.setUseHashlookup(true);
        sourceSelectionTreeViewer.setUpdateStrategy(YamaicaCheckedTreeViewer.UpdateStrategy.GRAY_SELECT_PARENTS);
        sourceSelectionTreeViewer.setComparator(comparer);
        sourceSelectionTreeViewer.addCheckStateListener(this);

        viewerToolBar.addActionRunListener(this);
        viewerToolBar.setViewer(sourceSelectionTreeViewer);
    }

    @Override
    protected void createOptionsGroupButtons(Group optionsGroup)
    {
        Font font = optionsGroup.getFont();

        importDependenciesCheckbox = new Button(optionsGroup, SWT.CHECK);
        importDependenciesCheckbox.setText("&Import package dependencies automatically");
        importDependenciesCheckbox.setFont(font);
        importDependenciesCheckbox.addListener(SWT.Selection, this);

        super.createOptionsGroupButtons(optionsGroup);
    }

    @Override
    protected void updateViewerInput()
    {
        try
        {
            sourceSelectionTreeViewer.setInput(null);

            disposeEAProjectLoader();

            if (null == sourceDirectory || !sourceDirectory.isFile())
            {
                setErrorMessage("The specified EA project file is not valid.");

                return;
            }
            else
            {
                setErrorMessage(null);
            }

            setMessage("Opening EA project...", INFORMATION);

            eaProjectLoader = new EAProjectLoader(sourceDirectory);

            getContainer().run(true, true, eaProjectLoader);

            sourceSelectionTreeViewer.setInput(eaProjectLoader.getRepository());
        }
        catch (InvocationTargetException e)
        {
            disposeEAProjectLoader();

            displayErrorDialog(e.getTargetException());
        }
        catch (InterruptedException e)
        {
            disposeEAProjectLoader();

            setErrorMessage(e.getMessage());
        }
        finally
        {
            setMessage(null, INFORMATION);
            updateWidgetEnablements();
            autoRefreshOnNextAttempt = false;
        }
    }

    /**
     * Use the dialog store to restore widget values to the values that they held
     * last time this wizard was used to completion
     */
    @Override
    protected void restoreWidgetValues()
    {
        IDialogSettings settings = getDialogSettings();

        if (null != settings)
        {
            if (null != importDependenciesCheckbox)
            {
                importDependenciesCheckbox.setSelection(settings.getBoolean(STORE_IMPORT_DEPENDENCIES_ID));
            }

            updateWidgetEnablements();
        }

        super.restoreWidgetValues();
    }

    /**
     * Since Finish was pressed, write widget values to the dialog store so that they
     * will persist into the next invocation of this wizard page
     */
    @Override
    protected void saveWidgetValues()
    {
        IDialogSettings settings = getDialogSettings();

        if (null != settings)
        {
            if (null != importDependenciesCheckbox)
            {
                settings.put(STORE_IMPORT_DEPENDENCIES_ID, importDependenciesCheckbox.getSelection());
            }
        }

        super.saveWidgetValues();
    }

    @Override
    protected boolean validateSourceGroup()
    {
        if (!sourceDirectory.exists())
        {
            setMessage("Source must not be empty.");

            return false;
        }

        if (null == sourceSelectionTreeViewer.getInput())
        {
            return false;
        }

        List<EAPackageContainer> selectedPackages = getSelectedPackages();

        if (selectedPackages.size() == 0)
        {
            setMessage(null);
            setErrorMessage("There are no packages with stereotype «fidl» currently selected for import.");

            return false;
        }

        setErrorMessage(null);

        return true;
    }

    @Override
    protected boolean validateOptionsGroup()
    {
        if (null != importDependenciesCheckbox && null != overwriteExistingResourcesCheckbox)
        {
            if (false == importDependenciesCheckbox.getSelection())
            {
                setMessage("The current \"Options\" settings can lead to defective \"fidl\" files!", WARNING);
            }
            else if (true == importDependenciesCheckbox.getSelection() && true == overwriteExistingResourcesCheckbox.getSelection())
            {
                setMessage("The current \"Options\" settings can lead to unexpectedly overwritten \"fidl\" files!", WARNING);
            }
            else
            {
                setMessage(null, WARNING);
            }
        }

        return super.validateOptionsGroup();
    }

    protected List<EAPackageContainer> getSelectedPackages()
    {
        List<EAPackageContainer> packages = new LinkedList<>();

        if (null != sourceSelectionTreeViewer)
        {
            for (Object element : sourceSelectionTreeViewer.getCheckedElements())
            {
                if (!(element instanceof EAPackageContainer))
                {
                    break;
                }

                boolean hasStereotype = ((EAPackageContainer) element).hasStereotype(EAFrancaConstants.STEREOTYPE_FIDL);

                if (true == hasStereotype)
                {
                    packages.add((EAPackageContainer) element);
                }
            }
        }

        return packages;
    }

    @Override
    public boolean finish()
    {
        boolean success = false;

        saveWidgetValues();

        try
        {
            if (true == autoRefreshOnNextAttempt && null != eaProjectLoader)
            {
                eaProjectLoader.getRepository().disposeContainers();
            }

            IPath containerPath = getContainerFullPath();

            getContainer().run(true, false, new TempFolderCreation(containerPath));

            getContainer().run(true, true, getImporter());

            boolean importDependencies = null != importDependenciesCheckbox && importDependenciesCheckbox.getSelection() == true;
            boolean overwriteFiles = null != overwriteExistingResourcesCheckbox
                    && overwriteExistingResourcesCheckbox.getSelection() == true;

            getContainer().run(true, true,
                    new TempFolderMoveProcess(containerPath, getSelectedPackages(), importDependencies, overwriteFiles, this));

            success = true;
        }
        catch (InvocationTargetException e)
        {
            displayErrorDialog(e.getTargetException());
        }
        catch (InterruptedException e)
        {

        }
        finally
        {
            try
            {
                getContainer().run(true, false, new TempFolderDeletion());
            }
            catch (InvocationTargetException e)
            {
                e.printStackTrace();
            }
            catch (InterruptedException e)
            {

            }

            autoRefreshOnNextAttempt = !success;
        }

        return success;
    }

    @Override
    public void handleEvent(Event event)
    {
        if (event.widget == sourceBrowseButton)
        {
            FileDialog dialog = new FileDialog(sourceBrowseButton.getShell(), SWT.OPEN | SWT.SHEET);
            dialog.setText("Select EA file");
            dialog.setFilterPath(sourceDirectory.getPath());
            dialog.setFilterExtensions(new String[] { "*.*", "*.eap" });
            dialog.setFilterNames(new String[] { "All types", "Enterprise Architect Project (*.eap)" });
            dialog.setFilterIndex(1);

            String selectedDirectory = dialog.open();

            if (null != selectedDirectory && null != sourceNameField)
            {
                sourceNameField.setText(selectedDirectory);

                updateFromSourceField();
            }
        }
        else
        {
            super.handleEvent(event);
        }
    }

    @Override
    public void preActionRun(ActionRunEvent e)
    {
        if (e.type == ViewerToolBar.REFRESH && null != eaProjectLoader)
        {
            eaProjectLoader.getRepository().disposeContainers();
        }
    }

    @Override
    protected IRunnableWithProgress getImporter()
    {
        IPath platformPath = ResourceUtils.createPlatformPath(tempFolder.getFullPath());

        return new EA2FrancaImportOperation(platformPath, eaProjectLoader.getRepository().getEAInstance(), getSelectedPackages());
    }

    @Override
    public void dispose()
    {
        disposeEAProjectLoader();

        super.dispose();
    }

    protected void disposeEAProjectLoader()
    {
        if (null != eaProjectLoader)
        {
            eaProjectLoader.dispose();

            eaProjectLoader = null;
        }
    }

    @Override
    protected void updateWidgetEnablements()
    {
        // This method overwrites the implementation of one of the base classes. It uses the same
        // algorithm but only deletes error messages.
        boolean pageComplete = determinePageCompletion();

        setPageComplete(pageComplete);

        if (pageComplete)
        {
            setErrorMessage(null);
        }
    }

    protected class TempFolderCreation extends WorkspaceModifyOperation
    {
        protected IPath containerPath = null;

        public TempFolderCreation(IPath containerPath)
        {
            Assert.isNotNull(containerPath);

            this.containerPath = containerPath;
        }

        @Override
        protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
        {
            try
            {
                monitor.beginTask("Creating temp folder", 1);

                if (null == tempFolder && null != containerPath)
                {
                    IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(containerPath.segment(0));
                    int tempNameSuffix = -1;

                    do
                    {
                        String tempName = ".temp";

                        if (tempNameSuffix > -1)
                        {
                            tempName = tempName + "-" + tempNameSuffix;
                        }

                        tempFolder = project.getFolder(tempName);

                        tempNameSuffix++;
                    }
                    while (tempFolder.getLocation().toFile().exists());

                    tempFolder.create(true, true, monitor);
                    tempFolder.setDerived(true, monitor);
                }
            }
            catch (CoreException e)
            {
                e.printStackTrace();
            }
            finally
            {
                monitor.worked(1);
                monitor.done();
            }
        }
    }

    protected class TempFolderDeletion extends WorkspaceModifyOperation
    {
        @Override
        protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
        {
            try
            {
                monitor.beginTask("Deleting temp folder", 1);

                if (null != tempFolder)
                {
                    tempFolder.delete(true, false, monitor);
                }
            }
            catch (CoreException e)
            {
                e.printStackTrace();
            }
            finally
            {
                monitor.worked(1);
                monitor.done();
            }
        }
    }

    protected class TempFolderMoveProcess extends WorkspaceModifyOperation
    {
        protected IPath                    containerPath      = null;
        protected List<EAPackageContainer> selectedPackages   = null;
        protected boolean                  importDependencies = false;
        protected boolean                  overwriteFiles     = false;
        protected boolean                  showOverwriteQuery = true;
        protected IOverwriteQuery          overwriteQuery     = null;

        public TempFolderMoveProcess(IPath containerPath, List<EAPackageContainer> selectedPackages, boolean importDependencies,
                boolean overwriteFiles, IOverwriteQuery overwriteQuery)
        {
            Assert.isNotNull(containerPath);
            Assert.isNotNull(selectedPackages);
            Assert.isNotNull(overwriteQuery);

            this.containerPath = containerPath;
            this.selectedPackages = selectedPackages;
            this.importDependencies = importDependencies;
            this.overwriteFiles = overwriteFiles;
            this.showOverwriteQuery = !overwriteFiles;
            this.overwriteQuery = overwriteQuery;
        }

        @Override
        protected void execute(IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException
        {
            try
            {
                final String taskName = "Moving files from temp to destination folder";
                monitor.setTaskName(taskName);

                if (null != tempFolder)
                {
                    Map<String, IFile> allCreatedFiles = getAllCreatedFiles(tempFolder);
                    Map<String, IFile> files2Move = new HashMap<>();

                    if (importDependencies)
                    {
                        // Import all generated files (selected packages + dependencies)
                        files2Move = allCreatedFiles;
                    }
                    else
                    {
                        // Import only selected files (selected packages)
                        for (EAPackageContainer eaPackageContainer : selectedPackages)
                        {
                            IPath namespaceAsPath = EAContainerExtensions.getFidlNamespaceAsPath(eaPackageContainer);

                            // Normalize the namespace.
                            IPath destNamespaceAsPath = FrancaUtils.normalizeNamespacePath(namespaceAsPath,
                                    FrancaUtils.ALL_FOR_INTERFACE_DEFINITIONS, FrancaUtils.ALL);
                            IPath withoutLastSegment = destNamespaceAsPath.removeLastSegments(1);
                            // Keep the last segment of the namespace unchanged. Lower case anything else.
                            IPath newPath = new Path(withoutLastSegment.toString().toLowerCase()).append(destNamespaceAsPath.lastSegment());

                            final String path = newPath.toString();
                            IFile file = allCreatedFiles.get(path);

                            if (null != file)
                            {
                                files2Move.put(path, file);
                            }
                        }
                    }

                    monitor.beginTask(taskName, files2Move.size());

                    for (Entry<String, IFile> file2Move : files2Move.entrySet())
                    {
                        boolean moveFile = false;
                        String namespaceAsPathString = FrancaUtils.namespace2PathString(file2Move.getKey());
                        IPath destinationPath = containerPath.append(namespaceAsPathString).addFileExtension(
                                FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION);
                        IFile sourceFile = file2Move.getValue();
                        IResource destinationFile = ResourcesPlugin.getWorkspace().getRoot().findMember(destinationPath);

                        if (null != destinationFile)
                        {
                            // Ask user if existing file(s) should be overwritten
                            if (showOverwriteQuery)
                            {
                                String code = overwriteQuery.queryOverwrite(destinationFile.getFullPath().makeRelative().toString());

                                if (code.equals(IOverwriteQuery.ALL))
                                {
                                    overwriteFiles = true;
                                    showOverwriteQuery = false;
                                }
                                else if (code.equals(IOverwriteQuery.CANCEL))
                                {
                                    throw new OperationCanceledException();
                                }
                                else if (code.equals(IOverwriteQuery.NO))
                                {
                                    overwriteFiles = false;
                                }
                                else if (code.equals(IOverwriteQuery.NO_ALL))
                                {
                                    overwriteFiles = false;
                                    showOverwriteQuery = false;
                                }
                                else if (code.equals(IOverwriteQuery.YES))
                                {
                                    overwriteFiles = true;
                                }
                            }

                            moveFile = overwriteFiles;

                            // Delete existing file (or folder)
                            if (moveFile)
                            {
                                try
                                {
                                    destinationFile.delete(true, new NullProgressMonitor());
                                }
                                catch (CoreException e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }
                        else
                        {
                            try
                            {
                                // Create folders for final destination
                                IContainer destinationContainer = new ContainerGenerator(destinationPath.removeLastSegments(1))
                                        .generateContainer(new NullProgressMonitor());

                                if (destinationContainer.exists())
                                {
                                    moveFile = true;
                                }
                            }
                            catch (CoreException e)
                            {
                                e.printStackTrace();
                            }
                            catch (OperationCanceledException e)
                            {
                                e.printStackTrace();
                            }
                        }

                        // Move created file to final destination
                        if (moveFile)
                        {
                            try
                            {
                                sourceFile.move(destinationPath, true, false, new NullProgressMonitor());
                            }
                            catch (CoreException e)
                            {
                                e.printStackTrace();
                            }
                        }

                        monitor.worked(1);

                        if (monitor.isCanceled())
                        {
                            break;
                        }
                    }
                }
            }
            finally
            {
                monitor.done();
            }
        }

        public Map<String, IFile> getAllCreatedFiles(IContainer folder)
        {
            Map<String, IFile> files = new HashMap<>();
            IPath tempFolderPath = tempFolder.getFullPath();

            try
            {
                for (IResource resource : folder.members())
                {
                    if (resource instanceof IFile)
                    {
                        IPath namespacePath = resource.getFullPath().removeFileExtension().makeRelativeTo(tempFolderPath);

                        files.put(namespacePath.toString(), (IFile) resource);
                    }
                    else if (resource instanceof IContainer)
                    {
                        files.putAll(getAllCreatedFiles((IContainer) resource));
                    }
                }
            }
            catch (CoreException e)
            {
                e.printStackTrace();
            }

            return files;
        }
    }
}
