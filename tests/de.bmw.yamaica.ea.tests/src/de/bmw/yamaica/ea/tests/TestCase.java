package de.bmw.yamaica.ea.tests;

import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.tests.utils.EA2FrancaTransformationAdapter;
import de.bmw.yamaica.ea.tests.utils.EATestConstants;

public enum TestCase
{
    ETC_001_AUTO_IMPORT_1(new String[] { "Demo.Error Tests.Test 1 auto import of non FIDL package.Test 1 1" }),
    ETC_001_AUTO_IMPORT_2(new String[] { "Demo.Error Tests.Test 1 auto import of non FIDL package.Test 1 2" }),
    ETC_002_MANUAL_IMPORT_1(new String[] { "Demo.Error Tests.Test 2 manual import of non FIDL package.Test 2 1" }),
    ETC_002_MANUAL_IMPORT_2(new String[] { "Demo.Error Tests.Test 2 manual import of non FIDL package.Test 2 2" }),
    ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1(new String[] { "Demo.Error Tests.Test 3 fire and forget methods with out parameters.Test 3 1" }),
    ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1(new String[] { "Demo.Error Tests.Test 4 error enum has more than one base type.Test 4 1" }),
    ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1(new String[] { "Demo.Error Tests.Test 5 error enum has wrong base type.Test 5 1" }),
    ETC_006_WRONG_VERSION_FORMAT_1(new String[] { "Demo.Error Tests.Test 6 version number has wrong format.Test 6 1" }),
    ETC_006_WRONG_VERSION_FORMAT_2(new String[] { "Demo.Error Tests.Test 6 version number has wrong format.Test 6 2" }),
    ETC_006_WRONG_VERSION_FORMAT_3(new String[] { "Demo.Error Tests.Test 6 version number has wrong format.Test 6 3" }),
    ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1(new String[] { "Demo.Error Tests.Test 7 not resolvable attribute type.Test 7 1" }),
    ETC_008_SEVERAL_BASE_TYPES_1(new String[] { "Demo.Error Tests.Test 8 several base types.Test 8 1" }),
    ETC_008_SEVERAL_BASE_TYPES_2(new String[] { "Demo.Error Tests.Test 8 several base types.Test 8 2" }),
    ETC_009_SEVERAL_CLIENT_INTERFACES_1(new String[] { "Demo.Error Tests.Test 9 several client interfaces.Test 9 1" }),
    ETC_010_SEVERAL_ARRAY_TYPES_1(new String[] { "Demo.Error Tests.Test 10 several array types.Test 10 1" }),
    ETC_011_NAME_NORMALIZATION_ERROR_1(new String[] { "Demo.Error Tests.Test 11 name normalization error.Test 11 1 [a-zA-Z0-9_]" }),
    ETC_011_NAME_NORMALIZATION_ERROR_2(new String[] { "Demo.Error Tests.Test 11 name normalization error.Test 11 2" }),
    ETC_011_NAME_NORMALIZATION_ERROR_3(new String[] { "Demo.Error Tests.Test 11 name normalization error.Test 11 3" }),
    ETC_012_FQN_NAME_COLLISION_1(new String[] { "Demo.Error Tests.Test 12 fully qualified name collision.Test 12 1" }),
    ETC_012_FQN_NAME_COLLISION_2(new String[] { "Demo.Error Tests.Test 12 fully qualified name collision.Test 12 2" }),
    ETC_012_FQN_NAME_COLLISION_3(new String[] { "Demo.Error Tests.Test 12 fully qualified name collision.Test 12 3" }),
    ETC_012_FQN_NAME_COLLISION_4(new String[] { "Demo.Error Tests.Test 12 fully qualified name collision.Test 12 4" }),
    ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1(new String[] { "Demo.Error Tests.Test 13 data types with wrong parent.Test 13 1" }),
    ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2(new String[] { "Demo.Error Tests.Test 13 data types with wrong parent.Test 13 2" }),
    ETC_013_DATA_TYPES_WITH_WRONG_PARENT_3(new String[] { "Demo.Error Tests.Test 13 data types with wrong parent.Test 13 3" }),
    ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1(new String[] { "Demo.Error Tests.Test 14 non client interface is derived from client interface.Test 14 1" }),
    ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1(new String[] { "Demo.Error Tests.Test 15 derivation from wrong data types.Test 15 1" }),
    ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2(new String[] { "Demo.Error Tests.Test 15 derivation from wrong data types.Test 15 2" }),

    TC_001_FRANCA_TEMPLATE(new String[] { "Demo.InterfaceDefinitions_Manfred.Samples.testinterface" });

    private final String[] eaPackagePaths;

    private TestCase(String[] eaPackagePaths)
    {
        this.eaPackagePaths = eaPackagePaths;
    }

    public void transform(EARepositoryContainer eaRepository) throws Exception
    {
        EA2FrancaTransformationAdapter.transformEAPackages(eaRepository, eaPackagePaths, getGenPath());
    }

    public void compare() throws Exception
    {
        EA2FrancaTransformationAdapter.compareModels(getRefPath(), getGenPath());
    }

    private String getGenPath()
    {
        return EATestConstants.GEN_PATH + getTestCaseName();
    }

    private String getRefPath()
    {
        return EATestConstants.REF_PATH + getTestCaseName();
    }

    private String getTestCaseName()
    {
        return toString().toLowerCase();
    }
}
