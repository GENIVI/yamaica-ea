package de.bmw.yamaica.ea.core.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

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

    public static Set<Resource> getResources(Bundle bundle)
    {
        if (null == bundle)
        {
            Assert.isNotNull(bundle);
        }

        Set<Resource> resources = new HashSet<Resource>();

        putResourcesInSet(resources, bundle, YamaicaEAConstants.PLUGIN_RESOURCE_PATHS);
        putResourcesInSet(resources, bundle, YamaicaEAConstants.FRAGMENT_RESOURCE_PATHS);

        return resources;
    }

    protected static void putResourcesInSet(Set<Resource> set, Bundle bundle, String path)
    {
        Resources resources = getResources(bundle, path);

        for (Resource resource : resources.resources)
        {
            set.add(resource);
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
