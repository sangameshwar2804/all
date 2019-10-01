package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Training\\eclipse-workspace\\CucumberClass\\resources\\Features\\LoginSmoke.feature"},
glue= {"com.stepdefinitions"},dryRun=false)
public class RunCukeTest {

}
