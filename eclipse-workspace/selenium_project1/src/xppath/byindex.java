package xppath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class byindex 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
	driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");

	}
}
