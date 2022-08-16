package xlsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5getcolumnsize
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	short columnInRow0 = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
	System.out.println(columnInRow0);
	}
}
