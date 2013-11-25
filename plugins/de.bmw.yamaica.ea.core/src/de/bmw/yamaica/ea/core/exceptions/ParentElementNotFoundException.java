/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.exceptions;

public class ParentElementNotFoundException extends EAException
{
    private static final long serialVersionUID = 2549241885729255361L;

    public ParentElementNotFoundException()
    {
        super();
    }

    public ParentElementNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public ParentElementNotFoundException(String message)
    {
        super(message);
    }

    public ParentElementNotFoundException(Throwable cause)
    {
        super(cause);
    }
}
