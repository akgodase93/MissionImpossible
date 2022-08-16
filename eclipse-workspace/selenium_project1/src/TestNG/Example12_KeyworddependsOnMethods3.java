package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example12_KeyworddependsOnMethods3
{
	@Test           
	public void login1()
	{
		Reporter.log("running login..",true);
		
	}
	
	@Test           
	public void login2()
	{
		Reporter.log("running login..",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods={"login1", "login2"})          
	public void logout()
	{
		Reporter.log("running logout..",true);
	}
	
}