package customized_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample3
{//customized list box is nothing but listbox without select class
	//but in facebook there is no customized listbox so we for practice use that facebook listbox 
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		//identify listBox
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//create an object of action class
		Actions act=new Actions(driver);
		//click on listbox
		act.click(month).perform();
		Thread.sleep(3000);
		 
		//navigate to bottom
		for(int i=1; i<=12; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();

		}
		//navigate to desired op
		for(int i=1; i<=7; i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();

		}
		act.click().perform();
		
		
		
		
		
	}
}
