package S_001_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B002_locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	//	EdgeDriver driver = new EdgeDriver();
		  ChromeDriver driver = new ChromeDriver();
         
          driver.get("https://demo.opencart.com/");
     
          driver.manage().window().maximize();
          //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
         driver.findElement(By.name("search")).sendKeys("mac");

         boolean curr = driver.findElement(By.id("form-currency")).isDisplayed();
          System.out.println(curr);
          //Linkedtext
          //driver.findElement(By.linkText("Desktops")).click();
          //driver.findElement(By.partialLinkText("sktops")).click();
      
          //ByClass
          List <WebElement> ele = driver.findElements(By.className("list-inline-item"));
          System.out.println("Total elements in top webpage is "+ele.size());
          //System.out.println(ele);
        
          //tagname find all links from the webpage
          List <WebElement> ele2 = driver.findElements(By.tagName("a"));
          System.out.println("Total elements in webpage is "+ele2.size());
          //System.out.println(ele);
          //true
          //Total elements in top webpage is 7
          //Total elements in webpage is 76
          //total images in webpage
          List <WebElement> ele3 = driver.findElements(By.tagName("img"));
          System.out.println("Total images in webpage is "+ele3.size());
      
         //Total images in webpage is 18

	}

}
