package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\sources\\login.feature",
glue= {"Hooks","com.Demo100"},monochrome=true,
plugin= {"pretty","html:target/CucumberReports/CucumberReport.html"})

public class TestRunner {

}
