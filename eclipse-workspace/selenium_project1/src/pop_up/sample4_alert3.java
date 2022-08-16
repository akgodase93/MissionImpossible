package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4_alert3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(3000);
		//alt.accept();
		System.out.println(alt.getText());
		alt.dismiss();
	}

}
