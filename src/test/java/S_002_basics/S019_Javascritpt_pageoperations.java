package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S019_Javascritpt_pageoperations {
	
	public static void main(String[] args) throws InterruptedException {

		//Minimize 
		//maximise 
		//fullscreen 
		
		
		WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
 
        JavascriptExecutor js = (JavascriptExecutor) driver;
       
         driver.manage().window().minimize(); Thread.sleep(2000);
         driver.manage().window().maximize(); Thread.sleep(2000);
         driver.manage().window().fullscreen();
       
       //Page zoom in and zoom out using javaScript

       js.executeScript("document.body.style.zoom='50%'");

       Thread.sleep(2000);

       js.executeScript("document.body.style.zoom='300%'");
       
       WebElement input = driver.findElement(By.xpath("//*[@id=\"name\"]"));
       js.executeScript("document.body.style.zoom='80%'");
       js.executeScript("arguments[0].value ='Meka23'",input);
       
       String innerHtml = (String) js.executeScript("return arguments[0].innerHTML;");
       System.out.println(innerHtml);
	}
}
