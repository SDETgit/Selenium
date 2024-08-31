package Random;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R002_CSS_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//CSS Locators 
		//1. Tag and id  tag#id
		String text = driver.findElement(By.cssSelector("a#itemc")).getText();
		System.out.println(text);
		//2. Tag and class  tag.class 
		String text2 = driver.findElement(By.cssSelector("a.list-group-item")).getText();
		System.out.println(text2);
		//3. Tag and attribute tag[attribute='value']
		String text3 = driver.findElement(By.cssSelector("a[onclick=\"byCat('notebook')\"]")).getText();
		System.out.println(text3);
		//4. Tag and class and attribute tag.class[attribute='value']
		String text4 = driver.findElement(By.cssSelector("a.list-group-item[onclick=\"byCat('monitor')\"] ")).getTagName();
		//String text5 = text3.getCssValue();
		System.out.println(text4);
		//System.out.println(text5);
		org.openqa.selenium.Dimension text6 = driver.findElement(By.cssSelector("a.list-group-item[onclick=\"byCat('monitor')\"] ")).getSize();
		System.out.println(text6);
		
		//Here tag name is optional even if we remove it, it will works exactly same 
		
		
		
	}	

}
