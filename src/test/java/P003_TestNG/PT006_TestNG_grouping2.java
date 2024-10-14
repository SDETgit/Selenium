package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft assertions do not through errors 
public class PT006_TestNG_grouping2 {
	
	//Depends on methods 
	@Test
	void launch() {
		System.out.println("Browser is launched p2 ");
	}
	
	@Test  (dependsOnMethods = {"launch"}, groups = {"Sanity","Regression"})
	void login() {
		System.out.println("Website is logged indsfs  ");
		
	}
	
	@Test (dependsOnMethods = {"login","launch"}, groups = {"Regression"})
	void validate() {
		System.out.println("Validation in progress ");
		
	}
	
	@Test (dependsOnMethods = {"login","launch","validate"}, groups = {"Regression"})
	void close() {
		System.out.println("Browser tear down ");
	}
	
}
 