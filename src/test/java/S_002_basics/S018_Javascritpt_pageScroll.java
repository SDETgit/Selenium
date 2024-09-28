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

public class S018_Javascritpt_pageScroll {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
       driver.get("https://testautomationpractice.blogspot.com/");
       

       JavascriptExecutor js = (JavascriptExecutor) driver;
       
     //1 Scroll page by pixel number
                    js.executeScript("window.scrollBy(0,1500)", "");
                    System.out.println(js.executeScript("return window.pageYOffset;"));
                 
     //2 Scroll page till element is visible
                    WebElement colors = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[6]/label"));
                    js.executeScript("arguments[0].scrollIntoView()", colors);
                    System.out.println(js.executeScript("return window.pageYOffset;"));
                 
     //3 Scroll page till end of page
                    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
                    System.out.println(js.executeScript("return window.pageYOffset;"));
                 
     //4 Scroll page again back to top
                    Thread.sleep(2000);
                    js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
                    System.out.println(js.executeScript("return window.pageYOffset;"));
                 
     //Scroll page width wise
                   
     //1 Scroll page by pixel number
                                 js.executeScript("window.scrollBy(1500,0)", "");
                            System.out.println(js.executeScript("return window.pageXOffset;"));
                         
     //2 Scroll page till element is visible
                            WebElement colors2 = driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[6]/label"));
                            js.executeScript("arguments[0].scrollIntoView()", colors2);
                     System.out.println(js.executeScript("return window.pageXOffset;"));
                         
     //3 Scroll page till end of page
                    js.executeScript("window.scrollBy(0,document.body.scrollWidth)");
                    System.out.println(js.executeScript("return window.pageXOffset;"));
                         
     //4 Scroll page again back to top
                    js.executeScript("window.scrollBy(0,-document.body.scrollWidth)");
                    System.out.println(js.executeScript("return window.pageXOffset;"));
	}
}
