package P002_Practice_2_DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PDDT002_Excel_writing_data {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		FileOutputStream workbook2 = new FileOutputStream("D:\\writing.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Data");
		
		//row 1
		XSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("Sno.");
		row.createCell(1).setCellValue("Course");
		row.createCell(2).setCellValue("Completion");
		
		//row2 
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("1");
		row2.createCell(1).setCellValue("Java");
		row2.createCell(2).setCellValue("Completed");
		
		//closing workbook 
		workbook.write(workbook2);
		workbook.close();
		workbook2.close();
	}
}
