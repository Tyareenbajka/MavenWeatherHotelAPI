package com.API.controller;
import com.API.controller.Destination;
import com.API.controller.HotelFinder;

public class RequestHandler {

    private final Destination destination;
    private final HotelFinder cityID;

    public RequestHandler() {
        this.destination = new Destination();
        this.cityID = HotelFinder.getInstance();
    }

    public String getWeatherInfo(String destination) {
        return this.destination.getWeatherInfo(destination);
    }

    public String getHotelsInfo(String city) {
        return cityID.getApiData(city);
    }
}
