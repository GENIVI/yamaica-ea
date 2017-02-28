/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.internal.franca;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

import de.bmw.yamaica.common.ui.dialogs.YamaicaImportWizard;
import de.bmw.yamaica.ea.ui.internal.Activator;

public class ImportWizard extends YamaicaImportWizard
{
    public ImportWizard()
    {
        super("YamaicaEAFrancaImportWizard");
        setWindowTitle("Import Franca IDL Files from Enterprise Architect Project");
    }

    @Override
    public void init(IWorkbench workbench, IStructuredSelection structuredSelection)
    {
        super.init(workbench, structuredSelection);

        setDefaultPageImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor("IMPORT_WIZARD"));
    }

    @Override
    public void addPages()
    {
        yamaicaWizardImportPage = new ImportPage(workbench, structuredSelection);

        addPage(yamaicaWizardImportPage);
    }
}
