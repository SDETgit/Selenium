package P001_Practice_1;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class P010_shadow_doms {
	
	

	public static void main(String[] args) throws InterruptedException  {
		
				
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://dev.automationtesting.in/shadow-dom");
		//This Element is inside 3 nested shadow DOM.
		 String cssSelectorForHost1 = "#shadow-root";
		 String cssSelectorForHost2 = "#inner-shadow-dom";
		 String cssSelectorForHost3 = "#nested-shadow-dom";
		 Thread.sleep(1000);
		 SearchContext shadow0 = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		 Thread.sleep(1000);
		 SearchContext shadow1 = shadow0.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		 Thread.sleep(1000);
		 SearchContext shadow2 = shadow1.findElement(By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		 Thread.sleep(1000);
	WebElement last = 	 shadow2.findElement(By.cssSelector("#multi-nested-shadow-element"));
		
		 System.out.println(last.getText());
		
	}

}
