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
public class P011_svg_element {
	
	

	public static void main(String[] args) throws InterruptedException  {
		
				

		ChromeOptions option = new ChromeOptions();
		
		 ChromeDriver driver = new ChromeDriver() ;
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//locating svg element Here we need to use xpath name() to locate them 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[name()='svg'][@role='presentation'])[3]")).click();
		 System.out.println("Click has been done ");
		 
		
	}

}
