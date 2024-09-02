package S_001_basics;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B018_frames_iframes {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/
	//https://the-internet.herokuapp.com/
	//https://ui.vision/demo/webtest/frames/

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		 
		WebElement frame1 = driver.findElement(By.xpath("//*[@src=\"frame_1.html\"]"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//*[@type='text'][@name='mytext1']")).sendKeys("Welcome");
		
		//swithing to default page 
		driver.switchTo().defaultContent();
		
		//switching frame2
		WebElement frame2 = driver.findElement(By.xpath("//*[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//*[@type='text'][@name='mytext2']")).sendKeys("Welcome1");
		
		
		//swithing to default page 
				driver.switchTo().defaultContent();
		//Switching frame 3 
		WebElement frame3 = driver.findElement(By.xpath("//*[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//*[@name=\"mytext3\"]")).sendKeys("Frame3");
									
		//switching iframe inside frame 
		WebElement framei = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(framei);
		driver.findElement(By.xpath("//div[@id=\"i8\"]")).click(); 	
		WebElement checkbox = driver.findElement(By.xpath("//div[@id='i19']//div[@class='uHMk6b fsHoPb']"));
		if(!checkbox.isSelected())
			checkbox.click(); 	
		
		
		//swithing to default page 
		driver.switchTo().defaultContent();
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("Frame4");
		
		//swithing to default page 
				driver.switchTo().defaultContent();
		//Switching frame 5 
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src=\"frame_5.html\"]"));
		driver.switchTo().frame(frame5);
		WebElement checkbox5 = driver.findElement(By.xpath("//input[@name=\"mytext5\"]"));
		checkbox5.sendKeys("frame5");
		
		WebElement link = driver.findElement(By.xpath("//a[@href=\"https://a9t9.com\"]"));
		link.click();
		driver.findElement(By.xpath("//*[@id=\"get\"]/div[2]/div/div/div/a")).click();
		
		/*
		 * driver.findElement(By.
		 * xpath("//div[@class=\"laptop-video col-md-7 col-sm-7\"]")).click();
		 * 
		 * //here youtube video is in another iframe we need to sitch through it
		 * WebElement yframe =
		 * driver.findElement(By.xpath("//iframe[@id=\"home-youtube\"]"));
		 * driver.switchTo().frame(yframe);
		 */

	}}																					
