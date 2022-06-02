package Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resourses/features", glue = {"StepDefinition"}, 
plugin = {"pretty", "html:target/htmlReports/report.html",
		"json:target/jsonReports/report.json",
		"junit:target/junitReports/report.xml"},monochrome = true
)
public class Runner {
	
	

}
