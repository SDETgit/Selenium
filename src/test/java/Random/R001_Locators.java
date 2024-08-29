package Random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R001_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//Locators 
		//1. ID 
	boolean elemenr = 	driver.findElement(By.id("cat")).isDisplayed();
	
	System.out.println(elemenr);
	//System.out.println(driver.getPageSource());
	
		//2. Name 
	boolean elemenr2 = 	driver.findElement(By.name("frm")).isDisplayed();
	System.out.println(elemenr2);
		//3. Class name
	String text = driver.findElement(By.className("list-group-item")).getText() ;
	System.out.println(text);
		//4. Tag name
	List<WebElement> el= driver.findElements(By.tagName("a"));
	System.out.println(el.size());
		//5. LinkText 
	boolean dis = driver.findElement(By.linkText("Phones")).isDisplayed();
	System.out.println(dis);
		//6. Partial LinkText 
	boolean dis2 = driver.findElement(By.partialLinkText("on")).isDisplayed();
	String text2 = driver.findElement(By.partialLinkText("on")).getText();
	System.out.println(dis2);
	System.out.println(text2);
		
		
	}	

}
