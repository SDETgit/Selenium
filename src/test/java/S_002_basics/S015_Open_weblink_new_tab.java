package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S015_Open_weblink_new_tab {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
       //  options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
       driver.get("https://artoftesting.com/samplesiteforselenium");
       Actions act = new Actions(driver);
       WebElement Home = driver.findElement(By.xpath("//*[@id=\"menu-item-102\"]/a"));
       act.keyDown(Keys.CONTROL).click(Home).keyUp(Keys.CONTROL).perform();
      
       
       
       
       
       
       Set<String> WindowID =    driver.getWindowHandles();
       List <String> Win = new ArrayList(WindowID);
       System.out.println(driver.getTitle());
       for(String WH:Win)
       {
    	   
    	  String Title =  driver.switchTo().window(WH).getTitle().trim();
    	  if(Title.equalsIgnoreCase("ArtOfTestingQaTools"))
    	  {
    		  driver.switchTo().window(WH);
    	  }
       }
       
       System.out.println(driver.getTitle());
        
	}
}
