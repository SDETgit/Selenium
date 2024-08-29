package S_001_basics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B004_CSS_Selectors {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
       
        driver.get("https://www.demoblaze.com/");
       
        //total links in webpage
        driver.manage().window().maximize();
                                   
        //cssSelector
       
        //1. tag and ID   tag#id
       
        //driver.findElement(By.cssSelector("a#login2")).click();
        //Note:- tag is optional we can write it without tag name also

       //driver.findElement(By.cssSelector("#login2")).click();
       
        //2. Tag and Class  tag.class
        //driver.findElement(By.cssSelector("a.nav-link")).click();
        //driver.findElement(By.cssSelector(".nav-link")).click(); without tag name
       
        //3. tag and attribute  tag[attribute = value ]
        //driver.findElement(By.cssSelector("a[data-target='#logInModal']")).click();
        //driver.findElement(By.cssSelector("[data-target='#logInModal']")).click(); //without tag name
       
        //4. tag class and attribute   tag.classname[attribute = value ]
        driver.findElement(By.cssSelector("a.nav-link[id='cartur']")).click();
        //driver.findElement(By.cssSelector(".nav-link[id='cartur']")).click(); //without tag name

       

       

       

	}

}
