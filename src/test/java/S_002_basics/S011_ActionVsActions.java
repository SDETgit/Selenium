package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S011_ActionVsActions {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
       //  options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        Actions act = new Actions(driver);
        //right click
        Thread.sleep(1000);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
        WebElement rc = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
        Action right_click = act.moveToElement(rc).contextClick().build();
        right_click.perform();
        
        
        
        
	}
}
