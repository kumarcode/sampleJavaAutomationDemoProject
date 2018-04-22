package cucumberStepDefinitionPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helperPackage.BrowserFactory;
import pagesPackage.HomePage;
import pagesPackage.LoginPage;

public class loginStepDefinition {
	
	//BrowserFactory browserObj;
	
	@Given("^I have launched the browser and entered the URL$")
	public void i_have_launched_the_browser_and_entered_the_URL() throws Throwable {
		//Initiate driver and launch url
		BrowserFactory.startBrowser("chrome");
	}

	@When("^I input valid username, password and click on Login button$")
	public void i_input_valid_username_password_and_click_on_Login_button() throws Throwable {
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();
				
		//perform login steps
		login_page.loginSteps();
	}

	@Then("^I should see the home page and validate with any of the button name on the home page$")
	public void i_should_see_the_home_page_and_validate_with_any_of_the_button_name_on_the_home_page() throws Throwable {
		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		home_page.validateHomePage();
		
		//quit the instance of driver
		BrowserFactory.driver.quit();
	}

}
