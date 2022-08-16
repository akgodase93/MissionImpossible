package popUps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name ='NewTab']")).click();
		
		Set<String> allId=driver.getWindowHandles();
		System.out.println(allId);
		
		String idOfMainPage=driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
		ArrayList<String> al=new ArrayList<String>(allId);
		String childID=al.get(1);
		System.out.println(childID);
		
		driver.switchTo().window(childID);
		driver.findElement(By.xpath("//div[@id='page']/descendant :: i [starts-with(@class, 'fas ')]/following :: span[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(idOfMainPage);
	}

}
