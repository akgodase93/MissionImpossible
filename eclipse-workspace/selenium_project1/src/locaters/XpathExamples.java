package locaters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class XpathExamples
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_iframe.asp");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//use of preceding-sibling
		driver.findElement(By.xpath("//div[@id='googleSearch']/preceding-sibling :: div[1]/descendant :: div[1]/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='root']/div[1]/div[1]/div[4]/descendant :: div[4]/form[1]/ descendant :: div[3]/input[@id='modalusername']")).sendKeys("Amar_rahe_tum");
		driver.findElement(By.xpath("//div[@id='root']/div[1]/ descendant:: div[3]/following-sibling:: div[2]/descendant:: div[10]/input[@id='current-password']")).sendKeys("Charlie");
		//div[@id='root']/div[1]/ descendant:: div[starts-with(@class,'EmailInput_input_field')]/input
		//div[@id='root']/div[1]/ descendant:: div[16]/input
		
	}
}
