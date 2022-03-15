package Runner;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(ExtendedCucumber.class)
@CucumberOptions(
		features = "C:\\Users\\abc\\eclipse-workspace\\Myntra\\src\\test\\java\\Cucumber\\Myntra\\Myntra.feature",
		glue  = "StepDefination",
		plugin = {"html:target/cucumber-report",
				"json:target/cucumber.json","pretty:target/cucumber-pretty.txt,com.avenstack.extentreports.cucumber.adpter.ExtentCucumberAdpter"})
public class TestRunner1 {

}
