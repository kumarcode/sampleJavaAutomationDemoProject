package testPackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helperPackage.BrowserFactory;
import pagesPackage.HomePage;
import pagesPackage.LoginPage;
import utilityPackage.ConfigReader;

public class TestClass extends BaseClass {
	
	
	//A simple test case to check if user is able to login successfully
	@Test(description = "Test to validate the login feature")
	public void loginTest()
	{		
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();
		
		//perform login steps
		login_page.loginSteps();
		
		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		
		home_page.validateHomePage();
	}
	
	/*@Test(description = "Duplicate Test to validate the login feature")
	public void loginTestDuplicate()
	{		
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();
		
		//perform login steps
		login_page.loginSteps();
		
		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		
		home_page.validateHomePage();
	}*/
	

}
