package testCases;

//import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass  {
 
   
    @Test(groups = {"Regression","Master"})
	public void test_account_Registration()throws InterruptedException

	{
    	logger.debug("Application logs......");
		logger.info("***Starting Tc_001_AccountRegistrationTest*****");
		try 
		{
			
		HomePage hp = new HomePage(driver);
	
	    hp.clickMyAccount();
	    logger.info("Clicked on MyAccount Link");
	    hp.clickRegister();
	    logger.info("Clicked on Register Link");
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		//Thread.sleep(2000);
		
		 logger.info("Providing Customer data");
		
        regpage.setfname("abc");
        regpage.setlname("xyz");
       //regpage.setemail(rb.getString("email"));
       //regpage.setpassoword(rb.getString("password"));
       regpage.setemail(randomeString()+ "@gmail.com");
       regpage.setpassoword("test@123");
       //regpage.clickNewsletter();
         Thread.sleep(5000);
        regpage.setprivateplcy();
        
        regpage.clickcontinue();
        Thread.sleep(2000);
        logger.info("Clicked on continue");
        String confmsg = regpage.getconfirmationmsg();
        logger.info("Validating expected Messages");
        Assert.assertEquals(confmsg, "Your Account Has Been Created!", "not getting expected message ");
		
	}
	catch(Exception e)
	{
		logger.error("test failed");
		Assert.fail();
	}
   logger.info("*****Finished Tc_001_AccountRegistrationTest*****");
		
	}
	
	 
}
