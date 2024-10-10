package S_010_Data_providers;

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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class D002_data_parallel_testing {
	WebDriver driver; 
	
	@BeforeClass
	@Parameters ({"browser","url"})
	void setUp(String br, String url ) {
		switch(br) 
		{
		case "chrome" : driver = new ChromeDriver(); break ; 
		case "edge" : driver = new EdgeDriver(); break ; 
		case "firefox" : driver = new FirefoxDriver(); break ;
		default : System.out.println("Invalid browser"); return;
		}
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
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
	 Assert.assertEquals(title, "OrangeHRM");
	}
	@Test(priority =3)
	void url() {
		 Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
  
	@Test(priority =4)
  void teardown() {
	  driver.quit();
  }
  
  
   
   
  
  
}
