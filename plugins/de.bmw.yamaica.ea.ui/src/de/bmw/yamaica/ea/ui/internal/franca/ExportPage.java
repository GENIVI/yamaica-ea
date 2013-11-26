/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.internal.franca;

import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.bmw.yamaica.base.ui.dialogs.YamaicaWizardExportPage;

public class ExportPage extends YamaicaWizardExportPage
{
    private static final String FRANCA_EA_EXPORTER      = "Franca IDL Exporter";
    private static final String EXPORT_FRANCA_IDL_FILES = "Export Franca IDL files to Enterprise Architect.";

    public ExportPage(IWorkbench workbench, IStructuredSelection structuredSelection)
    {
        super(workbench, structuredSelection, FRANCA_EA_EXPORTER, true);

        setTitle(FRANCA_EA_EXPORTER);
        setDescription(EXPORT_FRANCA_IDL_FILES);
    }

    @Override
    protected String[] getFileExtensions()
    {
        return new String[] { "fidl" };
    }

    @Override
    protected IRunnableWithProgress getExporter()
    {
        List<IResource> resourcesToExport = getSelectedResources();

        EaXmiExportOperation exportOperation = new EaXmiExportOperation(new Path(getDestinationValue()), getSourceContainer(), this,
                resourcesToExport);

        if (null != overwriteExistingFilesCheckbox)
        {
            exportOperation.setOverwriteFiles(overwriteExistingFilesCheckbox.getSelection());
        }

        return exportOperation;
    }
}
