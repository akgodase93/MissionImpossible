package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Automation Testing\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
		
		//1. sendKeys() 
		username.sendKeys("akshaykumar.godase");
		
		//2. clear() 
		Thread.sleep(1000);
		username.clear();
	 
		
		//5. click() 
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			Thread.sleep(1000);
			
		//6. getText()
			driver.get("https://www.facebook.com/");
			String create=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).getText();
			System.out.println(create);
		//7.isEnabled()
			boolean isenabled=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
			System.out.println(isenabled);
			
		//4. isSelected() 	
			boolean isselected=driver.findElement(By.xpath("//button[@name='login']")).isSelected();
			System.out.println(isselected);
		
		//3. isDisplayed()
			boolean isdisplayed=driver.findElement(By.xpath("//button[@name='login']")).isDisplayed();
			System.out.println(isdisplayed);
			
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
					Thread.sleep(3000);
					boolean value =
					driver.findElement(By.xpath("(//input[@class='_8esa'][2])")).isSelected();
					System.out.println(value);
					if(value==true)
					{
					System.out.println("Radio button selected");
					}
					else
					{
					System.out.println("Radio button is not selected");
					}
	}

}
