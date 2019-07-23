package driver_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
 features="feature",
 glue= {"stepdefinition"}
 )
public class runner {
	private void syso() {
		// TODO Auto-generated method stub

	}

}
