package de.bmw.yamaica.ea.core.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
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
    protected List<Resource> resources = new LinkedList<Resource>();

    protected Resources()
    {

    }

    public static Collection<Resource> getResources(Bundle bundle)
    {
        if (null == bundle)
        {
            Assert.isNotNull(bundle);
        }

        Map<String, Resource> resources = new HashMap<String, Resource>();

        putResourcesInMap(resources, bundle, YamaicaEAConstants.PLUGIN_RESOURCE_PATHS);
        putResourcesInMap(resources, bundle, YamaicaEAConstants.FRAGMENT_RESOURCE_PATHS);

        return resources.values();
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
