/* Copyright (C) 2013-2015 BMW Group
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
import java.util.logging.Level
import java.util.logging.Logger

class EAIssueLogger
{
    private static val Logger LOGGER =  Logger.getLogger(typeof(EAIssueLogger).name);

    private static val WARNING_DEFAULT_MESSAGE_START = "A warning"
    private static val ERROR_DEFAULT_MESSAGE_START = "An error"
    private static val INTERNAL_ERROR_DEFAULT_MESSAGE_START = "Please report a bug. An internal error"
    private static val DEFAULT_MESSAGE = "%s occurred while transforming the %s \"%s\"."

    val logMessages = new LinkedList<String>

    def void addIssue(Class<? extends EA2FrancaTransformationException> exceptionType, EAContainerWithNamespace container,
        String message, Object... args)
    {
        val m1 = String.format(DEFAULT_MESSAGE, getMessageStart(exceptionType), container.EAObjectType.getName,
            container.namespace)
        val m2 = String.format(message, args)

        val String exceptionMsg = m1 + " " + m2
        LOGGER.log(Level.SEVERE, exceptionMsg)

        if(null != exceptionType)
        {
            throw exceptionType.createException(exceptionMsg)
        }
        else
        {
            logMessages.add(exceptionMsg)
        }
    }

    def Collection<String> getLogMessages()
    {
        return logMessages
    }

    private def String getMessageStart(Class<? extends EA2FrancaTransformationException> exceptionType)
    {
        if(null == exceptionType)
        {
            return WARNING_DEFAULT_MESSAGE_START
        }
        else if(exceptionType.isAssignableFrom(InternalErrorException))
        {
            return INTERNAL_ERROR_DEFAULT_MESSAGE_START
        }
        else
        {
            return ERROR_DEFAULT_MESSAGE_START
        }
    }

    private def <T extends EA2FrancaTransformationException> T createException(Class<T> exceptionType, String message)
    {
        return exceptionType.getConstructor(typeof(String)).newInstance(message)
    }
}
