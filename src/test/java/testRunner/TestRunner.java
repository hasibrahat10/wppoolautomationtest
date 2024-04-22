package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = "@login",
        glue = "steps",
        plugin = {"pretty", "html:test-output"}
)

public class TestRunner {
}
