package com.API.controller;

import com.API.model.WeatherPOJO.Daily;
import com.API.model.WeatherPOJO.Temp;
import com.API.model.WeatherPOJO.Weather;

public class DataCalculator {

    public double calculateAverageTemperature(Weather weather){
        double tempSum = 0;
        for(Daily day : weather.getDaily()){
            Temp temp = day.getTemp();
            tempSum += temp.getMax() + temp.getMin();
        }
        return tempSum / 8.0;
    }
}
