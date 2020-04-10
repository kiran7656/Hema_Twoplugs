package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.DeleteService;
import com.pageObjects.LoginPage;
import com.pageObjects.ProfilePage;

public class TP_TC_095 extends BaseClass{
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
								cs.txtTitleField1("Bake");
								logger.info("Enter Title");
								
								//Enter Description
								cs.txtdescriptionField1("Wheat Cake");
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
								cs.txtPriceField("00");
								logger.info("Enter price as Zero");
								
								//click on submit button
								cs.btnSubmitServicePage();
						logger.info("clicked on submit button");
		  		
						SoftAssert softassert = new SoftAssert();
						//System.out.println(driver.getTitle());
						
						CreateService csn=new CreateService(driver);
						String msg = csn.validatemsg();
						if(msg.equals("Service has been added"))
						{
							softassert.assertTrue(true);
							logger.info("Test Passed! Updation Successful!");
						}
						else
						{
							softassert.assertTrue(false);
							logger.error("Updation Failed on Edit Page");
							captureScreen(driver,"Edit");
						}
						softassert.assertAll();
						logger.info("Completed Updation");
						
			
						//========= Delete Service====//

						
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
