package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample5_DragnDrop
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://demo.guru99.com/test/drag_drop.html");	
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src,dest).perform();
		
		
		
		
		
	}
}
