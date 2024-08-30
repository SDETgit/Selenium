package S_001_basics;


import java.net.MalformedURLException;
import java.net.URL;
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

public class B011_Webdriver_methods_navigation {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		  
		//Navigation

		 ChromeDriver driver = new ChromeDriver() ;

		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		 driver.navigate().to("https://www.demoblaze.com/");
		 
		 URL myurl = new URL("https://www.demoblaze.com/");
		 
		 driver.navigate().to(myurl);

		 driver.manage().window().maximize();
		 driver.navigate().back();
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().forward();
		 System.out.println(driver.getCurrentUrl());
		 driver.navigate().refresh();
		
		   
	}

}																						
