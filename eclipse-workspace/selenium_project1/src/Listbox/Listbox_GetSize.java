package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox_GetSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		//step1:
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size()); 
		
		System.out.println(s.getOptions().size());
		
	
	}	
	
}
