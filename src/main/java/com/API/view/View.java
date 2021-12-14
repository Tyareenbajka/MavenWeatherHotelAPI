package com.API.view;

import com.API.controller.Controller;

import java.util.Scanner;

public class View {

    private final Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a city to get the average temperature for the next seven days.");
        String city = scan.nextLine();

        String information = controller.getTemperature(city);
        System.out.println("Average temperature for " + city + ": "+ information + "\u2103");

        String hotelsInfo = controller.getHotels(city);
        System.out.println(hotelsInfo);
    }
}
