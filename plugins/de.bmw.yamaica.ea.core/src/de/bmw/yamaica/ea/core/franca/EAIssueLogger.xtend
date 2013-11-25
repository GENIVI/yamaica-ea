/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
/* Copyright (C) 2013 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.franca

import de.bmw.yamaica.ea.core.containers.EAContainerWithNamespace
import de.bmw.yamaica.ea.core.franca.exceptions.EA2FrancaTransformationException
import de.bmw.yamaica.ea.core.franca.exceptions.InternalErrorException
import java.util.Collection
import java.util.LinkedList

class EAIssueLogger
{
    static val WARNING_DEFAULT_MESSAGE_START = "A warning"
    static val ERROR_DEFAULT_MESSAGE_START = "An error"
    static val INTERNAL_ERROR_DEFAULT_MESSAGE_START = "Please report a bug. An internal error"
    static val DEFAULT_MESSAGE = "%s occurred while transforming the %s \"%s\"."

    val logMessages = new LinkedList<String>

    def public void addIssue(Class<? extends EA2FrancaTransformationException> exceptionType, EAContainerWithNamespace container,
        String message, Object... args)
    {
        val m1 = String.format(DEFAULT_MESSAGE + " ", getMessageStart(exceptionType), container.EAObjectType.getName.toLowerCase,
            container.namespace)
        val m2 = String.format(message, args)

        if(null != exceptionType)
        {
            throw exceptionType.createException(m1 + m2)
        }
        else
        {
            logMessages.add(m1 + m2)
        }
    }

    def public Collection<String> getLogMessages()
    {
        return logMessages
    }

    def private String getMessageStart(Class<? extends EA2FrancaTransformationException> exceptionType)
    {
        if(exceptionType.isAssignableFrom(InternalErrorException))
        {
            return INTERNAL_ERROR_DEFAULT_MESSAGE_START
        }
        else if(null != exceptionType)
        {
            return ERROR_DEFAULT_MESSAGE_START
        }
        else
        {
            return WARNING_DEFAULT_MESSAGE_START
        }
    }
    
    def private <T extends EA2FrancaTransformationException> T createException(Class<T> exceptionType, String message)
    {
        return exceptionType.getConstructor(typeof(String)).newInstance(message)
    }
}
