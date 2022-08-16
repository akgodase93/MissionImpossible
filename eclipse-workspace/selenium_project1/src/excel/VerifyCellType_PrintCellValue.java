package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellType_PrintCellValue 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		Cell cellinfo=WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0);
		CellType celltype=cellinfo.getCellType();
		
		if(celltype==CellType.NUMERIC)
		{
			double value=cellinfo.getNumericCellValue();
			System.out.println(value);
		}
		if(celltype==CellType.STRING)
		{
			String value=cellinfo.getStringCellValue();
			System.out.println(value);
		}
	}
}
