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
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S016_Open_in_new_tab {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
       driver.get("https://artoftesting.com/samplesiteforselenium");
       
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://www.demoblaze.com/");
     
        
	}
}
