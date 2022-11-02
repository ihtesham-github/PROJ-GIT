package com.samad.testrunner;

public @interface CucumberOptions {

	String[] features();

	String[] glue();

}
