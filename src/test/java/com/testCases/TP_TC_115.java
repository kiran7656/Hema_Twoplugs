package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.DeleteService;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.MailPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.ServiceDetailPage;
import com.pageObjects.TransHistoryPage;

public class TP_TC_115 extends BaseClass{

	@Test
	public void BalanceUpdate() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		logger.info("click on sign In button");
		login.setUsername("wave@mailinator.com");
		logger.info("Enter user name as Wave");
		login.setPassword("Busyqa2020");
		logger.info("Enter password for Wave");
		login.clickloginbtn1();
		logger.info("Login as Wave");
		// Creating a New Service here->
		
				// creating a object of CreateService Page
						CreateService service = new CreateService(driver);  
						
						//click on create new button
						service.clkbtnCreateNew();
						logger.info("Clicking on Create new tab");
						
						//click on Service
						service.clkbtnService();
						logger.info("Click on Service option");
						
						//Enter title for Service
						service.txtTitleField1("Winter Tyre Chnge in Ontario");
						logger.info("Enter Title");
						
						//Enter Description for Service
						service.txtdescriptionField1("Car services in ON");
						logger.info("Enter Description");
						
						//click on Category
						service.selectCategoryFieldAutomobile();
						logger.info("Click on category");
						
						//Select Category from list
						service.CategoryAutomobile();
						logger.info("Select Category as Automobile");
						TimeUnit.SECONDS.sleep(3);

						//click on sub category
						service.subCategoryFieldcar();		
						logger.info("click on subcategory");
						
						//select sub category from list
						service.selectCatergoryList();
						logger.info("select subcategory Automobile");
						
						//enter price for Service
						service.txtPriceField("10");
						logger.info("Enter price as 10 eeds");
						
						service.SilderBarMaxLimit();
						logger.info("set refund  percentage on slide Bar");
						
						service.refundValidField("2");
						logger.info("Refund valid till 2 Days");
						
						//click on create button
						service.btnSubmitServicePage();
						logger.info("Click on Create");
						
						CreateService csn = new CreateService (driver);
						//click on Hi Wave for sign out
						csn.clkdropDownLogout();
						logger.info("clicked on Hi Wave");
						//click on signout
						csn.clkbtnSignOut();
						logger.info("clicked on Sign Out Button");
						

//--------Login with WIND user ----------
										
		// creating a object of LoginPage
		LoginPage loginnew = new LoginPage(driver);	
		loginnew.clickloginlandingbtn();
		logger.info("clicked on login In Button");
							
		loginnew.setUsername("wind@mailinator.com");
		logger.info("Enter userid");
		loginnew.setPassword("Busyqa2020");
		logger.info("Enter password");
		loginnew.clickloginbtn1();
		logger.info("login with wind user");
		
		//===check Total balance first time as actual===//
		HomePage hp=new HomePage(driver);
		logger.info("Here is Total Balace on profile");
		int act=hp.TotalBalancecountactual();
		
		HomePage h=new HomePage(driver);
		//click on Plugs button to move on Plugs page
		h.clickplugslanding();
		logger.info("click on Plugs");
	
		PlugsPage p=new PlugsPage(driver);
		//click on Car Wash already exist service
		p.Clickcarwash();
		logger.info("click on carwash");
		
		//click on I WANT THIS
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
		csn.clkdropDownLogoutwind1();
		logger.info("clicked on Hi wind to signout");
		//click on sign out for galaxy
		csn.clksignoutwind1();
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
		ProfilePage pp = new ProfilePage(driver);
		pp .clkdropDownLogoutWave();
		logger.info("clicked on dropdown");
		pp.clkbtnSignOutwave();
		logger.info("clicked on signout for wave");
		

		//--------Login with WIND user Again to check Total Balance on Profile Page---------
												
				// creating a object of LoginPage
				LoginPage loginnew1 = new LoginPage(driver);	
				loginnew1.clickloginlandingbtn();
				logger.info("clicked on login In Button");
									
				loginnew1.setUsername("wind@mailinator.com");
				logger.info("Enter userid");
				loginnew1.setPassword("Busyqa2020");
				logger.info("Enter password");
				loginnew1.clickloginbtn1();
				logger.info("login with wind user");
				
