/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests;

import static de.bmw.yamaica.common.core.utils.ResourceUtils.getResourceFileFromBundle;
import static de.bmw.yamaica.common.tests.utils.PathHelper.getFilesOfDirectory;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.EA2FRANCA_OUTPUT_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.EA_NAMESPACE_PREFIX;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.FRANCA2EA_INPUT_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.FRANCA2EA_REF_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.TESTS_PLUGIN_ID;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.compareModels;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.executeEARunnable;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.getEAPackageContainers;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.getFidlPackageContainers;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.transformEA2Franca;
import static de.bmw.yamaica.ea.tests.utils.TransformationAdapter.transformFranca2EA;
import static de.bmw.yamaica.franca.common.core.FrancaUtils.INTERFACE_DEFINITION_FILE_EXTENSION;
import static java.util.Arrays.asList;
import static org.eclipse.core.runtime.IPath.SEPARATOR;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import de.bmw.yamaica.ea.core.containers.EAPackageContainer;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.tests.utils.Runnable;

public enum TestCase
{
    ETC_001_AUTO_IMPORT_1("Error_Tests/Test_1_auto_import_of_non_FIDL_package/Test_1_1"),
    ETC_001_AUTO_IMPORT_2("Error_Tests/Test_1_auto_import_of_non_FIDL_package/Test_1_2"),
    ETC_002_MANUAL_IMPORT_1("Error_Tests/Test_2_manual_import_of_non_FIDL_package/Test_2_1"),
    ETC_002_MANUAL_IMPORT_2("Error_Tests/Test_2_manual_import_of_non_FIDL_package/Test_2_2"),
    ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1("Error_Tests/Test_3_fire_and_forget_methods_with_out_parameters/Test_3_1"),
    ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1("Error_Tests/Test_4_error_enum_has_more_than_one_base_type/Test_4_1"),
    ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1("Error_Tests/Test_5_error_enum_has_wrong_base_type/Test_5_1"),
    ETC_006_WRONG_VERSION_FORMAT_1("Error_Tests/Test_6_version_number_has_wrong_format/Test_6_1"),
    ETC_006_WRONG_VERSION_FORMAT_2("Error_Tests/Test_6_version_number_has_wrong_format/Test_6_2"),
    ETC_006_WRONG_VERSION_FORMAT_3("Error_Tests/Test_6_version_number_has_wrong_format/Test_6_3"),
    ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1("Error_Tests/Test_7_not_resolvable_attribute_type/Test_7_1"),
    ETC_008_SEVERAL_BASE_TYPES_1("Error_Tests/Test_8_several_base_types/Test_8_1"),
    ETC_008_SEVERAL_BASE_TYPES_2("Error_Tests/Test_8_several_base_types/Test_8_2"),
    ETC_009_SEVERAL_CLIENT_INTERFACES_1("Error_Tests/Test_9_several_client_interfaces/Test_9_1"),
    ETC_010_SEVERAL_ARRAY_TYPES_1("Error_Tests/Test_10_several_array_types/Test_10_1"),
    ETC_011_NAME_NORMALIZATION_ERROR_1("Error_Tests/Test_11_name_normalization_error/Test_11_1_[a-zA-Z0-9_]"),
    ETC_011_NAME_NORMALIZATION_ERROR_2("Error_Tests/Test_11_name_normalization_error/Test_11_2"),
    ETC_011_NAME_NORMALIZATION_ERROR_3("Error_Tests/Test_11_name_normalization_error/Test_11_3"),
    ETC_012_FQN_NAME_COLLISION_1("Error_Tests/Test_12_fully_qualified_name_collision/Test_12_1"),
    ETC_012_FQN_NAME_COLLISION_2("Error_Tests/Test_12_fully_qualified_name_collision/Test_12_2"),
    ETC_012_FQN_NAME_COLLISION_3("Error_Tests/Test_12_fully_qualified_name_collision/Test_12_3"),
    ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1("Error_Tests/Test_13_data_types_with_wrong_parent/Test_13_1"),
    ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2("Error_Tests/Test_13_data_types_with_wrong_parent/Test_13_2"),
    ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1("Error_Tests/Test_14_non_client_interface_is_derived_from_client_interface/Test_14_1"),
    ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1("Error_Tests/Test_15_derivation_from_wrong_data_types/Test_15_1"),
    ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2("Error_Tests/Test_15_derivation_from_wrong_data_types/Test_15_2"),

    TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE("Test_Cases/Test_1_Import_Tests/Test_Case_101_Manual_Import_of_fidl_Package"),
    TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE_CAMELCASE("Test_Cases/Test_1_Import_Tests/Test_Case_101_Manual_ImPort_of_fidl_Package"),
    TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE("Test_Cases/Test_1_Import_Tests/Test_Case_102_Manual_Import_of_Type_Collection_Package"),
    TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE_CAMELCASE("Test_Cases/Test_1_Import_Tests/Test_Case_102_Manual_ImPort_of_Type_Collection_Package"),
    TC_103_IMPORTS_AUTOIMPORT_EXTEND("Test_Cases/Test_1_Import_Tests/Test_Case_103_Auto_Import_Extend"),
    TC_103_IMPORTS_AUTOIMPORT_EXTEND_CAMELCASE("Test_Cases/Test_1_Import_Tests/Test_Case_103_Auto_ImPort_Extend"),
    TC_104_IMPORTS_AUTOIMPORT_ARRAYOF("Test_Cases/Test_1_Import_Tests/Test_Case_104_Auto_Import_ArrayOf"),
    TC_104_IMPORTS_AUTOIMPORT_ARRAYOF_CAMELCASE("Test_Cases/Test_1_Import_Tests/Test_Case_104_Auto_ImPort_ArrayOf"),
    TC_105_IMPORTS_DATATYPES_AND_INTERFACES,
    TC_106_IMPORTS_DATATYPES_AND_INTERFACES_CHANGED_FILE_NAMES,
    TC_107_IMPORTS_COMPLEX_CIRCLE,
    TC_108_IMPORTS_COMPLEX_NO_CIRCLE,
    TC_109_IMPORTS_SINGLE_CIRCLE,
    TC_110_IMPORTS_FORCING_COMPLEX_CIRCLE(new String[] { "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_A",
            "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_B", "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_C",
            "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_D", "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_E",
            "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_F", "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_G",
            "Test_Cases/Test_1_Import_Tests/TC_110/Test_case_110_H" }),
    TC_111_IMPORTS_SELF_CIRCLE("Test_Cases/Test_1_Import_Tests/Test_case_111_SelfCircle"),
    TC_112_IMPORTS_EMPTY_ANONYMOUS_TYPE_COLLECTION,
    TC_113_IMPORTS_INTERFACES("Test_Cases/Test_1_Import_Tests/Test_Case_113_Extends"),

    TC_201_DATATYPES_TYPEDEFS,
    TC_201_DATATYPES_TYPEDEFS_CAMELCASE,
    TC_202_DATATYPES_UNIONS,
    TC_202_DATATYPES_UNIONS_CAMELCASE,
    TC_203_DATATYPES_ARRAYS,
    TC_203_DATATYPES_ARRAYS_CAMELCASE,
    TC_204_DATATYPES_ENUMERATIONS,
    TC_204_DATATYPES_ENUMERATIONS_CAMELCASE,
    TC_205_DATATYPES_MAPS,
    TC_205_DATATYPES_MAPS_CAMELCASE,
    TC_206_DATATYPES_STRUCTS,
    TC_206_DATATYPES_STRUCTS_CAMELCASE,
    TC_207_DATATYPES_UNIONS_DERIVED,
    TC_207_DATATYPES_UNIONS_DERIVED_CAMELCASE,
    TC_208_DATATYPES_ENUMERATIONS_DERIVED,
    TC_208_DATATYPES_ENUMERATIONS_DERIVED_CAMELCASE,
    TC_209_DATATYPES_STRUCTS_DERIVED,
    TC_209_DATATYPES_STRUCTS_DERIVED_CAMELCASE,
    TC_210_DATATYPES_VERSIONS,
    TC_210_DATATYPES_VERSIONS_CAMELCASE,
    TC_211_ENUMERATION("Test_Cases/Test_2_Datatypes/Test_Case_211_Enumeration"),
    TC_212_DATATYPES_VERSIONS_EXTENDED("Test_Cases/Test_2_Datatypes/Test_Case_212_Version_NumbersInf_Extended"),
    TC_213_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT("Test_Cases/Test_2_Datatypes/Test_Case_213_AnonymTypeCollectDefault"),
    TC_214_DATATYPES_ANONYM_TYPE_COLLECT_TRUE("Test_Cases/Test_2_Datatypes/Test_Case_214_AnonymTypeCollectTrue"),
    TC_215_DATATYPES_ANONYM_TYPE_COLLECT_FALSE("Test_Cases/Test_2_Datatypes/Test_Case_215_AnonymTypeCollectFalse"),
    TC_216_DATATYPES_NAMED_TYPE_COLLECT("Test_Cases/Test_2_Datatypes/Test_Case_216_NamedTypeCollectDefault"),
    TC_217_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT,
    TC_218_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_VALID,
    TC_219_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_INVALID,
    TC_220_DATATYPES_ANONYM_TYPE_COLLECT_INF_TAGGED_VALUE_SET("Test_Cases/Test_2_Datatypes/Test_Case_220_AnonymTypeCollectAndInterfaceTaggedValueSet"),

