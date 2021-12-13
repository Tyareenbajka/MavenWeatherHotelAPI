package com.API.model;

import java.util.HashMap;

public class CapitalCityData {

    HashMap<String,String> citydata;

    public CapitalCityData() {
        citydata = new HashMap<>();
        generateCityData();
    }

    private void generateCityData() {
        latAndLong("stockholm", "59.329323", "18.068581");
        latAndLong("oslo","59.913868", "10.752245");
    }

    private void latAndLong(String city, String latitude, String longitude) {
        citydata.put(city, "lat=" + latitude + "&lon=" + longitude);
    }

    protected String getCityData(String destination) {
        return citydata.get(destination);
    }
}
