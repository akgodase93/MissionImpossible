package screenshotCapture;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCDateTime 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
		String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Automation Testing\\Screenshot\\Screenshot "+out+".jpg");
		FileHandler.copy(src, dest);
		System.out.println("Screenshot Taken!!!!!!!!!");
				   
	}
}
