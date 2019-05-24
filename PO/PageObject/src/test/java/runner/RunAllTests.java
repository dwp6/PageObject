package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"stepDef"},
        plugin = {"pretty"},
        format = {"html:target/cucumber-reports", "json:target/json/cucumber.json"},
        tags = {"@allTests"},
        monochrome = true
)
public class RunAllTests {
}

