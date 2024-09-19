package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

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

public class S014_Keybaord_actions2 {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
       //  options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
       driver.get("https://text-compare.com/");
       Actions act = new Actions(driver);
       
       
       WebElement Text_area = driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
       Text_area.sendKeys("This is a millionaire dream steps");
       
       //control A
       act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
       //Control c 
       act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
       //tab 
       act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       //control v 
       act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}
}
