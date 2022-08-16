package xppath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.LowResourceMonitor.MainThreadPoolLowResourceCheck;

public class xpathAttributes
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();//open browser
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
		
	WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	UN.sendKeys("abcd");
	UN.clear();
	UN.sendKeys("xyz");
	}
}
