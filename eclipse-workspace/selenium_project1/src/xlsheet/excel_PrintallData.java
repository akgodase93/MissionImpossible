package xlsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_PrintallData
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	 Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
	
	int lastRowIndex = sh.getLastRowNum();
	for(int i=0; i<=lastRowIndex; i++)
	{
		int lastcellIndex=sh.getRow(i).getLastCellNum()-1;
		for(int j=0; j<=lastcellIndex; j++)
		{
			
			System.out.print(sh.getRow(i).getCell(j).getStringCellValue()+ " ");
		}
		System.out.println();
	}
}
}
