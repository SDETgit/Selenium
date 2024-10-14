package P002_Practice_2_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

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

public class PDDT003_data_driven_testing {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		
		String filePath = "C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\Interest_calculator.xlsx";
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		int rows = ExcelUtils.getRowCount(filePath,"Data");
		
		for(int i=1;i<=rows;i++) {
			
			//Read data from Excel 
		String PrincipalE= 	ExcelUtils.getCellData(filePath, "Data", i, 0);
		String ROIE= 	ExcelUtils.getCellData(filePath, "Data", i, 1);
		String per1= 	ExcelUtils.getCellData(filePath, "Data", i, 2);
		String per2= 	ExcelUtils.getCellData(filePath, "Data", i, 3);
		String freq= 	ExcelUtils.getCellData(filePath, "Data", i, 4);
		String maturity_amount= ExcelUtils.getCellData(filePath, "Data", i, 5);
		
			//Pass into the application
		WebElement Principal=		driver.findElement(By.xpath("//*[@id=\"principal\"]"));
		Principal.sendKeys(PrincipalE);
		WebElement ROI =		driver.findElement(By.xpath("//*[@id=\"interest\"]"));
		ROI.sendKeys(ROIE);
		WebElement period =		driver.findElement(By.xpath("//*[@id=\"tenure\"]"));
		period.sendKeys(per1);
		WebElement tenure=		driver.findElement(By.xpath("//*[@id=\"tenurePeriod\"]"));
		Select t = new Select(tenure);
		t.selectByVisibleText(per2);
		WebElement frequecy=		driver.findElement(By.xpath("//*[@id=\"frequency\"]"));
		Select f = new Select(frequecy);
		f.selectByVisibleText(freq);
		WebElement calculate=		driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
		  js.executeScript("arguments[0].click()", calculate) ;
		
		WebElement clear=		driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[2]/img"));
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong"));
		String amount = result.getText();
		Double amount_int =  Double.parseDouble(amount);
		Double maturity_amount_int = Double.parseDouble(maturity_amount);
			//Validate it 
		System.out.println(amount_int+" "+maturity_amount_int);
		if(amount_int.equals(maturity_amount_int))
		{
			System.out.println("Test is passed ");
			ExcelUtils.setCellData(filePath, "Data", i, 7, "Passed");
			ExcelUtils.fillGreenColor(filePath, "Data", i, 7);
		}
		
		else {
			System.out.println("Test is Failed ");
			ExcelUtils.setCellData(filePath, "Data", i, 7, "Failed");
			ExcelUtils.fillRedColor(filePath, "Data", i, 7);
		}
		  js.executeScript("arguments[0].click()", clear) ;
		
		}
	}
}
