package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateNeed;
import com.pageObjects.CreateService;
import com.pageObjects.DeleteNeed;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.MailPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.SearchNeed;

public class TP_TC_047 extends BaseClass {
	@Test
	public void Need() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		logger.info("clicked on login In Button");
		login.setUsername("wave@mailinator.com");
		logger.info("Enter Wave User id");
		login.setPassword("Busyqa2020");
		logger.info("Enter password for Wave");
		login.clickloginbtn1();
		logger.info("login In as Wave User");
			
		// Creating a New Need here->
		
		// creating a object of CreateService Page
				CreateNeed cn = new CreateNeed(driver);  
				
				//click on create new button
				cn.clkbtnCreateNewneed();
				logger.info("Clicking on Create new tab");
				
				//click on Need
				cn.clkbtnNeed();
				logger.info("Click on Need option");
				
				//Enter title
				
				cn.txtTitleField("Car Wash in Brampton");
				logger.info("Enter Title");
				
				//Enter Description
				cn.txtdescriptionField("Wash Car on tuesday");
				logger.info("Enter Description");
				
				//click on Category
				cn.selectCategoryFieldneed();
				logger.info("Click on category");
				
				//Select Category from list
				cn.CategoryAutomobileneed();
				logger.info("Select Category as Automobile");
				TimeUnit.SECONDS.sleep(3);

				//click on sub category
				cn.subCategoryFieldcar1();	
				logger.info("click on subcategory");
				
				//select sub category from list
				cn.selectCatergoryList1();
				logger.info("select subcategory Automobile");
				
				//enter price
				cn.txtPriceField("10");
				logger.info("Enter price");
				
				cn.btnCreateNeedPage();
				logger.info("Click on Create button");
								
				CreateService csn = new CreateService (driver);
				//click on Hi Wave for sign out
				csn.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on signout
				csn.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");				


				//--------Login with WIND user (Seller)----------
				
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
				//click on search button
				SearchNeed sn= new SearchNeed(driver);
				//click on Search button on Live Feed page
				sn.clicksearchbtn();
				logger.info("click on search button");
				//click on  Need from search list
				sn.clickNeed();
				logger.info("click on need which wnt to select");
				//click on i can do this
				sn.clickicandothis();
				logger.info("click on I CAN DO THIS");
				sn.txtBidPriceField("5");
				logger.info("clear existing and Enter new Biding price");
				sn.selectdropdownbid();
				logger.info("click on dropdown button");
				sn.selectdropdownservicebid();
				logger.info("select drop down service from list");
				sn.clickchkbox();
				logger.info("Click on check box");
				sn.clicksendbutn();
				logger.info("Click on Send Button");
				sn.clickbidsendokbtn();
				logger.info("Click on OK Button");
				//click on message to check Bid Send message
				MailPage mp1=new MailPage(driver);
				mp1.ClickMessage();
				logger.info("click on Message box");
				mp1.ClickMessageBidSend();
				logger.info("clicked on messages to Bid Send");
				System.out.println(driver.getTitle());
				
				//AC01-After click on Send button, Seller should have Bid sent mail in his inbox
				
