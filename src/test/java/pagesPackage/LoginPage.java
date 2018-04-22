package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helperPackage.BrowserFactory;
import utilityPackage.ConfigReader;
import utilityPackage.ExcelDataConfig;
import utilityPackage.ScreenShot;

public class LoginPage {
	//BrowserFactory browserObj;	
	//driver constructor for the page
	public LoginPage()
	{
		//browserObj = new BrowserFactory();
		PageFactory.initElements(BrowserFactory.driver, this);
	}
	
	//Username definition
	@FindBy(how = How.ID, using = "UserName")
	@CacheLookup
	static WebElement Username;
	
	//Password definition
	@FindBy(how = How.ID, using = "Password")
	@CacheLookup
	static WebElement Password;
	
	//Login button definition
	@FindBy(how = How.XPATH, using ="//*[@id=\"loginForm\"]/form/div[3]/input[1]")
	@CacheLookup
	static WebElement LoginButton;
	
	//Method to perform login actions
	public void loginSteps()
	{
		
		ExcelDataConfig excel = new ExcelDataConfig("./TestData/TestData.xlsx");
		
		//Send Value to the UserName textBox
		Username.sendKeys(excel.getData("Login", 1, 0));
		System.out.println("Entered Username");
					
		//Send value to the password textBox
		Password.sendKeys(excel.getData("Login", 1, 1));
		System.out.println("Entered Password");
			
		//Click on Save Button
		LoginButton.click();
		System.out.println("Clicked on Login button");
		
		//take screenshot
		ScreenShot.captureScreenshot(BrowserFactory.driver, "Login");
	}
	
	

}
