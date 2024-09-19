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
import org.openqa.selenium.support.ui.Select;

public class S008_date_pickers2 {
	

		static Month convert_Month(String month) {
			
			HashMap<String, Month> monthMap = new HashMap<String, Month>();
			monthMap.put("January",Month.JANUARY);
			monthMap.put("February",Month.FEBRUARY);
			monthMap.put("March",Month.MARCH);
			monthMap.put("April",Month.APRIL);
			monthMap.put("May",Month.MAY);
			monthMap.put("June",Month.JUNE);
			monthMap.put("July",Month.JULY);
			monthMap.put("August",Month.AUGUST);
			monthMap.put("September",Month.SEPTEMBER);
			monthMap.put("October",Month.OCTOBER);
			monthMap.put("November",Month.NOVEMBER);
			monthMap.put("December",Month.DECEMBER);
			monthMap.put("JANUARY",Month.JANUARY);
			monthMap.put("FEBRUARY",Month.FEBRUARY);
			monthMap.put("MARCH",Month.MARCH);
			monthMap.put("APRIL",Month.APRIL);
			monthMap.put("MAY",Month.MAY);
			monthMap.put("JUNE",Month.JUNE);
			monthMap.put("JULY",Month.JULY);
			monthMap.put("AUGUST",Month.AUGUST);
			monthMap.put("SEPTEMBER",Month.SEPTEMBER);
			monthMap.put("OCTOBER",Month.OCTOBER);
			monthMap.put("NOVEMBER",Month.NOVEMBER);
			monthMap.put("DECEMBER",Month.DECEMBER);
			
			Month vmonth = monthMap.get(month);
			if(vmonth ==null)
			{
				System.out.println("Invalid month...");
			}
			
			return vmonth;
		}
		
		static void date_select (WebDriver driver, String year, String month, String date) {
				       	        
		        driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();
		        WebElement year_select = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		        Select drop_year = new Select(year_select);
		                      drop_year.selectByVisibleText(year);
		                      
		        while(true) {
		        String Month_ui =  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span")).getText();
		        Month expected_month = convert_Month(month);
		        Month actual_month_ui = convert_Month(Month_ui);
		        
		        int result = expected_month.compareTo(actual_month_ui);
		        //0 both equal 
		        //>0 future month
		        //<0 past 
		        if(result>0)
		        {
		        	 driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
		        }
		        else if (result<0)
		        {
		        	driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
		        }
		        else 
		        { 		        	break;  		        } 		        }
		        
		        
		List<WebElement> table=          driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tr//td"));
		        for(WebElement a : table)
		        {
		                      if(a.getText().equalsIgnoreCase(date))
		                      {
		                                     a.click();
		                                     break;
		                      }
		        }
		       
		}
		

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //ChromeOptions options = new ChromeOptions();
        // options.addArguments("--headless");
        //ChromeDriver driver = new ChromeDriver(options) ;
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.switchTo().frame("frame-one796456169");        
        driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-0\"]")).sendKeys("Logins");
        //approach 1
        // driver.findElement(By.xpath("//input[@name=\"RESULT_TextField-2\"]")).sendKeys("10/10/2029");
        //appraoch 2
        driver.findElement(By.xpath("//span[@class=\"icon_calendar\"]")).click();
        String year = "1997";
        String month = "January";
        String date = "25";
        date_select(driver,"2002","MAY","30");
		
		
	
	}
}
