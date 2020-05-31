

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "classpath:features"
		,glue={"common","stepDefinations"},
		format = {"pretty","html:target/html/","json:target/cucumber.json"},
		plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"},
		tags =   {"@tag1"}
		)
public class RunCukesTest extends AbstractTestNGCucumberTests {

}

