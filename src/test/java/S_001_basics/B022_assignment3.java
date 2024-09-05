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

public class B022_assignment3 {
	//https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
	public static void main(String[] args) throws InterruptedException {
		
		 ChromeDriver driver = new ChromeDriver() ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Select using Select 
			/*
			 * driver.navigate().to(
			 * "https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/"
			 * ); driver.manage().window().maximize(); // count total number of options
			 * WebElement selectdrop=
			 * driver.findElement(By.xpath("//*[@name=\"country\"]"));
			 * 
			 * Select drop =new Select (selectdrop);
			 * 
			 * List <WebElement > alldrop = drop.getOptions();
			 * 
			 * System.out.println(alldrop.size());
			 * 
			 * //Select one option drop.selectByValue("4");
			 * drop.selectByVisibleText("Brazil"); drop.selectByIndex(3);
			 * 
			 * //print all options for( WebElement s :alldrop) {
			 * System.out.println(s.getText()); }
			 */
		//Hidden drop down 2 
		/*
		 * driver.get(
		 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 * driver.findElement(By.xpath("//*[@placeholder=\"Username\"]")).sendKeys(
		 * "Admin");
		 * driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		 * driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 * 
		 * //click pim
		 * 
		 * driver.findElement(By.xpath("(//a[@class=\"oxd-main-menu-item\"])[2]")).click
		 * ();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * driver.findElement(By.
		 * xpath("(//*[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"])[2]"
		 * )).click();
		 * 
		 * //driver.findElement(By.
		 * xpath("//div[@role=\"option\"]//span[text()='Current and Past Employees']")).
		 * click(); driver.findElement(By.
		 * xpath("//div[@role=\"option\"]//span[text()='Past Employees Only']")).click()
		 * ;
		 */
		 
		 //Multi Select 
		 driver.get("https://testautomationpractice.blogspot.com/");
		 
		 WebElement ele = driver.findElement(By.xpath("(//select[@class=\"form-control\"])[2]"));
		 
		 Select all  = new Select(ele);
		 
		List<WebElement> s = all.getOptions();
		
		for(WebElement as : s )
		{
			System.out.println(as.getText());
		}
		 
		all.selectByIndex(0);
		all.selectByValue("blue");
		all.selectByVisibleText("Yellow");
		all.deselectAll();
	}}																					
