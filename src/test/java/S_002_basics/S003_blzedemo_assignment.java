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
public class S003_blzedemo_assignment {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");

		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://blazedemo.com/");
		 
		WebElement dropdown1= driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		WebElement dropdown2= driver.findElement(By.xpath("//select[@name=\"toPort\"]"));
		
		Select drop1 = new Select(dropdown1);
		
		drop1.selectByVisibleText("Boston");
		
		Select drop2 = new Select(dropdown2);
		
		drop2.selectByVisibleText("Rome");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		List <WebElement> rows = driver.findElements(By.xpath("//table[@class=\"table\"]//tr"));
		List <WebElement> columns = driver.findElements(By.xpath("//table[@class=\"table\"]//tr[1]//td"));
		
		//Finding lowest prices from the flight 
		Double low = Double.MAX_VALUE;
		for(int i=2;i<rows.size();i++) {
		
		WebElement prices = driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]//td[6]"));
		Double v =Double.parseDouble( prices.getText().substring(1));
		if(v<low)
		{
			low = v;
		}
		}
		//Clicking flight with the lowest button 
		for(int i=2;i<rows.size();i++) {
			
			WebElement prices2 = driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]//td[6]"));
			Double v =Double.parseDouble( prices2.getText().substring(1));
			System.out.println(v+" "+low);
			if(v.equals(low))
			{
				WebElement button  = driver.findElement(By.xpath("//table[@class=\"table\"]//tr["+i+"]//td[1]"));
				button.click();
				break;
			}
			}
		System.out.println("Click has been done ");
		
		//Page 3 
		Faker faker = 	new Faker();

		String name = faker.name().fullName();

		String firstName = faker.name().firstName(); 
		String lastName = faker.name().lastName();

		String streetAddress =faker.address().streetAddress(); // 60018 Sawavn E String novel faker.how MetYourMother().catchphrase(); // 60018 Sawavn
		String city =faker.address().city();
		String state =faker.address().state();
		
		
		driver.findElement(By.xpath("//input[@id=\"inputName\"]")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name=\"address\"]")).sendKeys(streetAddress);

		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(city);

		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys(state);

		driver.findElement(By.xpath("//input[@id=\"creditCardNumber\"]")).sendKeys("8293820938203");

		driver.findElement(By.xpath("//input[@name=\"zipCode\"]")).sendKeys("28989");

		driver.findElement(By.xpath("//input[@id=\"nameOnCard\"]")).sendKeys(name);

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@value=\"Purchase Flight\"]")).click();
		
		
		String text = driver.findElement(By.xpath("//h1")).getText();
		
		if(text.equals("Thank you for your purchase today!"))
		{
			System.out.println("Test case has been passed ");
		}
		else 
			System.out.println("Failed");
		
	}}																					
