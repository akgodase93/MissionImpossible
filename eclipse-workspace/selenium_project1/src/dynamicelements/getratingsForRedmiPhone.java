package dynamicelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getratingsForRedmiPhone 
{
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	String rating = driver.findElement(By.xpath("(((//div[@class='_2kHMtA'])[1]//span)[4]//span)[2]")).getText();
	System.out.println(rating);
	}
}
