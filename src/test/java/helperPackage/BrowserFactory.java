package helperPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;

import utilityPackage.ConfigReader;


public class BrowserFactory {
	
	//Global driver
	public static WebDriver driver;
	
	//@Parameters("browserName")
	//A custom method to choose the browser on which the test need to be executed
	public static void startBrowser(String browserName)
	{
		//choose Firefox browser
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		//choose Chrome browser
		else if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromePath());
			driver = new ChromeDriver();
		}
		//choose IE browser
		else if (browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.chrome.driver", ConfigReader.getChromePath());
			driver = new InternetExplorerDriver();
		}
		//choose Headless browser
		if (browserName.equalsIgnoreCase("headless"))
		{
			driver = new HtmlUnitDriver();
		}
		
		//maximize browser
		driver.manage().window().maximize();
		
		//launch the url
		driver.get(ConfigReader.getURL());
				
	}

}
