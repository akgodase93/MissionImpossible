package pop_up;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_childBrowser_switchtochild_Mximize
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//opn new tab from main ppage
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Set<String> MultiID = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(MultiID);
		driver.switchTo().window(al.get(1));
		driver.manage().window().maximize();
	
	}
}
