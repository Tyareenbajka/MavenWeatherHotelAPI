package com.API.model.Handler;
import com.API.model.Destination;

import java.io.IOException;

public class RequestHandler {

    private final Destination destination;
    private final HotelFinder cityID;

    public RequestHandler() {
        this.destination = new Destination();
        this.cityID = new HotelFinder();
    }

    public String getWeatherInfo(String destination) {
        return this.destination.getWeatherInfo(destination);
    }

    public String getHotelsInfo(String city) {
        try {
            return cityID.getApiData(city);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return "!";
    }
}
