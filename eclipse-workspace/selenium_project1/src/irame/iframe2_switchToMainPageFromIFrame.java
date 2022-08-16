package irame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2_switchToMainPageFromIFrame
{
	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(3000);
		//switch to iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
}
