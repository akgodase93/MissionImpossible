package screenshotCapture;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class IGScreenshotRS 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
		String RS=RandomString.make(10);
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Automation Testing\\Screenshot\\"+RS+".jpg");
		
		FileHandler.copy(src, dest);
		System.out.println("Screenshot Taken!!!!!!! & Saved at F:\\Automation Testing\\Screenshot ");
		Thread.sleep(1000);
		driver.close();
	}
}
