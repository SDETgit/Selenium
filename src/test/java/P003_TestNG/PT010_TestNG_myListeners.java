package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft assertions do not through errors 
public class PT010_TestNG_myListeners  implements ITestListener {
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
 