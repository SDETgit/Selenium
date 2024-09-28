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

public class S013_Slider {
	
	

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
       //  options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
       driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
       Actions act = new Actions(driver);
       
       //minslider 
       WebElement slider_p = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
        System.out.println("Slider location " +slider_p.getLocation()); //Slider location (59, 252) (x , Y )
        //As our slider is horizontal we will only move it along x axis 
        //if our slider would hve been vertical we would have move it via y axis coordinates
        
        act.dragAndDropBy(slider_p, 20,252).perform();
        
          WebElement max_slider = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
          System.out.println("Slider location " +max_slider.getLocation()); //Slider location (411, 250) (x , Y )
          act.dragAndDropBy(max_slider, -100,250).perform();
          act.dragAndDropBy(max_slider, -100,250).perform();
        System.out.println(  max_slider.getLocation().getX());
       System.out.println(  max_slider.getLocation().getY());
       System.out.println("Slider location " +slider_p.getLocation()); //Slider location (59, 252) (x , Y )
       
          
	}
}
