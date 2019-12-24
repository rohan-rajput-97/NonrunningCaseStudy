package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\PDC3B-Training.PDC3B\\eclipse\\Rohan-workspace\\CucumberProject\\MyFeatures\\caseStudy.feature"},glue={"casestudy"},tags={"@CaseStudy4"})
public class RunnerCaseStudy {

}
