package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Examples
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//use of contains(text(), 'text_value')
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();

		//use of tganame[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@id='login1' and @name='login']")).sendKeys("godaseakshaykumar18693@rediffmail.com");
		
		//use of contains(@attribute, value)
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Rushay@143");
	}
}
