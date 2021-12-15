package com.API.model.HotelsPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Data {
    private Body body;
    public Data(){}

    public Data(Body body) {
        this.body = body;
    }

    public Body getBody() {
        return body;
    }
}
