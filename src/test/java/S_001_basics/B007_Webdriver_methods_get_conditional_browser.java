package S_001_basics;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B007_Webdriver_methods_get_conditional_browser {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		
		//Get methods 
		   ChromeDriver driver = new ChromeDriver();
			
			  driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
			  driver.manage().window().maximize();
			  
			  String Url = driver.getCurrentUrl(); System.out.println(Url);
			  
			  String Title = driver.getTitle(); System.out.println(Title); //
			  String source = driver.getPageSource(); // 
			  System.out.println(source); String WinH =
			  driver.getWindowHandle(); System.out.println(WinH);
			  
			  driver.get(
			  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			  Thread.sleep(10000);
			  driver.findElement(By.xpath("//*[contains(text(),'OrangeHRM, Inc')]")).click(
			  );
			  
			  Set <String> WinHs = driver.getWindowHandles(); System.out.println(WinHs);
			  
			  driver.close(); //Here 2 windows were opened but driver closed the previous
			 // window as it was focussed on that only // driver.quit();
			 
		   
		  //Conditonal methods 
			
			  driver.get("https://artoftesting.com/samplesiteforselenium");
			  driver.manage().window().maximize(); // Thread.sleep(5000);
			  
			  boolean logo = driver.findElement(By.xpath("//*[text()='ArtOfTesting']")).isDisplayed();
			  System.out.println(logo); 
			  boolean enab= driver.findElement(By.xpath("//*[@id='fname']")).isEnabled();
			  System.out.println(enab);
			  
			  driver.findElement(By.xpath("//*[@value='male']")).click();
			  
			  
			  boolean radiobox = driver.findElement(By.xpath("//*[@value='male']")).isSelected();
			  System.out.println("Status of radiobox male:- " +radiobox);
			  boolean radiobox2 = driver.findElement(By.xpath("//*[@value='female']")).isSelected();
			  System.out.println("Status of radiobox female:- " +radiobox2); WebElement
			  aut_check= driver.findElement(By.xpath("//*[@value=\"Automation\" and @type='checkbox']"));
			  
			  System.out.println("check box enabled "+aut_check.isSelected());
			  
			  aut_check.click();
			  System.out.println("check box enabled "+aut_check.isSelected());
			  aut_check.click();
			  System.out.println("check box enabled "+aut_check.isSelected());
			 
		  //browser commands 
		   
		     driver.get(
		     "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		     driver.manage().window().maximize(); Thread.sleep(4000);
		     driver.findElement(By.xpath("//*[text() ='OrangeHRM, Inc']")).click();
		     Thread.sleep(4000); //driver.close(); //closes current tab driver.quit(); //
		   //  closses entire session
		    	
		   
	}

}																						
