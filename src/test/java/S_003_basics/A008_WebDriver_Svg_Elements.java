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

public class A008_WebDriver_Svg_Elements {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		 ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.get("https://books-pwakit.appspot.com/");
	//	 driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("Baba"); //as we have directly navigated to shadow 
		 //via xpath it will throw 
		// org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element
		 
		//This Element is inside single shadoaw DOM.
		 String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
		 Thread.sleep(1000);
		 SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		 Thread.sleep(1000);
		 shadow.findElement(By.cssSelector("#input")).sendKeys("Millionaire");
		 
		 
	}}																					
