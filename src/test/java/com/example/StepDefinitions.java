package com.example;

import io.cucumber.java.en.Given;

public class StepDefinitions {

    @Given("The application is launched")
    public void applicationLaunched() {
        System.out.println("Application is launched!");
    }
}