    TC_301_INTERFACES_PRIMITIVE_ATTRIBUTES,
    TC_302_INTERFACES_COMPLEX_ATTRIBUTES,
    TC_303_INTERFACES_SPECIAL_ATTRIBUTES,
    TC_304_INTERFACES_PRIMITIVE_METHOD_PARAMS,
    TC_305_INTERFACES_COMPLEX_METHOD_PARAMS,
    TC_306_INTERFACES_PRIMITIVE_METHOD_RETURNS,
    TC_307_INTERFACES_COMPLEX_METHOD_RETURNS,
    TC_308_INTERFACES_IN_AND_OUT_METHODS,
    TC_309_INTERFACES_SPECIAL_METHODS,
    TC_310_INTERFACES_ERRORS,
    TC_311_INTERFACES_EXTENDED_INTERFACES,
    TC_312_INTERFACES_METHODS_ONLY_AND_BROADCASTS_ONLY,
    TC_313_INTERFACES_METHODS_AND_BROADCAST,
    TC_314_INTERFACES_METHODS_EXTENDED_AND_BROADCAST,
    TC_315_INTERFACES_METHODS_AND_BROADCASTS_EXTENDED,
    TC_316_INTERFACES_METHODS_EXTENDED_AND_BROADCASTS_EXTENDED,
    TC_317_INTERFACES_VERSIONS,
    TC_318_INTERFACES_SPECIAL_METHODS_WITH_ATTR,
    TC_319_INTERFACES_PRIMITIVE_ATTRIBUTE,
    TC_320_INTERFACES_NOSUB_ATTRIBUTE,
    TC_321_INTERFACES_METHODS_BROADCASTS_ATTRIBUTES,
    TC_322_INTERFACES_DEPRECATED_ATTR_NAME,

    TC_401_COMMENTS_DATATYPES,
    TC_402_COMMENTS_INTERFACES,
    TC_403_COMMENTS_DESCRIPTIONS,
    TC_404_COMMENTS_DESCRIPTIONS_REPLACEMENT("Test_Cases/Test_4_Datatypes/Test_Case_404_DescriptionReplacement"),

    // Test cases GLIPCI-36 related (franca's managed service and polymorphic structs features).
    // Keep in mind: Leading numbers in file name are not allowed! Action to do: Insert 'Tc' in the beginning, replace '-' with '_'.
    // Append file name to the package path as well!
    TC_501_ORG_FRANCA_CONNECTORS_DBUS_TESTS("testcases/Tc40_PolymorphicStructs"),
    TC_502_ORG_FRANCA_CORE_DSL_TESTS(new String[] { "testcases/Tc37_StructPolymorphic", "testcases/Tc80_InterfaceManagingOthers" }),
    TC_503_ORG_FRANCA_EXAMPLES_REFERENCE("org/reference/Tc10_TypesInTypeCollection"),
    TC_504_ORG_FRANCA_CORE_DSL_SPLITTED_TESTS(new String[] { "testcases/Tc37_StructPolymorphic", "testcases/Tc_ManagedService",
            "testcases/Tc80_InterfaceManagingOthers" });

    private final List<File>   francaFidlFiles    = new ArrayList<>();
    private final List<String> eaFidlPackagePaths = new ArrayList<>();

    private TestCase(String[] namespacePaths)
    {
        String[] francaFidlFilePaths = new String[namespacePaths.length];

        for (int i = 0; i < francaFidlFilePaths.length; i++)
        {
            francaFidlFilePaths[i] = namespacePaths[i] + "." + INTERFACE_DEFINITION_FILE_EXTENSION;
        }

        init(francaFidlFilePaths, namespacePaths);
    }

    private TestCase(String[] francaFidlFilePaths, String[] eaFidlPackagePaths)
    {
        init(francaFidlFilePaths, eaFidlPackagePaths);
    }

    private TestCase(String namespacePath)
    {
        this(new String[] { namespacePath });
    }

