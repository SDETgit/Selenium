package S_006_TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//TC1 
//
//1.Login 			@BeforeMethod
//2.Search 			@Test
//3.Logout 			@AfterMethod
//4.Login
//5.Advance Search 	@Test
//6.Logout
public class T001_TestNG_Annotations_TC1 {
	
	@BeforeTest
	void bt () {
		System.out.println("This is a before test method");
	}
	

	
	@Test(priority =-1)
	void abc() {
		System.out.println("This is abc from TC1");
	}
	@AfterTest
	void AT () {
		System.out.println("This is a aftertest method");
	}

}																					
