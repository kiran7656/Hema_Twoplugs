package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.EditServicePage;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.MailPage;
import com.pageObjects.ServiceDetailPage;
import com.pageObjects.TransHistoryPage;

public class TP_TC_096 extends BaseClass{

	@Test
	public void TransactionHistory() throws IOException, InterruptedException
	{
		// creating a object of LoginPage
		LoginPage login = new LoginPage(driver);	
		login.clickloginlandingbtn();
		login.setUsername("wave@mailinator.com");
		login.setPassword("Busyqa2020");
		login.clickloginbtn1();
		// Creating a New Service here->
		
		// creating a object of CreateService Page
				CreateService service = new CreateService(driver);  
				
				//click on create new button
				service.clkbtnCreateNew();
				logger.info("Clicking on Create new tab");
				//click on Service
				service.clkbtnService();
				logger.info("Click on Service option");
				//Enter title
				service.txtTitleField1("Bake Muffin with choclate");
				logger.info("Enter Title");
				//Enter Description
				service.txtdescriptionField1("Wheat with Banana choco");
				logger.info("Enter Description");
				//click on Category
				service.Clickfirst();
				logger.info("Click on category");
				//Select Category from list
				service.SelectFood();
				logger.info("Select Category as Food");
				TimeUnit.SECONDS.sleep(3);
				//click on sub category
				service.Twoplugscategory();		
				logger.info("click on subcategory");
				//select sub category from list
				service.Twoplugscook();
				logger.info("select subcategory cook");
				
				//enter price
				service.txtPriceField("00");
				logger.info("Enter price as Zero");
				
				//click on submit button
				service.btnSubmitServicePage();
				logger.info("clicked on submit button");
	
				CreateService csn = new CreateService (driver);
				//click on Hi Wave for sign out
				csn.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on sign out for Wave
				csn.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");
				
				//--------Login with another user as Ocean----------
				
				// creating a object of LoginPage
				LoginPage loginnew = new LoginPage(driver);	
				loginnew.clickloginlandingbtn();
				logger.info("clicked on login In Button");
				
				loginnew.setUsername("ocean@mailinator.com");
				logger.info("Enter userid");
				loginnew.setPassword("qatest2plugs");
				logger.info("Enter password");
				loginnew.clickloginbtn1();
				logger.info("login with ocean user");
						
				//create object of Home Page
				HomePage h=new HomePage(driver);
				h.clickplugslanding();
				logger.info("clicked on Plugs button");
				// creating a object of Edit service 
				EditServicePage esp=new EditServicePage(driver);
				esp.ClickBakeMuffin();
				logger.info("clicked on Bake Muffin with choclate");
				// creating a object of Service details
				ServiceDetailPage sdp=new ServiceDetailPage(driver);
				sdp.Clickiwntthis();
				logger.info("click on I WANT THIS button");
				
				//click on chk box from Buy Service pop up window
				sdp.Clickchkbox();
				logger.info("clicked on check box from Buy Service pop up"); 
				//click on buy button
				sdp.Clickbuybtn();
				logger.info("clicked on Buy Button");
				//click on OK button after service buy page 
				sdp.ClickOk();
				logger.info("clicked on OK Button");
				csn.clkdropDownLogout1();
				logger.info("clicked on Hi Ocean to signout");
				//click on signout
				csn.clkbtnSignOut1();
				logger.info("clicked on Sign Out Button");
				
				//=========login with Wave user again
				
				LoginPage login2 = new LoginPage(driver);	// creating a object of LoginPage
				login2.clickloginlandingbtn();
				logger.info("clicked on login In");
				login2.setUsername("wave@mailinator.com");
				logger.info("Enter user id for Wave User");
				login2.setPassword("Busyqa2020");
				logger.info("Enter password for Wave User");
				login2.clickloginbtn1();
				logger.info("clicked on login In Button");
				MailPage mp=new MailPage(driver);
				mp.ClickMessage();
				logger.info("clicked on messages");
				mp.ClickConfirmordermail();
				logger.info("clicked on confirm order mail from message box");
				mp.Clickchkboxconfirmmail();
				logger.info("clicked on checkbox on confirm order mail page");
				mp.Clickfirstconfirm();
			logger.info("clicked on confirm button first time");
				mp.clickconfirmdeliverymail();
				logger.info("clicked on confirm delivery from message box");
				mp.clickconfirmsecond();
				logger.info("clicked on confirm button second time on next page after delivery");
				mp.clickconfirmdeliverymail1();
			 logger.info("clicked on confirm delivery mail again to check status of delivery");
			
				TransHistoryPage thp= new TransHistoryPage(driver);
				thp.Clicktransactionbtn();
				logger.info("clicked on Transaction Page");
				
				//soft Assertion validation for transaction page
				SoftAssert softassert = new SoftAssert();
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed! transaction History updated Successful!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Test Failed! Login failed!");
					captureScreen(driver,"TransactionHistory");
				}
				softassert.assertAll();
				logger.info("Completed Transaction");
				
				
				//click on Hi Wave for sign out
				csn.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on signout
				csn.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");				

				//Close Browser
				driver.quit();
				
				
}
}