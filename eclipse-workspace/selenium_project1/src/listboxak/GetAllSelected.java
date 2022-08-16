package listboxak;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected 
{
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("F:\\Automation Testing\\selenium jar\\select.html");
	
	WebElement car=driver.findElement(By.xpath("//select[@name='cars']"));
	
	Select s=new Select(car);
	
	s.selectByIndex(0);
	Thread.sleep(1000);
	s.selectByValue("audi");
	Thread.sleep(1000);
	s.selectByVisibleText("Opel");
	
	//A. Getting all selected options only
	List<WebElement> getAllSelected=s.getAllSelectedOptions();
	System.out.println(getAllSelected.size());
	
	for(WebElement s1: getAllSelected)
	{
		System.out.println(s1.getText());
	}
	Thread.sleep(1000);
	
	// B. Getting all options in Listbox
	List<WebElement> getAll=s.getOptions();
	System.out.println(getAll.size());
	
	for(WebElement s1: getAll)
	{
		System.out.println(s1.getText());
	}
	Thread.sleep(1000);
	
	driver.close();
}
}
