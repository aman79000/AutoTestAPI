package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( plugin = {"rerun:target/rerun.txt","pretty","html:target/cucumber-html-report.html"},
features = "src/test/features",
glue = "org.example.stepdefination",
monochrome = true)


public class TestRunner extends AbstractTestNGCucumberTests {
}
