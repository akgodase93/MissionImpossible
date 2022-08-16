package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example5_Annotation {

	@BeforeClass
	public void openBrowser() 
	{
		Reporter.log("open browser....",true);
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("login to App....",true);
	}
	
	@Test
	public void verifyPN()
	{
		Reporter.log("running verify PN test script",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("running verify user ID test script",true);
	}
	
		
	@AfterMethod
	public void logoutFromApp()
	{
		Reporter.log("logout from App....",true);
	}
	
	@AfterClass
	public void closeBrowser() 
	{
		Reporter.log("close browser....",true);
	}
	
}