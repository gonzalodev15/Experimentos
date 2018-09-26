package pe.com.core.test.integration.suit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources",
		glue = {"pe.com.core.test.integration.test"},
		plugin = {
				"pretty",
				"html:target/cucumber",
				"json:target/cucumber.json",
				"json:target/cucumber_junit_report.xml"
		}
	)
public class VisorIntegrationSuite {

}
