package P001_Practice_1;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class P009_WebDriver_Options {
	
	

	public static void main(String[] args) throws InterruptedException  {
		
				
		ChromeOptions options = new ChromeOptions();
		
		//1. Headless browsing 
		//options.addArguments("--headless=new");
		
		//2. Accept insecure certificates 
		options.setAcceptInsecureCerts(true);
		
		//3. Remove automated message 
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		//4. open browser in incognito 
		//options.addArguments("--incognito");
		
		//5. Add extension in browser via crx file 
		File file = new File("D:\\Pavan Sir\\Selenium\\CRX_Files\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		File file2 = new File("D:\\Pavan Sir\\Selenium\\CRX_Files\\uBlock-Origin-Chrome-Web-Store.crx");
		
		List <File> file_path = new ArrayList<File>();
		file_path.add(file);
		file_path.add(file2);
		options.addExtensions(file_path);
		ChromeDriver driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
	//	driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		 driver.navigate().to("https://expired.badssl.com/");
		
		 
		
	}

}
