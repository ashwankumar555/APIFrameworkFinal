package cucumber.Options;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
        features = "src/test/java/features",
        plugin = "json:target/jsonReports/cucumber-report.json",
        glue = {"stepDefinations"}
       // tags = "@DeletePlace"  // no curly braces needed unless multiple tags
)
public class TestRunner {

}
