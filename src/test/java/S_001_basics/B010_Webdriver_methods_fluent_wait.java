package S_001_basics;


import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B010_Webdriver_methods_fluent_wait {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		
		  
		//Fluent wait declaration
		ChromeDriver driver = new ChromeDriver() ;
		Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
		.withTimeout (Duration.ofSeconds (5))
		.pollingEvery (Duration.ofSeconds(1))
		.ignoring (NoSuchElementException.class);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply (WebDriver driver) {
		return driver.findElement(By.xpath("input[placeholder='Username']"));
		}
		});
		txtUsername.sendKeys("Admin");
		
		   
	}

}																						
