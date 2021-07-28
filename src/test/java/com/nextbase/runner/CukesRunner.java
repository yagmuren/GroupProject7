package com.nextbase.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/nextbase/step_definitions",
        features = "src/test/resources/features",
        dryRun = false,
        plugin = {
                "html: target/cucumber-report.html",
                "json: cucumber.json",
                "rerun:target/rerun.txt "},
        tags = "@sample"
)

public class CukesRunner {
}
