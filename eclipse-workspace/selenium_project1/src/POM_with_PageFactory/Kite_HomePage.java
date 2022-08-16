package POM_with_PageFactory;
//regularMethod==POM class

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage 
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement ProfileID;
	
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void  verifyKiteHomePageUserID()
	{
		String actProfID = ProfileID.getText();
		String ExpProfID="DV1510";
		if(actProfID.equals(ExpProfID))
		{
			System.out.println("TPass");
		}
		else
		{
			System.out.println("TFail");
		}
	}
	
}
