package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/dallasFeature"},
plugin = {"json:target/cucumber.json"},//he is responsible for generate HTML reports
glue = "dallasStepDefinitions")//tags = {""})

public class TestRunnerClass extends AbstractTestNGCucumberTests {

}
