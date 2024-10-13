package S_003_basics;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A007_WebDriver_Options_incognito {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		 ChromeDriver driver = new ChromeDriver(option) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
		 
		//1. get full page screenshot 
		 TakesScreenshot ts = driver;
		 Thread.sleep(4000);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		//File targetFile = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\src\\screenshots\\f2.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage2.png");
		SourceFile.renameTo(targetFile); //copy sourceFile to TrargetFile
		
		//2. Capture screenshot for WebElement 
		WebElement footer = driver.findElement(By.xpath("//*[@id=\"footc\"]"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
	      
	    j.executeScript("arguments[0].style.border='2px solid red';", footer);
		File FooScreen= footer.getScreenshotAs(OutputType.FILE);
		File fc = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\src\\screenshots\\fc1.png");
		FooScreen.renameTo(fc);
		
		//3 Capture screeshot for WebElement like logo 
		WebElement Logo = driver.findElement(By.xpath("//*[@id=\"nava\"]/img"));
		j.executeScript("arguments[0].style.border='2px solid red';", Logo);
		File logo_sc = Logo.getScreenshotAs(OutputType.FILE);
		File tar_logo = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\src\\screenshots\\lc2.png");
		logo_sc.renameTo(tar_logo);
		System.out.println(System.getProperty("user.dir")+"\\screenshots\\fullpage2.png");
		//C:\Users\DELL\eclipse-workspace\Selenium_Learning\screenshots\fullpage.png

	}}																					
