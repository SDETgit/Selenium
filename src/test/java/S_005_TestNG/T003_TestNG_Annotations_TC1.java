package S_005_TestNG;

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
public class T003_TestNG_Annotations_TC1 {
	@BeforeTest
	void bt () {
		System.out.println("This is a before test method");
	}
	
	@BeforeMethod
	void login () {
		System.out.println("Login has been done");
	}
	
	@AfterMethod
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
	@AfterTest
	void At () {
		System.out.println("This is a after test method");
	}
}																					
