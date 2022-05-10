package com.robinhoodsearch.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",
		glue="com.robinhoodsearch.steps"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
