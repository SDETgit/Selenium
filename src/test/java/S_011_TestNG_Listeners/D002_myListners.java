package S_011_TestNG_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class D002_myListners implements ITestListener {
	
	public void onStart(ITestContext context) {
		 System.out.println("Test execution started ");
		  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test execution after every method of test");
	  }
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("Test execution success");
		  }
	 public void onTestFailure(ITestResult result) {
		    System.out.println("Test execution failed");
		  }
	 public void onTestSkipped(ITestResult result) {
		    System.out.println("Test execution skipped");
		  }
	 public void onFinish(ITestContext context) {
		    System.out.println("Test execution finished");
		  }

}
