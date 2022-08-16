package pop_up;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_childBrowser_switchtoMainwindowfromchild
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//opn new tab from main ppage
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window ID
		Set<String> MultiIDs = driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(MultiIDs);
		
		//al.get(1); // consider 0 is for main 1 for child
		
		//switch to child window
		driver.switchTo().window(al.get(1)); //stringWindow id
		
		//click on training opntion from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		//switch to mainPage
		driver.switchTo().window(al.get(0));
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
	
	
	
	
	}
}
