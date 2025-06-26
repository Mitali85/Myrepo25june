package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = {"D:\\Cucumber\\hrm\\Features\\AddEducation.feature"}   , glue = {"StepDefinition"}  ,
					dryRun = false , monochrome = true , plugin = {"pretty"})

public class TestRunner 
{
	
	

}
