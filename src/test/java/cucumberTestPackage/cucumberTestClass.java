package cucumberTestPackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cucumber Feature Files",glue={"cucumberStepDefinitionPackage"})
public class cucumberTestClass {

}
