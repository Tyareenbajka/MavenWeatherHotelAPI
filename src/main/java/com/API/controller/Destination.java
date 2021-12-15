package com.API.controller;

import com.API.model.WeatherPOJO.CapitalCityData;
import com.API.model.WeatherPOJO.Weather;

public class Destination {

    private final CapitalCityData citydata;
    private final DataCalculator calculator;
    private final WeatherAPI weatherAPI;

    public Destination() {
        this.citydata = new CapitalCityData();
        this.calculator = new DataCalculator();
        this.weatherAPI = WeatherAPI.getInstance();
    }

    public String getWeatherInfo(String destination) {
        String citydata = this.citydata.getCityData(destination);
        Weather weather = weatherAPI.getApiData(citydata);
        double data = this.calculator.calculateAverageTemperature(weather);
        return String.format("%.1f", data);
    }


}
