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
public class Kite_LoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	ChromeOptions Options=new ChromeOptions();
	Options.addArguments("--disable-notifications");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\eclipse-workspace\\selenium_project1\\tool\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(Options);	
	driver.get("https://kite.zerodha.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Kite_Login1Page login1=new Kite_Login1Page(driver);
	login1.inpKiteLogin1PageUsername();
	login1.inpKiteLogin1PagePassword();
	login1.clickKiteLogin1PageLoginBtn();
	
	Kite_Login2Page login2=new Kite_Login2Page(driver);
	login2.inpKiteLogin2pin();
	login2.clickKiteLogin2PageContinueBtn();
	
	Kite_HomePage homePage=new Kite_HomePage(driver);
	homePage.verifyKiteHomePageUserID();
	
	
	
	
	
	
	
	}
}
