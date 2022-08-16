package pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_PopupHiddenDivision 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		//click on login
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7798657841");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahire2511");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	}
}
