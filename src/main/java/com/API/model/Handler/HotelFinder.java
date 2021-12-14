package com.API.model.Handler;

import com.API.model.Hotel.CityIDPOJO.City;
import com.API.model.Hotel.HotelsPOJO.Hotels;
import com.API.model.Hotel.HotelsPOJO.Results;
import com.API.model.apiCaller;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HotelFinder implements apiCaller<String> {

    @Override
    public String getApiData(String destination) throws IOException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://hotels4.p.rapidapi.com/locations/v2/search?query=" + destination))
                .header("x-rapidapi-host", "hotels4.p.rapidapi.com")
                .header("x-rapidapi-key", "04be855e8fmsh2bf8f6d108d6f4ep13597ajsndd6e172f9b02")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        City city1 = objectMapper.readValue(response.body(), City.class);
        String cityID = city1.getSuggestions().get(0).getEntities().get(0).getDestinationId().getDestinationId();

        request = HttpRequest.newBuilder()
                .uri(URI.create("https://hotels4.p.rapidapi.com/properties/list?destinationId=" + cityID + "&pageNumber=1&pageSize=25&checkIn=2020-01-08&checkOut=2020-01-15&adults1=1&sortOrder=PRICE&locale=en_US&currency=USD"))
                .header("x-rapidapi-host", "hotels4.p.rapidapi.com")
                .header("x-rapidapi-key", "04be855e8fmsh2bf8f6d108d6f4ep13597ajsndd6e172f9b02")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

        Hotels hotels = objectMapper.readValue(response.body(),Hotels.class);
        StringBuilder listOfHotels = new StringBuilder();
        for (Results r: hotels.getData().getBody().getSearchResults().getResults()) {
            listOfHotels.append(r.getName()).append("\n");
        }
        return listOfHotels.toString();
    }
}