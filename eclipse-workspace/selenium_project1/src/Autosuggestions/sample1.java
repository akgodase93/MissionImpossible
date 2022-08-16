package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win321\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String Expr="redmi note 10 pro max";
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		Thread.sleep(4000);

		List<WebElement> Alloptions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		Thread.sleep(4000);
		for(WebElement Option:Alloptions)
		{
			String actr= Option.getText();
			System.out.println(actr);
			if(actr.equals(Expr))
			{
			Option.click();
			break;
			}
		}
	
	}
}
