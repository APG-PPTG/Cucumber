package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = {"Features"}, //Name of the Feature folder
		//features = "D:\\2023Selenium\\CucumberProject\\Features\\Tagging.feature",
		features = "D:\\2023Selenium\\CucumberProject\\Features\\Hooks.feature",
		glue={"stepDefinitions"}, //Name of Step Def folder
		format= {"pretty", "html:test-output","json:json_output/cucumber.json", "junit:junit_xml_output/cucumber.xml"},
		dryRun= false,
		monochrome=true,
		strict=	false
		//tags= {"@SanityTest"} //Only Sanity tests will execute
	    //tags=	{"@SanityTest", "@End2EndTest"}
		// tags= {"@SanityTest", "@End2EndTest"} //Sanity and Regression both tags
		// tags = {"@SanityTest, @End2EndTest"} // Sanity or regression
		//tags = {"~@End2EndTest"}, //Ignore E2E Tests
		//tags = {"~@End2EndTest", "~@SanityTest"}
		)
		
public class TestRunner {
	

}