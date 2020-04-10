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

public class TP_TC_114 extends BaseClass{
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
						service.txtTitleField1("Car Rent on Weekend in Brampton");
						logger.info("Enter Title");
						
						//Enter Description for Service
						service.txtdescriptionField1("Car Rent services ");
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
						service.txtPriceField("20");
						logger.info("Enter price");
						
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
		
		HomePage hp=new HomePage(driver);
		logger.info("Here is Total Balace on profile");
		int act=hp.TotalBalancecountactual();
		
		ProfilePage pp=new ProfilePage(driver);
		//pp.clkbtnProfile();
		//logger.info("check Total balance on profile page");
		
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
		//click on sign out for Wind
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
		//click on confirm order mail first mail
		mp.ClickConfirmordermail();
		logger.info("clicked on confirm order mail from message box");
		//click on check box
		mp.Clickchkboxconfirmmail();
		logger.info("clicked on checkbox on confirm order mail page");
		//click on confirm box inside confirm order mail
		mp.Clickfirstconfirm();
		logger.info("clicked on confirm button first time");
		mp.clickconfirmdeliverymail();
		logger.info("clicked on confirm delivery from message box");
		//click on confirm button inside confirm delivery mail
		mp.clickconfirmsecond();
		logger.info("clicked on confirm button second time on next page after delivery");
		mp.clickconfirmdeliverymail1();
		logger.info("clicked on confirm delivery mail again to check status of delivery");
		pp.clkdropDownLogoutWave();
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
				
				//click on "Hi wind" drop down to go to Profile page
				pp.clkdropDownLogoutwind2();
				logger.info("clicked on Hi wind to signout");
						
				ProfilePage p1=new ProfilePage(driver);
				p1.clkbtnProfilew();
				logger.info("check Total balance on profile page");
				
				// ==== check for expected Total Balance for user====//
				HomePage hpu=new HomePage(driver);
				logger.info("Here is Updated Balace on profile");
				int exp=hp.TotalBalancecountexpected();
				
				//soft Assertion validation for transaction page
				SoftAssert asrt = new SoftAssert();
				if(act>exp)
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
				
				DeleteService ds=new DeleteService(driver);
				ds.ClickDeleteService();
				logger.info("click on delete option");
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
