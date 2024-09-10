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
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_Webtable_practice {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");

		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 
		
		//1. Table name 
		String table_name =  driver.findElement(By.xpath("(//div[@class=\"widget HTML\"]/h2)[1]")).getText();
		System.out.println(table_name);
		 
		//2. Table rows 
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
		
		System.out.println("Count of wors is :- "+rows.size());
		//3. table columns 
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[2]/td"));
		
		System.out.println("Number of columns :- "+columns.size());
		//4. Print first row 
		List<WebElement> rows2 = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//td"));
		for(int i=2;i<=2;i++)
		{
			for(int k=1;k<5;k++)
			{
				String element = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+k+"]")).getText();
				System.out.print(element+"\t");
			}
		}
		//5. print first column 
		System.out.println();
		for(int k=1;k<columns.size();k++)
			{
				String element = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//td["+k+"]")).getText();
				System.out.print(element+"\t");
			}
		//Print header 
		System.out.println();
		List<WebElement> headers  = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr[1]/th"));
		for(WebElement h :headers )
		{
			System.out.print(h.getText()+"\t");
		}
		System.out.println();
		//6. Print full table 
		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=columns.size();j++) {
		String value  = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		
		
		//approach 2 
		System.out.println();

		System.out.println();

		System.out.println();
		List<WebElement> all_elements  = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr/td"));
		for(WebElement al :all_elements )
		{
			System.out.print(al.getText()+"\t");
		}
		System.out.println();
		//7. Print particular element 
		//Print all amit 
		List<WebElement> all_elements2  = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr/td"));
		for(WebElement al :all_elements )
		{
			if(al.getText().equalsIgnoreCase("Amit"))
			System.out.println(al.getText()+"\t");
		}
		System.out.println();
		//8. Print contnetn based on condition 
		//Print all books written by Amit 
		for(int i=2;i<=rows.size();i++)
		{
			
		String value  = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[2]")).getText();
			if(value.equals("Mukesh"))
			{
				String book  = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[1]")).getText();
				System.out.println("Books written by Mukesh are :- "+book);
				
				//prices 
				String prices  = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[4]")).getText();
				System.out.print(" "+prices);
			}
			
			System.out.println();
		}
		
		//9 Find total prices of books 
		double sum = 0;
		for(int i=2;i<=rows.size();i++) {
			String prices2  = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[4]")).getText();
		//	System.out.println(prices2);
			Double s = Double.parseDouble(prices2);
			sum+=s;
		}
		
		System.out.println("Sum of books is "+sum);
		
	}}																					
