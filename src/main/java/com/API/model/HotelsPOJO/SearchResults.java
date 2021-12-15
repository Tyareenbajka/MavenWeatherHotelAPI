package com.API.model.HotelsPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class SearchResults {
    List<Results> results;

    public SearchResults(){}
    public SearchResults(List<Results> results) {
        this.results = results;
    }

    public List<Results> getResults() {
        return results;
    }
}
