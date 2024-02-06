package automation.notion.ui.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty", "json:reports/cucumber.json", "junit:reports/cucumber.xml",
                "html:reports/cucumber-html-report.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = "automation.notion",
        features = "src/test/resources/features/"
)
public class RunnerTest extends AbstractTestNGCucumberTests {

}
