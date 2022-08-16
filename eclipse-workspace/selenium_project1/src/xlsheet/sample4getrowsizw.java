package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample4getrowsizw 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	int lastRow = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
	System.out.println("total no of rows: "+lastRow);
	
	}
}
