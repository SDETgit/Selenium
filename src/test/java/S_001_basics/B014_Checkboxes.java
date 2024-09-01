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

public class B014_Checkboxes {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		//checkboxes
		  
		

		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.navigate().to("https://testautomationpractice.blogspot.com");
		 
		//1. select single checkbox 
		 driver.findElement(By.xpath("//input[@value='sunday']")).click();
		 
		 //2. Select all checkboxes 
		 List<WebElement> chkbx = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]")); 
		
		 for(WebElement a :chkbx )
		 {
			 if(!a.isSelected())
			 a.click();
		 }
		 Thread.sleep(5000);
		 //3 Select last 5 check boxes only 
		 for(int i=chkbx.size()-5;i<chkbx.size();i++)
		 {
			 chkbx.get(i).click();
		 }
		 Thread.sleep(5000);
		 //4 Select first 5 check boxes only 
		 for(int i=0;i<5;i++)
		 {
			 chkbx.get(i).click();
		 }
		 
		 //5 unselect checkboxesif they are selected 
		 for(WebElement a :chkbx )
		 {
			 if(a.isSelected())
			 a.click();
		 }
	}}																					
