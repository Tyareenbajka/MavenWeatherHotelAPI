package com.API.model;

public class RequestHandler {

    Destination destination;

    public RequestHandler() {
        this.destination = new Destination();
    }

    public String getWeatherInfo(String destination) {
        return this.destination.getWeatherInfo(destination);
    }
}
