package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleCompletetable_dynamic
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Automation Testing\\automation_selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Automation%20Testing/automation_selenium/selenium_Notes/htmlcodes/table.html");	
		Thread.sleep(3000);
		 List<WebElement> AllRows = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		 int size = AllRows.size();
		 for(int i=1; i<=size; i++)//for row
		 {
			int columnsize;
			 if(i==1)
			 {
				 columnsize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/th")).size();
			 }
			 else
			 {
				 columnsize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+"]/td")).size();

			 }
			for(int j=1; j<=columnsize; j++)//for column
			{
				String AllOption;
				 if(i==1)
				 {
					  AllOption = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th["+j+"]")).getText();
				 }
				 else
				 {
					 AllOption = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
				 }
				 System.out.print(AllOption+" ");

			}
			System.out.println();
		}
		 
	}
}
