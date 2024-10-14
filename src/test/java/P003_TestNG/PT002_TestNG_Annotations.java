package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PT002_TestNG_Annotations {
	@BeforeTest
	void testt() {
		System.out.println("Before test");
	}

	@BeforeGroups("FT")
	void testft() {
		System.out.println("Before grups");
	}
	@BeforeClass
void test1() {
	System.out.println("Before class ");
}


@BeforeMethod
void test2() {
	System.out.println("Before method ");
}


@Test (priority =2)
void test3() {
	System.out.println("Test3");
}



@Test (priority =1, groups = {"FT","Regresion"})
void test4() {
	System.out.println("Test4");
}
WebDriver driver ; 

@Test(priority =-100,groups = {"FT","Regresion"})
void launch () {
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.demoblaze.com//");
	driver.manage().window().maximize();
	System.out.println("-100");
	
}

@Test(priority =-99,groups = {"Regresion"})
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

@AfterClass
void close () {
	
	driver.close();
	System.out.println("-98");
}






}
 