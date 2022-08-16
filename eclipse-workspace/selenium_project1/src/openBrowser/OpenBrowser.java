package openBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
}
