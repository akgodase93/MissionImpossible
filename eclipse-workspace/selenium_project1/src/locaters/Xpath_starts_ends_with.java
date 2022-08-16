package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_starts_ends_with
{
	public static void main(String[] args)throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String text=driver.findElement(By.xpath("//iframe[starts-with(@id,'google')]")).getText();
		String text1=driver.findElement(By.xpath("//iframe[ends-with(@id,'_esf')]")).getText();
		System.out.println(text);
		System.out.println(text1);
	}
}
