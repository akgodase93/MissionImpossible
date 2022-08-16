package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exl_getNumericAsString 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		String value =WorkbookFactory.create(file).getSheet("Sheet3").getRow(3).getCell(0).getStringCellValue();
		System.out.println(value);
	}
}
