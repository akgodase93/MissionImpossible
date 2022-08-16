//Q. Write a Script to select multiple options in Listbox.
package listboxak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class ListboxMethods 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		
		Thread.sleep(2000);
		//1. Identify ListBox, webelement & store it in reference variable
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		//2. Create object of select class which accepts webelement argument
		
		Select s=new Select(day);
		
		boolean result=s.isMultiple();
		if(result)
		{
			System.out.println("Listbox is multiple options selectable");
		}
		else
		{
			System.out.println("Listbox is not multiple options selectable");
		}
		driver.quit();
	}
}
