package com.example;

import courgette.api.CourgetteOptions;
import courgette.api.Level; 
import courgette.api.testng.TestNGCourgette;
import io.cucumber.testng.CucumberOptions;

@CourgetteOptions(
        threads = 4, 
        level = Level.SCENARIO,
        rerunFailedScenarios = true,
        showTestOutput = true,
        cucumberOptions = @CucumberOptions(
                features = "src/test/resources/features",
                glue = {"com.example", "com.example.hooks"},
                plugin = {
                        "pretty",
                        "html:target/cucumber-html-report",
                        "json:target/cucumber.json"
                }
        )
)
public class CourgetteRunner extends TestNGCourgette {
}
