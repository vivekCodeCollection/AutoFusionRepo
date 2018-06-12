package output;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"D:/GloAutomation/autofusionwebsample/src/test/resources/features/login.feature:13"},
        plugin = {"com.cucumber.weblistener.ExtentCucumberFormatter:D:/GloAutomation/autofusionwebsample/target/2"},
        monochrome = false,
        glue = {"com.sample.step"})
public class Parallel02IT extends AbstractTestNGCucumberTests {
}
