package S_006_TestNG2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//TC2 
//
//1.Login 			@BeforeClass
//2.Search 			@Test
//4.Advance Search 	@Test
//5.Logout 			@AfterClass
public class T002_TestNG_Annotations_TC2 {
	
	@BeforeTest
	void bt () {
		System.out.println("This is a before test method");
	}
	@AfterTest
	void AT () {
		System.out.println("This is a aftertest method");
	}
	
	
	
	@Test(priority =-1)
	void xyz() {
		System.out.println("This is xyz from TC2");
	}
	
	
	 
}																					
