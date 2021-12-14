package com.API.model.Hotel.CityIDPOJO;

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