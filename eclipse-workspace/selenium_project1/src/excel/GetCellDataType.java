package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetCellDataType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		CellType celltype=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getCellType();
		System.out.println(celltype);
		
		if(celltype==CellType.STRING)
		{
			System.out.println(celltype);
		}
	}
}
