package utilityPackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

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
