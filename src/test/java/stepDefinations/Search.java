package stepDefinations;




import java.io.IOException;

import Cucumber_Automation.Baseclass;
import Pageobject.Homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//import io.cucumber.junit.Cucumber;

//@RunWith(Cucumber.class)
public class Search extends Baseclass{
	Homepage h;

		
    
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() throws IOException {
	  Baseclass.getDriver();

	  //driver.get("https://github.com/");
	}
	 @When("^User search for (.+) vegetables$")
	public void user_search_for_vegetables(String string) {
		h= new Homepage(driver);
		 //h= new Homepage(Hooks.getDriver());
		h.getlogin().sendKeys(string);
	}
	@Then("{string} results are displayed")
	public void results_are_displayed(String string) {
		
	}


}
