package P002_Practice_2_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import S_004_data_driven_testing.ExcelUtils;

public class PDDT004_properties_file {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\config2.properties");
		Properties prop = new Properties();
		prop.load(file);
		String url = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		String orderid = prop.getProperty("orderid");
		String customerid = prop.getProperty("customerid");
		System.out.println(url+" "+email+" "+password+" "+ orderid+" "+customerid);
		
	}
}
