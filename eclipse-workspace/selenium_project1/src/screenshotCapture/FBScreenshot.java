package screenshotCapture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class FBScreenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Automation Testing\\Screenshot\\facebook.jpg");
		System.out.println("Screenshot Taken and saved at F:\\Automation Testing\\Screenshot");
		
		Thread.sleep(1000);
		FileHandler.copy(src, dest);
		
	}

}
