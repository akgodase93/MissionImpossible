package multiple_link;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallLinksPresentinGoogleWebPage
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	System.out.println(links.size());
	
	for(WebElement link:links)
	{
		System.out.println(link.getText());
	}
	
	
}
}
