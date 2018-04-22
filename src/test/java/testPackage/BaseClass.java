package testPackage;

import java.io.File;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import helperPackage.BrowserFactory;
import utilityPackage.ConfigReader;

public class BaseClass {
	
	ExtentReports reports;
	ExtentTest testLog;
	ExtentHtmlReporter htmlReporter;
	
	@BeforeTest
	public void testInit()
	{
		htmlReporter = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/test-output/MyExtentReport.html"));
		htmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
		reports = new ExtentReports();
		
		reports.setSystemInfo("Environment", "QA");
		reports.setSystemInfo("Application", "QA Application");
		reports.setSystemInfo("Regression", "On Test Environment");
		reports.attachReporter(htmlReporter);


	}
	
	@BeforeMethod
	public void setUpTest(Method method)
	{
		String testName = method.getName();
		testLog = reports.createTest(testName);
		//Initiate driver
		BrowserFactory.startBrowser("chrome");
	}
	
	@AfterMethod
	public void tearDownTest(ITestResult result)
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			testLog.log(Status.PASS, "Test passed");
		}else if(result.getStatus()==ITestResult.FAILURE)
		{
			testLog.log(Status.FAIL, "Test failed");
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			testLog.log(Status.SKIP, "Test skipped");
		}
	
		//quit the instance of driver
		BrowserFactory.driver.quit();
	}
	
	@AfterTest
	public void clearUp()
	{
		reports.flush();
	}

}
