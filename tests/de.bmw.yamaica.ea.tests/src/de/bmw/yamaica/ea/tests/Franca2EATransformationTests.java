/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests;

import static de.bmw.yamaica.common.tests.utils.PathHelper.deleteBundleFile;
import static de.bmw.yamaica.ea.core.EAConstants.STEREOTYPE_IMPORT;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_ARRAF_OF;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_ARRAY;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_ERROR;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_FIDL;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_FRANCA_CLIENT_INTERFACE;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_FRANCA_ENUM;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_FRANCA_INTERFACE;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_FRANCA_SERVICE_INTERFACE;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_METHOD;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_METHOD_FIRE_AND_FORGET;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_NO_FIDL;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_STRUCT;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.STEREOTYPE_UNION;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX;
import static de.bmw.yamaica.ea.core.franca.EAFrancaConstants.TAGGED_VALUE_NAME;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.EA_PROJECT_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.TESTS_PLUGIN_ID;
import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EAAttributeContainer;
import de.bmw.yamaica.ea.core.containers.EAConnectorContainer;
import de.bmw.yamaica.ea.core.containers.EADiagramContainer;
import de.bmw.yamaica.ea.core.containers.EAElementContainer;
import de.bmw.yamaica.ea.core.containers.EAMethodContainer;
import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EAParameterContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.tests.utils.Runnable;
import de.bmw.yamaica.ea.tests.utils.TransformationAdapter;

public class Franca2EATransformationTests
{
    private static EAProjectLoader       eaProjectLoader;
    private static EARepositoryContainer eaRepository;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        deleteBundleFile(TESTS_PLUGIN_ID, EA_PROJECT_PATH);

        eaProjectLoader = TransformationAdapter.createEAProjectLoader(TESTS_PLUGIN_ID, EA_PROJECT_PATH);
        eaRepository = eaProjectLoader.getRepository();
        eaRepository.deleteAllModels();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        eaRepository = null;
        eaProjectLoader.dispose();
        eaProjectLoader = null;

