package cucumberTest.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber"},
        features = {"src/test/resources/cucumberFeatures"},
        extraGlue = {"cucumberTest.steps"}
)

public class RunnerTest {
}
