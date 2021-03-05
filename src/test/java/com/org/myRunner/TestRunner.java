package com.org.myRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "C:\\Users\\TOSHIBA\\eclipse-workspace\\vishalcucumber\\src\\main\\java\\com\\org\\feature\\login.feature",
		glue= {"stepDefination"},
		
		format= {"pretty","html:test-output"},
		
		monochrome=true,
		strict=true,
		dryRun=false
		
		)





public class TestRunner {
	
	//wqedfrtghyjukl

}
	