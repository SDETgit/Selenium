package P003_TestNG;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
//Soft assertions do not through errors 
public class PT013_TestNG_POM_pagefactory   {
WebDriver driver ; 
	
	//Constructor 
PT013_TestNG_POM_pagefactory (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators 
	@FindBy(how=  How.XPATH, using= "//input[@placeholder='Username']" ) WebElement Username2;
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement Username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement Login;
	@FindBy(tagName = "a") List<WebElement> links ;  //Group of webelement 
	
	//Action methods 
public void setUsername(String user) {
	Username.sendKeys(user);
}


public void setpassword(String pwd) {
	password.sendKeys(pwd);
}


public void ClickLogin() {
	Login.click();
}
	
	
}
 