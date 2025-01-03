package com.example.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestHooks {

    @Before
    public void beforeScenario() {
        System.out.println("Executing before the scenario");
    }

    @After
    public void afterScenario() {
        System.out.println("Executing after the scenario");
    }
}
