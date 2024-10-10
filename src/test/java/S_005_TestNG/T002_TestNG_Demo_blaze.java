package S_005_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
1. Open application  
2. Test logo presence 
3. login
4. close  
*/
public class T002_TestNG_Demo_blaze {
	WebDriver driver;
	@Test (priority =1)
	void openapp() {
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		System.out.println("Open app ");
	}
	
	  @Test(priority =2) 
	  void logo () { WebElement logo =
	  driver.findElement(By.xpath("//*[@id=\"nava\"]/img")); Boolean flag =
	  logo.isDisplayed(); if(!flag) { System.out.println("Flag is displayed "); }
	  else { System.out.println("Flag is not displayed "); } }
	  
	  @Test(priority =3) void login() { System.out.println("Login is done ");
	  
	  }
	  
	  @Test(priority =4) void close() { //driver.close();
	  System.out.println("driver is closed "); }
	 
}																					
