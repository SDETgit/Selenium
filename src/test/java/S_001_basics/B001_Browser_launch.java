package S_001_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class B001_Browser_launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
	//	EdgeDriver driver = new EdgeDriver();
		driver.get("https://novoresume.com/editor/resume/54180ca0-8a80-11e9-bc23-9bd374f02780");
		
		//3) Validate title
		String title= driver.getTitle();
		if(title.equals("Authentication Required | Novorésumé"))
		{
		System.out.println("Passed");
		}
		else
		{
		System.out.println("Failed");
		}
		//4) close browser
		//driver.close();
		driver.quit();
		 //close() closes only the current window on which Selenium is running automated tests.
        //The WebDriver session, however, remains active. On the other hand, the driver. quit()
        //method closes all browser windows and ends the WebDriver session.

	}

}
