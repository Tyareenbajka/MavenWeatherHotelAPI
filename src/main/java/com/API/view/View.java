package com.API.view;

import com.API.controller.Controller;

import java.util.Scanner;

public class View {

    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press a key to get a destination along with the average temperature for the next seven days.");
        scan.nextLine();

        String information = controller.getTemperature();
        System.out.println("Average temperature for Stockholm: " + information + "\u2103");
    }
}
