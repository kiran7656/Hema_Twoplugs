package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.TransferPage;

public class TP_TC_116 extends BaseClass{

	@Test
	public void BalanceUpdate() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		logger.info("click on sign In button");
		login.setUsername("wind@mailinator.com");
		logger.info("Enter user name as Wind");
		login.setPassword("Busyqa2020");
		logger.info("Enter password for Wind");
		login.clickloginbtn1();
		logger.info("Login as Wind");
		
		//click on search text box and enter user name
		
		ProfilePage puser=new ProfilePage(driver);
		//Enter user Name to whom u want to transfer Eeds
		puser.txtSearchUser("Wave");
		logger.info("Search Username as Wave");
		TimeUnit.SECONDS.sleep(6);
		
		//click on Wave user
		puser.ClickWaveUser();
		logger.info("click Wave user");
		
		//===check Total balance first time as actual===//
				HomePage hp=new HomePage(driver);
				logger.info("Here is Total Balace on profile");
				int act=hp.TotalBalancecountactual();
				
		//click on Send eeds icon from Profile Page
		puser.ClicksendEeds();
		logger.info("Click on Send Eeds icon");
		
		//enter amount to user
		TransferPage tp=new TransferPage(driver);
		tp.EnterAmount("2");
		logger.info("Entered Amount");
		
		//click button Transfer
		tp.clkbtnTransfer();
		logger.info("clicked button transfer");
		
		//click on button transfer again on new window "Are you sure you want to transfer"
		tp.clkbtnTransfer2();
		logger.info("click TRANSFER on -Are you sure you want to transfer window");
		
	
		// ==== check for expected Total Balance for user====//
		logger.info("Here is Updated Balace on profile");
		int exp=hp.TotalBalanceexpeeds();
		
		//soft Assertion validation for transaction page
		SoftAssert asrt = new SoftAssert();
		if(act < exp)
		{
			asrt.assertTrue(true);
			logger.info("Profile Total Balance gets updated with the amount while transferring eeds successfully");
		}
		else
		{
			asrt.assertTrue(false);
			logger.error("Balance Updation Failed!");
			captureScreen(driver,"BalanceUpdate");
		}
		asrt.assertAll();
		logger.info("Completed balance Updation");
		
		//Logout from users
		CreateService csn = new CreateService (driver);
		csn.clkdropDownLogoutwind1();
		logger.info("clicked on Hi wind to signout");
		//click on sign out for Wind
		csn.clksignoutwind1();
		logger.info("clicked on Sign Out Button");
		
		
	}
		
		
			
}
