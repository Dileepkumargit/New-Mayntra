package StepDefination;
import static StepDefination.hooks.driver;

import POM.Homepage;
import POM.myntraLoginpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Myntra {
	
	
	myntraLoginpage hp = new myntraLoginpage();
	Homepage homepage = new Homepage();
	
	 @Given("^Go to The myntra website$")
	    public void go_to_the_myntra_website() throws Throwable {
	       driver.get("http://www.myntra.com");
	       
	    }
	 
	 @And("^Click on the login$")
	    public void click_on_the_login() throws Throwable {
		 	hp.clickOnLogin();
		 	
	    }
	 
	 @When("^Enter the Login Credentials$")
	    public void enter_the_login_credentials() throws Throwable {
		  hp.enterTheLoginDetails();
	    }
	 
	 @And("^Click on the Login button$")
	    public void click_on_the_login_button() throws Throwable {
	       hp.clickOnTheLoginButton();
	    }
	  @Given("^search for the iteam \"([^\"]*)\"$")
	    public void search_for_the_iteam_something(String strArg1) throws Throwable {
	       homepage.searchForShirts();
	    }

	    @And("^select any random iteam$")
	    public void select_any_random_iteam() throws Throwable {
	    	 homepage.selectRadomPickAndgetthedetails();
	    	 homepage.windowhadle();
	    }

}
