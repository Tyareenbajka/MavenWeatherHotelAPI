package com.API.view;

import com.API.controller.Controller;

public class Application {
    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View(controller);

        view.start();
    }
}