        // Give EA some time to exit. Otherwise a startup error can appear if it is started again immediately by another test class.
        sleep(2000);
    }

    @Test
    public void manualImportOfFidlPackage() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlMainPackage = fidlPackages.get(0);

                EAPackageContainer fidlDatatypesPackage = ((EAPackageContainer) fidlMainPackage.getParent())
                        .getOrCreatePackage("TC_101_Datatypes");
                fidlDatatypesPackage.setStereotypes(STEREOTYPE_FIDL);

                EAConnectorContainer immportConnector = fidlDatatypesPackage.getElement().createConnector("",
                        EAConnectorContainer.Type.DEPENDENCY, fidlMainPackage.getElement());
                immportConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(fidlDatatypesPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void manualImportOfFidlPackageCamelCase() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE_CAMELCASE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlMainPackage = fidlPackages.get(0);

                EAPackageContainer fidlDatatypesPackage = ((EAPackageContainer) fidlMainPackage.getParent())
                        .getOrCreatePackage("Tc_101_DataTypes");
                fidlDatatypesPackage.setStereotypes(STEREOTYPE_FIDL);

                EAConnectorContainer immportConnector = fidlDatatypesPackage.getElement().createConnector("",
                        EAConnectorContainer.Type.DEPENDENCY, fidlMainPackage.getElement());
                immportConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(fidlDatatypesPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void manualImportOfTypeCollectionPackage() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlMainPackage = fidlPackages.get(0);

                EAPackageContainer fidlDatatypesPackage = ((EAPackageContainer) fidlMainPackage.getParent())
                        .getOrCreatePackage("TC_102_Datatypes");
                fidlDatatypesPackage.setStereotypes(STEREOTYPE_FIDL);

                EAPackageContainer typeCollectionPackage = fidlDatatypesPackage.getOrCreatePackage("types");
                typeCollectionPackage.setAuthor("");

                EAConnectorContainer immportConnector = typeCollectionPackage.getElement().createConnector("",
                        EAConnectorContainer.Type.DEPENDENCY, fidlMainPackage.getElement());
                immportConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(typeCollectionPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void manualImportOfTypeCollectionPackageCamelCase() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE_CAMELCASE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlMainPackage = fidlPackages.get(0);

                EAPackageContainer fidlDatatypesPackage = ((EAPackageContainer) fidlMainPackage.getParent())
                        .getOrCreatePackage("Tc_102_DataTypes");
                fidlDatatypesPackage.setStereotypes(STEREOTYPE_FIDL);

                EAPackageContainer typeCollectionPackage = fidlDatatypesPackage.getOrCreatePackage("types");
                typeCollectionPackage.setAuthor("");

                EAConnectorContainer immportConnector = typeCollectionPackage.getElement().createConnector("",
                        EAConnectorContainer.Type.DEPENDENCY, fidlMainPackage.getElement());
                immportConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(typeCollectionPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void automaticImportExtend() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void automaticImportExtendCamelCase() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void automaticImportArrayOf() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void automaticImportArrayOfCamelCase() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void importOfDatatypesAndInterfaces() throws Exception
    {
        TestCase.TC_105_IMPORTS_DATATYPES_AND_INTERFACES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void importOfDatatypesAndInterfacesChangedFileNames() throws Exception
    {
        TestCase.TC_106_IMPORTS_DATATYPES_AND_INTERFACES_CHANGED_FILE_NAMES.runFranca2EATransformation(eaRepository);
    }

    @Test(expected = StackOverflowError.class)
    public void complexCircleImportSample() throws Exception
    {
        TestCase.TC_107_IMPORTS_COMPLEX_CIRCLE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void complexImportSampleWithoutCircle() throws Exception
    {
        TestCase.TC_108_IMPORTS_COMPLEX_NO_CIRCLE.runFranca2EATransformation(eaRepository);
    }

    @Test(expected = StackOverflowError.class)
    public void singleCircleImportSample() throws Exception
    {
        TestCase.TC_109_IMPORTS_SINGLE_CIRCLE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void forcingComplexImportCircle() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_110_IMPORTS_FORCING_COMPLEX_CIRCLE.execute(eaRepository, new Runnable()
        {
            // Reproducing the test case 107 here (avoiding the StackOverflow and expecting a CircleException during EA2Franca
            // transformation).
            // Tip: Add/remove circle connection and check/compare output!
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                assertEquals("Expecting exact 8 FIDL packages (A..H).", 8, fidlPackages.size());
                final String structName = "myStruct";
                final String enumName = "myEnum";

                int index = 0;

                for (EAPackageContainer fidlMainPackage : fidlPackages)
                {
                    fidlMainPackage.setAuthor("Max Mustermann");

                    // Last character (e.g. "A", "B" etc.)
                    final String suffix = Character.toString(fidlMainPackage.getName().charAt(fidlMainPackage.getName().length() - 1));

                    final EAElementContainer myEnum = fidlMainPackage.getOrCreateElement(enumName, EAElementContainer.Type.CLASS);
                    myEnum.setStereotypes(STEREOTYPE_FRANCA_ENUM);
                    final EAAttributeContainer attribute = myEnum.getOrCreateAttribute(suffix);
                    attribute.setDefault(Integer.toString(index++));

                    EAElementContainer struct = fidlMainPackage.getOrCreateElement(structName, EAElementContainer.Type.CLASS);
                    struct.setStereotypes(STEREOTYPE_STRUCT);
                    {
                        // EAAttributeContainer stringVar = struct.getOrCreateAttribute("attr");
                        // stringVar.setType("String");

                        EAAttributeContainer importedEnum = struct.getOrCreateAttribute("myEnum");
                        importedEnum.setTypeElement(myEnum);
                    }

                    EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                            EADiagramContainer.Type.CLASS);
                    diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                    diagram.getOrCreateDiagramObject(myEnum.getElement());
                    diagram.layout();
                }

                // Set some imports and add enum to the structs.
                EAPackageContainer fidlPackageA = fidlPackages.get(0);
                EAPackageContainer fidlPackageB = fidlPackages.get(1);
                EAPackageContainer fidlPackageC = fidlPackages.get(2);
                EAPackageContainer fidlPackageD = fidlPackages.get(3);
                EAPackageContainer fidlPackageE = fidlPackages.get(4);
                EAPackageContainer fidlPackageF = fidlPackages.get(5);
                EAPackageContainer fidlPackageG = fidlPackages.get(6);
                EAPackageContainer fidlPackageH = fidlPackages.get(7);

                // A:
                inject(fidlPackageA, fidlPackageB, structName, enumName, "myEnumB");
                inject(fidlPackageA, fidlPackageH, structName, enumName, "myEnumH");
                // B:
                inject(fidlPackageB, fidlPackageC, structName, enumName, "myEnumC");
                // C:
                inject(fidlPackageC, fidlPackageD, structName, enumName, "myEnumD");
                inject(fidlPackageC, fidlPackageG, structName, enumName, "myEnumG");
                // D:
                inject(fidlPackageD, fidlPackageE, structName, enumName, "myEnumE");
                inject(fidlPackageD, fidlPackageF, structName, enumName, "myEnumF");
                // E:
                inject(fidlPackageE, fidlPackageF, structName, enumName, "myEnumF");
                // Watch out! CircleException! Export is possible by disabling this line!
                inject(fidlPackageE, fidlPackageB, structName, enumName, "myEnumB");
                // F:
                inject(fidlPackageF, fidlPackageG, structName, enumName, "myEnumG");
                inject(fidlPackageF, fidlPackageH, structName, enumName, "myEnumH");
                // G:
                // Nothing
                // H:
                inject(fidlPackageH, fidlPackageG, structName, enumName, "myEnumG");
            }
        });
    }

    @Test
    public void importSelfCircle() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_111_IMPORTS_SELF_CIRCLE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setAuthor("Max Mustermann");
                fidlMainPackage.setNotes("Self import should be ignored by EA2Franca transformation.");

                final EAElementContainer myEnum = fidlMainPackage.getOrCreateElement("MyEnum", EAElementContainer.Type.CLASS);
                myEnum.setStereotypes(STEREOTYPE_FRANCA_ENUM);
                final EAAttributeContainer attribute = myEnum.getOrCreateAttribute("VALUE");
                attribute.setDefault(Integer.toString(0));

                // Import to it self! Should be ignored by EA2Franca transformation.
                EAConnectorContainer importConnector = fidlMainPackage.createConnector("", EAConnectorContainer.Type.DEPENDENCY,
                        fidlMainPackage.getElement());
                importConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(myEnum.getElement());
                diagram.layout();
            }
        });
    }

    // A --imports--> B
    // varName := "myEnumB"
    private void inject(EAPackageContainer fidlPackageA, EAPackageContainer fidlPackageB, String structName, String enumName, String varName)
    {
        EAConnectorContainer importConnector = fidlPackageB.createConnector("", EAConnectorContainer.Type.DEPENDENCY,
                fidlPackageA.getElement());
        importConnector.setStereotypes(STEREOTYPE_IMPORT);

        EAElementContainer structOfA = findElement(fidlPackageA, structName);
        if (structOfA != null)
        {
            EAAttributeContainer importedEnum = structOfA.getOrCreateAttribute(varName);
            importedEnum.setTypeElement(findElement(fidlPackageB, enumName));
        }
    }

    private EAElementContainer findElement(EAPackageContainer fidlPackage, String elementName)
    {
        for (EAElementContainer element : fidlPackage.getElements())
        {
            if (element.getName().equals(elementName))
            {
                return element;
            }
        }
        return null;
    }

    @Test
    public void importOfEmptyAnonymousTypeCollection() throws Exception
    {
        TestCase.TC_112_IMPORTS_EMPTY_ANONYMOUS_TYPE_COLLECTION.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void importInterfaces() throws Exception
    {
        TestCase.TC_113_IMPORTS_INTERFACES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void typedefs() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void typedefsCamelCase() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void unions() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void unionsCamelCase() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void arrays() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void arraysCamelCase() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void enumerations() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void enumerationsCamelCase() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void maps() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void mapsCamelCase() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void structs() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void structsCamelCase() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedUnions() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedUnionsCamelCase() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedEnumerations() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedEnumerationsCamelCase() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedStructs() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void derivedStructsCamelCase() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void datatypeVersions() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void datatypeVersionsCamelCase() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS_CAMELCASE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void enumerationTest() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_211_ENUMERATION.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setAuthor("Max Mustermann");

                // Disabled all available types. Types will not be checked at all.
                // "boolean", "byte", "char", "double", "float", "int", "long", "short", "unknown"
                final String[] types = new String[] { "String" };

                final List<EAElementContainer> list = new ArrayList<>();
                list.add(createEnumeration(fidlMainPackage, "EnumerationUnique", types, new String[] { "-2147483648", "-1", "0" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationOne", types, new String[] { "1", "+1" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationMaxInteger", types, new String[] { "2147483647", "+2147483647" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationMinus255", types, new String[] { "-0xFF", "-0xff", "-#ff", "-#FF" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationPlus255", types, new String[] { "0xFF", "+0xFF", "0xff", "+0xff",
                        "#ff", "+#ff", "#FF", "+#FF" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationMinusOctalValues", types, new String[] { "-02000000000",
                        "-002000000000" }));
                list.add(createEnumeration(fidlMainPackage, "EnumerationPlusOctalValues", types, new String[] { "01777777777",
                        "+01777777777", "001777777777", "+001777777777" }));

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                for (EAElementContainer currentContainer : list)
                {
                    diagram.getOrCreateDiagramObject(currentContainer.getElement());
                }
                diagram.layout();
            }
        });
    }

    @Test
    public void datatypeVersionsExtended() throws Exception
    {
        TestCase.TC_212_DATATYPES_VERSIONS_EXTENDED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void anonymousTypeCollectionTaggedValueNotSet() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_213_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setStereotypes(STEREOTYPE_FIDL);
                fidlMainPackage.setAuthor("Max Mustermann");

                EAElementContainer enumeration = createEnumeration(fidlMainPackage, "MyEnumeration", new String[] { "String" },
                        new String[] { "0", "1", "2", "3" });

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(enumeration.getElement());
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void anonymousTypeCollectionTaggedValueTrue() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_214_DATATYPES_ANONYM_TYPE_COLLECT_TRUE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setStereotypes(STEREOTYPE_FIDL);
                fidlMainPackage.setAuthor("Max Mustermann");
                fidlMainPackage.createTaggedValue(TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX).setValue("true");

                EAElementContainer enumeration = createEnumeration(fidlMainPackage, "MyEnumeration", new String[] { "String" },
                        new String[] { "0", "1", "2", "3" });

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(enumeration.getElement());
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void anonymousTypeCollectionTaggedValueFalse() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_215_DATATYPES_ANONYM_TYPE_COLLECT_FALSE.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setStereotypes(STEREOTYPE_FIDL);
                fidlMainPackage.setAuthor("Max Mustermann");
                fidlMainPackage.createTaggedValue(TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX).setValue("false");

                EAElementContainer enumeration = createEnumeration(fidlMainPackage, "MyEnumeration", new String[] { "String" },
                        new String[] { "0", "1", "2", "3" });

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(enumeration.getElement());
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.layout();
            }
        });
    }

    // GLIPCI-655 related. In case of named (additional package) typeCollection the taggedValue has no effect.
    @Test
    public void namedTypeCollection() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_216_DATATYPES_NAMED_TYPE_COLLECT.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);

                EAPackageContainer typesPackage = fidlMainPackage.getOrCreatePackage("types");
                typesPackage.setAuthor("Max Mustermann");
                EAElementContainer enumeration = createEnumeration(typesPackage, "MyEnumeration", new String[] { "String" }, new String[] {
                        "0", "1", "2", "3" });

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(enumeration.getElement());
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(typesPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void namedTypeCollectionLastPackageSegmentDiffers() throws Exception
    {
        TestCase.TC_217_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void validTypeCollectionNaming() throws Exception
    {
        TestCase.TC_218_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_VALID.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void invalidTypeCollectionNaming() throws Exception
    {
        TestCase.TC_219_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_INVALID.runFranca2EATransformation(eaRepository);
    }

    // Adds and returns a enumeration to the fidlMainPackage.
    private static EAElementContainer createEnumeration(final EAPackageContainer fidlMainPackage, final String enumName,
            final String[] types, final String[] enumValues)
    {
        final EAElementContainer enumeration = fidlMainPackage.getOrCreateElement(enumName, EAElementContainer.Type.CLASS);
        enumeration.setStereotypes(STEREOTYPE_FRANCA_ENUM);

        int index = 1;

        for (final String type : types)
        {
            for (final String value : enumValues)
            {
                final EAAttributeContainer attribute = enumeration.getOrCreateAttribute("VALUE" + index++);
                attribute.setType(type);
                attribute.setDefault(value);
            }
        }
        return enumeration;
    }

    @Test
    public void anonymousTypeCollAndInterfaceTaggedValueSet() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_220_DATATYPES_ANONYM_TYPE_COLLECT_INF_TAGGED_VALUE_SET.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                final String author = "Max Mustermann";
                final EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setStereotypes(STEREOTYPE_FIDL);
                fidlMainPackage.setAuthor(author);
                fidlMainPackage.createTaggedValue(TAGGED_VALUE_ANONYMOUS_TYPECOLLECTION_PREFIX).setValue("true");

                EAElementContainer myEnumeration = createEnumeration(fidlMainPackage, "MyEnumeration", new String[] { "String" },
                        new String[] { "0", "007", "0xFF", "0xFFFF" });

                EAElementContainer myInterface = fidlMainPackage.getOrCreateElement("MyInterface", EAElementContainer.Type.INTERFACE);
                myInterface.setAuthor(author);
                EAMethodContainer method = myInterface.getOrCreateMethod("MyMethod");
                method.setStereotypes(STEREOTYPE_METHOD);
                EAParameterContainer parameter = method.getOrCreateParameter("result");
                parameter.setType("String");
                parameter.setKind(EAParameterContainer.Kind.OUT);

                final EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(),
                        EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(myEnumeration.getElement());
                diagram.getOrCreateDiagramObject(myInterface.getElement());
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void datatypeInteger() throws Exception
    {
        TestCase.TC_221_DATATYPES_INTEGER.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void primitiveAttributes() throws Exception
    {
        TestCase.TC_301_INTERFACES_PRIMITIVE_ATTRIBUTES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void complexInterfaceAttributes() throws Exception
    {
        TestCase.TC_302_INTERFACES_COMPLEX_ATTRIBUTES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void specialAttributes() throws Exception
    {
        TestCase.TC_303_INTERFACES_SPECIAL_ATTRIBUTES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void primitiveMethodParams() throws Exception
    {
        TestCase.TC_304_INTERFACES_PRIMITIVE_METHOD_PARAMS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void complexMethodParams() throws Exception
    {
        TestCase.TC_305_INTERFACES_COMPLEX_METHOD_PARAMS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void primitiveMethodReturns() throws Exception
    {
        TestCase.TC_306_INTERFACES_PRIMITIVE_METHOD_RETURNS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void complexMethodReturns() throws Exception
    {
        TestCase.TC_307_INTERFACES_COMPLEX_METHOD_RETURNS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void inAndOutMethodReturns() throws Exception
    {
        TestCase.TC_308_INTERFACES_IN_AND_OUT_METHODS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void specialMethods() throws Exception
    {
        TestCase.TC_309_INTERFACES_SPECIAL_METHODS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void methodErrors() throws Exception
    {
        TestCase.TC_310_INTERFACES_ERRORS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void extendedInterfaces() throws Exception
    {
        TestCase.TC_311_INTERFACES_EXTENDED_INTERFACES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsOnlyAndBroadcastOnly() throws Exception
    {
        TestCase.TC_312_INTERFACES_METHODS_ONLY_AND_BROADCASTS_ONLY.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsAndBroadcasts() throws Exception
    {
        TestCase.TC_313_INTERFACES_METHODS_AND_BROADCAST.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcasts() throws Exception
    {
        TestCase.TC_314_INTERFACES_METHODS_EXTENDED_AND_BROADCAST.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended() throws Exception
    {
        TestCase.TC_315_INTERFACES_METHODS_AND_BROADCASTS_EXTENDED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended2() throws Exception
    {
        TestCase.TC_316_INTERFACES_METHODS_EXTENDED_AND_BROADCASTS_EXTENDED.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceVersions() throws Exception
    {
        TestCase.TC_317_INTERFACES_VERSIONS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void specialMethodsWithAttribute() throws Exception
    {
        TestCase.TC_318_INTERFACES_SPECIAL_METHODS_WITH_ATTR.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void primitiveAttribute() throws Exception
    {
        TestCase.TC_319_INTERFACES_PRIMITIVE_ATTRIBUTE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void nosubAttribute() throws Exception
    {
        TestCase.TC_320_INTERFACES_NOSUB_ATTRIBUTE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void methodsBroadcastsAttributes() throws Exception
    {
        TestCase.TC_321_INTERFACES_METHODS_BROADCASTS_ATTRIBUTES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void deprecatedAttributeNaming() throws Exception
    {
        TestCase.TC_322_INTERFACES_DEPRECATED_ATTR_NAME.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsAndBroadcastsOverloading() throws Exception
    {
        TestCase.TC_323_INTERFACES_METHODS_AND_BROADCASTS_OVERLOADING.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void datatypeComments() throws Exception
    {
        TestCase.TC_401_COMMENTS_DATATYPES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void interfaceComments() throws Exception
    {
        TestCase.TC_402_COMMENTS_INTERFACES.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void descriptionsComments() throws Exception
    {
        TestCase.TC_403_COMMENTS_DESCRIPTIONS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void descriptionsCommentsReplacement() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.TC_404_COMMENTS_DESCRIPTIONS_REPLACEMENT.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                assertEquals(1, fidlPackages.size());

                EAPackageContainer fidlMainPackage = fidlPackages.get(0);
                fidlMainPackage.setAuthor("Max Mustermann");
                // '*' should be replaced with '(star)'
                // '@' should be replaced with '(at)'
                fidlMainPackage.setNotes("Hello *World*! email: Mustermann, Max <max.mustermann@bmw.de>");

                final EAElementContainer myEnum = fidlMainPackage.getOrCreateElement("myEnum", EAElementContainer.Type.CLASS);
                myEnum.setStereotypes(STEREOTYPE_FRANCA_ENUM);
                {
                    final EAAttributeContainer attribute = myEnum.getOrCreateAttribute("VALUE");
                    attribute.setDefault(Integer.toString(0));
                }

                EAElementContainer struct = fidlMainPackage.getOrCreateElement("myStruct", EAElementContainer.Type.CLASS);
                struct.setStereotypes(STEREOTYPE_STRUCT);
                {
                    EAAttributeContainer importedEnum = struct.getOrCreateAttribute("myEnum");
                    importedEnum.setTypeElement(myEnum);
                }

                EADiagramContainer diagram = fidlMainPackage.getOrCreateDiagram(fidlMainPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlMainPackage.getElement());
                diagram.getOrCreateDiagramObject(myEnum.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void polymorphicStruct() throws Exception
    {
        TestCase.TC_501_ORG_FRANCA_CONNECTORS_DBUS_TESTS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void polymorphicStructAndManagedService() throws Exception
    {
        TestCase.TC_502_ORG_FRANCA_CORE_DSL_TESTS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void polymorphicStructs() throws Exception
    {
        TestCase.TC_503_ORG_FRANCA_EXAMPLES_REFERENCE.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void polymorphicStructAndManagedServiceDifferentFiles() throws Exception
    {
        TestCase.TC_504_ORG_FRANCA_CORE_DSL_SPLITTED_TESTS.runFranca2EATransformation(eaRepository);
    }

    @Test
    public void autoImport1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_001_AUTO_IMPORT_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer nonFidlPackage = ((EAPackageContainer) fidlPackage.getParent()).getOrCreatePackage("Non_FIDL_Package");

                EAElementContainer union1 = fidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer union2 = nonFidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union2.setStereotypes(STEREOTYPE_UNION);

                union2.createConnector("", EAConnectorContainer.Type.GENERALIZATION, union1);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union1);
                diagram.getOrCreateDiagramObject(union2);
                diagram.layout();
            }
        });
    }

    @Test
    public void autoImport2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_001_AUTO_IMPORT_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer nonFidlPackage = fidlPackage.getOrCreatePackage("Non_FIDL_Package");
                nonFidlPackage.setStereotypes(STEREOTYPE_NO_FIDL);

                EAElementContainer union1 = fidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer union2 = nonFidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union2.setStereotypes(STEREOTYPE_UNION);

                union2.createConnector("", EAConnectorContainer.Type.GENERALIZATION, union1);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union1);
                diagram.getOrCreateDiagramObject(union2);
                diagram.layout();
            }
        });
    }

    @Test
    public void manualImport1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_002_MANUAL_IMPORT_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer nonFidlPackage = ((EAPackageContainer) fidlPackage.getParent()).getOrCreatePackage("Non_FIDL_Package");

                EAConnectorContainer importConnector = nonFidlPackage.createConnector("", EAConnectorContainer.Type.DEPENDENCY,
                        fidlPackage.getElement());
                importConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlPackage.getElement());
                diagram.getOrCreateDiagramObject(nonFidlPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void manualImport2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_002_MANUAL_IMPORT_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer nonFidlPackage = fidlPackage.getOrCreatePackage("Non_FIDL_Package");
                nonFidlPackage.setStereotypes(STEREOTYPE_NO_FIDL);

                EAConnectorContainer importConnector = nonFidlPackage.createConnector("", EAConnectorContainer.Type.DEPENDENCY,
                        fidlPackage.getElement());
                importConnector.setStereotypes(STEREOTYPE_IMPORT);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(fidlPackage.getElement());
                diagram.getOrCreateDiagramObject(nonFidlPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void fireAndForgetMethodsWithOutParameters() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                EAMethodContainer method = interface_.getOrCreateMethod("m");
                method.setStereotypes(STEREOTYPE_METHOD_FIRE_AND_FORGET);
                EAParameterContainer parameter = method.getOrCreateParameter("p");
                parameter.setType("String");
                parameter.setKind(EAParameterContainer.Kind.OUT);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.layout();
            }
        });
    }

    @Test
    public void enumWithSeveralBaseTypes() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer enumeration1 = fidlPackage.getOrCreateElement("enumeration1", EAElementContainer.Type.CLASS);
                enumeration1.setStereotypes(STEREOTYPE_FRANCA_ENUM);
                EAElementContainer enumeration2 = fidlPackage.getOrCreateElement("enumeration2", EAElementContainer.Type.CLASS);
                enumeration2.setStereotypes(STEREOTYPE_FRANCA_ENUM);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                EAMethodContainer method = interface_.getOrCreateMethod("m");
                method.setStereotypes(STEREOTYPE_METHOD);
                EAParameterContainer parameter1 = method.getOrCreateParameter("p1");
                parameter1.setStereotypes(STEREOTYPE_ERROR);
                parameter1.setType(enumeration1.getName());
                parameter1.setTypeElement(enumeration1);
                parameter1.setKind(EAParameterContainer.Kind.OUT);
                EAParameterContainer parameter2 = method.getOrCreateParameter("p2");
                parameter2.setStereotypes(STEREOTYPE_ERROR);
                parameter2.setType(enumeration2.getName());
                parameter2.setTypeElement(enumeration2);
                parameter2.setKind(EAParameterContainer.Kind.OUT);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.layout();
            }
        });
    }

    @Test
    public void enumWithWrongBaseTypes() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("union", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                EAMethodContainer method = interface_.getOrCreateMethod("m");
                method.setStereotypes(STEREOTYPE_METHOD);
                EAParameterContainer parameter = method.getOrCreateParameter("p");
                parameter.setStereotypes(STEREOTYPE_ERROR);
                parameter.setType(union.getName());
                parameter.setTypeElement(union);
                parameter.setKind(EAParameterContainer.Kind.OUT);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.layout();
            }
        });
    }

    @Test
    public void wrongVersionFormat1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_006_WRONG_VERSION_FORMAT_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer typeCollectionPackage = fidlPackage.getOrCreatePackage("types");
                typeCollectionPackage.setVersion("1.a");

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(typeCollectionPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void wrongVersionFormat2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_006_WRONG_VERSION_FORMAT_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer typeCollectionPackage = fidlPackage.getOrCreatePackage("types");
                typeCollectionPackage.setVersion("a.1");

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(typeCollectionPackage.getElement());
                diagram.layout();
            }
        });
    }

    @Test
    public void wrongVersionFormat3() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_006_WRONG_VERSION_FORMAT_3.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                interface_.setVersion("A");

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.layout();
            }
        });
    }

    @Test
    public void unresovableAttributeType() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);
                EAAttributeContainer attribute = union.getOrCreateAttribute("a");
                attribute.setType("UInt256");

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.layout();
            }
        });
    }

    @Test
    public void severalBaseTypes1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_008_SEVERAL_BASE_TYPES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                interface_.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);
                EAElementContainer interfaceBase1 = fidlPackage.getOrCreateElement("b1", EAElementContainer.Type.INTERFACE);
                interfaceBase1.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);
                EAElementContainer interfaceBase2 = fidlPackage.getOrCreateElement("b2", EAElementContainer.Type.INTERFACE);
                interfaceBase2.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);

                interfaceBase1.createConnector("", EAConnectorContainer.Type.GENERALIZATION, interface_);
                interfaceBase2.createConnector("", EAConnectorContainer.Type.GENERALIZATION, interface_);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.getOrCreateDiagramObject(interfaceBase1);
                diagram.getOrCreateDiagramObject(interfaceBase2);
                diagram.layout();
            }
        });
    }

    @Test
    public void severalBaseTypes2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_008_SEVERAL_BASE_TYPES_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer unionBase1 = fidlPackage.getOrCreateElement("b1", EAElementContainer.Type.CLASS);
                unionBase1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer unionBase2 = fidlPackage.getOrCreateElement("b2", EAElementContainer.Type.CLASS);
                unionBase2.setStereotypes(STEREOTYPE_UNION);

                unionBase1.createConnector("", EAConnectorContainer.Type.GENERALIZATION, union);
                unionBase2.createConnector("", EAConnectorContainer.Type.GENERALIZATION, union);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.getOrCreateDiagramObject(unionBase1);
                diagram.getOrCreateDiagramObject(unionBase2);
                diagram.layout();
            }
        });
    }

    @Test
    public void severalClientInterfaces() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_009_SEVERAL_CLIENT_INTERFACES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                interface_.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);
                EAElementContainer clientInterface1 = fidlPackage.getOrCreateElement("ci1", EAElementContainer.Type.INTERFACE);
                clientInterface1.setStereotypes(STEREOTYPE_FRANCA_CLIENT_INTERFACE);
                EAElementContainer clientInterface2 = fidlPackage.getOrCreateElement("ci2", EAElementContainer.Type.INTERFACE);
                clientInterface2.setStereotypes(STEREOTYPE_FRANCA_CLIENT_INTERFACE);

                EAConnectorContainer association1 = clientInterface1.createConnector("", EAConnectorContainer.Type.ASSOCIATION, interface_);
                association1.setStereotypes(STEREOTYPE_FRANCA_INTERFACE);
                EAConnectorContainer association2 = clientInterface2.createConnector("", EAConnectorContainer.Type.ASSOCIATION, interface_);
                association2.setStereotypes(STEREOTYPE_FRANCA_INTERFACE);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.getOrCreateDiagramObject(clientInterface1);
                diagram.getOrCreateDiagramObject(clientInterface2);
                diagram.layout();
            }
        });
    }

    @Test
    public void severalArrayTypes() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_010_SEVERAL_ARRAY_TYPES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer array_ = fidlPackage.getOrCreateElement("a", EAElementContainer.Type.CLASS);
                array_.setStereotypes(STEREOTYPE_ARRAY);
                EAElementContainer union1 = fidlPackage.getOrCreateElement("u1", EAElementContainer.Type.CLASS);
                union1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer union2 = fidlPackage.getOrCreateElement("u2", EAElementContainer.Type.CLASS);
                union2.setStereotypes(STEREOTYPE_UNION);

                EAConnectorContainer association1 = union1.createConnector("", EAConnectorContainer.Type.ASSOCIATION, array_);
                association1.setStereotypes(STEREOTYPE_ARRAF_OF);
                association1.setDirection(EAConnectorContainer.Direction.SOURCE_TO_DESTINATION);
                EAConnectorContainer association2 = union2.createConnector("", EAConnectorContainer.Type.ASSOCIATION, array_);
                association2.setStereotypes(STEREOTYPE_ARRAF_OF);
                association2.setDirection(EAConnectorContainer.Direction.SOURCE_TO_DESTINATION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(array_);
                diagram.getOrCreateDiagramObject(union1);
                diagram.getOrCreateDiagramObject(union2);
                diagram.layout();
            }
        });
    }

    @Test
    public void nameNormalizationError1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                // Nothing to do here :)
            }
        });
    }

    @Test
    public void nameNormalizationError2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("1u", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.layout();
            }
        });
    }

    @Test
    public void nameNormalizationError3() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_3.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.layout();
            }
        });
    }

    @Test
    public void fullyQualifiedNameCollision1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_012_FQN_NAME_COLLISION_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union1 = fidlPackage.getOrCreateElement("A", EAElementContainer.Type.CLASS);
                union1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer union2 = fidlPackage.getOrCreateElement("B", EAElementContainer.Type.CLASS);
                union2.setStereotypes(STEREOTYPE_UNION);
                union2.createTaggedValue(TAGGED_VALUE_NAME).setValue("A");

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union1);
                diagram.getOrCreateDiagramObject(union2);
                diagram.layout();
            }
        });
    }

    @Test
    public void fullyQualifiedNameCollision2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_012_FQN_NAME_COLLISION_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer typeCollectionPackage1 = fidlPackage.createPackage("types");
                EAPackageContainer typeCollectionPackage2 = fidlPackage.createPackage("types");

                EAElementContainer union1 = typeCollectionPackage1.getOrCreateElement("A", EAElementContainer.Type.CLASS);
                union1.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer union2 = typeCollectionPackage2.getOrCreateElement("B", EAElementContainer.Type.CLASS);
                union2.setStereotypes(STEREOTYPE_UNION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union1);
                diagram.getOrCreateDiagramObject(union2);
                diagram.layout();
            }
        });
    }

    @Test
    public void fullyQualifiedNameCollision3() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_012_FQN_NAME_COLLISION_3.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface1 = fidlPackage.createElement("i", EAElementContainer.Type.INTERFACE);
                interface1.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);
                EAElementContainer interface2 = fidlPackage.createElement("i", EAElementContainer.Type.INTERFACE);
                interface2.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface1);
                diagram.getOrCreateDiagramObject(interface2);
                diagram.layout();
            }
        });
    }

    @Test
    public void dataTypeWithWrongParent1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAPackageContainer typeCollectionPackage = fidlPackage.createPackage("types");
                EAPackageContainer typeCollectionSubPackage = typeCollectionPackage.createPackage("sub_types");

                EAElementContainer union = typeCollectionSubPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.layout();
            }
        });
    }

    @Test
    public void dataTypeWithWrongParent2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer union = fidlPackage.getOrCreateElement("u", EAElementContainer.Type.CLASS);
                union.setStereotypes(STEREOTYPE_UNION);
                EAElementContainer subUnion = union.getOrCreateElement("sub_u", EAElementContainer.Type.CLASS);
                subUnion.setStereotypes(STEREOTYPE_UNION);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(union);
                diagram.getOrCreateDiagramObject(subUnion);
                diagram.layout();
            }
        });
    }

    @Test
    public void clientInterfaceDerivationError() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer interface_ = fidlPackage.getOrCreateElement("i", EAElementContainer.Type.INTERFACE);
                interface_.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);
                EAElementContainer clientInterface = fidlPackage.getOrCreateElement("ci", EAElementContainer.Type.INTERFACE);
                clientInterface.setStereotypes(STEREOTYPE_FRANCA_CLIENT_INTERFACE);

                EAElementContainer extendeInterface = fidlPackage.getOrCreateElement("ci_extended", EAElementContainer.Type.INTERFACE);
                extendeInterface.setStereotypes(STEREOTYPE_FRANCA_SERVICE_INTERFACE);

                EAConnectorContainer association = clientInterface.createConnector("", EAConnectorContainer.Type.ASSOCIATION, interface_);
                association.setStereotypes(STEREOTYPE_FRANCA_INTERFACE);

                clientInterface.createConnector("", EAConnectorContainer.Type.GENERALIZATION, extendeInterface);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(interface_);
                diagram.getOrCreateDiagramObject(clientInterface);
                diagram.getOrCreateDiagramObject(extendeInterface);
                diagram.layout();
            }
        });
    }

    @Test
    public void derivationFromWrongDataType1() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer struct = fidlPackage.getOrCreateElement("s", EAElementContainer.Type.CLASS);
                struct.setStereotypes(STEREOTYPE_STRUCT);
                EAElementContainer enumeration = fidlPackage.getOrCreateElement("e", EAElementContainer.Type.CLASS);
                enumeration.setStereotypes(STEREOTYPE_FRANCA_ENUM);

                enumeration.getOrCreateConnector("", EAConnectorContainer.Type.GENERALIZATION, struct);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(struct);
                diagram.getOrCreateDiagramObject(enumeration);
                diagram.layout();
            }
        });
    }

    @Test
    public void derivationFromWrongDataType2() throws Exception
    {
        // Building EA model manually since this cannot be done by a Frana2EA transformation
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2.execute(eaRepository, new Runnable()
        {
            @Override
            public void run(List<EAPackageContainer> fidlPackages)
            {
                EAPackageContainer fidlPackage = fidlPackages.get(0);
                EAElementContainer struct = fidlPackage.getOrCreateElement("s", EAElementContainer.Type.CLASS);
                struct.setStereotypes(STEREOTYPE_STRUCT);
                EAElementContainer type = fidlPackage.getOrCreateElement("t", EAElementContainer.Type.CLASS);

                type.getOrCreateConnector("", EAConnectorContainer.Type.GENERALIZATION, struct);

                EADiagramContainer diagram = fidlPackage.getOrCreateDiagram(fidlPackage.getName(), EADiagramContainer.Type.CLASS);
                diagram.getOrCreateDiagramObject(struct);
                diagram.getOrCreateDiagramObject(type);
                diagram.layout();
            }
        });
    }
}
