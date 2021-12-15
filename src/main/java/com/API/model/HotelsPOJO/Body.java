package com.API.model.HotelsPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Body {
    private SearchResults searchResults;

    public Body(){}
    public Body(SearchResults searchResults) {
        this.searchResults = searchResults;
    }

    public SearchResults getSearchResults() {
        return searchResults;
    }
}
