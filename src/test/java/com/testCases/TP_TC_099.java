package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.DeleteService;
import com.pageObjects.EditServicePage;
import com.pageObjects.HomePage;
import com.pageObjects.InsufficientEedsPage;
import com.pageObjects.LoginPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.ServiceDetailPage;

public class TP_TC_099 extends BaseClass{
	@Test
	public void ZeroPrizeUpdate() throws IOException, InterruptedException
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
						// Creating a New Service here->
						
						// creating a object of CreateService Page
						CreateService cs = new CreateService(driver);  
								
						//click on create new button
						cs.clkbtnCreateNew();
						logger.info("Clicking on Create new tab");
						
						//click on Service
						cs.clkbtnService();
						logger.info("Click on Service option");
							
						//Enter title
						cs.txtTitleField1("Bake DryFruit Muffin");
						logger.info("Enter Title");
								
						//Enter Description
						cs.txtdescriptionField1("DryFruit Cake");
						logger.info("Enter Description");
								
						//click on Category
						cs.Clickfirst();
						logger.info("Click on category");
								
						//Select Category from list
						cs.SelectFood();
						logger.info("Select Category as Food");
						TimeUnit.SECONDS.sleep(3);

						//click on sub category
						cs.Twoplugscategory();		
						logger.info("click on subcategory");
								
						//select sub category from list
						cs.Twoplugscook();
						logger.info("select subcategory cook");
							
						//enter price
						cs.txtPriceField("200");
						logger.info("Enter price as 200");
								
						//click on submit button
						cs.btnSubmitServicePage();
						logger.info("clicked on submit button");
	
						CreateService csn = new CreateService (driver);
						//click on Hi Wave for sign out
						csn.clkdropDownLogout();
						logger.info("clicked on Hi Wave");
						//click on signout
						csn.clkbtnSignOut();
						logger.info("clicked on Sign Out Button");
						
						//--------Login with another user ----------
						
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
						TimeUnit.SECONDS.sleep(3);

						//Insufficient funds Page gets open
						InsufficientEedsPage IP=new InsufficientEedsPage(driver);
						//Enter Credit Card Name
						IP.EnterNameonCard("Busyqa twoplugs");
						logger.info("Enter Card Holder Name");
						
						//Enter Card Number, Expiry Date,CVC, ZipCode details 
						IP.EnterCardDetails("4242424242424242","04/25","815","23289");
						logger.info("Enter Card Number, MM/YY,CVC,ZipCode");
						
						//Click on Pay Button
						IP.ClickPayBtn();
						logger.info("Click on Pay Button");
						//click OK button after Purchase Succeeded
						
						IP.ClickokBtn();
						logger.info("Click on Ok Button");
						
						//click on log out Ocean
						cs.clkdropDownLogout1();
						logger.info("Click on Dropdown list");
						
						cs.clkbtnSignOut1();	
						logger.info("Click on Signout for Ocean");
						
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
