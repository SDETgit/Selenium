package S_004_data_driven_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

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

public class D003_Writing_data_into_Excel_dynamic {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
	
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\WriteExcel.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows ? ");
		int rows = sc.nextInt();
		
		System.out.println("How many cells ?");
		int cols = sc.nextInt();
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell=  row.createCell(j);
				cell.setCellValue(sc.next());
			}
		}
	
		workbook.write(file);
			 workbook.close();
			 file.close();
			 System.out.println("Done");
	}}																					
