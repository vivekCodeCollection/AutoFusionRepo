package output;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/GloAutomation/autofusionwebsample/src/test/resources/features/login.feature:6"},
        plugin = {"com.cucumber.weblistener.ExtentCucumberFormatter:D:/GloAutomation/autofusionwebsample/target/1"},
        monochrome = false,
        glue = {"com.sample.step"})
public class Parallel01IT extends AbstractTestNGCucumberTests {
}
