package com.testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(features="Features",glue={"com.testscriptdefention"},plugin={"json:target/cucumber.json"})
public class SampleRunnerTest extends AbstractTestNGCucumberTests {
	 
}


