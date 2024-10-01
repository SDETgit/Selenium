package S_004_data_driven_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.TotalDigitsDocument.TotalDigits;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D002_Writing_data_into_Excel {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
	
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\WriteExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		XSSFRow row = sheet.createRow(0);
		 row.createCell(0).setCellValue("1");
		 row.createCell(0).setCellValue("Java");
		 row.createCell(1).setCellValue(19);
		 row.createCell(2).setCellValue("Automation");
		 
			XSSFRow row2 = sheet.createRow(4);
			 row2.createCell(0).setCellValue("2");
			 row2.createCell(0).setCellValue("Python");
			 row2.createCell(1).setCellValue(19);
			 row2.createCell(2).setCellValue("Automation");
			workbook.write(file);
			 workbook.close();
			 file.close();
			 System.out.println("Done");
	}}																					
