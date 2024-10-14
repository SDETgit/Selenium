package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft assertions do not through errors 
public class PT008_TestNG_parallel_ececution {
	WebDriver driver;
	 
	@BeforeClass
	@Parameters({"browser","url"})
	void launch(String browser, String url) {
		switch(browser)
		{
		case "chrome" : driver = new ChromeDriver(); break;
		case "edge" : driver = new EdgeDriver(); break;
		case "firefox" : driver = new FirefoxDriver(); break;
		default : System.out.println("Invalid browser"); return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get(url);
	}
	
	@Test  
	void login() {
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	
	
	
	@AfterClass 
	void teardown() {
		System.out.println("Browser tear down ");
	}
	
	
	
}
 