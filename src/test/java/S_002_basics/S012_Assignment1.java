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

public class S012_Assignment1 {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
       //  options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        Actions act = new Actions(driver);
        //right click
        
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement rc = driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        Action right_click = act.moveToElement(rc).doubleClick().build();
        right_click.perform();
        System.out.println("dsds");
        
        
        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        act.dragAndDrop(source, target).build().perform();
        
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);
        WebElement source1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement target1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        act.dragAndDrop(source1, target1).build().perform();
        
        WebElement source2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement target2 = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        act.dragAndDrop(source2, target2).build().perform();
        
        WebElement source3 = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
        WebElement target3 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
        act.dragAndDrop(source3, target3).build().perform();
        
        WebElement source4 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement target4 = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));
        act.dragAndDrop(source4, target4).build().perform();
        
	}
}
