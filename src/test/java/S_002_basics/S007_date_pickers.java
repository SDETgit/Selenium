package S_002_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class S007_date_pickers {
	static void FutureDate(WebDriver driver, String month, String year,String date) throws InterruptedException {
		
		while(true) {
		//	Thread.sleep(1000);
		String month_ui = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String year_ui = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		
		if(year.equals(year_ui)&&month.equalsIgnoreCase(month_ui))
		{
			break;
		}
		//Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();
		}
		
List<WebElement> date_ui = 	driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
		
		for(WebElement da : date_ui)
		{
			if(da.getText().equals(date))
			{
				da.click();
			}
		}
	}
	
static void PastDate(WebDriver driver, String month, String year,String date) throws InterruptedException {
		
		while(true) {
		//	Thread.sleep(1000);
		String month_ui = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
		String year_ui = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		
		if(year.equals(year_ui)&&month.equalsIgnoreCase(month_ui))
		{
			break;
		}
		//Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		}
		
List<WebElement> date_ui = 	driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
		
		for(WebElement da : date_ui)
		{
			if(da.getText().equals(date))
			{
				da.click();
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("headless");

		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.navigate().to("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//approach 1 
		//driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("09/10/2025");
		
		//aproach 2 
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
		String year = "2023";
		String month = "May";
		String date = "15";
		
		
		
		//FutureDate(driver,month,year,date);
		//PastDate(driver,month,year,date);

		//We can pass them directly also 
		FutureDate(driver,"May","2025","15");
	}
}
