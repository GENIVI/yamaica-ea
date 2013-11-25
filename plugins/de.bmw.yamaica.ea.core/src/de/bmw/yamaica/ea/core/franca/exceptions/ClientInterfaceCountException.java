package de.bmw.yamaica.ea.core.franca.exceptions;

public class ClientInterfaceCountException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = 6705550741186080305L;

    public ClientInterfaceCountException()
    {
    }

    public ClientInterfaceCountException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ClientInterfaceCountException(String message)
    {
        super(message);
    }

    public ClientInterfaceCountException(Throwable cause)
    {
        super(cause);
    }
}
