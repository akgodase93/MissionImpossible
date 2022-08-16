package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3_getDatafromParticularColumnOfRow
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing/automation_selenium/selenium_Notes/htmlcodes/table.html");	
		Thread.sleep(3000);
	    String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
		System.out.println(text);
		 String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]")).getText();
		 System.out.println(text1);
		 
		 
	}
}
