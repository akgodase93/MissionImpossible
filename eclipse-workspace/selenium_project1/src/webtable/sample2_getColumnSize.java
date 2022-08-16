package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2_getColumnSize
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing/automation_selenium/selenium_Notes/htmlcodes/table.html");	
		Thread.sleep(3000);
		//for header
		int columsize1 = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		    System.out.println(columsize1);
		//for Row	 
	    int columsize = driver.findElements(By.xpath("//table[@id='1234']//tr[3]/td")).size();
	    System.out.println(columsize);
		 
		 
		 
	}
}
