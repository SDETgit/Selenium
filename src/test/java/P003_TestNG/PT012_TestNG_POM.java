package P003_TestNG;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//Soft assertions do not through errors 
public class PT012_TestNG_POM   {
WebDriver driver ; 
	
	//Constructor 
	 PT012_TestNG_POM (WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators 

By Username= 	By.xpath("//input[@placeholder='Username']");
By password = 	By.xpath("//input[@placeholder='Password']");
By Login = 	By.xpath("//button[normalize-space()='Login']");
	
	
	//Action methods 
public void setUsername(String user) {
	driver.findElement(Username).sendKeys(user);
}


public void setpassword(String pwd) {
	driver.findElement(password).sendKeys(pwd);
}


public void ClickLogin() {
	driver.findElement(Login).click();
}
	
	
}
 