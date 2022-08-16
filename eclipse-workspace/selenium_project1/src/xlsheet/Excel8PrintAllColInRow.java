package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel8PrintAllColInRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1"); 
	int LastRow = sheet.getLastRowNum();
	for(int i=0; i<=LastRow; i++)
	{
		Cell value = sheet.getRow(i).getCell(0);
		System.out.println(value+" ");
	}
	}
	
}
