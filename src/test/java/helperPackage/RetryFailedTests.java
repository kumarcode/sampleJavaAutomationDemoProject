package helperPackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RetryFailedTests {
	
	//This method will execute the failed test cases from the TestNG test output
	public void executeFailedTests()
	{
	TestNG runner = new TestNG();
	
	List<String> list = new ArrayList<String>();
	
	list.add("C:\\Users\\Kumar\\workspace\\SampleProject\\com.sampleAutomationFramework\\test-output\\Suite\\testng-failed.xml");
	
	runner.setTestSuites(list);
	
	runner.run();
	}


}
