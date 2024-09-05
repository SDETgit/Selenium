package S_001_basics;


import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B023_AutoSuggestion_Dropdown {
	//https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
	public static void main(String[] args) throws InterruptedException {
		
		// Create ChromeOptions instance
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
	
		 ChromeDriver driver = new ChromeDriver(options) ;
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 //using duck duck go 
			/*
			 * driver.get("https://duckduckgo.com/");
			 * 
			 * Set<String> win= driver.getWindowHandles(); System.out.println(win);
			 * driver.findElement(By.xpath("//*[@id=\"searchbox_input\"]")).sendKeys(
			 * "Selenium"); List<WebElement> dr=
			 * driver.findElements(By.xpath("//li[@class=\"searchbox_suggestion__csrUQ\"]"))
			 * ;
			 * 
			 * 
			 * 
			 * Thread.sleep(4000); try { for(WebElement s : dr) {
			 * if(s.getText().equals("selenium webdriver")) { s.click(); } }
			 * }catch(StaleElementReferenceException e) { System.out.println(e); }
			 */
		 
		 //using google .com 
			
			/*
			 * driver.get("https://www.google.com/");
			 * 
			 * Set<String> win = driver.getWindowHandles(); System.out.println(win);
			 * driver.findElement(By.xpath("//textarea[@title=\"Search\"]")).sendKeys(
			 * "Selenium"); List<WebElement> dr =
			 * driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li//div/span"));
			 * 
			 * Thread.sleep(4000); try { for (WebElement s : dr) {
			 * System.out.println(s.getText()); if
			 * (s.getText().equalsIgnoreCase("selenium webdriver")) { s.click(); } } } catch
			 * (StaleElementReferenceException e) { System.out.println(e); }
			 * System.out.println("Clicking last ");
			 * driver.findElement(By.xpath("(//div[@role=\"option\"])[4]")).click();
			 */ 
		 //using https://testautomationpractice.blogspot.com/
			/*
			 * driver.get("https://testautomationpractice.blogspot.com/");
			 * 
			 * Set<String> win= driver.getWindowHandles(); System.out.println(win);
			 * driver.findElement(By.xpath(
			 * "//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
			 * driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).
			 * click(); List<WebElement> dr=
			 * driver.findElements(By.xpath("//div[@id=\"wikipedia-search-result-link\"]//a"
			 * ));
			 * 
			 * 
			 * 
			 * Thread.sleep(4000); try { for(WebElement s : dr) {
			 * System.out.println(s.getText()); if(s.getText().equalsIgnoreCase("Selenium"))
			 * { s.click(); } } }catch(StaleElementReferenceException e) {
			 * System.out.println(e); } System.out.println("Clicking last ");
			 */
			 // driver.findElement(By.xpath("(//div[@role=\"option\"])[4]")).click();
			// using bjs .com 

		  driver.get("https://www.bjs.com/");
		  
		  Set<String> win= driver.getWindowHandles();
		  System.out.println(win);
		  driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("phones"); 
		//  driver.findElement(By.xpath("//input[@class=\"wikipedia-search-button\"]")).click();
		  List<WebElement> dr=
		  driver.findElements(By.xpath("//a[@auto-data=\"searchBar_searchRedirectedPage\"]//span"));
		  
		  
		  
		  Thread.sleep(4000);
		  try { for(WebElement s : dr) {
		  System.out.println(s.getText());
		  if(s.getText().equalsIgnoreCase("phones cell")) { s.click(); } }
		  }catch(StaleElementReferenceException e) { System.out.println(e); }
		  System.out.println("Clicking last ");
	}}																					
