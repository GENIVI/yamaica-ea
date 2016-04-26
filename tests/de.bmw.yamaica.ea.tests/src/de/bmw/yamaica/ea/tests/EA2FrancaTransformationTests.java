/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests;

import static de.bmw.yamaica.common.tests.utils.PathHelper.deleteBundleFile;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.EA2FRANCA_OUTPUT_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.EA_PROJECT_PATH;
import static de.bmw.yamaica.ea.tests.utils.TestConstants.TESTS_PLUGIN_ID;
import static java.lang.Thread.sleep;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.exceptions.ArrayTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.AutoImportException;
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeDataTypeException;
import de.bmw.yamaica.ea.core.franca.exceptions.CircleException;
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceDerivationException;
import de.bmw.yamaica.ea.core.franca.exceptions.DataTypeParentException;
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeException;
import de.bmw.yamaica.ea.core.franca.exceptions.FireAndForgetMethodException;
import de.bmw.yamaica.ea.core.franca.exceptions.ForbiddenAttributeNameException;
import de.bmw.yamaica.ea.core.franca.exceptions.FullyQualifiedNameCollisionException;
import de.bmw.yamaica.ea.core.franca.exceptions.InvalidTypeCollectionNamingException;
import de.bmw.yamaica.ea.core.franca.exceptions.ManualImportException;
import de.bmw.yamaica.ea.core.franca.exceptions.NameNormalizationException;
import de.bmw.yamaica.ea.core.franca.exceptions.TypeResolvingException;
import de.bmw.yamaica.ea.core.franca.exceptions.VersionNumberFormatException;
import de.bmw.yamaica.ea.tests.utils.TransformationAdapter;

public class EA2FrancaTransformationTests
{
    private static EAProjectLoader       eaProjectLoader;
    private static EARepositoryContainer eaRepository;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        deleteBundleFile(TESTS_PLUGIN_ID, EA2FRANCA_OUTPUT_PATH);

        eaProjectLoader = TransformationAdapter.createEAProjectLoader(TESTS_PLUGIN_ID, EA_PROJECT_PATH);
        eaRepository = eaProjectLoader.getRepository();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        eaRepository = null;
        eaProjectLoader.dispose();
        eaProjectLoader = null;

