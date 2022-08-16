package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetRowColSize
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		
		Workbook book=WorkbookFactory.create(file);
		
		Sheet sheet=book.getSheet("Sheet2");
		int lastRow=sheet.getLastRowNum() + 1; // lastRow=lastRow() which is last index of row + 1
		System.out.println("Row Size: "+lastRow);
		
		int lastCol=sheet.getRow(0).getLastCellNum();
		System.out.println("Coloumn Size: "+lastCol);
		
	}
}
