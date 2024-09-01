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

public class B017_Alert_basic_auth {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/
	//https://the-internet.herokuapp.com/

	public static void main(String[] args) throws InterruptedException {
		//Authenticated alert Alerts 
		  //We cannot inspect them or enter values in alert so we pass them via url 
		//https://username:password@the-internet.herokuapp.com/basic_auth

		 ChromeDriver driver = new ChromeDriver() ;
		 WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		 
		//driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText());
									
	}}																					
