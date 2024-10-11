package S_012_TestNG_POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
//without page factory 
public class P003_Page_object_Mode2 {
 
	WebDriver driver ; 
	
	//Constructor 
	P003_Page_object_Mode2 (WebDriver driver)
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
