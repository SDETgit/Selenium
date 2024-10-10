package S_010_Data_providers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D001_Data_providers {
	WebDriver driver; 
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test (dataProvider = "dp")
	void testLogin(String email, String password) throws InterruptedException {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
	boolean logout = 	driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")).isDisplayed();
	System.out.println(logout);
	
	if(logout)
	{
		Assert.assertTrue( true);
	}
	
	else 
		{
		Assert.fail();
		}
		
	}


	@AfterClass
	void teardown() {
	 System.out.println();
	 driver.close();
 }
	
	@DataProvider(name = "dp" , indices = {0,1})
	Object[][] login_Data()
	{
		Object data[][]= {  {"abc@gmail.com", "test123"},
				{"sitaro7199@craftapk.com", "test012"},
				{"john@gmail.com", "test@123"},
				{"pavanol123@gmail.com", "test@123"},
				{"johncanedy@gmail.com", "test"},
		};
		return data;
	}
  
  
  
  
   
   
  
  
}
