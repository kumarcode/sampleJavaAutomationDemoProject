package testPackage;

import org.junit.After;
import org.junit.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import helperPackage.BrowserFactory;
import utilityPackage.ConfigReader;

public class BaseClass {
	
	@BeforeMethod
	public void setUpTest()
	{
		
		//Initiate driver
		BrowserFactory.startBrowser("chrome");
	}
	
	@AfterMethod
	public void tearDownTest()
	{
		//quit the instance of driver
		BrowserFactory.driver.quit();
	}

}
