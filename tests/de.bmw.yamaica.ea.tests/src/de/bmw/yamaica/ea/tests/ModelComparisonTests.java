/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.tests;

import org.junit.Test;

public class ModelComparisonTests
{
    @Test
    public void manualImportOfFidlPackage() throws Exception
    {
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE.runModelComparison();
    }

    @Test
    public void manualImportOfFidlPackageCamelCase() throws Exception
    {
        TestCase.TC_101_IMPORTS_MANUAL_IMPORT_OF_FIDL_PACKAGE_CAMELCASE.runModelComparison();
    }

    @Test
    public void manualImportOfTypeCollectionPackage() throws Exception
    {
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE.runModelComparison();
    }

    @Test
    public void manualImportOfTypeCollectionPackageCamelCase() throws Exception
    {
        TestCase.TC_102_IMPORTS_MANUAL_IMPORT_OF_TYPE_COLLECTION_PACKAGE_CAMELCASE.runModelComparison();
    }

    @Test
    public void automaticImportExtend() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND.runModelComparison();
    }

    @Test
    public void automaticImportExtendCamelCase() throws Exception
    {
        TestCase.TC_103_IMPORTS_AUTOIMPORT_EXTEND_CAMELCASE.runModelComparison();
    }

    @Test
    public void automaticImportArrayOf() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF.runModelComparison();
    }

    @Test
    public void automaticImportArrayOfCamelCase() throws Exception
    {
        TestCase.TC_104_IMPORTS_AUTOIMPORT_ARRAYOF_CAMELCASE.runModelComparison();
    }

    @Test
    public void importOfDatatypesAndInterfaces() throws Exception
    {
        // Keep in mind: Name of output/ref files differs from input files:
        // e.g. /input/[..]/common.fidl vs /ref/[..]/Common.fidl
        TestCase.TC_105_IMPORTS_DATATYPES_AND_INTERFACES.runModelComparison(true);
    }

    @Test
    public void importOfDatatypesAndInterfacesChangedFileNames() throws Exception
    {
        // Keep in mind: Name of output/ref files differs from input files:
        // e.g. /input/[..]/tc_106_1_interfaces.fidl vs /ref/[..]/Common.fidl
        TestCase.TC_106_IMPORTS_DATATYPES_AND_INTERFACES_CHANGED_FILE_NAMES.runModelComparison(true);
    }

    @Test
    public void complexImportSampleWithoutCircle() throws Exception
    {
        TestCase.TC_108_IMPORTS_COMPLEX_NO_CIRCLE.runModelComparison(true);
    }

    @Test
    public void importSelfCircle() throws Exception
    {
        TestCase.TC_111_IMPORTS_SELF_CIRCLE.runModelComparison(true);
    }

    @Test
    public void importOfEmptyAnonymousTypeCollection() throws Exception
    {
        TestCase.TC_112_IMPORTS_EMPTY_ANONYMOUS_TYPE_COLLECTION.runModelComparison(true);
    }

    @Test
    public void importInterfaces() throws Exception
    {
        TestCase.TC_113_IMPORTS_INTERFACES.runModelComparison();
    }

    @Test
    public void typedefs() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS.runModelComparison();
    }

    @Test
    public void typedefsCamelCase() throws Exception
    {
        TestCase.TC_201_DATATYPES_TYPEDEFS_CAMELCASE.runModelComparison();
    }

    @Test
    public void unions() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS.runModelComparison();
    }

    @Test
    public void unionsCamelCase() throws Exception
    {
        TestCase.TC_202_DATATYPES_UNIONS_CAMELCASE.runModelComparison();
    }

    @Test
    public void arrays() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS.runModelComparison();
    }

    @Test
    public void arraysCamelCase() throws Exception
    {
        TestCase.TC_203_DATATYPES_ARRAYS_CAMELCASE.runModelComparison();
    }

    @Test
    public void enumerations() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS.runModelComparison();
    }

    @Test
    public void enumerationsCamelCase() throws Exception
    {
        TestCase.TC_204_DATATYPES_ENUMERATIONS_CAMELCASE.runModelComparison();
    }

    @Test
    public void maps() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS.runModelComparison();
    }

    @Test
    public void mapsCamelCase() throws Exception
    {
        TestCase.TC_205_DATATYPES_MAPS_CAMELCASE.runModelComparison();
    }

    @Test
    public void structs() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS.runModelComparison();
    }

    @Test
    public void structsCamelCase() throws Exception
    {
        TestCase.TC_206_DATATYPES_STRUCTS_CAMELCASE.runModelComparison();
    }

    @Test
    public void derivedUnions() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED.runModelComparison();
    }

    @Test
    public void derivedUnionsCamelCase() throws Exception
    {
        TestCase.TC_207_DATATYPES_UNIONS_DERIVED_CAMELCASE.runModelComparison();
    }

    @Test
    public void derivedEnumerations() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED.runModelComparison();
    }

    @Test
    public void derivedEnumerationsCamelCase() throws Exception
    {
        TestCase.TC_208_DATATYPES_ENUMERATIONS_DERIVED_CAMELCASE.runModelComparison();
    }

    @Test
    public void derivedStructs() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED.runModelComparison();
    }

    @Test
    public void derivedStructsCamelCase() throws Exception
    {
        TestCase.TC_209_DATATYPES_STRUCTS_DERIVED_CAMELCASE.runModelComparison();
    }

    @Test
    public void datatypeVersions() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS.runModelComparison();
    }

    @Test
    public void datatypeVersionsCamelCase() throws Exception
    {
        TestCase.TC_210_DATATYPES_VERSIONS_CAMELCASE.runModelComparison();
    }

    @Test
    public void enumerationTest() throws Exception
    {
        TestCase.TC_211_ENUMERATION.runModelComparison();
    }

    @Test
    public void datatypeVersionsExtended() throws Exception
    {
        TestCase.TC_212_DATATYPES_VERSIONS_EXTENDED.runModelComparison();
    }

    @Test
    public void anonymousTypeCollectionTaggedValueNotSet() throws Exception
    {
        TestCase.TC_213_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.runModelComparison();
    }

    @Test
    public void anonymousTypeCollectionTaggedValueTrue() throws Exception
    {
        TestCase.TC_214_DATATYPES_ANONYM_TYPE_COLLECT_TRUE.runModelComparison();
    }

    @Test
    public void anonymousTypeCollectionTaggedValueFalse() throws Exception
    {
        TestCase.TC_215_DATATYPES_ANONYM_TYPE_COLLECT_FALSE.runModelComparison();
    }

    @Test
    public void namedTypeCollection() throws Exception
    {
        TestCase.TC_216_DATATYPES_NAMED_TYPE_COLLECT.runModelComparison();
    }

    @Test
    public void namedTypeCollectionLastPackageSegmentDiffers() throws Exception
    {
        TestCase.TC_217_DATATYPES_ANONYM_TYPE_COLLECT_DEFAULT.runModelComparison();
    }

    @Test
    public void validTypeCollectionNaming() throws Exception
    {
        TestCase.TC_218_DATATYPES_TYPECOLLECTION_DEPRECATED_NAMING_VALID.runModelComparison();
    }

    @Test
    public void anonymousTypeCollAndInterfaceTaggedValueSet() throws Exception
    {
        TestCase.TC_220_DATATYPES_ANONYM_TYPE_COLLECT_INF_TAGGED_VALUE_SET.runModelComparison();
    }

    @Test
    public void primitiveAttributes() throws Exception
    {
        TestCase.TC_301_INTERFACES_PRIMITIVE_ATTRIBUTES.runModelComparison();
    }

    @Test
    public void complexAttributes() throws Exception
    {
        TestCase.TC_302_INTERFACES_COMPLEX_ATTRIBUTES.runModelComparison();
    }

    @Test
    public void specialAttributes() throws Exception
    {
        TestCase.TC_303_INTERFACES_SPECIAL_ATTRIBUTES.runModelComparison();
    }

    @Test
    public void primitiveMethodParams() throws Exception
    {
        TestCase.TC_304_INTERFACES_PRIMITIVE_METHOD_PARAMS.runModelComparison();
    }

    @Test
    public void complexMethodParams() throws Exception
    {
        TestCase.TC_305_INTERFACES_COMPLEX_METHOD_PARAMS.runModelComparison();
    }

    @Test
    public void primitiveMethodReturns() throws Exception
    {
        TestCase.TC_306_INTERFACES_PRIMITIVE_METHOD_RETURNS.runModelComparison();
    }

    @Test
    public void complexMethodReturns() throws Exception
    {
        TestCase.TC_307_INTERFACES_COMPLEX_METHOD_RETURNS.runModelComparison();
    }

    @Test
    public void inAndOutMethodReturns() throws Exception
    {
        TestCase.TC_308_INTERFACES_IN_AND_OUT_METHODS.runModelComparison();
    }

    @Test
    public void specialMethods() throws Exception
    {
        TestCase.TC_309_INTERFACES_SPECIAL_METHODS.runModelComparison();
    }

    @Test
    public void methodErrors() throws Exception
    {
        TestCase.TC_310_INTERFACES_ERRORS.runModelComparison();
    }

    @Test
    public void extendedInterfaces() throws Exception
    {
        TestCase.TC_311_INTERFACES_EXTENDED_INTERFACES.runModelComparison();
    }

    @Test
    public void interfaceMethodsOnlyAndBroadcastOnly() throws Exception
    {
        TestCase.TC_312_INTERFACES_METHODS_ONLY_AND_BROADCASTS_ONLY.runModelComparison();
    }

    @Test
    public void interfaceMethodsAndBroadcasts() throws Exception
    {
        TestCase.TC_313_INTERFACES_METHODS_AND_BROADCAST.runModelComparison();
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcasts() throws Exception
    {
        TestCase.TC_314_INTERFACES_METHODS_EXTENDED_AND_BROADCAST.runModelComparison();
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended() throws Exception
    {
        TestCase.TC_315_INTERFACES_METHODS_AND_BROADCASTS_EXTENDED.runModelComparison();
    }

    @Test
    public void interfaceMethodsExtendedAndBroadcastsExtended2() throws Exception
    {
        TestCase.TC_316_INTERFACES_METHODS_EXTENDED_AND_BROADCASTS_EXTENDED.runModelComparison();
    }

    @Test
    public void interfaceVersions() throws Exception
    {
        TestCase.TC_317_INTERFACES_VERSIONS.runModelComparison();
    }

    @Test
    public void specialMethodsWithAttribute() throws Exception
    {
        TestCase.TC_318_INTERFACES_SPECIAL_METHODS_WITH_ATTR.runModelComparison();
    }

    @Test
    public void primitiveAttribute() throws Exception
    {
        TestCase.TC_319_INTERFACES_PRIMITIVE_ATTRIBUTE.runModelComparison();
    }

    @Test
    public void nosubAttribute() throws Exception
    {
        TestCase.TC_320_INTERFACES_NOSUB_ATTRIBUTE.runModelComparison();
    }

    @Test
    public void methodsBroadcastsAttributes() throws Exception
    {
        TestCase.TC_321_INTERFACES_METHODS_BROADCASTS_ATTRIBUTES.runModelComparison();
    }

    @Test
    public void datatypeComments() throws Exception
    {
        TestCase.TC_401_COMMENTS_DATATYPES.runModelComparison();
    }

    @Test
    public void interfaceComments() throws Exception
    {
        TestCase.TC_402_COMMENTS_INTERFACES.runModelComparison();
    }

    @Test
    public void descriptionsComments() throws Exception
    {
        TestCase.TC_403_COMMENTS_DESCRIPTIONS.runModelComparison();
    }

    @Test
    public void descriptionsCommentsReplacement() throws Exception
    {
        TestCase.TC_404_COMMENTS_DESCRIPTIONS_REPLACEMENT.runModelComparison();
    }

    @Test
    public void polymorphicStruct() throws Exception
    {
        TestCase.TC_501_ORG_FRANCA_CONNECTORS_DBUS_TESTS.runModelComparison();
    }

    @Test
    public void polymorphicStructAndManagedService() throws Exception
    {
        TestCase.TC_502_ORG_FRANCA_CORE_DSL_TESTS.runModelComparison();
    }

    @Test
    public void polymorphicStructs() throws Exception
    {
        TestCase.TC_503_ORG_FRANCA_EXAMPLES_REFERENCE.runModelComparison();
    }

    @Test
    public void polymorphicStructAndManagedServiceDiffentFiles() throws Exception
    {
        TestCase.TC_504_ORG_FRANCA_CORE_DSL_SPLITTED_TESTS.runModelComparison();
    }
}
