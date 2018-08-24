package com.cg.TestingAssignment1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:HTMLFolderName/cucumber.html",},
		features= {"Features"},
		tags="@sanity,@regression,@smoke"
		)
public class AppTest {

}
