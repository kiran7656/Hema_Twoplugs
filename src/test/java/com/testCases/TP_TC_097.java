package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.HomePage;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.pageObjects.MailPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.TransHistoryPage;
import com.utilities.ExcelConfig;
import com.utilities.ReadConfig;
import com.utilities.XLUtils;

public class TP_TC_097 extends BaseClass{
	@Test
	public void TransactionHistory() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		login.setUsername("wave@mailinator.com");
		login.setPassword("Busyqa2020");
		login.clickloginbtn1();
	
		//======= Validating pagination on Plugs page =======//
				//create object of Home Page
				HomePage h=new HomePage(driver);
				h.clickplugslanding();
				logger.info("clicked on Plugs button");
				
				//click on Plug button and then click on buttons for checking movement
				PlugsPage p=new PlugsPage(driver);
				
				//Click on last button on page
				p.SelectLastbtn();
				logger.info("clicked on Last button");
				//assertion to check Last page button validation
			    
				SoftAssert asrt1 = new SoftAssert();
				//System.out.println(driver.getTitle());
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt1.assertTrue(true);
					logger.info("Test Passed! Last page move Successful!");
				}
				else
				{
					asrt1.assertTrue(false);
					logger.error("Test Failed! last page failed!");
					captureScreen(driver,"Lastclick");
				}
				
				//click on Previous Page second button
				p.SelectPrevioustbtn();
				logger.info("clicked on Previous button");
				
				
				//click on Next button ,second last button
			    p.SelectNextbtn();
			    logger.info("clicked on next button");

			    //click on First button on page
				p.SelectFirstbtn();
				logger.info("clicked on First button");
		
						
				///===Pagination Validation on Messages Page====//
				
				MailPage mp=new MailPage(driver);
				//Click on Messages tab
				mp.ClickMessage();
				logger.info("clicked on messages");
				// click on last page Messages
				mp.SelectLastMsg();
				logger.info("clicked on Last Message");
				//Click on Previous page 
				mp.SelectPreviousMsg();
				logger.info("clicked on Previous Message");
				//Click on Next page to see message 
				mp.SelectNextMsg();
				logger.info("clicked on Next Message");
				//Click on First page to see Messages from first Page
				mp.SelectFirstMsg();
				logger.info("clicked on First Message");

	///===Pagination Validation on Transaction Page=====//
				
				TransHistoryPage thp= new TransHistoryPage(driver);
				thp.Clicktransactionbtn();
				logger.info("clicked on Transaction Page");
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,600)");
				//click on Next Transaction - - second last arrow
				thp.SelectNextTxn();
				logger.info("clicked on Next Transaction");
				//Click on last arrow for last page Transaction
				thp.SelectLastTxn();
				logger.info("clicked on Last Transaction");
				//Click on second arrow to see previous transaction page
				thp.SelectPreviousTxn();
				logger.info("clicked on Previous Transaction");
				// Click on first arrow to see Transaction from first page
				thp.SelectFirstTxn();
				logger.info("clicked on First Transaction");
		
				CreateService cs=new CreateService(driver);
				//click on Hi Wave for sign out
				cs.clkdropDownLogout();
				logger.info("clicked on Hi Wave");
				//click on signout
				cs.clkbtnSignOut();
				logger.info("clicked on Sign Out Button");
				//Close Browser
				driver.quit();
				
          }
	
	}