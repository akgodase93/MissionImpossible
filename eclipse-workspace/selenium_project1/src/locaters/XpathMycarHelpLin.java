package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMycarHelpLin
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mycarhelpline.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id = 'bluemenu']/child :: ul/child :: li[5]/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/child :: div[@class='innerpage-bodycontainer-left']/ child :: div[1]/child :: table[1]/descendant :: img[1]")).click();
		driver.findElement(By.xpath("//div[@id= 'header-container']/preceding-sibling :: table[3]/preceding :: img[3]")).click();
		
	}
}
