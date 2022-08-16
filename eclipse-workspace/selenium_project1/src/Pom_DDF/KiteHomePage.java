package Pom_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
	@FindBy(xpath="//span[text()='DV1510']") private WebElement ProfileId;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyKiteHomePageUN(String expProfileID)
	{
		String ActText = ProfileId.getText();
		if(ActText.equals(expProfileID))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
	
		}
	}
}
