package stc.tv.valuelabs.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = {"./src/test/java/stc/tv/valuelabs/feature"}
 ,glue={"stc.tv.valuelabs.stepdefinition"}
		
 )
public class Testrunner {
	
	



	

	

}
