package com.org.myRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\main\\java\\com\\org\\feature",
		glue= {"step"
				+ "Defination"},
		
		format= {"pretty","html:test-output"},
		
		monochrome=true,
		strict=true,
		dryRun=false
		
		)





public class TestRunner {
	
	//wqedfrtghyjukl

}
	