package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1_dropdownHandling
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
	Actions act=new Actions(driver);
	act.moveToElement(login).perform();
    driver.findElement(By.xpath("//div[text()='My Profile']")).click();
	
		
		
		
	}
}
