package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_GetString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//1. create object of FileInputStream class with excel sheet path as a parameter in constructor
		FileInputStream file= new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		
		//2. To open excel sheet use static method create() from WorkBookFactory class
		Workbook book= WorkbookFactory.create(file);
		
		//3. To open specific sheet from excel use getSheet() method
		Sheet sheet=book.getSheet("Sheet1");
		
		//4. To identify the desired Row use method getRow(int value) 
		Row row=sheet.getRow(0);
		
		//5. To identify specific Cell  use method getCell(int value)
		Cell cell=row.getCell(0);
		
		String value=cell.getStringCellValue();
		System.out.println(value);
	}
}
