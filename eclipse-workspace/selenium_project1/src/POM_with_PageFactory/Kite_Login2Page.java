package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//regularMethod==POM class
public class Kite_Login2Page 
{
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement ContinueBtn;
	
	public Kite_Login2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpKiteLogin2pin()
	{
		Pin.sendKeys("959594");
	}
	public void clickKiteLogin2PageContinueBtn()
	{
		ContinueBtn.click();
	}
}
