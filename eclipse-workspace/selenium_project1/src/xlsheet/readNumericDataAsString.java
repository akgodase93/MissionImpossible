package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readNumericDataAsString
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	 String columnInRow0 = WorkbookFactory.create(file).getSheet("sheet1").getRow(12).getCell(0).getStringCellValue();
	 System.out.println(columnInRow0);
	 
	 
//	 String columnInRow1 = WorkbookFactory.create(file).getSheet("sheet1").getRow(13).getCell(0).getStringCellValue();
//	 System.out.println(columnInRow1);

	}
}
