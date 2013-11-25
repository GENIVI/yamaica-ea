package de.bmw.yamaica.ea.core.franca.exceptions;

public class BaseTypeDataTypeException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = -699896035358394692L;

    public BaseTypeDataTypeException()
    {
    }

    public BaseTypeDataTypeException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public BaseTypeDataTypeException(String message)
    {
        super(message);
    }

    public BaseTypeDataTypeException(Throwable cause)
    {
        super(cause);
    }
}
