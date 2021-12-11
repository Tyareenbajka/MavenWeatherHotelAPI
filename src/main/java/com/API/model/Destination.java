package com.API.model;

public class Destination {

    DataCalculator calculator;
    WeatherAPI weatherAPI;
    Weather weather;

    public Destination() {
        this.calculator = new DataCalculator();
        this.weatherAPI = new WeatherAPI();
    }

    public String getWeatherInfo(String destination) {
        this.weather = weatherAPI.callWeatherAPI(destination);
        double data = this.calculator.calculateAverageTemperature(weather);
        return String.format("%.1f", data);
    }
}
