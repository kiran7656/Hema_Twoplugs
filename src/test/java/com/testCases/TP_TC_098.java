package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.DeleteService;
import com.pageObjects.HomePage;
import com.pageObjects.InsufficientEedsPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.ServiceDetailPage;

public class TP_TC_098 extends BaseClass{

	@Test
	public void CreditcardWorkflow() throws IOException, InterruptedException
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
						service.txtTitleField1("Car Rent in Ottawa");
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
						service.txtPriceField("300");
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

		//click on check box from Buy Service pop up window
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
		//click on log out 
		csn.clkdropDownLogoutwind1();
		logger.info("clicked on Hi wind to signout");
		//click on sign out for wind
		csn.clksignoutwind1();
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
