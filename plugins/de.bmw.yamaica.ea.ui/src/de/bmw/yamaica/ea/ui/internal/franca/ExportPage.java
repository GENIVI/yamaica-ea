/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.ui.internal.franca;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;

import de.bmw.yamaica.common.ui.dialogs.YamaicaWizardExportPage;
import de.bmw.yamaica.ea.core.franca.EAFrancaConstants;
import de.bmw.yamaica.ea.ui.EAElementSelectionDialog;
import de.bmw.yamaica.ea.ui.franca.Franca2EAExportOperation;

public class ExportPage extends YamaicaWizardExportPage
{
    // dialog store id constants
    private final static String STORE_NAMESPACE_PREFIX_ID    = "YamaicaWizardExportPage.STORE_NAMESPACE_PREFIX_ID";       //$NON-NLS-1$
    private final static String STORE_USE_GENIVI_EXPORTER_ID = "YamaicaWizardExportPage.STORE_EXPORTER_ID";               //$NON-NLS-1$

    private static final String FRANCA_EA_EXPORTER           = "Franca IDL Exporter";
    private static final String EXPORT_FRANCA_IDL_FILES      = "Export Franca IDL files to Enterprise Architect project.";

    private Combo               namespacePrefixField;
    private Button              namespacePrefixSelectButton, useYamaicaExporterButton, useGeniviExporterButton;
    private boolean             exporterSelectionEnabled     = false;
    private Button              validateInputButton;

    public ExportPage(IWorkbench workbench, IStructuredSelection structuredSelection)
    {
        super(workbench, structuredSelection, FRANCA_EA_EXPORTER, true);

        setTitle(FRANCA_EA_EXPORTER);
        setDescription(EXPORT_FRANCA_IDL_FILES);
    }

    @Override
    protected String[] getFileExtensions()
    {
        return new String[] { EAFrancaConstants.STEREOTYPE_FIDL };
    }

    @Override
    protected Map<String, String> getSaveDialogExtensions()
    {
        LinkedHashMap<String, String> returnMap = new LinkedHashMap<String, String>();
        returnMap.put("*.eap", "Enterprise Architect Project (*.eap)");
        returnMap.putAll(super.getSaveDialogExtensions());
        return returnMap;
    }

    @Override
    protected void createDestinationGroup(Composite parent)
    {
        super.createDestinationGroup(parent);

        Font font = parent.getFont();

        Label destinationLabel = new Label(destinationSelectionGroup, SWT.NONE);
        destinationLabel.setText("Namespace prefi&x:");
        destinationLabel.setFont(font);

        // destination name entry field
        namespacePrefixField = new Combo(destinationSelectionGroup, SWT.SINGLE | SWT.BORDER);
        namespacePrefixField.addListener(SWT.Modify, this);
        namespacePrefixField.addListener(SWT.Selection, this);
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
        data.widthHint = SIZING_TEXT_FIELD_WIDTH;
        namespacePrefixField.setLayoutData(data);
        namespacePrefixField.setFont(font);
        namespacePrefixField.addListener(SWT.Modify, this);
        namespacePrefixField.addListener(SWT.Selection, this);

        namespacePrefixSelectButton = new Button(destinationSelectionGroup, SWT.PUSH);
        namespacePrefixSelectButton.setText("Select...");
        namespacePrefixSelectButton.setEnabled(false);
        namespacePrefixSelectButton.addListener(SWT.Selection, this);
        namespacePrefixSelectButton.setFont(font);
        setButtonLayoutData(namespacePrefixSelectButton);
    }

    @Override
    protected IRunnableWithProgress getExporter()
    {
        return new Franca2EAExportOperation(new Path(getDestinationValue()), new Path(namespacePrefixField.getText()),
                getSourceContainer(), this, getSelectedResources(), validateInputButton.getSelection());
    }

    @Override
    protected void createOptionsGroup(Composite parent)
    {
        validateInputButton = new Button(parent, SWT.CHECK);
        validateInputButton.setText("Validate input files");
        validateInputButton.setSelection(true);
    }

    @Override
    protected void createOptionsGroupButtons(Group optionsGroup)
    {
        Font font = optionsGroup.getFont();

        GridLayout layout = new GridLayout(2, false);

        Composite exporterComposite = new Composite(optionsGroup, SWT.NONE);
        exporterComposite.setLayout(layout);
        exporterComposite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

        useYamaicaExporterButton = new Button(exporterComposite, SWT.RADIO);
        useYamaicaExporterButton.setText("yamaica exporter");
        useYamaicaExporterButton.setFont(font);

        useGeniviExporterButton = new Button(exporterComposite, SWT.RADIO);
        useGeniviExporterButton.setText("GENIVI exporter");
        useGeniviExporterButton.setFont(font);
    }

    @Override
    public void handleEvent(Event event)
    {
        if (event.widget == namespacePrefixSelectButton)
        {
            File eaFile = new File(getDestinationValue());
            IPath namespacePrefixPath = new Path(namespacePrefixField.getText());
            EAElementSelectionDialog dialog = new EAElementSelectionDialog(namespacePrefixSelectButton.getShell(), eaFile,
                    namespacePrefixPath, true);

            if (dialog.open() == EAElementSelectionDialog.OK)
            {
                namespacePrefixField.setText(dialog.getSelection().toString());
            }
        }
        else
        {
            super.handleEvent(event);
        }
    }

    @Override
    protected boolean validateDestinationGroup()
    {
        boolean valid = super.validateDestinationGroup();

        if (new File(getDestinationValue()).exists())
        {
            namespacePrefixSelectButton.setEnabled(true);
        }
        else
        {
            namespacePrefixSelectButton.setEnabled(false);
        }

        if (!valid)
        {
            return false;
        }

        if (new Path(namespacePrefixField.getText()).segmentCount() < 1)
        {
            setErrorMessage("The namespace prefix must consists of at least one segment.");

            return false;
        }

        return true;
    }

    @Override
    protected void restoreWidgetValues()
    {
        IDialogSettings settings = getDialogSettings();

        if (null != settings)
        {
            String[] namespacePrefixes = settings.getArray(STORE_NAMESPACE_PREFIX_ID);

            if (null != namespacePrefixes)
            {
                namespacePrefixField.setText(namespacePrefixes[0]);

                for (String sourceName : namespacePrefixes)
                {
                    namespacePrefixField.add(sourceName);
                }
            }

            if (exporterSelectionEnabled)
            {
                boolean useGeniviExporter = settings.getBoolean(STORE_USE_GENIVI_EXPORTER_ID);
                useGeniviExporterButton.setSelection(useGeniviExporter);
                useYamaicaExporterButton.setSelection(!useGeniviExporter);
            }

            super.restoreWidgetValues();
        }
    }

    @Override
    protected void saveWidgetValues()
    {
        IDialogSettings settings = getDialogSettings();

        if (null != settings)
        {
            String[] namespacePrefixes = settings.getArray(STORE_NAMESPACE_PREFIX_ID);

            if (null == namespacePrefixes)
            {
                namespacePrefixes = new String[0];
            }

            namespacePrefixes = addToHistory(namespacePrefixes, namespacePrefixField.getText());
            settings.put(STORE_NAMESPACE_PREFIX_ID, namespacePrefixes);

            if (exporterSelectionEnabled)
            {
                settings.put(STORE_USE_GENIVI_EXPORTER_ID, useGeniviExporterButton.getSelection());
            }

            super.saveWidgetValues();
        }
    }

    @Override
    protected boolean getIsProgressMonitorCancelable()
    {
        return true;
    }
}
