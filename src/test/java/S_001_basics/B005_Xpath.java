package S_001_basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B005_Xpath {

	public static void main(String[] args) throws InterruptedException {
		   ChromeDriver driver = new ChromeDriver();
           driver.get("https://www.demoblaze.com/");
           driver.manage().window().maximize();
           //Absolute Xpath
//driver.findElement(By.xpath("/html/body/nav/div[1]/ul/li[2]/a")).click();
           //System.out.println("Click done");
            //Using  xpath
           //driver.findElement(By.xpath("//*[@class='list-group-item'][3]")).click();
                                      

            //Xpath with mutiple attributes
//driver.findElement(By.xpath("//a[@onclick=\"byCat('notebook')\"][@class=\"list-group-item\"]")).click();
           //Xpath with and
//driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\" and @class=\"list-group-item\"]")).click();  //Here both classes must match
           //xapth with or
//driver.findElement(By.xpath("//a[@onclick=\"byCat('monitor')\" or @class=\"list-group-1item\"]")).click(); //in or condition added 1 at list-group-1item so that it do not match multiple web elements with class name as list-group-item
           //xpath with inner text
     //driver.findElement(By.xpath("//a[text()='Monitors']")).click();
           boolean status = driver.findElement(By.xpath("//*[text()='About Us']")).isDisplayed();
           System.out.println(status);
           String text = driver.findElement(By.xpath("//*[text()='About Us']")).getText();
           System.out.println(text);
           //xpath with contains
           String text2 = driver.findElement(By.xpath("//*[contains(text(),'We believe')]")).getText();
           System.out.println(text2);
           //xpath with start-with
           String text3 = driver.findElement(By.xpath("//*[starts-with(text(),'We believe')]")).getText();
           System.out.println(text3);
           //Chained Xpath
           String text4=              driver.findElement(By.xpath("//*[@class=\"col-lg-3\"]/div/a[1]")).getText();
           System.out.println(text4);

       

       

       

	}

}
