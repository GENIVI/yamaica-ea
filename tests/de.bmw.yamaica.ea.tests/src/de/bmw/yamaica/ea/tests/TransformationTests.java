package de.bmw.yamaica.ea.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import de.bmw.yamaica.common.tests.utils.PathHelper;
import de.bmw.yamaica.ea.core.EAProjectLoader;
import de.bmw.yamaica.ea.core.containers.EARepositoryContainer;
import de.bmw.yamaica.ea.core.franca.exceptions.ArrayTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.AutoImportException;
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.BaseTypeDataTypeException;
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.ClientInterfaceDerivationException;
import de.bmw.yamaica.ea.core.franca.exceptions.DataTypeParentException;
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeCountException;
import de.bmw.yamaica.ea.core.franca.exceptions.ErrorEnumTypeException;
import de.bmw.yamaica.ea.core.franca.exceptions.FireAndForgetMethodException;
import de.bmw.yamaica.ea.core.franca.exceptions.FullyQualifiedNameCollisionException;
import de.bmw.yamaica.ea.core.franca.exceptions.ManualImportException;
import de.bmw.yamaica.ea.core.franca.exceptions.NameNormalizationException;
import de.bmw.yamaica.ea.core.franca.exceptions.TypeResolvingException;
import de.bmw.yamaica.ea.core.franca.exceptions.VersionNumberFormatException;
import de.bmw.yamaica.ea.tests.utils.EA2FrancaTransformationAdapter;
import de.bmw.yamaica.ea.tests.utils.EATestConstants;

public class TransformationTests
{
    private static EAProjectLoader       eaProjectLoader;
    private static EARepositoryContainer eaRepository;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        PathHelper.deleteBundleFolder(EATestConstants.TESTS_PLUGIN_ID, EATestConstants.GEN_PATH);

        eaProjectLoader = EA2FrancaTransformationAdapter.createEAProjectLoader(EATestConstants.ERROR_TEST_INPUT_PATH);
        eaRepository = eaProjectLoader.getRepository();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
        eaRepository = null;
        eaProjectLoader.dispose();
        eaProjectLoader = null;
    }

    @Test
    public void francaTemplate1() throws Exception
    {
        TestCase.TC_001_FRANCA_TEMPLATE.transform(eaRepository);
    }

    @Test(expected = AutoImportException.class)
    public void autoImport1() throws Exception
    {
        TestCase.ETC_001_AUTO_IMPORT_1.transform(eaRepository);
    }

    @Test(expected = AutoImportException.class)
    public void autoImport2() throws Exception
    {
        TestCase.ETC_001_AUTO_IMPORT_2.transform(eaRepository);
    }

    @Test(expected = ManualImportException.class)
    public void manualImport1() throws Exception
    {
        TestCase.ETC_002_MANUAL_IMPORT_1.transform(eaRepository);
    }

    @Test(expected = ManualImportException.class)
    public void manualImport2() throws Exception
    {
        TestCase.ETC_002_MANUAL_IMPORT_2.transform(eaRepository);
    }

    @Test(expected = FireAndForgetMethodException.class)
    public void fireAndForgetMethodsWithOutParameters() throws Exception
    {
        TestCase.ETC_003_FIRE_AND_FOREGET_METHODS_WITH_OUT_PARAMETERS_1.transform(eaRepository);
    }

    @Test(expected = ErrorEnumTypeCountException.class)
    public void enumWithSeveralBaseTypes() throws Exception
    {
        TestCase.ETC_004_ENUM_WITH_SEVERAL_BASE_TYPES_1.transform(eaRepository);
    }

    @Test(expected = ErrorEnumTypeException.class)
    public void enumWithWrongBaseTypes() throws Exception
    {
        TestCase.ETC_005_ENUM_WITH_WRONG_BASE_TYPES_1.transform(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat1() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_1.transform(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat2() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_2.transform(eaRepository);
    }

    @Test(expected = VersionNumberFormatException.class)
    public void wrongVersionFormat3() throws Exception
    {
        TestCase.ETC_006_WRONG_VERSION_FORMAT_3.transform(eaRepository);
    }

    @Test(expected = TypeResolvingException.class)
    public void unresovableAttributeType() throws Exception
    {
        TestCase.ETC_007_UNRESOLVABLE_ATTRIBUTE_TYPE_1.transform(eaRepository);
    }

    @Test(expected = BaseTypeCountException.class)
    public void severalBaseTypes1() throws Exception
    {
        TestCase.ETC_008_SEVERAL_BASE_TYPES_1.transform(eaRepository);
    }

    @Test(expected = BaseTypeCountException.class)
    public void severalBaseTypes2() throws Exception
    {
        TestCase.ETC_008_SEVERAL_BASE_TYPES_2.transform(eaRepository);
    }

    @Test(expected = ClientInterfaceCountException.class)
    public void severalClientInterfaces() throws Exception
    {
        TestCase.ETC_009_SEVERAL_CLIENT_INTERFACES_1.transform(eaRepository);
    }

    @Test(expected = ArrayTypeCountException.class)
    public void severalArrayTypes() throws Exception
    {
        TestCase.ETC_010_SEVERAL_ARRAY_TYPES_1.transform(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError1() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_1.transform(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError2() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_2.transform(eaRepository);
    }

    @Test(expected = NameNormalizationException.class)
    public void nameNormalizationError3() throws Exception
    {
        TestCase.ETC_011_NAME_NORMALIZATION_ERROR_3.transform(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision1() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_1.transform(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision2() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_2.transform(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision3() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_3.transform(eaRepository);
    }

    @Test(expected = FullyQualifiedNameCollisionException.class)
    public void fullyQualifiedNameCollision4() throws Exception
    {
        TestCase.ETC_012_FQN_NAME_COLLISION_4.transform(eaRepository);
    }

    @Test(expected = DataTypeParentException.class)
    public void dataTypeWithWrongParent1() throws Exception
    {
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_1.transform(eaRepository);
    }

    @Test(expected = DataTypeParentException.class)
    public void dataTypeWithWrongParent2() throws Exception
    {
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_2.transform(eaRepository);
    }

    @Test(expected = DataTypeParentException.class)
    public void dataTypeWithWrongParent3() throws Exception
    {
        TestCase.ETC_013_DATA_TYPES_WITH_WRONG_PARENT_3.transform(eaRepository);
    }

    @Test(expected = ClientInterfaceDerivationException.class)
    public void clientInterfaceDerivationError() throws Exception
    {
        TestCase.ETC_014_CLIENT_INTERFACE_DERIVATION_ERROR_1.transform(eaRepository);
    }

    @Test(expected = BaseTypeDataTypeException.class)
    public void derivationFromWrongDataType1() throws Exception
    {
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_1.transform(eaRepository);
    }

    @Test(expected = BaseTypeDataTypeException.class)
    public void derivationFromWrongDataType2() throws Exception
    {
        TestCase.ETC_015_DERIVATION_FROM_WRONG_DATA_TYPES_2.transform(eaRepository);
    }
}
