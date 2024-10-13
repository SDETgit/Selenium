package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S010_mouse_actions {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      //   options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(5000);
      
        //hover and click 
		
		  driver.navigate().to("https://demo.opencart.com/");
		  driver.manage().window().maximize(); WebElement desktop =
		  driver.findElement(By.xpath("//*[text()='Desktops']")); WebElement dropdown=
		  driver.findElement(By.xpath("//*[text()='PC (0)']")); WebElement lp=
		  driver.findElement(By.xpath("//*[text()='Laptops & Notebooks']"));
		  
		  Actions act = new Actions(driver);
		  
		  act.moveToElement(desktop).moveToElement(lp).click().build().perform();
		 
        
        //mouse hover 
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-hover.html");
        WebElement hover = driver.findElement(By.xpath("//*[text()='hover over me']"));
        
     //   Actions act = new Actions(driver);
        act.moveToElement(hover).perform();
        
        //right click
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo");
        WebElement rc = driver.findElement(By.xpath("(//*[text()='right click me'])[1]"));
        act.moveToElement(rc).contextClick().perform();
        
        //click on copy
        driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
        
        //alert 
        driver.switchTo().alert().accept();
        
        //douvble click 
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://doubleclicktest.com/");
        WebElement doublec = driver.findElement(By.xpath("//*[text()='Click Here to Test']"));
        act.moveToElement(doublec).doubleClick().perform();
        act.moveToElement(doublec).doubleClick().perform();
        
        System.out.println("Click performed  ");
        
        //drag and drop 
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        WebElement target = driver.findElement(By.xpath("//*[@id=\"div2\"]"));
        WebElement source = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));
        
        act.dragAndDrop(source, target).perform();
        System.out.println("Click performed  4");
        
        
	}
}
