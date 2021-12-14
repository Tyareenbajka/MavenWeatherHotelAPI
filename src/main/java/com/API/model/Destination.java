package com.API.model;

public class Destination {

    private final CapitalCityData citydata;
    private final DataCalculator calculator;
    private final WeatherAPI weatherAPI;

    public Destination() {
        this.citydata = new CapitalCityData();
        this.calculator = new DataCalculator();
        this.weatherAPI = new WeatherAPI();
    }

    public String getWeatherInfo(String destination) {
        String citydata = this.citydata.getCityData(destination);
        Weather weather = weatherAPI.getApiData(citydata);
        double data = this.calculator.calculateAverageTemperature(weather);
        return String.format("%.1f", data);
    }
}
