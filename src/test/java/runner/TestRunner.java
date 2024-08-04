package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features/"},
        glue = "stepdefs",
        plugin = {"json:target/cucumber.json", "html:target/cucumber-reports"}
)
public class TestRunner {
}
