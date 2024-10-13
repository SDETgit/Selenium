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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P004_Mouse_Actions {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement hover = driver.findElement(By.xpath("//*[@id=\"Attribution1\"]/div[1]/a[1]"));
	    Actions act = new Actions(driver);  
	    
		/*
		 * Thread.sleep(2000); //hover act.moveToElement(hover).build().perform();
		 * Thread.sleep(2000); //click WebElement button =
		 * driver.findElement(By.xpath("//button[@name=\"start\"]"));
		 * 
		 * act.moveToElement(button).click().perform(); Thread.sleep(2000); //Double
		 * click
		 * 
		 * WebElement doublecl =
		 * driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		 * 
		 * act.moveToElement(doublecl).doubleClick().perform();
		 * 
		 * 
		 * 
		 * Thread.sleep(2000); //drag and drop WebElement source =
		 * driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")); WebElement target =
		 * driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 * act.dragAndDrop(source, target).perform(); Thread.sleep(2000);
		 * 
		 * //right click act.contextClick(source); WebElement rightc =
		 * driver.findElement(By.xpath("//*[@id=\"HTML11\"]/h2"));
		 * 
		 * act.moveToElement(rightc).contextClick().perform();
		 * 
		 * // click and hold release driver.switchTo().newWindow(WindowType.TAB);
		 * driver.get("https://testautomationpractice.blogspot.com/"); WebElement
		 * source1 = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		 * WebElement target1 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 * act.clickAndHold(source1).moveToElement(target1).release().build().perform();
		 */
	    //Slider 
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	    WebElement slider_start = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
	    WebElement slider_finish = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
	    System.out.println("Slider location " +slider_start.getLocation()); //Slider location (411, 250) (x , Y )
	    System.out.println("Slider location " +slider_finish.getLocation()); //Slider location (411, 250) (x , Y )
	    act.dragAndDropBy(slider_start, 200, 0).build().perform();
	    act.dragAndDropBy(slider_finish, -100,0).perform();
	    System.out.println("Slider location " +slider_start.getLocation()); //Slider location (411, 250) (x , Y )
	    System.out.println("Slider location " +slider_finish.getLocation()); //Slider location (411, 250) (x , Y )
	    System.out.println("Scroll done ");
	    Thread.sleep(1000);
	  }

}
