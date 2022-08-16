package screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{	
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
}
}
