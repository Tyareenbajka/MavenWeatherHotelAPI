package com.API.model;

public class RequestHandler {

    Destination destination;

    public RequestHandler() {
        this.destination = new Destination();
    }

    public String getWeatherInfo() {
        String destinationInfo = destination.getWeatherInfo("Stockholm");
        return destinationInfo;
    }
}
