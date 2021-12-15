package com.API.model.CityIDPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Entities {
    private DestinationId destinationId;

    public Entities(){}
    public Entities(DestinationId destinationId) {
        this.destinationId = destinationId;
    }

    public DestinationId getDestinationId() {
        return destinationId;
    }
}