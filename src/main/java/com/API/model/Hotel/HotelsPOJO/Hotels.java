package com.API.model.Hotel.HotelsPOJO;

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
