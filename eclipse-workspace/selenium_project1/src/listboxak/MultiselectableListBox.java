package listboxak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectableListBox 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("F:\\Automation Testing\\selenium jar\\select.html");
		
		WebElement car=driver.findElement(By.xpath("//select[@name='cars']"));
		
		Select s=new Select(car);
		
		boolean result=s.isMultiple();
		if(result)//true
		{
			System.out.println("Listbox is multiple options selectable");
		}
		else
		{
			System.out.println("Listbox is not multiple options selectable");
		}
		
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("audi");
		Thread.sleep(1000);
		s.selectByVisibleText("Opel");
		
		String cars=s.getFirstSelectedOption().getText();
		System.out.println(cars);
		
		Thread.sleep(2000);
		//Deselect methods
		//A) deselectByIndex(int value)
			s.deselectByIndex(0);
			Thread.sleep(1000);
		//B) deselectByValue(String value);
			s.deselectByValue("audi");
			Thread.sleep(1000);
		//C) deselectByVisibleText(String visibleText)
			s.deselectByVisibleText("Opel");
			
			
			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByValue("audi");
			Thread.sleep(1000);
			s.selectByVisibleText("Opel");
		
			
			s.deselectAll();
			Thread.sleep(1000);
			driver.quit();
	}
	
}
