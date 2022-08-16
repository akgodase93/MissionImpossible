package xlsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel_verifyTypeOfcell
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{
	FileInputStream file=new FileInputStream("F:\\Automation Testing\\automation_selenium\\April21B.xlsx");	
	
	Cell cellInfo = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(1);
	
	CellType TypeOfCellInfo = cellInfo.getCellType();
	
	System.out.println(TypeOfCellInfo);
	
	if(TypeOfCellInfo==CellType.STRING)
	{
		System.out.println(cellInfo.getStringCellValue());
	}
	else if(TypeOfCellInfo==CellType.NUMERIC)
	{
		System.out.println(cellInfo.getNumericCellValue());

	}
	else if(TypeOfCellInfo==CellType.BOOLEAN)
	{
		System.out.println(cellInfo.getBooleanCellValue());

	}
}
}
