package P001_Practice_1;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;
public class P008_Screenshots {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://testautomationpractice.blogspot.com/");
		 
		//Full page screenshot
		TakesScreenshot TS =  driver;
		File sourceFile = TS.getScreenshotAs(OutputType.FILE);
		File TargetFIle = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage4.png");
		sourceFile.renameTo(TargetFIle);
		
		//Screenshot for webElement 
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"header-inner\"]/div[1]/h1"));
		File logo_source = logo.getScreenshotAs(OutputType.FILE);
		logo_source.renameTo(TargetFIle);
	}

}
