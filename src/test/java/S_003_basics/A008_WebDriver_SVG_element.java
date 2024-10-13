package S_003_basics;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A008_WebDriver_SVG_element {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		
		 ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//locating svg element Here we need to use xpath name() to locate them 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		 System.out.println("Click has been done ");
		 
	}}																					
