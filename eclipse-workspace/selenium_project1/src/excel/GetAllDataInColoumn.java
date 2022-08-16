package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class GetAllDataInColoumn 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Testing\\Screenshot\\excel\\sample.xlsx");
		Sheet sheet=WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex=sheet.getLastRowNum();
	
		System.out.println("**********************************Coloumn Data****************");
		for(int i=0; i<=lastRowIndex; i++)
		{
			String info=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(info);
		}
		
		
		int lasCol=sheet.getRow(0).getLastCellNum();
		System.out.println();
		System.out.println("Coulumn Size: "+lasCol);
		System.out.println("**********************************Row Data*********************");
		for(int i=0; i<=lasCol-1;i++)
		{
			String info=sheet.getRow(0).getCell(i).getStringCellValue();
			System.out.print(info+" ");
		}
	}
}
