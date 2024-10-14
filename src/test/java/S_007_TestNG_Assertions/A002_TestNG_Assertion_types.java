package S_007_TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A002_TestNG_Assertion_types {
	
	  @Test public void hardAssertions() {
	  
	  String actual = "ABX"; String expected = "ABX";
	  
	  Assert.assertEquals(actual, expected);
	  
	  // Assert.assertEquals(actual, expected); // Assert.assertNotEquals(actual,	  expected);
	  
	  //Assert.assertTrue(1==2); // Assert.assertFalse(1==1);
	  //Assert.assertNull(actual); // Assert.assertNotNull(expected); //
	  Assert.fail();
	  
	  }
	 
  
  @Test
public void SoftAssertions() {
	  
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
}
