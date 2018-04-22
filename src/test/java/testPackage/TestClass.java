package testPackage;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

import helperPackage.BrowserFactory;
import pagesPackage.HomePage;
import pagesPackage.LoginPage;
import utilityPackage.ConfigReader;

public class TestClass extends BaseClass {
	
	
	//A simple test case to check if user is able to login successfully
	@Test(description = "Test to validate the login feature")
	public void loginTest()
	{		
		testLog.log(Status.INFO, "Login test started");
		SoftAssert softAssert = new SoftAssert();
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();
		testLog.log(Status.INFO, "Logged in successully");

		//perform login steps
		login_page.loginSteps();
		softAssert.assertEquals(true, true, "Test failed after launching url");
		
		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		home_page.validateHomePage();
		softAssert.assertEquals(true, true);		
		testLog.log(Status.PASS, "Login test Passed");

		
		softAssert.assertAll();
		
	}
	
	@Test(description = "Test2 to validate the login feature")
	public void loginTest2()
	{		
		
		SoftAssert softAssert = new SoftAssert();
		//Initiate PO for login page
		LoginPage login_page = new LoginPage();

		//perform login steps
		login_page.loginSteps();
		softAssert.assertEquals(true, true, "Test failed after launching url");
		
		//Initiate PO for home page and validate
		HomePage home_page = new HomePage();
		home_page.validateHomePage();
		softAssert.assertEquals(true, true);		
		
		softAssert.assertAll();
		
	}

}
