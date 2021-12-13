package com.API.controller;

import com.API.model.Handler.RequestHandler;

public class Controller {

    private final RequestHandler request;

    public Controller() {
        this.request = new RequestHandler();
    }

    public String getTemperature(String destination) {
        return request.getWeatherInfo(destination);
    }

    public String getHotels(String city){
        return request.getHotelsInfo(city);
    }
}
