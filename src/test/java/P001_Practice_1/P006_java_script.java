package P001_Practice_1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P006_java_script {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		 JavascriptExecutor js = driver;
		 
		 //Send values
		 
		 WebElement input = driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]"));
		 js.executeScript("arguments[0].value='Selenium'", input);
		 //input.clear();
		 js.executeScript("arguments[0].setAttribute('Value','Selenium4')", input);
		 
		 
		 //Click 
		 WebElement checkbox_tuesday = driver.findElement(By.xpath("//*[@id=\"tuesday\"]"));
		 
		 js.executeScript("arguments[0].click()", checkbox_tuesday);
		 
		 //page scroll 
		 js.executeScript("window.scrollBy(0,1500)", "");
		 
		 System.out.println(js.executeScript("return window.pageYOffset"));
		
		 //scroll till element is visible 
		 js.executeScript("arguments[0].scrollIntoView()", checkbox_tuesday);
		 System.out.println(js.executeScript("return window.pageYOffset"));
		 
		 //till end of page 
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		 
		 //scroll to top 
		 js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		 
		 
		 //page operations zoom and zoom out 
		 js.executeScript("document.body.style.zoom='200%'");
		 js.executeScript("document.body.style.zoom='100%'");
		 
		 //highlight element 
		 Thread.sleep(2000);
		WebElement de =  driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]"));
		 js.executeScript("arguments[0].style.border='2px solid red';", de);
		 
		 
		 //return ineer html 
		 String s = (String) js.executeScript("return document.body.innerHTML;",de); 
		 System.out.println(s);
	}

}
