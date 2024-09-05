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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001_Webtable {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		//Alerts 
		  
		

		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 
		
		List <WebElement> rows =  driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));	
		//number of rows in table 
		int row1 = rows.size();
		System.out.println("Total rows are :- "+rows.size());
		/*
		 * int rows2 = driver.findElements(By.tagName("tr")).size(); //gives from all tables 
		 * System.out.println(rows2);
		 */
		
		//number of columns 
		List <WebElement> columns =  driver.findElements(By.xpath("//table[@name=\"BookTable\"]//th"));
		int co = columns.size();
		System.out.println("Columns "+columns.size());
		
		//by tag name 
		int col = driver.findElements(By.tagName("th")).size();
		System.out.println(col);
		
		//Read data from web table specific row and column (5th row and 1st column )
		System.out.println(driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText());
		
		//read all data from table 
		
		for(WebElement cos: columns)
		{
			System.out.print(cos.getText()+"	");
		}
		System.out.println();
		
		for(int i=2 ;i<=row1;i++) 
		{
			for(int j=1;j<=co;j++)
			{
				
				String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
	}}																					
