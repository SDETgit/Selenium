package S_012_TestNG_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//without page factory 
public class P001_no_Page_object_Model {
 
	WebDriver driver ; 
	
	//Constructor 
	P001_no_Page_object_Model (WebDriver driver)
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
