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

public class S021_Javascritpt_innerHTML {
	
	public static void main(String[] args) throws InterruptedException {

		//Minimize 
		//maximise 
		//fullscreen 
		
		
		WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = "https://www.tutorialspoint.com/index.htm";
       
        driver.get(url);
        WebElement text = driver.findElement(By.xpath("/html/body/main/section[1]/div/div[2]/h1"));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String s = (String) j.executeScript("return document.body.innerHTML;",text); 
        j.executeScript("arguments[0].style.border='2px solid red';", text);
        WebElement learn = driver.findElement(By.xpath("//*[@id=\"mobile-search-strings\"]"));
        
        j.executeScript("arguments[0].focus();", text);
        System.out.println("Get HTML of page: "+ s);
       // driver.quit();
	}
}
