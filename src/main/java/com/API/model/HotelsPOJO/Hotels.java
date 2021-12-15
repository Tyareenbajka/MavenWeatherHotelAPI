package com.API.model.HotelsPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Hotels {
    private Data data;

    public Hotels(){}

    public Hotels(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }
}
