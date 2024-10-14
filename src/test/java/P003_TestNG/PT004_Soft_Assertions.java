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
import org.testng.asserts.SoftAssert;
//Soft assertions do not through errors 
public class PT004_Soft_Assertions {
	
	SoftAssert sa = new SoftAssert();
	
	@Test(priority =1)
	void test_assertions() {
		  String actual = "ABX";
		  String expected = "A1BX";
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(1, 2);
		  
		  System.out.println("After assertion ");
		  
		  sa.assertEquals(actual, expected);
		  Assert.assertNotEquals(actual, expected);
			
		sa.assertTrue(1==2); 
		 sa.assertFalse(1==1); 
		sa.assertNull(actual);
		 sa.assertNotNull(expected);
		//  sa.fail();
			 sa.assertAll();
	}

	@Test(priority =2)
	void test_assertions2() {
		sa.assertNotEquals(1, 2);
	}


	@Test(priority =3)
	void test_assertions3() {
		sa.assertTrue(true);
	}
	
	@Test(priority =4)
	void test_assertions4() {
		sa.assertFalse(false);
	}
	
	@Test(priority =5)
	void test_assertions5() {
		sa.assertNull(null);
	}
	
	@Test(priority =6)
	void test_assertions6() {
		sa.assertNotNull("1");
	}
	@Test(priority =7)
	void test_assertions7() {
		sa.fail();
		 sa.assertAll();
		 
		 System.out.println("Assertions ");
	}
	
	
}
 