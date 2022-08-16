package multiple_link;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_SwitchedTomainPage
{
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//Switch to iframe
		//driver.switchTo().frame("iframeResult");  //by StringframeId
		//driver.switchTo().frame("iframeResult");  //by string frame name
		//driver.switchTo().frame(0);              //int frame index
	   	
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);          //frame web element
		
		//perform action on frame element
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date')]")).click();
		//switch to main page
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		//click on home icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
		
		
		
		
	}
}