				// ==== Click on Transaction Page=====//
				TransHistoryPage thp= new TransHistoryPage(driver);
				thp.Clicktransactionbtn();
				logger.info("clicked on Transaction Page");
				thp.ClickRefund();
				logger.info("clicked on Refund icon");
				//====click on I WANT REFUND====//
				thp.ClickiwntRfnd();
				logger.info("clicked on I WANT REFUND Tab");
				csn.clkdropDownLogoutwind2();
				logger.info("clicked on Hi wind to signout");
				//click on sign out for galaxy
				csn.clksignoutwindw2();
				logger.info("clicked on Sign Out Button");
				
				//============Login with Wave to check refund get deducted==========
				
				LoginPage l= new LoginPage(driver);	// creating a object of LoginPage
				l.clickloginlandingbtn();
				logger.info("clicked on login In");
				l.setUsername("wave@mailinator.com");
				logger.info("Enter user id for Wave User");
				l.setPassword("Busyqa2020");
				logger.info("Enter password for Wave User");
				l.clickloginbtn1();
				logger.info("clicked on login In Button");
				MailPage mpn=new MailPage(driver);
				mpn.ClickMessageR();
				logger.info("clicked on messages");
				mpn.SelectRefundMsg();
				logger.info("clicked on refund message");
				//click on refund Tab from mail
				mpn.clickRefundbtn();
				logger.info("clicked on Refund Button inside mail/message");
				PlugsPage pp1=new PlugsPage(driver);
				pp1.clkdropDownLogoutwave2();
				logger.info("clicked on dropdown");
				pp1.clkbtnSignOutwave2();
				logger.info("clicked on signout for wave");
				
				//--------Login with WIND user Again to check transaction Refund Balance Page---------
				
				// creating a object of LoginPage
				LoginPage loginnew2 = new LoginPage(driver);	
				loginnew2.clickloginlandingbtn();
				logger.info("clicked on login In Button");
									
				loginnew2.setUsername("wind@mailinator.com");
				logger.info("Enter userid");
				loginnew2.setPassword("Busyqa2020");
				logger.info("Enter password");
				loginnew2.clickloginbtn1();
				logger.info("login with wind user");
				
				// ==== Click on Transaction Page=====//
				TransHistoryPage thp1= new TransHistoryPage(driver);
				thp1.Clicktransactionbtn();
				logger.info("clicked on Transaction Page to check refund status");
				
				//click on "Hi wind" drop down to go to Profile page
				pp.clkdropDownLogoutwind2();
				logger.info("clicked on Hi wind to signout");
						
				ProfilePage p1=new ProfilePage(driver);
				p1.clkbtnProfilew();
				logger.info("check Total balance on profile page");
				
				// ==== check for expected Total Balance for user====//
				HomePage hp1=new HomePage(driver);
				logger.info("Here is Updated Balace on profile");
				int exp=hp1.TotalBalancecountexpected();
				
				//soft Assertion validation for transaction page
				SoftAssert asrt = new SoftAssert();
				if(act == exp)
				{
					asrt.assertTrue(true);
					logger.info("Verify Total Balance success");
				}
				else
				{
					asrt.assertTrue(false);
					logger.error("Balance Updation Failed!");
					captureScreen(driver,"BalanceUpdate");
				}
				asrt.assertAll();
				logger.info("Completed balance Updation");
				
				//click on Dropdown for log out Wind
				csn.clkdropDownLogoutwind2();
				logger.info("clicked on Hi wind to signout");
				//click on sign out for galaxy
				csn.clksignoutwindw2();
				logger.info("clicked on Sign Out Button");
				
				
				//=========login with Wave User for Delete Service====//

				LoginPage loginwave = new LoginPage(driver);	// creating a object of LoginPage
				loginwave.clickloginlandingbtn();
				logger.info("clicked on login In Button");
				loginwave.setUsername("wave@mailinator.com");
				logger.info("Enter Wave User id");
				loginwave.setPassword("Busyqa2020");
				logger.info("Enter password for Wave");
				loginwave.clickloginbtn1();
				logger.info("login In as Wave User");
			
				ProfilePage p2=new ProfilePage(driver);
				p2.clkdropDownLogoutWave();
				logger.info("click on Hi wave drop down");
				p2.clkbtnProfilewave();
				logger.info("click on profile");
				//click on Delete option
				DeleteService ds=new DeleteService(driver);
				ds.ClickDeleteService();
				logger.info("click on delete option");
				//Click on I Want To Delete Button
				ds.clickIWntDeletebtn();
				logger.info("click on I want To Delete Button");
				
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
