package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5_getAlldataINColumn_dynamic
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing/automation_selenium/selenium_Notes/htmlcodes/table.html");	
		Thread.sleep(3000);
		List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		 int size = AllRows.size();
		 for(int i=1; i<=size ;i++)
		 {
		 
		 if(i==1)
		 {
			 String AllOption = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th[2]")).getText();
			 System.out.print(AllOption+" ");
		 }
		 else
		 {
			 String AllOption = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td[2]")).getText();
			 System.out.print(AllOption+" ");
		 }
		 }
		 
	}
}
