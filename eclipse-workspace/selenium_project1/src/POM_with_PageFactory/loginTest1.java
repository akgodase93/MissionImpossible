package POM_with_PageFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//main class==>test class
public class loginTest1
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
	
	Kite_Login1Page login1=new Kite_Login1Page(driver);
	login1.inpKiteLogin1PageUsername();
	login1.clickKiteLogin1PageLoginBtn();
		
	}
}
