package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends BasePage{

	public MyAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	WebElement MyAccountHeading;
	@FindBy(linkText= "Logout")
	WebElement lnkLogout;
    public boolean isMyAccountPageExists()
    {
    	try
    	{
    		return (MyAccountHeading.isDisplayed());
    	}
    	 catch(Exception e)
    	{
    		 return (false);
    	}
    	
    }
    public void clicklogout()
	{
		lnkLogout.click();
	}
}

