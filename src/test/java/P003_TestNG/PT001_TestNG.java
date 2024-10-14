package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PT001_TestNG {
@Test
void test1() {
	System.out.println("Test1");
}


@Test (priority =-3)
void test2() {
	System.out.println("Test2");
}


@Test (priority =2)
void test3() {
	System.out.println("Test3");
}



@Test (priority =1)
void test4() {
	System.out.println("Test4");
}
WebDriver driver ; 

@Test(priority =-100)
void launch () {
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.demoblaze.com//");
	driver.manage().window().maximize();
	System.out.println("-100");
	
}

@Test(priority =-99)
void validate () {
	WebElement logo = driver.findElement(By.xpath("//*[@id=\"nava\"]/img"));
	if(logo.isDisplayed())
	{
		System.out.println("Passed");
	}
	else 
		System.out.println("Failed");
	
	System.out.println("-99");
	
}

@Test(priority =-98)
void close () {
	
	driver.close();
	System.out.println("-98");
}






}
 