        // Deleting generated error test case files because they likely contain errors.
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_001_AUTO_IMPORT_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_001_AUTO_IMPORT_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_002_MANUAL_IMPORT_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_002_MANUAL_IMPORT_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_006_WRONG_VERSION_FORMAT_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_006_WRONG_VERSION_FORMAT_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_006_WRONG_VERSION_FORMAT_3.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_008_SEVERAL_BASE_TYPES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_008_SEVERAL_BASE_TYPES_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_009_SEVERAL_CLIENT_INTERFACES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_010_SEVERAL_ARRAY_TYPES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_011_NAME_NORMALIZATION_ERROR_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_011_NAME_NORMALIZATION_ERROR_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_011_NAME_NORMALIZATION_ERROR_3.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_012_FQN_NAME_COLLISION_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_012_FQN_NAME_COLLISION_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_012_FQN_NAME_COLLISION_3.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2.getOutputPath());
        deleteBundleFile(TESTS_PLUGIN_ID, TestCase.TC_110_IMPORTS_FORCING_COMPLEX_CIRCLE.getOutputPath());

        // Give EA some time to exit. Otherwise a startup error can appear if it is started again immediately by another test class.
        sleep(2000);
    }

    @Test
    public void manualImportOfFidlPackage() throws Exception
    {
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void manualImportOfFidlPackageCamelCase() throws Exception
    {
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void manualImportOfTypeCollectionPackage() throws Exception
    {
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void manualImportOfTypeCollectionPackageCamelCase() throws Exception
    {
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void automaticImportExtend() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void automaticImportExtendCamelCase() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void automaticImportArrayOf() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void automaticImportArrayOfCamelCase() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void importOfDatatypesAndInterfaces() throws Exception
    {
        TestCase.TC_105_IMPORTS_DATATYPES_AND_INTERFACES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void importOfDatatypesAndInterfacesChangedFileNames() throws Exception
    {
        TestCase.TC_106_IMPORTS_DATATYPES_AND_INTERFACES_CHANGED_FILE_NAMES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void complexImportSampleWithoutCircle() throws Exception
    {
        TestCase.TC_108_IMPORTS_COMPLEX_NO_CIRCLE.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = CircleException.class)
    public void forcingComplexImportCircle() throws Exception
    {
        TestCase.TC_110_IMPORTS_FORCING_COMPLEX_CIRCLE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void importSelfCircle() throws Exception
    {
        TestCase.TC_111_IMPORTS_SELF_CIRCLE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void importOfEmptyAnonymousTypeCollection() throws Exception
    {
        TestCase.TC_112_IMPORTS_EMPTY_ANONYMOUS_TYPE_COLLECTION.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void importInterfaces() throws Exception
    {
        TestCase.TC_113_IMPORTS_INTERFACES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void typedefs() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void typedefsCamelCase() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void unions() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void unionsCamelCase() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void arrays() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void arraysCamelCase() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void enumerations() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void enumerationsCamelCase() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void maps() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void mapsCamelCase() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void structs() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void structsCamelCase() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedUnions() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedUnionsCamelCase() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedEnumerations() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedEnumerationsCamelCase() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedStructs() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void derivedStructsCamelCase() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void datatypeVersions() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void datatypeVersionsCamelCase() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS_CAMELCASE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void enumeationTest() throws Exception
    {
        TestCase.TC_211_ENUMERATION.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void datatypeVersionsExtended() throws Exception
    {
        TestCase.TC_212_DATATYPES_VERSIONS_EXTENDED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void anonymousTypeCollectionTaggedValueNotSet() throws Exception
    {
        TestCase.TC_213_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void anonymousTypeCollectionTaggedValueTrue() throws Exception
    {
        TestCase.TC_214_DATATYPES_ANONYM_TYPE_COLLECT_TRUE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void anonymousTypeCollectionTaggedValueFalse() throws Exception
    {
        TestCase.TC_215_DATATYPES_ANONYM_TYPE_COLLECT_FALSE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void namedTypeCollection() throws Exception
    {
        TestCase.TC_216_DATATYPES_NAMED_TYPE_COLLECT.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void namedTypeCollectionLastPackageSegmentDiffers() throws Exception
    {
        TestCase.TC_217_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void validTypeCollectionNaming() throws Exception
    {
        TestCase.TC_218_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_VALID.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = InvalidTypeCollectionNamingException.class)
    public void invalidTypeCollectionNaming() throws Exception
    {
        TestCase.TC_219_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_INVALID.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void anonymousTypeCollAndInterfaceTaggedValueSet() throws Exception
    {
        TestCase.TC_220_DATATYPES_ANONYM_TYPE_COLLECT_INF_TAGGED_VALUE_SET.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void primitiveAttributes() throws Exception
    {
        TestCase.TC_301_INTERFACES_PRIMITIVE_ATTRIBUTES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void complexInterfaceAttributes() throws Exception
    {
        TestCase.TC_302_INTERFACES_COMPLEX_ATTRIBUTES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void specialAttributes() throws Exception
    {
        TestCase.TC_303_INTERFACES_SPECIAL_ATTRIBUTES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void primitiveMethodParams() throws Exception
    {
        TestCase.TC_304_INTERFACES_PRIMITIVE_METHOD_PARAMS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void complexMethodParams() throws Exception
    {
        TestCase.TC_305_INTERFACES_COMPLEX_METHOD_PARAMS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void primitiveMethodReturns() throws Exception
    {
        TestCase.TC_306_INTERFACES_PRIMITIVE_METHOD_RETURNS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void complexMethodReturns() throws Exception
    {
        TestCase.TC_307_INTERFACES_COMPLEX_METHOD_RETURNS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void inAndOutMethodReturns() throws Exception
    {
        TestCase.TC_308_INTERFACES_IN_AND_OUT_METHODS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void specialMethods() throws Exception
    {
        TestCase.TC_309_INTERFACES_SPECIAL_METHODS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void methodErrors() throws Exception
    {
        TestCase.TC_310_INTERFACES_ERRORS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void extendedInterfaces() throws Exception
    {
        TestCase.TC_311_INTERFACES_EXTENDED_INTERFACES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsOnlyAndBroadcastOnly() throws Exception
    {
        TestCase.TC_312_INTERFACES_METHODS_ONLY_AND_BROADCASTS_ONLY.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsAndBroadcasts() throws Exception
    {
        TestCase.TC_313_INTERFACES_METHODS_AND_BROADCAST.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcasts() throws Exception
    {
        TestCase.TC_314_INTERFACES_METHODS_EXTENDED_AND_BROADCAST.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended() throws Exception
    {
        TestCase.TC_315_INTERFACES_METHODS_AND_BROADCASTS_EXTENDED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended2() throws Exception
    {
        TestCase.TC_316_INTERFACES_METHODS_EXTENDED_AND_BROADCASTS_EXTENDED.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceVersions() throws Exception
    {
        TestCase.TC_317_INTERFACES_VERSIONS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void specialMethodsWithAttribute() throws Exception
    {
        TestCase.TC_318_INTERFACES_SPECIAL_METHODS_WITH_ATTR.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void primitiveAttribute() throws Exception
    {
        TestCase.TC_319_INTERFACES_PRIMITIVE_ATTRIBUTE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void nosubAttribute() throws Exception
    {
        TestCase.TC_320_INTERFACES_NOSUB_ATTRIBUTE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void methodsBroadcastsAttributes() throws Exception
    {
        TestCase.TC_321_INTERFACES_METHODS_BROADCASTS_ATTRIBUTES.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ForbiddenAttributeNameException.class)
    public void deprecatedAttributeNamingException() throws Exception
    {
        TestCase.TC_322_INTERFACES_DEPRECATED_ATTR_NAME.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void datatypeComments() throws Exception
    {
        TestCase.TC_401_COMMENTS_DATATYPES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void interfaceComments() throws Exception
    {
        TestCase.TC_402_COMMENTS_INTERFACES.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void descriptionsComments() throws Exception
    {
        TestCase.TC_403_COMMENTS_DESCRIPTIONS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void descriptionsCommentsReplacement() throws Exception
    {
        TestCase.TC_404_COMMENTS_DESCRIPTIONS_REPLACEMENT.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void polymorphicStruct() throws Exception
    {
        TestCase.TC_501_ORG_FRANCA_CONNECTORS_DBUS_TESTS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void polymorphicStructAndManagedService() throws Exception
    {
        TestCase.TC_502_ORG_FRANCA_CORE_DSL_TESTS.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void polymorphicStructs() throws Exception
    {
        TestCase.TC_503_ORG_FRANCA_EXAMPLES_REFERENCE.runEA2FrancaTransformation(eaRepository);
    }

    @Test
    public void polymorphicStructAndManagedServiceDifferentFiles() throws Exception
    {
        TestCase.TC_504_ORG_FRANCA_CORE_DSL_SPLITTED_TESTS.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = AutoImportException.class)
    public void autoImport1() throws Exception
    {
        TestCase.ETC_001_AUTO_IMPORT_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = AutoImportException.class)
    public void autoImport2() throws Exception
    {
        TestCase.ETC_001_AUTO_IMPORT_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ManualImportException.class)
    public void manualImport1() throws Exception
    {
        TestCase.ETC_002_MANUAL_IMPORT_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ManualImportException.class)
    public void manualImport2() throws Exception
    {
        TestCase.ETC_002_MANUAL_IMPORT_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = FireAndForgetMethodException.class)
    public void fireAndForgetMethodsWithOutParameters() throws Exception
    {
        TestCase.ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ErrorEnumTypeCountException.class)
    public void enumWithSeveralBaseTypes() throws Exception
    {
        TestCase.ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ErrorEnumTypeException.class)
    public void enumWithWrongBaseTypes() throws Exception
    {
        TestCase.ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat1() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat2() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat3() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_3.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = TypeResolvingException.class)
    public void unresovableAttributeType() throws Exception
    {
        TestCase.ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = BaseTypeCountException.class)
    public void severalBaseTypes1() throws Exception
    {
        TestCase.ETC_008_SEVERAL_BASE_TYPES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = BaseTypeCountException.class)
    public void severalBaseTypes2() throws Exception
    {
        TestCase.ETC_008_SEVERAL_BASE_TYPES_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ClientInterfaceCountException.class)
    public void severalClientInterfaces() throws Exception
    {
        TestCase.ETC_009_SEVERAL_CLIENT_INTERFACES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ArrayTypeCountException.class)
    public void severalArrayTypes() throws Exception
    {
        TestCase.ETC_010_SEVERAL_ARRAY_TYPES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError1() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError2() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError3() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_3.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision1() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision2() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision3() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_3.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = DataTypeParentException.class)
    public void dataTypeWithWrongParent1() throws Exception
    {
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = DataTypeParentException.class)
    public void dataTypeWithWrongParent2() throws Exception
    {
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = ClientInterfaceDerivationException.class)
    public void clientInterfaceDerivationError() throws Exception
    {
        TestCase.ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = BaseTypeDataTypeException.class)
    public void derivationFromWrongDataType1() throws Exception
    {
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1.runEA2FrancaTransformation(eaRepository);
    }

    @Test(expected = BaseTypeDataTypeException.class)
    public void derivationFromWrongDataType2() throws Exception
    {
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2.runEA2FrancaTransformation(eaRepository);
    }
}
