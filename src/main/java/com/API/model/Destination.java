package com.API.model;

public class Destination {

    CapitalCityData citydata;
    DataCalculator calculator;
    WeatherAPI weatherAPI;


    public Destination() {
        this.citydata = new CapitalCityData();
        this.calculator = new DataCalculator();
        this.weatherAPI = new WeatherAPI();
    }

    public String getWeatherInfo(String destination) {
        String citydata = this.citydata.getCityData(destination);
        Weather weather = weatherAPI.callWeatherAPI(citydata);
        double data = this.calculator.calculateAverageTemperature(weather);
        return String.format("%.1f", data);
    }
}
