package S_001_basics;


import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Stopwatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B008_Webdriver_methods_implicitwait {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		
		//Implicit waits   
		   ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Stopwatch watch = null;
			  driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
			  driver.manage().window().maximize();
			  
			  String Url = driver.getCurrentUrl(); 
			  System.out.println(Url);
			  
			  String Title = driver.getTitle(); 
			  System.out.println(Title); 
			//  String source  = driver.getPageSource(); 
			 // System.out.println(source); 
			  String WinH = driver.getWindowHandle(); 
			  System.out.println(WinH);
			  
			  try {
				  watch = Stopwatch.createStarted();
				  driver.findElement(By.xpath("sda")).click();
			  }catch(Exception e)
			  {
				  watch.stop();
				  System.out.println("Exception is :-"+e);
				  System.out.println(watch.elapsed(TimeUnit.SECONDS));
			  }
			  
			  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   	//Thread.sleep(10000);
			  driver.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]")).click();
			  
			
		   
	}

}																						
