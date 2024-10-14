package P003_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PT003_Hard_Assertions {

	@Test(priority =1)
	void test_assertions() {
		Assert.assertEquals(1, 1);
	}

	@Test(priority =2)
	void test_assertions2() {
		Assert.assertNotEquals(1, 2);
	}


	@Test(priority =3)
	void test_assertions3() {
		Assert.assertTrue(true);
	}
	
	@Test(priority =4)
	void test_assertions4() {
		Assert.assertFalse(false);
		
	}
	
	@Test(priority =5)
	void test_assertions5() {
		Assert.assertNull(null);
	}
	
	@Test(priority =6)
	void test_assertions6() {
		Assert.assertNotNull("1");
	}
	@Test(priority =7)
	void test_assertions7() {
		Assert.fail();
	}
	
	
}
 