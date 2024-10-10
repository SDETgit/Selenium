package S_005_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//TC2 
//
//1.Login 			@BeforeClass
//2.Search 			@Test
//4.Advance Search 	@Test
//5.Logout 			@AfterClass
public class T004_TestNG_Annotations_TC2 {
	
	@BeforeClass
	void login () {
		System.out.println("Login has been done");
	}
	
	@AfterClass
	void logout () {
		System.out.println("Logout has been done");
	}
	
	@Test(priority =-1)
	void search() {
		System.out.println("Search has been done");
	}
	
	@Test
	void adv_search () {
		System.out.println("Advance search has been done ");
	}
	 
}																					
