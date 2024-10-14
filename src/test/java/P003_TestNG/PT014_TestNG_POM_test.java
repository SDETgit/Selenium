package P003_TestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PT014_TestNG_POM_test {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	void test() throws InterruptedException {
	PT013_TestNG_POM_pagefactory pl = new PT013_TestNG_POM_pagefactory(driver);
		//PT012_TestNG_POM pl = new PT012_TestNG_POM(driver);
		pl.setUsername("Admin");
		pl.setpassword("admin123");
		pl.ClickLogin();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void teardown() {
		driver.quit();	
	}
}
