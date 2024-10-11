package S_012_TestNG_POM;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class P002_Orange_HRM_Test {
	
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
		//P001_no_Page_object_Model pl = new P001_no_Page_object_Model(driver);
		P003_Page_object_Mode2 pl = new P003_Page_object_Mode2(driver);
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
