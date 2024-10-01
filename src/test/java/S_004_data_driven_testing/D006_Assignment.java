package S_004_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class D006_Assignment {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
		//Locating properties file 
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\config2.properties");
			
		//Loading properties file 
			Properties prop = new Properties();
			prop.load(file);
			
			String url = prop.getProperty("appurl");
	ChromeDriver driver = new ChromeDriver();
	driver.get(url);
	}}																					
