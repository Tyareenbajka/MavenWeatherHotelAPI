package com.API.model;

public class DataCalculator {

    protected double calculateAverageTemperature(Weather weather){
        double tempSum = 0;
        for(Daily day : weather.getDaily()){
            Temp temp = day.getTemp();
            tempSum += temp.getMax() + temp.getMin();
        }
        return tempSum / 8.0;
    }
}
