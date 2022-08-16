package Listbox;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing/automation_selenium/selenium_Notes/htmlcodes/listbox.html");
		Thread.sleep(3000);

		//step1:
		WebElement COUNTRY  = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(COUNTRY);
		boolean result = s.isMultiple(); //return type boolean
		System.out.println(result);
		if(result)
		{
			System.out.println("listbox is Multi-selectable");	
		}
		else
		{
			System.out.println("listbox is single-selectable");	
		}
	}	
	

}
