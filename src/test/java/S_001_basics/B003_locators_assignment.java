package S_001_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B003_locators_assignment {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
         
         driver.get("https://demoblaze.com/index.html");
       
         //total links in webpage
         driver.manage().window().maximize();
    
        Thread.sleep(10000);
      
       
         List<WebElement> ele= driver.findElements(By.tagName("a"));
         System.out.println("Total Links are :- "+ele.size());
         //Get all links and print
          for(WebElement link:ele){
           System.out.println(link.getText() + " - " + link.getAttribute("href"));}
         System.out.println(ele);
         //Total images
         List<WebElement> ele2 =  driver.findElements(By.tagName("img"));
      
         System.out.println("total images are "+ ele2.size());
       
         //Click on link using link test
//            driver.findElement(By.linkText("Contact")).click();
         //System.out.println(ele2);
      
        driver.findElement(By.partialLinkText("About")).click();

         System.out.println(ele2);

	}

}
