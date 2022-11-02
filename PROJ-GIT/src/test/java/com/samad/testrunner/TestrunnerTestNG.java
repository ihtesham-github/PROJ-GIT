package com.samad.testrunner;

public class TestrunnerTestNG {
	@CucumberOptions (

			features = {"Features"},
			glue = {"stepdef"}			
			//tags= {"@sc2","@sc1"}
			)					
			public class TestRunner extends AbstractTestNGCucumberTests{}
}