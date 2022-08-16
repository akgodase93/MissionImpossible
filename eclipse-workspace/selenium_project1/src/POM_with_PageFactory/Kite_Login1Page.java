package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//regularMethod==POM class
public class Kite_Login1Page 
{	//declaration
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pwd;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement loginBtn;
	
	//initialization
	public Kite_Login1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin1PageUsername()
	{
		UN.sendKeys("DV1510");
	}
	public void inpKiteLogin1PagePassword()
	{
		Pwd.sendKeys("Year@123");
	}
	public void clickKiteLogin1PageLoginBtn()
	{
		loginBtn.click();
	}
}
