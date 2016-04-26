/* Copyright (C) 2013-2015 BMW Group
 * Author: Manfred Bathelt (manfred.bathelt@bmw.de)
 * Author: Juergen Gehring (juergen.gehring@bmw.de)
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package de.bmw.yamaica.ea.core.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;

import de.bmw.yamaica.ea.core.YamaicaEAConstants;

@XmlRootElement(name = YamaicaEAConstants.XML_RESOURCES_ELEMENT)
public class Resources
{
    @XmlElement(name = YamaicaEAConstants.XML_RESOURCE_ELEMENT, required = true)
    protected List<Resource> resources = new LinkedList<>();

    protected Resources()
    {

    }

    public static Map<String, Resource> getResources(Bundle bundle)
    {
        if (null == bundle)
        {
            Assert.isNotNull(bundle);
        }

        Map<String, Resource> resources = new HashMap<String, Resource>();

        putResourcesInMap(resources, bundle, YamaicaEAConstants.PLUGIN_RESOURCE_PATHS);
        putResourcesInMap(resources, bundle, YamaicaEAConstants.FRAGMENT_RESOURCE_PATHS);

        return resources;
    }

    protected static void putResourcesInMap(Map<String, Resource> map, Bundle bundle, String path)
    {
        Resources resources = getResources(bundle, path);

        for (Resource resource : resources.resources)
        {
            map.put(resource.getName(), resource);
        }
    }

    protected static Resources getResources(Bundle bundle, String path)
    {
        try
        {
            InputStream inputStream = FileLocator.openStream(bundle, new Path(path), true);

            return (Resources) JAXBContext.newInstance(Resources.class).createUnmarshaller().unmarshal(inputStream);
        }
        catch (IOException e)
        {
            return new Resources();
        }
        catch (JAXBException e)
        {
            e.printStackTrace();

            return new Resources();
        }
    }
}
