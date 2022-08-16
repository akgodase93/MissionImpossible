package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class VerifyCellType_PrintAllRowData{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastCellIndex=sheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastCellIndex; i++)
		{
			Cell cellinfo=sheet.getRow(1).getCell(i);
			CellType celltype=cellinfo.getCellType();
			
			if(celltype==CellType.STRING)
			{
				String value=cellinfo.getStringCellValue();
				System.out.print("String: "+value+" ");
			}
			
			if(celltype==CellType.NUMERIC)
			{
				double value=cellinfo.getNumericCellValue();
				System.out.print("Numeric: "+value+" ");
			}
			
			if(celltype==CellType.BOOLEAN)
			{
				boolean value=cellinfo.getBooleanCellValue();
				System.out.print("Boolean: "+value+" ");
			}
			
		}
		
	}

}
