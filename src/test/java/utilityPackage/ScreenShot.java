package utilityPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNG;

public class ScreenShot {
	
	//Method to take screenshot and store in screenshot folder
	public static void captureScreenshot(WebDriver driver, String screenshotName)
	{
		try
		{
	        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./Screenshots/"+screenshotName+".png"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
