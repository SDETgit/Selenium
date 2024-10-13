package P001_Practice_1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P003_Date_picker {
	
	public static void future_date(WebDriver driver, String year, String month, String day) {
		   while (true) {
		    	  WebElement year2 =  driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
			      WebElement month2 =  driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		    	  String year_ui =year2.getText();
		    	  String month_ui =month2.getText();
		    	  System.out.println(year_ui+" "+month_ui);
		    	
		       if(year_ui.equalsIgnoreCase(year)&&month_ui.equalsIgnoreCase(month))
		       {
		    	break;   
		       }
		     
		    WebElement click =   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		       ((JavascriptExecutor) driver).executeScript("arguments[0].click();", click);
		       
		      }
		      List   <WebElement> date = driver.findElements(By.xpath("//a[@class=\"ui-state-default\"]"));
		      for(WebElement da : date)
		      {
		    	  if(da.getText().equals(day))
		    	  {
		    		 da.click();
		    		 break;
		    	  }
		      }
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://jqueryui.com/datepicker/");
	      driver.manage().window().maximize();
	       //Via sendkeys 
	       driver.switchTo().frame(0);
	       
	    //   driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("21/10/2024");
	       
	       //via date select 
	       String day = "21";
	       String month = "january";
	       String year = "2035";
	       driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).click();
	    
	       future_date(driver, year, month, day);
	      
	   
	      
	       
	}

}
