package P002_Practice_2_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PDDT001_Excel_reading_data {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileInputStream excel = new FileInputStream("D:\\SaleData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFSheet sheet2 = workbook.getSheet("Sales Data");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(2).getLastCellNum();
		
		System.out.println("Total rows ="+rows);
		System.out.println("Total columns ="+columns);
		
		for(int i=0;i<=rows;i++)
		{
			XSSFRow currow = sheet.getRow(i);
			for(int j=0;j<columns;j++)
			{
				XSSFCell curcell = currow.getCell(j);
				System.out.print(curcell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		excel.close();
	}
}
