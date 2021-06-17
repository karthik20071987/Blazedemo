package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/test/resources/features",
		glue = "stepdefinitions",
		tags = "@Regression",
		plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"}
)

public class TestRunner {

}