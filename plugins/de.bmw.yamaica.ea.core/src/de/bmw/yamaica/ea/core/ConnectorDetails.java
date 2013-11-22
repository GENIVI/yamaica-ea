package de.bmw.yamaica.ea.core;

import xmei.EaTypesType;
import xmei.StereotypeType;

public class ConnectorDetails
{

    private String         connectorId;
    private StereotypeType connectorStereotype;
    private EaTypesType    connectorType;
    private String         startId;
    private int            startLocalId;
    private String         endId;
    private int            endLocalId;

    public String getConnectorId()
    {
        return connectorId;
    }

    public void setConnectorId(String connectorId)
    {
        this.connectorId = connectorId;
    }

    public StereotypeType getConnectorStereotype()
    {
        return connectorStereotype;
    }

    public void setConnectorStereotype(StereotypeType connectorStereotype)
    {
        this.connectorStereotype = connectorStereotype;
    }

    public EaTypesType getConnectorType()
    {
        return connectorType;
    }

    public void setConnectorType(EaTypesType connectorType)
    {
        this.connectorType = connectorType;
    }

    public String getStartId()
    {
        return startId;
    }

    public void setStartId(String startId)
    {
        this.startId = startId;
    }

    public String getEndId()
    {
        return endId;
    }

    public void setEndId(String endId)
    {
        this.endId = endId;
    }

    public int getStartLocalId()
    {
        return startLocalId;
    }

    public void setStartLocalId(int startLocalId)
    {
        this.startLocalId = startLocalId;
    }

    public int getEndLocalId()
    {
        return endLocalId;
    }

    public void setEndLocalId(int endLocalId)
    {
        this.endLocalId = endLocalId;
    }

}
