package S_006_TestNG2;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T004_TestNG_Annotations_TC5 {
	public class Before_Group {
		@BeforeGroups(groups = {"authentication"})
	    public void setUpAuthentication() {
	        System.out.println("Database setup complete for authentication tests.");
	    }

	    @Test(groups = {"authentication"})
	    public void testLogin() {
	        System.out.println("Login test executed.");
	    }
	    @Test(groups = {"authentication"})
	    public void testSignup() {
	        System.out.println("Signup test executed.");
	    }
	    @Test(groups = {"authentication"})
	    public void testSignout() {
	        System.out.println("Signout test executed.");
	    }

		@AfterGroups("Frontend Testing")  
	    public void after_group()  
	    {  
	    System.out.println("Above are the frontend testing type");  
	    }  
	    @Test(groups= {"Frontend Testing"})  
	     public void fun1() {
	         System.out.println("Unit Testing");
	     }
	     @Test(groups= {"Frontend Testing"})
	     public void fun2() {
	         System.out.println("Integration Testing:");
	     }
	     @Test(groups= {"Frontend Testing"})
	     public void fun3() {
	         System.out.println("Regression Testing");
	     }
	     @Test(groups= {"Backend Testing"})
	     public void fun4() {
	         System.out.println("Structural testing");
	     }

	}}
