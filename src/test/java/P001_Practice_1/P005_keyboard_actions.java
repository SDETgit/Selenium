package P001_Practice_1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P005_keyboard_actions {
	
	

	public static void main(String[] args) throws InterruptedException  {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://quickdiff.net/");
		
		Actions act = new Actions(driver);
		WebElement text1 = driver.findElement(By.xpath("/html/body/form/textarea[1]"));
		WebElement text2 = driver.findElement(By.xpath("/html/body/form/textarea[2]"));
		
	//	act.moveToElement(text1).click().sendKeys("ABds ").build().perform();
	//	act.keyDown(Keys.CONTROL).sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	//	act.moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		act.moveToElement(text1).click().sendKeys("ABds ").keyDown(Keys.CONTROL).
		sendKeys("A").sendKeys("C").keyUp(Keys.CONTROL).
		moveToElement(text2).click().keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	}

}
