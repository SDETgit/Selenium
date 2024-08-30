package S_001_basics;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B012_Webdriver_methods_Window_Handles {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		
		  
		//Windows Handles

		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
         driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		 
		Set<String> windowIds = driver.getWindowHandles();   

		//Aprroach1 good for 1 2 tabs (as set do not maintain insertion order this approach may not be good )
		 List <String > Wl = new ArrayList(windowIds);
		 String parentID = Wl.get(0);
		 String childID = Wl.get(1);
  
		 System.out.println(driver.getTitle());

		 //Switch to child window
		 driver.switchTo().window(childID);
		 System.out.println(driver.getTitle());

		 //Switch to parent window
		 driver.switchTo().window(parentID);
		 System.out.println(driver.getTitle());

		 //Approach 2 when many tabs (Optimal approach )
		 for(String Win :windowIds )
		 {
           String title = driver.switchTo().window(Win).getTitle();
            if(title.equals("OrangeHRM")||title.equals("Human Resources Management Software | OrangeHRM"))
               {
                System.out.println(driver.getCurrentUrl());
                 driver.close();
	               }
		 }
}

}																						
