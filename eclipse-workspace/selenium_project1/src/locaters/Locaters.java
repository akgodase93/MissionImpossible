package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1. xPath by attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akshaykumar.godase");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Rushay@143");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//2. xPath by text
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		
		//3. xpath by contains(text)
		// driver.findElement(By.xpath("//a[contains(text(),'Forgotten']")).click();
		
		//4. xpath by contains(attribute)
			driver.findElement(By.xpath("//a[contains(@title,'at Instagram')][1]")).click();	
			driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
	}
}
