package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src\\test\\resources\\features\\Login.feature",
		//glue="src\\test\\java\\stepDefinitons",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:test-output"}
		)
public class runner {

}
