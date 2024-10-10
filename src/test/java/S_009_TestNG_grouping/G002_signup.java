package S_009_TestNG_grouping;

import org.testng.annotations.Test;

public class G002_signup {
	@Test (priority =1, groups = {"Regression"})
	  public void Facebooks() {
		System.out.println("Sign up to facebook");
		
	  }
	
	@Test (priority =2, groups = {"Regression"})
	  public void twitters() {
		System.out.println("Sign up to twitter");
		
	  }
	
	@Test (priority =3, groups = {"Regression"})
	  public void gmails() {
		System.out.println("Sign up to gmail");
		
	  }
}
