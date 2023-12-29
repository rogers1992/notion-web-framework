package automation.notion.ui.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = "automation.notion",
        features = "src/test/resources/features/"
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
