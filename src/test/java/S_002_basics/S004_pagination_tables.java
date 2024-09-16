package S_002_basics;


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
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.github.javafaker.Faker;
public class S004_pagination_tables {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");

		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 
		 //find the number of pages 
		 WebElement pages= driver.findElement(By.xpath("(//ul[@id=\"pagination\"]//li/a)[4]"));
		 int pnum = Integer.parseInt(pages.getText());
		 System.out.println("Total pages are :- "+pnum);
		 
		 for(int i=1;i<=pnum;i++) {
			 
			 if(i>1)
			 {
				 WebElement pagination = driver.findElement(By.xpath("(//ul[@id=\"pagination\"]//li/a)["+i+"]"));
				 pagination.click();
		
			 }
			 List <WebElement> rows= driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr"));
			 List <WebElement> columns= driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr[2]//td"));
			
			 for(int j=1;j<rows.size();j++)
			 {
				 for(int k=1 ;k<=columns.size();k++) {
					 WebElement ele = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+j+"]//td["+k+"]"));
					// System.out.print("values "+k+" "+columns.size() +" ");
					 int col = columns.size();
					 if(k==col)
					 {
						 WebElement ele2 = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+j+"]//td["+k+"]//input"));
							
						 ele2.click();
					 }
					 System.out.print(ele.getText()+"\t");
				 }
				 System.out.println();
			 }
			 
		 }
		 
		
	}}																					
