package S_011_TestNG_Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Listeners(S_011_TestNG_Listeners.D002_myListners.class)
@Listeners(S_011_TestNG_Listeners.D003_TestNG_Extent_Report_Manager.class)
public class D001_TestNG_Listeners {
WebDriver driver; 
	
	@BeforeClass
	void setUp() {
		
		driver = new ChromeDriver(); 
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test (priority =1)
	void logo () {
	boolean status = 	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	@Test(priority =2)
	void title () {
		String title = driver.getTitle();
	 Assert.assertEquals(title, "OrangeHR M");
	}
	@Test(priority =3, dependsOnMethods = {"title"})
	void url() {
		 Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  
	@Test(priority =4)
  void teardown() {
	  driver.quit();
  }
  
  
  
   
   
  
  
}
