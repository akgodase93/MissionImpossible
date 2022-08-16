package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetAllData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastRowIndex=sheet.getLastRowNum();
		for(int i=0;i<=lastRowIndex-1;i++)
		{
			int lasCellIndex=sheet.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lasCellIndex;j++)
			{
				String info=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(info+" ");
			}
			System.out.println();
		}
	}
}
