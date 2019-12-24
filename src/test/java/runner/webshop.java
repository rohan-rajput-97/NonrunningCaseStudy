package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\CucumberProject\\MyFeatures\\webshop.feature"},glue={"TestDefination"})
public class webshop {

}
