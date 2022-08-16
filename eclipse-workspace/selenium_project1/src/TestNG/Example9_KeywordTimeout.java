package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example9_KeywordTimeout 
{
//	@Test(timeOut=5000)    for failed test          
//	public void TC1() throws InterruptedException
//	{
//		Thread.sleep(7000);
//		Reporter.log("running TC1..",true);
//	}
	@Test(timeOut=5000)             
	public void TC1() throws InterruptedException
	{
		Thread.sleep(4000);
		Reporter.log("running TC1..",true);
	}
	
}