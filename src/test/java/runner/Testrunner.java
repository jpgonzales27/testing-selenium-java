package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = ("seleniumgluecode")
)
public class Testrunner {

}
