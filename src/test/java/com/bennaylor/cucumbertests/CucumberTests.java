package com.bennaylor.cucumbertests;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features", 
				     glue="com.bennaylor.cucumbertests.stepDefinitions")

public class CucumberTests {

}
