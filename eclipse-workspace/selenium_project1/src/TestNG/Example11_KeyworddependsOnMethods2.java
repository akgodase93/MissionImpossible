package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example11_KeyworddependsOnMethods2 
{
	@Test           
	public void login()
	{
		Reporter.log("running login..",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="login")          
	public void logout()
	{
		Reporter.log("running logout..",true);
	}
	
}