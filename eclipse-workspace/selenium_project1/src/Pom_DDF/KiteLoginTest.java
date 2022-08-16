package Pom_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginTest 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("C:\\Users\\sai\\eclipse-workspace\\selenium_project1\\xsheet\\sample1.xlsx");
	Sheet Sh = WorkbookFactory.create(file).getSheet("DDF");	
	
	ChromeOptions Option=new ChromeOptions();
	Option.addArguments("--disable-notifications");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sai\\eclipse-workspace\\selenium_project1\\tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(Option);
	driver.manage().window().maximize();

	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	KiteLogin1Page login1=new KiteLogin1Page(driver);
	login1.inpKiteLogin1PageUsername(Sh.getRow(0).getCell(0).getStringCellValue());
	
	login1.inpKiteLogin1PagePassword(Sh.getRow(0).getCell(1).getStringCellValue());
		
	login1.clickKiteLogin1PageLoginBtn();
	
	KiteLogin2Page login2=new KiteLogin2Page(driver);
	login2.inpKiteLogin2PagePin(Sh.getRow(0).getCell(2).getStringCellValue());
	
	login2.clickKiteLogin2PageContinueBtn();
	KiteHomePage homePage=new KiteHomePage(driver);
	
	homePage.VerifyKiteHomePageUN(Sh.getRow(0).getCell(3).getStringCellValue());
	
	
	
		
		
	}
}
