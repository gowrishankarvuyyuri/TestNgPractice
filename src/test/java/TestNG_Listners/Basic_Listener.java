package TestNG_Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Basic_Listener implements ITestListener{
	
	public void onStart(ITestContext context) {
	    System.out.println("Before Test Starts");
	  }

	public void onTestStart(ITestResult result) {
		System.out.println("Test Starts");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	  }
	
	public void onFinish(ITestContext context) {
		    System.out.println("After Test Completes");
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
}
