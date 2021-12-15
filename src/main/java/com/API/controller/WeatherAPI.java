package com.API.controller;

import com.API.model.WeatherPOJO.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WeatherAPI implements apiCaller<Weather> {

    private Weather weather;
    private static WeatherAPI instance;

    private WeatherAPI() {
    }

    @Override
    public Weather getApiData(String destination) {
        String units = "&units=metric&";
        String apiKey = "appid=7e8cb3086564753cb1c05a9a0477a2a8";
        String url = "https://api.openweathermap.org/data/2.5/onecall?" + destination + units + apiKey;

        try{
            ObjectMapper objectMapper = new ObjectMapper();
            URL apiSite = new URL(url);
            URLConnection apiConnection = apiSite.openConnection();
            BufferedReader readData = new BufferedReader(new InputStreamReader(apiConnection.getInputStream()));

            this.weather = objectMapper.readValue(readData, Weather.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return weather;
    }

    public static WeatherAPI getInstance() {
        if (instance == null) {
            instance = new WeatherAPI();
        }
        return instance;
    }
}
