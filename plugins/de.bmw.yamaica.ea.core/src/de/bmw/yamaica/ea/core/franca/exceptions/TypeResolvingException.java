package de.bmw.yamaica.ea.core.franca.exceptions;

public class TypeResolvingException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 813146441623079117L;

    public TypeResolvingException()
    {
        super();
    }

    public TypeResolvingException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public TypeResolvingException(String message)
    {
        super(message);
    }

    public TypeResolvingException(Throwable cause)
    {
        super(cause);
    }
}
