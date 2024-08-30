package S_001_basics;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B013_Assignment_2 {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		//https://testautomationpractice.blogspot.com/
		 //1. Provide string for search
		 //2. count number of links
		 //3. click on each link using for loop
		 //4. get windows'id for each browser
		 //5. close specific browser window
		  
		//Windows Handles

		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.navigate().to("https://testautomationpractice.blogspot.com");
		 
		//1. Provide string for search
		 driver.findElement(By.xpath("//input[@class=\"wikipedia-search-input\"]")).sendKeys("Stocks");
		 
		 //2. count number of links
		 List<WebElement> ele = driver.findElements(By.xpath("//*[contains(@href,'http')]"));
		 
		 System.out.println("Total links are :- " +ele.size());
		 
		 //3. click on each link using for loop
//		
		 JavascriptExecutor js = (JavascriptExecutor) driver;

	        for (WebElement link : ele) {
	            // Get the href attribute of each link
	            String href = link.getAttribute("href");

	            if (href != null && !href.isEmpty()) {
	                // Open the link in a new tab using JavaScript
	                js.executeScript("window.open(arguments[0], '_blank');", href);
	            }
	        }

	    //4. get windows'id for each browser
	        
	   Set<String> win =      driver.getWindowHandles();
	   System.out.println(win);	   
		 
	   //5. close specific browser window
	   for(String wi : win)
	   {
		   String ti = driver.switchTo().window(wi).getTitle();
		   
		   if(ti.equals("favicon.ico (48×48)")|| ti==null||ti.equals("Automation Testing Practice"))
		   {
			   System.out.println(ti+" has been closed");
			driver.close();   
		   }
		}
	   
		
	}}																					
