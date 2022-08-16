//Q. Write a Script to Insert Day, Month & Year in Facebook signup page

package listboxak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxHandle
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		
		Thread.sleep(2000);
		//Step.1 Identify ListBox, Find WebElement and Store in reference.
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		//Step.2 Create and Object of Select class which accept webelement args.
		Select s=new Select(day);
		Select s1=new Select(month);
		Select s2=new Select(year);
		
		//Step.3 Use Select class Method to select option
		//A) selectByIndex(int value)
		s.selectByIndex(17);
		//B) selectByValue(String value)
		s1.selectByValue("11");
		
		//C) selectByVisibleText(String visibleText);
		s2.selectByVisibleText("1993");
		
		
		
	}
}
