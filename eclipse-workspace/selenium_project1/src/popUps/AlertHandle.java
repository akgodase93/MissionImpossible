package popUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle 
{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//1. To fill up customer id field
		driver.findElement(By.xpath("//input[@name= 'cusid']")).sendKeys("1");
		//2. Click on submit button
		driver.findElement(By.xpath("//input[@name = 'submit']")).click();
		
		Thread.sleep(2000);
		//To get text dislpayed on alert pop-up
		System.out.println(driver.switchTo().alert().getText());
		
		// To click on OK button of popup
		//driver.switchTo().alert().accept();
		
		// To click on Cancel button of popup
		driver.switchTo().alert().dismiss();
		
		
	}
}
