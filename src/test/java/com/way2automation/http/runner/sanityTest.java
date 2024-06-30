package com.way2automation.http.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", // path of features package
        glue = "com/way2automation/http/steps",  // path of steps package
        plugin = {"html:target/cucumber-reports/cucumber.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",// path of html report   // extent report website
        "json:target/cucumber-reports/cucumber.json"},
        tags = "@sanity"

)
public class sanityTest extends AbstractTestNGCucumberTests {

}
