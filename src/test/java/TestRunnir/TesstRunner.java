package TestRunnir;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "StepDefination")

//tags= {""})

public class TesstRunner extends AbstractTestNGCucumberTests {

}
