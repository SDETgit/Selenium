package S_004_data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	driver.get(url);
	String filepath = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\Interest_calculator_2.xlsx";
	
	int rows = ExcelUtils.getRowCount(filepath, "Data");
	
	for(int i=1;i<=rows;i++)
	{
		//Read data from Excel 
		Thread.sleep(2);
		String IDA = ExcelUtils.getCellData(filepath, "Data", i, 0);
		String Length = ExcelUtils.getCellData(filepath, "Data", i, 1);
		String Interest = ExcelUtils.getCellData(filepath, "Data", i, 2);
		String compounding = ExcelUtils.getCellData(filepath, "Data", i, 3);
		String Total = ExcelUtils.getCellData(filepath, "Data", i, 4);
		
		//Pass data into the application 
		WebElement ida_w = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
		WebElement length_w = driver.findElement(By.xpath("//input[@formcontrolname=\"cdLength\"]"));
		WebElement Interest_w = driver.findElement(By.xpath("//input[@formcontrolname=\"cdRate\"]"));
		List<WebElement> compound = driver.findElements(By.xpath("//div[@role=\"listbox\"]"));
		WebElement total_w = driver.findElement(By.xpath("//span[@id=\"displayTotalValue\"]"));
		WebElement comp = driver.findElement(By.xpath("//*[@id=\"mat-select-value-1\"]"));
		
		ida_w.clear();
		length_w.clear();
		Interest_w.clear();
		ida_w.sendKeys(IDA);
		length_w.sendKeys(Length);
		Interest_w.sendKeys(Interest);
		comp.click();
		
		if(compounding.equals("Compounded Monthly"))
		{
			driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
		}
		
		else {
			driver.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span")).click();
		}
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement uton = driver.findElement(By.xpath("//button[@id=\"CIT-chart-submit\"]"));
		  js.executeScript("arguments[0].click()", uton) ;
		String Total_ac=total_w.getText();
		System.out.println(Total_ac);
		//Validation 
		if(Total.equals(Total_ac))
			
		{
			System.out.println("Test is passed ");
			ExcelUtils.fillGreenColor(filepath, "Data", i, 7);
			ExcelUtils.setCellData(filepath, "Data", i, 7, "Passed");
			
			ExcelUtils.setCellData(filepath, "Data", i, 6, Total_ac);
		}
		else 
		{
			System.out.println("Test is failed ");
			ExcelUtils.fillRedColor(filepath, "Data", i, 7);
			ExcelUtils.setCellData(filepath, "Data", i, 7, "Failed");
			
			ExcelUtils.setCellData(filepath, "Data", i, 6, Total_ac);
		}
	}
	}}																					
