package S_001_basics;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
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

public class B016_Alert_using_explicit_wait {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/
	//https://the-internet.herokuapp.com/

	public static void main(String[] args) throws InterruptedException {
		//Alerts 
		  
		

		 ChromeDriver driver = new ChromeDriver() ;
		 WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		 
		//1.Normal ok Alert
		 driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Alert al = exwait.until(ExpectedConditions.alertIsPresent());
		al.accept();
		 String text2 =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
			System.out.println(text2);  //result text that generated on clicking accept/cancel
									
	}}																					
