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



public class TP_TC_021_rough1 extends BaseClass
{
	SignUpPage sp;
	
		
	@Test(dataProvider="SignUpData")
	 public void SignUpTest(String mypass) throws InterruptedException, IOException {
		
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
				// after logging into Sun
				
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
	
	@DataProvider(name="SignUpData")
	public Object[][] providedata()
	{
		ExcelConfig config=new ExcelConfig(System.getProperty("user.dir")+"\\src\\test\\java\\com\\testData\\sign.xlsx");
		int rows=config.getRowCount("Sheet1");
		System.out.println("No. of rows display"+rows);
		Object data[][]=new Object[rows][1];
		data[0][0]=config.getData("Sheet1", 0, 0);
			
	// validating for multiple rows (passwords)	in excel sheets	
	//	Object data[][]=new Object[rows][1];
		
		//for(int i=0;i<rows;i++)
	//	{
		//	data[i][0]=config.getData("Sheet1", i, 0);
		    // validate for multiple column
			//	data[0][i]=config.getData("Sheet1", 0,i);
	//		}
		return data;
	}
			
}
