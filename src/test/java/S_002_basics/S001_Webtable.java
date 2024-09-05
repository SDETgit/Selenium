package S_002_basics;


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

public class S001_Webtable {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		//Alerts 
		  
		

		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		 
		//1.Normal ok Alert
		 driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		// driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		 //to get text of alert 
		 Alert ale = driver.switchTo().alert();
		 System.out.println(ale.getText());
		 ale.accept();
		 
		 //2 Confirmational alert 
		 driver.findElement(By.xpath("//*[@onclick=\"jsConfirm()\"]")).click();
			// driver.switchTo().alert().accept();
			// driver.switchTo().alert().dismiss();
			 //to get text of alert 
			 Alert ale2 = driver.switchTo().alert();
			 System.out.println(ale.getText());
			// ale.accept(); //accept using accept button 
			 ale.dismiss();  //Close using cancel button 
			String text =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
			System.out.println(text);  //result text that generated on clicking accept/cancel 
			
			
		//3. Prompt alert - input box 
			 driver.findElement(By.xpath("//*[@onclick=\"jsPrompt()\"]")).click();
			 Alert al = driver.switchTo().alert();
			 al.sendKeys("Welcome");
			// al.accept();
			 al.dismiss();
			 
			 String text2 =  driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
				System.out.println(text2);  //result text that generated on clicking accept/cancel
	}}																					
