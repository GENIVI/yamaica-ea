package de.bmw.yamaica.ea.core.resources;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import de.bmw.yamaica.ea.core.YamaicaEAConstants;

@XmlRootElement(name = YamaicaEAConstants.XML_RESOURCE_ELEMENT)
public class Resource
{
    @XmlAttribute(name = YamaicaEAConstants.XML_NAME_ATTRIBUTE, required = true)
    protected String name;

    @XmlAttribute(name = YamaicaEAConstants.XML_BUNDLE_ATTRIBUTE, required = true)
    protected String bundleId;

    @XmlAttribute(name = YamaicaEAConstants.XML_PATH_ATTRIBUTE, required = true)
    protected String path;

    public String getName()
    {
        return name;
    }

    public String getBundleId()
    {
        return bundleId;
    }

    public String getPath()
    {
        return path;
    }
}
