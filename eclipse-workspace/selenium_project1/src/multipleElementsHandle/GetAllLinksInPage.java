package multipleElementsHandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinksInPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		List<WebElement> AllLinks=driver.findElements(By.xpath("//a"));
		
		System.out.println(AllLinks.size());
		for(WebElement link: AllLinks)
		{
			System.out.println(link.getText());
		}
		for(WebElement link: AllLinks)
		{
			if(link.getText().equals("Create New Account"))
			{
				link.click();
				break;
			}
		}
		
	}

}
