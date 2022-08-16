package Pom_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page 
{
	@FindBy(xpath="//input[@id='pin']") WebElement Pin;
	@FindBy(xpath="//button[@class='button-orange wide']") WebElement ContinueBtn;
	
	public KiteLogin2Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void inpKiteLogin2PagePin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void clickKiteLogin2PageContinueBtn()
	{
		ContinueBtn.click();
	}
	
}
