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

public class B019_Select_dropdowns {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/
	//https://the-internet.herokuapp.com/
	//https://ui.vision/demo/webtest/frames/

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 
		WebElement dropdown = driver.findElement(By.xpath("//select[@class=\"form-control\"][@id=\"country\"]"));
		
		Select drop = new Select (dropdown);
		
		//Three methods in Select 
		drop.selectByValue("japan");
										//Thread.sleep(2000);
		drop.selectByIndex(4);
										//Thread.sleep(2000);
		drop.selectByVisibleText("United Kingdom");
		
		//select all options 
		List <WebElement> alldrop = drop.getOptions();
		
		System.out.println("Size of dropdown is :-" +alldrop.size());
		
		//printing all method 1 
		for(WebElement e: alldrop)
		{
			System.out.print(e.getText()+" ");
		}
		System.out.println('\n'+"Method 2 ");
		////printing all method 2
		for(int i=0;i<alldrop.size();i++)
		{
			System.out.print(alldrop.get(i).getText()+" ");
		}
		
	}}																					
