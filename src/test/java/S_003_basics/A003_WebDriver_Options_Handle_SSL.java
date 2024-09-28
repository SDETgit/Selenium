package S_003_basics;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A003_WebDriver_Options_Handle_SSL {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
	//	option.addArguments("--headless=new");
		
		option.setAcceptInsecureCerts(true);
		 ChromeDriver driver = new ChromeDriver(option) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://expired.badssl.com/");
		
		 System.out.println(driver.getTitle()); //Privacy error
		 //expired.badssl.com


		

	}}										 										
