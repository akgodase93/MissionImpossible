package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@name='email'])")).sendKeys("rutuja");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
	
	}
}
