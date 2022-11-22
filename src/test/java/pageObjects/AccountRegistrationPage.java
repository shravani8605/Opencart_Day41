package pageObjects;

//import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
    
	//Elements
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
 
	@FindBy(how= How.XPATH, using = "//input[@name='agree']")
	WebElement checkpolicy;
	
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;


	
	//Actions
	public void setfname(String fname)
	{
		FirstName.sendKeys(fname);
	}
	public void setlname(String lname)
	{
		LastName.sendKeys(lname);
	}
	public void setemail(String email)
	{
		Email.sendKeys(email);
	}
	public void setpassoword(String pwd) 
	{
		Password.sendKeys(pwd);
	}

	public void setprivateplcy() 
	{
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//mywait.until(ExpectedConditions.elementToBeClickable(checkpolicy)).click();
		//checkpolicy.click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", checkpolicy);
	}
			
	public void clickcontinue()
	{
		continuebtn.sendKeys(Keys.RETURN);;
	}
	public String getconfirmationmsg()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
}
