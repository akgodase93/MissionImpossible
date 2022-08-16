package iframeAk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		//ckick on date & time btn
		driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
		//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//click on home Icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
