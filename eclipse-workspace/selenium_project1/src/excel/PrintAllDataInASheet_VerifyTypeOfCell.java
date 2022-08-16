package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PrintAllDataInASheet_VerifyTypeOfCell 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		for (int i = 0; i<=lastRowIndex; i++) //outer for loop --> rows
		{
		int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
		for (int j = 0; j <=lastCellIndex; j++)
		{
		Cell cellInfo = sh.getRow(i).getCell(j);
		CellType s2 = cellInfo.getCellType();
		if(s2==CellType.STRING)
		{
		System.out.print(cellInfo.getStringCellValue()+" ");
		}
		else if (s2==CellType.NUMERIC)
		{
		System.out.print(cellInfo.getNumericCellValue()+ " ");
		}
		else if (s2==CellType.BOOLEAN) {
		System.out.print(cellInfo.getBooleanCellValue()+" ");
		}
		}
		System.out.println();
		}
	}
}
