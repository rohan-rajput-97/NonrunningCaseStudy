package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"MyFeatures"},glue={"TestDefination"},tags= {"@Regression, @Smoke"})
public class Runnersss {

}
