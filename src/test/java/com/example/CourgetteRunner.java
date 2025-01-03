package com.example;

import courgette.api.CourgetteOptions;
import courgette.api.RunLevel; // Ensure this import exists
import courgette.api.testng.TestNGCourgette;
import io.cucumber.testng.CucumberOptions;


@CourgetteOptions(
        threads = 4, // Number of parallel threads
        runLevel = CourgetteOptions.RunLevel.SCENARIO,
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
