package de.bmw.yamaica.ea.core.franca.exceptions;

public class ArrayTypeCountException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 4728653518469556807L;

    public ArrayTypeCountException()
    {
    }

    public ArrayTypeCountException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ArrayTypeCountException(String message)
    {
        super(message);
    }

    public ArrayTypeCountException(Throwable cause)
    {
        super(cause);
    }
}
