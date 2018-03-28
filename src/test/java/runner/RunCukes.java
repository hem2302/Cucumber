package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions (features = {"src/test/java/features"},
					glue = {"steps"},
					monochrome = true,
					tags = {"@many"}
					)
@RunWith(Cucumber.class)

public class RunCukes {
	
	

}
