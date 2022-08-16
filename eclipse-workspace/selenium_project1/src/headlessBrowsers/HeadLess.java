package headlessBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLess 
{
	public static WebDriver driver;
	public static ChromeOptions options;
	public static FirefoxOptions foptions;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		//options.addArguments("headless");
		options.setHeadless(true);
		driver=new ChromeDriver(options);
		
		driver.get("https://www.fb.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
		WebDriverManager.firefoxdriver().setup();
		foptions=new FirefoxOptions();
		foptions.addArguments("--headless");
		//foptions.setHeadless(true);
		driver=new FirefoxDriver(foptions);
		driver.get("https://www.instagram.com");
	}
}
