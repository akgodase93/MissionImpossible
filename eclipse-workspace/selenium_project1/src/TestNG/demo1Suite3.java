package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo1Suite3
{
	@Test(timeOut=5000)          
	public void TC7() throws InterruptedException
	{
		Thread.sleep(6000);
		Reporter.log("running TC7..",true);
		
	}

	@Test           
	public void TC8()
	{
		Reporter.log("running TC8..",true);
		
	}
	
	@Test           
	public void TC9()
	{
		Reporter.log("running TC9..",true);
		
	}
	
}
