package S_001_basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B006_Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		   ChromeDriver driver = new ChromeDriver();
           driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
           driver.manage().window().maximize();
           
          //0 . Self selects itself 
           String text1 = driver.findElement(By.xpath("//a[contains(text(),'Simplex R')]/self::a")).getText();
           System.out.println(text1);
         //1. Locating xpath by ancestors 
           String text2  = driver.findElement(By.xpath("//*[contains(text(),'Simplex R')]/ancestor::div/div[1]")).getText();
           System.out.println(text2 );
           
         //2. Locating xpath by parent
           String text3  = driver.findElement(By.xpath("//*[contains(text(),'Simplex R')]/parent::td")).getText();
           System.out.println(text3 );
         //3. Locating xpath by self 
           String text4  = driver.findElement(By.xpath("//a[contains(text(),'Simplex R')]/self::a")).getText();
           System.out.println(text4 );
         //4. Locating xpath by following 
           String text5  = driver.findElement(By.xpath("//*[contains(text(),'Simplex R')]/following::tr[1]")).getText();
           System.out.println(text5 );
         //5. Locating xpath by preceding
           String text6  = driver.findElement(By.xpath("//*[contains(text(),'Simplex R')]/preceding::tr[1]")).getText();
           System.out.println(text6 );

           driver.get("https://www.demoblaze.com/");
           //6. Locating xpath by following sibling
           String text7  = driver.findElement(By.xpath("//*[contains(text(),'Phones')]/preceding-sibling::*")).getText();
           System.out.println(text7 );
         //7. Locating xpath by preceding sibling 
           String text8  = driver.findElement(By.xpath("//*[contains(text(),'Phones')]/following-sibling::a[1]")).getText();
           System.out.println(text8 );
         //8. Locating xpath by child
         //  String text9  = driver.findElement(By.xpath("//*[@class=\"list-group\"]//a")).getText();
           String text9  = driver.findElement(By.xpath("//*[@class=\"list-group\"]/child::a")).getText();
         
           System.out.println(text9 );
         //9. Locating xpath by grand child /descendant 
           String text10 = driver.findElement(By.xpath("//*[@class=\"navbar navbar-toggleable-md bg-inverse\"]/descendant ::li[1]")).getText();
           System.out.println(text10);
         //10. Locating xpath by ancestors. 
           String text11 = driver.findElement(By.xpath("//*[@class=\"list-group-item\"]/ancestor::html")).getText();
           System.out.println(text11);
          

       

       

       

	}

}
