/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca.exceptions;

/**
 * Invalid typeCollection naming exception.
 *
 * The name of the typeCollection shall not be equals to the name of any element of its own.
 *
 * Invalid naming sample:
 *   typeCollection myType {
 *       struct myType {
 *           int32 value
 *       }
 *   }
 */
public class InvalidTypeCollectionNamingException extends EA2FrancaTransformationException
{
    private static final long serialVersionUID = -4229680659607397216L;

    public InvalidTypeCollectionNamingException()
    {
    }

    public InvalidTypeCollectionNamingException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public InvalidTypeCollectionNamingException(String message)
    {
        super(message);
    }

    public InvalidTypeCollectionNamingException(Throwable cause)
    {
        super(cause);
    }
}
