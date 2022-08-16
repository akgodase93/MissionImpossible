package multipleElementsHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		String expText="Vivo V23 5G";
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Vivo V23");
		
		Thread.sleep(1000);
		
		List<WebElement> autosuggesstions=driver.findElements(By.xpath("//ul[@class='G43f7e'][1]/li"));
		for(WebElement all: autosuggesstions)
		{
			String actText=all.getText();
			if(expText.equalsIgnoreCase(actText))
			{
				all.click();
				break;
			}
		}
	
	}

}
