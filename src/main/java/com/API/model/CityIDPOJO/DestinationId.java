package com.API.model.CityIDPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class DestinationId {
    private String destinationId;

    public DestinationId(){}
    public DestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationId() {
        return destinationId;
    }
}
