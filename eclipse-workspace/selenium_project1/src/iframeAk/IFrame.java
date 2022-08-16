package iframeAk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(1000);
		
		//1.Switch to iframe
		//find the tagname 'iframe'
		
		//Method 1. ID
		//driver.switchTo().frame("iframeResult");// Use string frame 'id' i.e. iframeResult
		
		//Method 2. Name
		//driver.switchTo().frame("iframeResult");
		
		//Method 3. Index
		//driver.switchTo().frame(0);
		
		//Method 4. Webelement
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		
		//2. Click on the selected webelement in iframe
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(1000);
		driver.close();
	}
}