    private TestCase(String francaFidlFilePath, String eaFidlPackagePath)
    {
        this(new String[] { francaFidlFilePath }, new String[] { eaFidlPackagePath });
    }

    private void init(String[] francaFidlFilePaths, String[] eaFidlPackagePaths)
    {
        for (int i = 0; i < francaFidlFilePaths.length; i++)
        {
            final String fidlFilePath = getInputPath() + SEPARATOR + pathToLowerCase(francaFidlFilePaths[i]);
            this.francaFidlFiles.add(getResourceFileFromBundle(TESTS_PLUGIN_ID, fidlFilePath));
        }

        for (int i = 0; i < eaFidlPackagePaths.length; i++)
        {
            this.eaFidlPackagePaths.add(getNamespacePrefix() + SEPARATOR + pathToLowerCase(eaFidlPackagePaths[i]));
        }
    }

    /**
     * Lower casing all sub directories.
     *
     * E.g. "Error_Tests/Test_6_version_number_has_wrong_format/Test_6_1" will be converted to
     * "error_tests/test_6_version_number_has_wrong_format/Test_6_1".
     */
    private static String pathToLowerCase(final String francaFidlFilePath)
    {
        // Using Path to handle with file path.
        Path filePath = new Path(francaFidlFilePath);
        // Remove last segment (the fidl file).
        IPath subdirs = filePath.removeLastSegments(1);
        // Lower case all relative sub dirs and append the origin fidl file afterwards.
        return new Path(subdirs.toString().toLowerCase()).append(filePath.lastSegment()).toString();
    }

    private TestCase()
    {
        this(new String[] {}, new String[] {});
    }

    public void runFranca2EATransformation(EARepositoryContainer eaRepository) throws Exception
    {
        if (francaFidlFiles.size() > 0)
        {
            transformFranca2EA(eaRepository, getNamespacePrefix(), francaFidlFiles);
        }
        else
        {
            File testPluginFolder = getResourceFileFromBundle(TESTS_PLUGIN_ID, ".");
            File testCaseFolder = new File(testPluginFolder.toString() + SEPARATOR + getInputPath());
            List<File> testCaseInputFiles = getFilesOfDirectory(testCaseFolder, INTERFACE_DEFINITION_FILE_EXTENSION);

            transformFranca2EA(eaRepository, getNamespacePrefix(), testCaseInputFiles);
        }
    }

    public void runEA2FrancaTransformation(EARepositoryContainer eaRepository) throws Exception
    {
        if (eaFidlPackagePaths.size() > 0)
        {
            List<EAPackageContainer> eaPackages = getEAPackageContainers(eaRepository.getModels(), eaFidlPackagePaths);

            transformEA2Franca(eaRepository, eaPackages, TESTS_PLUGIN_ID, getOutputPath());
        }
        else
        {
            List<EAPackageContainer> testCaseRootPackages = getEAPackageContainers(eaRepository.getModels(), asList(getNamespacePrefix()));
            List<EAPackageContainer> fidlPackageContainers = getFidlPackageContainers(testCaseRootPackages);

            transformEA2Franca(eaRepository, fidlPackageContainers, TESTS_PLUGIN_ID, getOutputPath());
        }
    }

    public void execute(EARepositoryContainer eaRepository, Runnable runnable) throws Exception
    {
        if (eaFidlPackagePaths.size() > 0)
        {
            executeEARunnable(eaRepository, getNamespacePrefix(), eaFidlPackagePaths, runnable);
        }
        else
        {
            fail("The test case enumeration must specfiy at least one namespace path for this test case!");
        }
    }

    public void runModelComparison(boolean ignoreFileNameComparison) throws Exception
    {
        compareModels(getRefPath(), TESTS_PLUGIN_ID, getOutputPath(), ignoreFileNameComparison);
    }

    public void runModelComparison() throws Exception
    {
        runModelComparison(false);
    }

    public String getOutputPath()
    {
        return EA2FRANCA_OUTPUT_PATH + getTestCaseName();
    }

    public String getInputPath()
    {
        return FRANCA2EA_INPUT_PATH + getTestCaseName();
    }

    public String getRefPath()
    {
        return FRANCA2EA_REF_PATH + getTestCaseName();
    }

    public String getTestCaseName()
    {
        return toString().toLowerCase();
    }

    public String getNamespacePrefix()
    {
        return EA_NAMESPACE_PREFIX + SEPARATOR + getTestCaseName();
    }
}
