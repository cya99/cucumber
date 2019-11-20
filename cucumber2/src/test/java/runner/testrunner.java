package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\demo4.feature",glue= {"cucumber1"},plugin={"html:target/cucumber1.html"},tags= {"@RegressionTest","~@SmokeTest"})
public class testrunner {
	

}
