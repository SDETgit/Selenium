package S_009_TestNG_grouping;

import org.testng.annotations.Test;

public class G003_payment {
	@Test (priority =1, groups = {"Regression","Sanity","Functional"})
	  public void PaymentinITR() {
		System.out.println("Payment in ITR");
		
	  }
	
	@Test (priority =1, groups = {"Regression","Sanity","Functional"})
	  public void PaymentinDollar() {
		System.out.println("Payment in dollar");
		
	  }
	
	
}
