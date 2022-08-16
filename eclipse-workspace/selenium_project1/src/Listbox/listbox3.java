package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox3 
{
public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	
	WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	Select s=new Select(year);
	//s.selectByVisibleText("1995"); //select by visible text
	s.selectByValue("2002"); //select by value
}	

}
