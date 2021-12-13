package com.API.controller;

import com.API.model.RequestHandler;

public class Controller {

    RequestHandler request;

    public Controller() {
        this.request = new RequestHandler();
    }

    public String getTemperature(String destination) {
        return request.getWeatherInfo(destination);
    }
}
