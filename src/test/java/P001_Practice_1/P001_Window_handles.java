package P001_Practice_1;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class P001_Window_handles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		   driver.get("https://www.google.com/"); 
		   driver.switchTo().newWindow(WindowType.TAB);
	       driver.get("https://www.demoblaze.com/");
	       driver.switchTo().newWindow(WindowType.TAB);
	       driver.get("https://testautomationpractice.blogspot.com/");
	       System.out.println(	driver.getTitle());
	    Set<String> windows =    driver.getWindowHandles();
	    
	    System.out.println(windows);
		
		  for(String wh :windows ) { String title =
		  driver.switchTo().window(wh).getTitle(); if(title.equals("STORE")) {
		  driver.switchTo().window(wh); break; } }
		 
	    
	    System.out.println(	driver.getTitle());
	}

}
