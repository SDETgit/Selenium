package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Soft assertions do not through errors 
public class PT007_TestNG_data_provider {
	WebDriver driver;
	 
	@BeforeClass
	void launch() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test  (dataProvider ="dp" )
	void login(String login, String passwrod) {
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(login);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(passwrod);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}
	
	
	
	@AfterClass 
	void teardown() {
		System.out.println("Browser tear down ");
	}
	
	@DataProvider (name = "dp")
	Object[][]  login_data() {
		Object data[][] = {
				{"Adim","adimne"},{"Admin","Admin123"} ,
				{"Admin","admin123"} ,{"Admin","a dmin123"} ,{"Admin","admin123"} 
		};
		return data;
	}
	
}
 