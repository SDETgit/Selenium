package S_004_data_driven_testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

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

public class D001_Reading_data_from_excel {
	//https://www.demoblaze.com/
	//https://artoftesting.com/samplesiteforselenium
	//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	//https://testautomationpractice.blogspot.com/

	public static void main(String[] args) throws InterruptedException, IOException {
	
		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_Learning\\TestData\\SaleData.xlsx");
		//FileInputStream file2 = new FileInputStream(System.getProperty("usr.dir")	+"\\TestData\\SaleData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sales Data"); //here pass name of Sheet 
		XSSFSheet sheet2 = workbook.getSheetAt(0); //If we know the index of sheet in workbook 
		
		int totalRows = sheet.getLastRowNum();
		int toalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows ="+totalRows);
		System.out.println("Total columns ="+toalCells);
		
		
		for(int i=0;i<=totalRows;i++)
		{
			XSSFRow curRow = sheet.getRow(i);
			for(int j=0;j<toalCells;j++)
			{
				XSSFCell currCell = curRow.getCell(j);
				System.out.print(currCell.toString()+"\t");
			}
			System.out.println(i);
		}
		workbook.close();
		file.close();
	}}																					
