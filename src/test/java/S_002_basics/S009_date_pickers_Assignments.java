package S_002_basics;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class S009_date_pickers_Assignments {
	
	static void date_picker (WebDriver driver,  Actions actions, String year, String month , String date) {
		  WebElement dropdown_m = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
	        
	        Select departure_month = new Select(dropdown_m);
	        
	        
	        departure_month.selectByVisibleText(month);
	        WebElement dropdown_y = driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]"));
	        
	        
	        Select departure_year = new Select(dropdown_y);
	        departure_year.selectByVisibleText(year);
	        
	        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
	        
	        for(WebElement da : dates )
	        {
	        	if(da.getText().equals(date))
	        	{
	        		 actions.moveToElement(da).click().perform();
	        	}
	        }
	}
	static void date_picker2 (WebDriver driver,  Actions actions, String month , String date) {
		  WebElement dropdown_m = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
	        
	        Select departure_month = new Select(dropdown_m);
	        
	        
	        departure_month.selectByVisibleText(month);
	        WebElement dropdown_y = driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]"));
	        
	        
	        
	        
	        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
	        
	        for(WebElement da : dates )
	        {
	        	if(da.getText().equals(date))
	        	{
	        		 actions.moveToElement(da).click().perform();
	        	}
	        }
	}

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://dummy-tickets.com/");
        
        Thread.sleep(5000);
      WebElement both =   driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/div[2]/div/div[3]/div/div/section/div/div[1]/ul/li[3]/a"));
      Actions actions = new Actions(driver);

      actions.moveToElement(both).click().perform();

   WebElement radiobutton_multi =      driver.findElement(By.xpath("//input[@value=\"multicityfh\"]"));
   actions.moveToElement(radiobutton_multi).click().perform();

        driver.findElement(By.xpath("//*[@id=\"both_multycity\"]/div[1]/div[1]/div[1]/input")).sendKeys("Australia");
        
        Thread.sleep(500);
      List<WebElement> dropdown_from=  driver.findElements(By.xpath("//ul[@class=\"suggestions-list\"]//div[@class=\"city\"]"));
      
      for(WebElement d1 :dropdown_from )
      {
    	  if(d1.getText().equalsIgnoreCase("Granites"))
    	  {
    		  
    		  actions.moveToElement(d1).click().perform();
    	  }
      }
      
      driver.findElement(By.xpath("//*[@id=\"both_multycity\"]/div[1]/div[1]/div[2]/input")).sendKeys("USA");
      List<WebElement> dropdown_to=  driver.findElements(By.xpath("//*[@id=\"both_multycity\"]/div[1]/div[1]/div[2]/ul/li/div/div/div"));
      Thread.sleep(500);
      for(WebElement d1 :dropdown_to )
      {
    	  System.out.println("Click doing"+d1.getText());
    	  if(d1.getText().equalsIgnoreCase("Lusaka")||d1.getText().equalsIgnoreCase("Augusta"))
    	  {
    		   
    		  System.out.println("Click done");
    		  
    		  actions.moveToElement(d1).click().perform();
    	  }
      }
     WebElement departure_b =    driver.findElement(By.xpath("(//*[@name=\"departure[]\"])[6]"));
        
     Thread.sleep(1200);
	  actions.moveToElement(departure_b).click().perform();
        
		/*
		 * WebElement dropdown_m =
		 * driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		 * 
		 * Select departure_month = new Select(dropdown_m); String year = "2025"; String
		 * month = "Jan"; String date = "25";
		 * 
		 * departure_month.selectByVisibleText(month); WebElement dropdown_y =
		 * driver.findElement(By.xpath("//select[@aria-label=\"Select year\"]"));
		 * 
		 * 
		 * Select departure_year = new Select(dropdown_y);
		 * departure_year.selectByVisibleText(year);
		 * 
		 * List<WebElement> dates = driver.findElements(By.xpath(
		 * "//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
		 * 
		 * for(WebElement da : dates ) { if(da.getText().equals(date)) {
		 * actions.moveToElement(da).click().perform(); } }
		 */
	  date_picker(driver, actions, "2025", "Jan", "26");
	  
	   driver.findElement(By.xpath("(//*[@name=\"city[]\"])[4]")).sendKeys("Amsterdam");
	 
	  List<WebElement> city_list = driver.findElements(By.xpath("//*[@id=\"both_multycity\"]/div[5]/div/div/ul/li/div/p"));
	  for(WebElement d1 :city_list )
      {
    	  System.out.println("Click doing"+d1.getText());
    	  if(d1.getText().equalsIgnoreCase("Lusaka")||d1.getText().equalsIgnoreCase("Amsterdam"))
    	  {
    		   
    		  System.out.println("Click done");
    		  
    		  actions.moveToElement(d1).click().perform();
    	  }
      }
	  
	  WebElement city_date_fr = driver.findElement(By.xpath("(//input[@name=\"checkin[]\"])[4]"));
	  actions.moveToElement(city_date_fr).click().perform();
	  date_picker2(driver, actions, "Jan", "26");
	  WebElement city_date_to = driver.findElement(By.xpath("(//input[@name=\"checkout[]\"])[4]"));
	  actions.moveToElement(city_date_to).click().perform();
	  date_picker2(driver, actions, "Jan", "28");
	  
	  
	}
}
