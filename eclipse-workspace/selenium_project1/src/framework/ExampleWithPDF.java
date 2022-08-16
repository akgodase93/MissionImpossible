package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleWithPDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\selenium_project1\\xsheet\\sample1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	ChromeOptions Options=new ChromeOptions();
	Options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\eclipse-workspace\\selenium_project1\\tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(Options);	
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//enter user ID
	String UID = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UID);
			
	//enter pwd
	String PWD = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
			
	//click on login button
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
			
	//enter pin
	String Pin = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(Pin);
			
	//click on continue btn
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
			
	//verify user ID
	String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	String expUserID =  sh.getRow(0).getCell(3).getStringCellValue();
			
	if(actUserID.equals(expUserID))
	{
		System.out.println("TC Pass");
	}
	else
	{
		System.out.println("TC Failed");
	}
		
	}
	
}