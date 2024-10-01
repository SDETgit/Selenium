package S_004_data_driven_testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style;

	public static int getRowCount(String xlfile, String xlsheet) throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		int rowCount = ws.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}

	public static int getCellCount(String xlfile, String xlsheet, int rowNum) throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
	}

	public static String getCellData(String xlfile, String xlsheet, int rowNum, int colNum) throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);

		String data;

		try {
			// data=cell.toString();
			DataFormatter formatter = new DataFormatter();
			data = formatter.formatCellValue(cell);// Returns the formatted value of cell as a string
		} catch (Exception e) {
			data = "";
		}
		wb.close();
		fis.close();
		return data;
	}

	public static void setCellData(String xlfile, String xlsheet, int rowNum, int colNum, String Data)
			throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);

		cell = row.getCell(colNum);
		cell.setCellValue(Data);
		fos = new FileOutputStream(xlfile);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}

	public static void fillGreenColor(String xlfile, String xlsheet, int rowNum, int colNum) throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rowNum);
		cell = row.getCell(colNum);

		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fos = new FileOutputStream(xlfile);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}

	public static void fillRedColor(String xlfile, String xlsheet, int rownum, int column) throws IOException {
		fis = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fis);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(column);

		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

		cell.setCellStyle(style);
		fos = new FileOutputStream(xlfile);
		wb.write(fos);
		wb.close();
		fis.close();
		fos.close();
	}

}