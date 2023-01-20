package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/Location.feature",
        glue={"stepDefinitions"},
        		plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml"},
        monochrome=true, tags=(""))
public class TestRunner extends AbstractTestNGCucumberTests {
}

