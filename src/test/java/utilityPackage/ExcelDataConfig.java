package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static String cellValue;

	//Method to load/ initiate the workbook
	public ExcelDataConfig(String excelPath)
	{
		try 
		{
			FileInputStream fis = new FileInputStream(excelPath);

			wb = new XSSFWorkbook(fis);		
		} 
		catch (Exception e) 
		{
			System.out.println("Excel Exception" +e.getMessage());
		}
	}
	
	//Method to read a value from a cell in the spreadsheet
	public String getData(String sheetName, int rowNumber, int columnNumber)
	{
		sheet = wb.getSheet(sheetName);
			
		DataFormatter formatter = new DataFormatter();
			
		cellValue = formatter.formatCellValue(sheet.getRow(rowNumber).getCell(columnNumber));
		
		return cellValue;
	}
	
	

}
