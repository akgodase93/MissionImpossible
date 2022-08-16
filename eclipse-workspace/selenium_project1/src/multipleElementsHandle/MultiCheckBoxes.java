package multipleElementsHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiCheckBoxes {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/signup/");
		
		List<WebElement> multicheck=driver.findElements(By.xpath("//input[@type='checkbox']"));
		//checking checkboxe in forward direction
		for(int i=0; i<=multicheck.size()-1;i++)
		{
			multicheck.get(i).click();
			Thread.sleep(2000);
		}
		
		for(int i=multicheck.size()-1; i>=0;i--)
		{
			multicheck.get(i).click();
			Thread.sleep(2000);
		}
	}

}
