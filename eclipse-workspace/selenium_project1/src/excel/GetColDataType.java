package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetColDataType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0; i<=lastRowIndex; i++)
		{
			Cell CellInfo = sh.getRow(i).getCell(1);
			CellType s2 = CellInfo.getCellType();
			if(s2==CellType.STRING)
			{
				System.out.println(CellInfo.getStringCellValue());
			}
			else if (s2==CellType.NUMERIC)
			{
				System.out.println(CellInfo.getNumericCellValue());
			}
			else if (s2==CellType.BOOLEAN)
			{
				System.out.println(CellInfo.getBooleanCellValue());
			}
		
		}
	}
}
