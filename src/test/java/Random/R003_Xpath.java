package Random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R003_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Xpath
		 //tagname[@attribute='value']
		 //*[@attribute='value'] * is regular expression
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		//Xpath 
		
		//Absolute xpath 
		String text1 = driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/a[1]")).getText();
		System.out.println(text1);
		//Relative x path 
		String text = driver.findElement(By.xpath("//*[@class='list-group-item'][1]")).getText();
		System.out.println(text);
		//with multiple attributes 
		String text3 = driver.findElement(By.xpath("//*[@class='list-group-item'][@id='cat']")).getText();
		System.out.println(text3);
		//with and 
		String text4 = driver.findElement(By.xpath("//*[@class='list-group-item' and @onclick=\"byCat('notebook')\"]")).getText();
		System.out.println(text4);
		//with or 
		String text5 = driver.findElement(By.xpath("//*[@class='list-group-item' or @onclick=\"byCat('notebook')\"]")).getText();
		System.out.println(text5);
		//with contains 
		String text6 = driver.findElement(By.xpath("//*[contains(text(),\"Get\")]")).getText();
		System.out.println(text6);
		//with Starts-with 
		String text7 = driver.findElement(By.xpath("//*[starts-with(text(),\"We b\")]")).getText();
		System.out.println(text7);
		//with inner text 
		String text8 = driver.findElement(By.xpath("//*[text() = 'Phones']")).getText();
		System.out.println(text8);
		//with chained x path 
		String text9 = driver.findElement(By.xpath("//*[@id='fotcont']/div/div/div/p")).getText();
		System.out.println(text9);
		
		
		
		
	}	

}
