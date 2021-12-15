package com.API.model.CityIDPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
    private List<Suggestions> suggestions;

    public City(){}
    public City(List<Suggestions> suggestions) {
        this.suggestions = suggestions;
    }

    public List<Suggestions> getSuggestions() {
        return suggestions;
    }
}