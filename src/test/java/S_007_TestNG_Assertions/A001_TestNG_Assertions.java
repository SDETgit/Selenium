package S_007_TestNG_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A001_TestNG_Assertions {
  @Test
  public void f() {
	  String a = "ABX";
	  String b = "abx";
	  
	  Assert.assertEquals(a, b);
  }
  public void zf() {
	  String a = "ABX";
	  String b = "abx";
	  
	 if(a.equals(b))
{
	System.out.println("Passed");
	Assert.assertTrue(true);
}
	 else {
		 System.out.println("Failed");
		 Assert.assertFalse(false);
	 }
  }
}
