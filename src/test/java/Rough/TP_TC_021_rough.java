package Rough;

import java.io.IOException;
import com.utilities.*;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.SignUpPage;

public class TP_TC_021_rough extends BaseClass
{
	SignUpPage sp;
	@Test	
	 public void SignUpTest(String mypass) throws InterruptedException, IOException
	{
			//SignUp page
				SignUpPage SignUpPage = new SignUpPage(driver);
				
				logger.info("Clicking on JOIN NOW FOR FREE button to enter user name, email and password");
				SignUpPage.clickbtnsignuplanding();	
				
				logger.info("Entering password");
				SignUpPage.DoLogin(mypass);
				
				SignUpPage.clickbtnSignup();
				logger.info("Click on SignUp button");
				Thread.sleep(5000);
				// Validating the login - "Home Page" title
				// after logging into TwoPlugs
				
				SoftAssert asrt=new SoftAssert();
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt.assertTrue(true);
					logger.info("login success");
						
				}
				else
				{
					captureScreen(driver,"Signuptest");
					// to capture screen on failure and here after driver
								// we use the name of the current test method i.e. Signuptest
					logger.error("SignUp is failed : Screen shot taken");
					asrt.assertTrue(false);
				}
				System.out.println(" " + "Page Title  : " + driver.getTitle());
				logger.info("Vaidating title page - Home page, after SignUp");
	
	}
			
}
