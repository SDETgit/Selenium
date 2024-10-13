package S_003_basics;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A006_WebDriver_Options_add_extension {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		File file = new File("D:\\Pavan Sir\\Selenium\\CRX_Files\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		File file2 = new File("D:\\Pavan Sir\\Selenium\\CRX_Files\\uBlock-Origin-Chrome-Web-Store.crx");
		List<File> paths = new ArrayList<File>();
		
		paths.add(file);
		paths.add(file2);
		//For single extension 
		//option.addExtensions(file);
		
		//for multiple extension 
		option.addExtensions(paths);
		 ChromeDriver driver = new ChromeDriver(option) ;
		 ChromeDriver driver2 = new ChromeDriver() ;
		//  driver2.switchTo().newWindow(WindowType.WINDOW);
	       driver2.get("https://www.w3schools.com/java/");
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://www.w3schools.com/java/");
		 driver.manage().window().maximize();
		 
	
	}}																					
