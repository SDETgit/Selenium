package S_001_basics;


import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B009_Webdriver_methods_explicitwait {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		
		//Explicite waits   
			ChromeDriver driver = new ChromeDriver();
			WebDriverWait expwait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
			driver.get("https://www.demoblaze.com/");
	           driver.manage().window().maximize();
		   
		WebElement laptops = 	expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='list-group-item'][3]")));
		String text1 = laptops.getText();
		System.out.println(text1);
		
		expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick=\"byCat('notebook')\"][@class=\"list-group-item\"]"))).click();
	        
	           driver.findElement(By.xpath("//*[@class='list-group-item'][3]")).click();
	           driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"][@class=\"list-group-item\"]")).click();
	           driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\" and @class=\"list-group-item\"]")).click();  //Here both classes must match
	           driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\" or @class=\"list-group-1item\"]")).click(); //in or condition added 1 at list-group-1item so that it do not match multiple web elements with class name as list-group-item
	           driver.findElement(By.xpath("//a[text()='Monitors']")).click();
	           boolean status = driver.findElement(By.xpath("//*[text()='About Us']")).isDisplayed();
	           System.out.println(status);
	           String text = driver.findElement(By.xpath("//*[text()='About Us']")).getText();
	           System.out.println(text);
	           String text2 = driver.findElement(By.xpath("//*[contains(text(),'We believe')]")).getText();
	           System.out.println(text2);
	           String text3 = driver.findElement(By.xpath("//*[starts-with(text(),'We believe')]")).getText();
	           System.out.println(text3);
	           String text4 = driver.findElement(By.xpath("//*[@class=\"col-lg-3\"]/div/a[1]")).getText();
	           System.out.println(text4);
			
		   
	}

}																						