				SoftAssert softassert = new SoftAssert();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed! Seller get Bid Send mail in his inbox Successfully!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Updation Failed on Edit Page");
					captureScreen(driver,"Edit");
				}
				softassert.assertAll();
				logger.info("Completed Updation");
				
				//==== logout from WIND User====//
				
				csn.clkdropDownLogoutwind1();
				logger.info("clicked on Hi wind to signout");
				//click on sign out for Wind
				csn.clksignoutwind1();
				logger.info("clicked on Sign Out Button");
				
				//====Login as Wave (Buyer)===
				LoginPage login1 = new LoginPage(driver);	// creating a object of LoginPage
				login1.clickloginlandingbtn();
				logger.info("clicked on login In Button");
				login1.setUsername("wave@mailinator.com");
				logger.info("Enter Wave User id");
				login1.setPassword("Busyqa2020");
				logger.info("Enter password for Wave");
				login1.clickloginbtn1();
				logger.info("login In as Wave User");
					
				//check message for new Bid
				MailPage mp=new MailPage(driver);
				mp.ClickMessage();
				logger.info("clicked on messages");
				
				mp.clickNewBidmail();
				logger.info("clicked on New Bid Mail");
				
				//AC02- Buyer should receive New Bid mail with 3 options - Decline Bid, Make an Offer, Accept 
				
				SoftAssert asrt = new SoftAssert();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt.assertTrue(true);
					logger.info("Test Passed! Buyer receiinge New Bid mail with 3 options - Decline Bid, Make an Offer, Accept Successfully!");
				}
				else
				{
					asrt.assertTrue(false);
					logger.error("Updation Failed on Edit Page");
					captureScreen(driver,"Edit");
				}
				asrt.assertAll();
				logger.info("Completed Updation");
				
				//click on check box inside New Bid mail
				mp.clickmailchkbox();
				logger.info("clicked on check box from mail to decline Bid");
				mp.ClickDeclineBid();
				logger.info("clicked on Decline Bid");
				//logout as Wave
				csn.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on signout
				csn.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");
				
//--------Login with WIND user (Seller)----------
				
				// creating a object of LoginPage
				LoginPage loginn = new LoginPage(driver);	
				loginn.clickloginlandingbtn();
				logger.info("clicked on login In Button");
									
				loginn.setUsername("wind@mailinator.com");
				logger.info("Enter userid");
				loginn.setPassword("Busyqa2020");
				logger.info("Enter password");
				loginn.clickloginbtn1();
				logger.info("login with wind user");
				//check message for canceled Bid
				MailPage mp2=new MailPage(driver);
				mp2.ClickMessage();
				logger.info("clicked on messages to chk cancelled bid");
				
				mp2.ClickBidCancelledmsg();
				logger.info("clicked on Cancelled Bid Mail");
//AC03 - After Buyer declines bid, seller received Bid canceled mail in their inbox
				
				SoftAssert ast = new SoftAssert();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					ast.assertTrue(true);
					logger.info("Test Passed! After Buyer declines bid, Seller received Bid canceled mail in their inbox Successfully!");
				}
				else
				{
					ast.assertTrue(false);
					logger.error("Updation Failed on Edit Page");
					captureScreen(driver,"Edit");
				}
				ast.assertAll();
				logger.info("Completed Updation");
				
				
				CreateService csn1 = new CreateService (driver);
				//click on Hi Wave for sign out
				csn1.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on signout
				csn1.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");
				
				//====Login as Wave Again to delete Need =====
				LoginPage loginneed = new LoginPage(driver);	// creating a object of LoginPage
				loginneed.clickloginlandingbtn();
				logger.info("clicked on login In Button");
				loginneed.setUsername("wave@mailinator.com");
				logger.info("Enter Wave User id");
				loginneed.setPassword("Busyqa2020");
				logger.info("Enter password for Wave");
				loginneed.clickloginbtn1();
				logger.info("login In as Wave User");
				
				//Verify message for canceled Bid for Wave
				MailPage mp3=new MailPage(driver);
				mp3.ClickMessage();
				logger.info("clicked on messages to chk cancelled bid");
				
				mp3.verifybidcancel();
				logger.info("clicked on Cancelled Bid Mail");
//AC03 - - After Buyer declines bid, Buyer received Bid canceled mail in their inbox
				
				SoftAssert ast1 = new SoftAssert();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					ast1.assertTrue(true);
					logger.info("Test Passed! After Buyer declines bid, Buyer received Bid canceled mail in their inbox Successfully!");
				}
				else
				{
					ast1.assertTrue(false);
					logger.error("Updation Failed on Edit Page");
					captureScreen(driver,"Edit");
				}
				ast1.assertAll();
				logger.info("Completed Updation");
				
			
							
				ProfilePage p1=new ProfilePage(driver);
				p1.clkdropDownLogoutWave();
				logger.info("click on Hi wave drop down");
				p1.clkbtnProfilewave();
				logger.info("click on profile");
				
				DeleteNeed dn=new DeleteNeed(driver);
				dn.ClickDelete();
				logger.info("click on delete option");
				dn.clickIWntDeletebtn();
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
