package de.bmw.yamaica.ea.core.franca.exceptions;

public class VersionNumberFormatException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 4811273583232819346L;

    public VersionNumberFormatException()
    {
        super();
    }

    public VersionNumberFormatException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public VersionNumberFormatException(String message)
    {
        super(message);
    }

    public VersionNumberFormatException(Throwable cause)
    {
        super(cause);
    }
}
