package org.home_work6.service;

import org.home_work6.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
        controller.exit();
    }
}