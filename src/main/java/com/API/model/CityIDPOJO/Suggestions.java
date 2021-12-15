package com.API.model.CityIDPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Suggestions {
    private List<Entities> entities;

    public Suggestions(){}
    public Suggestions(List<Entities> entities) {
        this.entities = entities;
    }

    public List<Entities> getEntities() {
        return entities;
    }
}