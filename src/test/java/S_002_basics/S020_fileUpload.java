package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S020_fileUpload {
	
	public static void main(String[] args) throws InterruptedException {

		//Minimize 
		//maximise 
		//fullscreen 
		
		
		WebDriver driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
		  driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).
		  sendKeys("D:\\New Text Document.txt"); String File_upload =
		  driver.findElement(By.xpath("//*[@id=\"fileList\"]/li")).getText();
		  if(File_upload.equals("Text")) { System.out.println("Upload passed"); } else
		  { System.out.println("Upload failed "); } Thread.sleep(10000);
		 
        //Upload multiple files
        String file1 = "D:\\New Text Document.txt";
        String file2 = "D:\\New Text Document - Copy (2).txt";
        driver.findElement(By.xpath("//*[@id=\"filesToUpload\"]")).sendKeys(file1+"\n"+file2);
        List<WebElement> file_names = driver.findElements(By.xpath("//*[@id=\"fileList\"]/li"));
        if(file_names.size()==2) {
                   System.out.println("Number of files correctly uploaded ");
        }
        else
        {
                   System.out.println("failed");
        }
        if(driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[1]")).getText().equals("New Text Document.txt")&&
                                 driver.findElement(By.xpath("//*[@id=\"fileList\"]/li[2]")).getText().equals("New Text Document - Copy (2).txt"))
        {
                 System.out.println("Passed"); 
        }
        else {
                   System.out.println("Failed ");
        }
	}
}
