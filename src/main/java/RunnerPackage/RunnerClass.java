package RunnerPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:/Karthikeyan/Automation/Projects/CucumberTraining/src/main/java/Feature/placeOrder.feature" //define the locaiton of feature file, we can give mulitple location by comma ,
,glue={"stepDefinitions"} 	// locate the path of step definition file, here i have mentioned the package name.
,dryRun=true	 // Verify the mapping between feature file and steps in step definition file	
,plugin={"pretty","html:test-outout"}//"junit:junit_output/cucumber.xml"} // Used to generate different reportx like html,json and XML
,monochrome=true // Used for generate console output in readable format
,strict=true //It will check if any steps are missing in step definition
)
	
public class RunnerClass {}


