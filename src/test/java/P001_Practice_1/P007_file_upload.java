package P001_Practice_1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P007_file_upload {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		 
		WebElement upload = driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]"));
		upload.sendKeys("D:\\New Text Document - Copy (2).txt");
		
		String file1 = "D:\\New Text Document - Copy (2).txt";
		String file2 = "D:\\New Text Document - Copy.txt";
		upload.sendKeys(file1+"\n"+file2);
		
	}

}
