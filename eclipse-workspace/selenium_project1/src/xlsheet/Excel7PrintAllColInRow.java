package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel7PrintAllColInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1"); 
	int LastCellIndex = sheet.getRow(0).getLastCellNum()-1;
	for(int i=0; i<=LastCellIndex; i++)
	{
		String value = sheet.getRow(0).getCell(i).getStringCellValue();
		System.out.print(value+ " ");
	}
	
	}
}
