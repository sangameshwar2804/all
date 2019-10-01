package com.bdd.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\Training\\eclipse-workspace\\Cucumber\\resouces\\features" }, glue = {
		"com.stepdefinition" }, tags = { "@loginwithinvalid"}, dryRun = false)
public class RunCukeTest {

}
