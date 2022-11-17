package pageObjects;

//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		//Elements
		
		
		@FindBy(xpath = "//input[@id='input-email']")
		WebElement Email;
		
		@FindBy(xpath = "//input[@id='input-password']")
		WebElement Password;
	 
		@FindBy(xpath = "//button[normalize-space()='Login']")
        WebElement Login;

		
		//Actions
		
		public void setemail(String email)
		{
			Email.sendKeys(email);
		}
		public void setpassoword(String pwd) 
		{
			Password.sendKeys(pwd);
		}

		public void clicklogin()
		{
			Login.click();
	
		}


	}



