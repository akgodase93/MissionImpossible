package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetDataVerifyTypeofCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		
		Cell CellInfo = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0);
		CellType s1 = CellInfo.getCellType();
		if(s1==CellType.STRING)
		{
		String value = CellInfo.getStringCellValue();
		System.out.println(value);
		}
		else if (s1==CellType.NUMERIC)
		{
		double value = CellInfo.getNumericCellValue();
		System.out.println(value);
		}
		else if (s1==CellType.BOOLEAN)
		{
		boolean value = CellInfo.getBooleanCellValue();
		System.out.println(value);
		}
		
	}

}
