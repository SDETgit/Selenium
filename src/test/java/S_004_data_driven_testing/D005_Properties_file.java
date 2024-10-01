package S_004_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class D005_Properties_file {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
	
	//Locating properties file 
	FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\config.properties");
		
	//Loading properties file 
		Properties prop = new Properties();
		prop.load(file);
		
		//Reading data from properties file 
	String url = prop.getProperty("appurl");
	String email = prop.getProperty("email");
	String password = prop.getProperty("password");
	String orderid = prop.getProperty("orderid");
	String customerid = prop.getProperty("customerid");
	
	//Printing data from properties file 
	System.out.println(url+" "+email+" "+password+" "+orderid+" "+customerid);
	
	//Collect only keys from the properties file 
	Set<String> keys1 =prop.stringPropertyNames();
	System.out.println(keys1);
	Set<Object> keys =prop.keySet();
	System.out.println(keys);  //[password, orderid, customerid, appurl, email]

	//Reading values from file 
	Collection<Object> values= prop.values();
	System.out.println(values);
	
		file.close();
	}}																					
