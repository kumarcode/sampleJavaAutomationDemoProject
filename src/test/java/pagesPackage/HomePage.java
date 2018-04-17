package pagesPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helperPackage.BrowserFactory;

public class HomePage {
	
	//POM constructor
	public HomePage()
	{
		PageFactory.initElements(BrowserFactory.driver, this);
	}
	
	//Add new Job button
	@FindBy(how = How.ID, using = "addnewjob")
	static WebElement addJobButton;
	
	//Method to check if home page is displayed
	public void validateHomePage()
	{
		//Verification
		BrowserFactory.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		boolean verifyMsg = addJobButton.isDisplayed();
		
		if(verifyMsg == true)
		{
			System.out.println("Test Pass, login successful");
		}
		else
		{
			System.out.println("Test Fail, login failed");

		}
	}



}
