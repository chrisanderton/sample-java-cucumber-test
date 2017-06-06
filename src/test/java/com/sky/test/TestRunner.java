package com.sky.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

System.setProperty("webdriver.chrome.driver", "/app/.apt/usr/bin/google-chrome");

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/first.feature" }, glue = {
		"com.sky.test.stepDefinitions" }, tags = { "@test" })
public class TestRunner {
}
