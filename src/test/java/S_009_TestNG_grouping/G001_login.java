package S_009_TestNG_grouping;

import java.nio.channels.AsynchronousServerSocketChannel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G001_login {
	@Test (priority =1, groups = {"Sanity"})
	  public void Facebook() {
		System.out.println("Login up to facebook");
		
	  }
	
	@Test (priority =2, groups = {"Sanity"})
	  public void twitter() {
		System.out.println("Login up to twitter");
		
	  }
	
	@Test (priority =3, groups = {"Sanity"})
	  public void gmail() {
		System.out.println("Login up to gmail");
		
	  }
}
