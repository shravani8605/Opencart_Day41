package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	
	
	@Test
	public  void test_login()
	{
		try
		{
			
		logger.info("****Starting Tc_002_LoginTest****");
		
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My Account");
		
		hp.clickLogin();
		logger.info("Clicked on login");
		
		LoginPage lp = new LoginPage(driver);
		logger.info("Providing login details");
		lp.setemail(rb.getString("email"));
		lp.setpassoword(rb.getString("password"));
		lp.clicklogin();
		
		MyAccount map = new MyAccount(driver);
		boolean targetpage = map.isMyAccountPageExists();
		Assert.assertEquals(targetpage,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("****Finished TC_002_LoginTest****");
	}

}
