package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex_GetInt 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//1. create object of FileInputStream class with excel sheet path as a parameter to constructor
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");		
		
		//2. To open a excel sheet we use static method create() method of WorkBookFactory class
		Workbook book=WorkbookFactory.create(file);
		
		//3. To open specific sheet in the excel use getSheet() method
		Sheet sheet=book.getSheet("Sheet1");
		
		//4. To identify specific row use getRow(int value)
		Row row=sheet.getRow(1);
		
		//5. To identify specific cell use getCell(int value)
		Cell cell=row.getCell(2);
		
		//6.Store the value in data type
		double value=cell.getNumericCellValue();
		
		System.out.println(value);
	}
}
