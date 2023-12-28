package api.stepDef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"api.stepDef"},
        features = ("src/test/resources/api"),
        plugin = {"pretty","html:reports/api.html", "json:reports/api.json"}
)

public class ApiTestRunner { }
