package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		
		String getTitle=driver.getTitle();
		System.out.println("Title: "+getTitle);
		
		String getCurrentUrl=driver.getCurrentUrl();
		System.out.println(" URL: "+getCurrentUrl);
			
		Point p=driver.manage().window().getPosition();
		System.out.println(" Current Position: "+p);
		
		Dimension d=driver.manage().window().getSize();
		System.out.println("Current Size"+d);
		
		Point p1=new Point(8,50);
		driver.manage().window().setPosition(p1);
		
		Thread.sleep(10000);
		Dimension d1=new Dimension(1300,500);
		driver.manage().window().setSize(d1);
		Thread.sleep(10000);
		
		driver.close();
	}
}
