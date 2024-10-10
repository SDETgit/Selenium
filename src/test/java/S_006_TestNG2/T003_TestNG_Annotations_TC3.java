package S_006_TestNG2;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class T003_TestNG_Annotations_TC3 {
  @Test
  public void f() {System.out.println("This is being executed @Test"); 
  }
  
  @Test
  public void f2() {System.out.println("This is being executed @Test2"); 
  }
  @BeforeMethod
  public void beforeMethod() {System.out.println("This is being executed @beforeMethod"); 
	  
  }

  @AfterMethod
  public void afterMethod() {System.out.println("This is being executed @afterMethod"); 
  }

  @BeforeClass
  public void beforeClass() {System.out.println("This is being executed @beforeClass"); 
  }

  @AfterClass
  public void afterClass() {System.out.println("This is being executed @afterClass"); 
  }

  @BeforeTest
  public void beforeTest() {System.out.println("This is being executed @beforeTest"); 
  }

  @AfterTest
  public void afterTest() {System.out.println("This is being executed @afterTest"); 
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is being executed @BeforeSuite"); 
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is being executed @afterSuite"); 
  }

}
