package raihan.selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"raihan.selenium.stepDef"},
        features = ("src/test/resources/selenium"),
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
)

public class CucumberRunner { }
