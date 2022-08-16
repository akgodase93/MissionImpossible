package Pom_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page
{
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	@FindBy(xpath="//button[text()='Login ']") private WebElement Loginbtn;
	
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin1PageUsername(String username)
	{
		UN.sendKeys(username);
	}
	
	public void inpKiteLogin1PagePassword(String password)
	{
		Pass.sendKeys(password);
	}
	
	public void clickKiteLogin1PageLoginBtn()
	{
		Loginbtn.click();
	}
}
