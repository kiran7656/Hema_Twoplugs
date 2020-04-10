package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.LandingPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.TransHistoryPage;
import com.utilities.ExcelConfig;
import com.utilities.ReadConfig;
import com.utilities.XLUtils;

public class TP_TC_097 extends BaseClass{
@Test(dataProvider="credentials")
	
	public void logintest(String user, String pwd) throws InterruptedException, IOException 
	{
		//create object of Landing class
		LandingPage l=new LandingPage(driver);
			
		//click login button
				l.clickloginlandingbtn();
				logger.info("log in button clicked");
					
		// create Login page object
					LoginPage LoginPage = new LoginPage(driver);
		
		//Enter user name on Login page
					LoginPage.setUsername(user);
					logger.info("providing user name");
				
		//Enter password on Login page
					LoginPage.setPassword(pwd);
					logger.info("providing password");
					
			//click on login button
					LoginPage.clickloginbtn1();
				logger.info("Clicking on login button to access TwoPlugs main home page");
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
				
				//Validate whether page goes to previous page 
				SoftAssert asrt = new SoftAssert();
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt.assertTrue(true);
					logger.info("Test Passed! Previous page move Successful!");
				}
				else
				{
					asrt.assertTrue(false);
					logger.error("Test Failed! last page failed!");
					captureScreen(driver,"previousclick");
				}
				asrt.assertAll();
				logger.info("Completed PreviousMove");
			
	         //click on Next button ,second last button
			    p.SelectNextbtn();
			    logger.info("clicked on next button");

			    //assertion to check next page button validation
			   
			    SoftAssert asrt2 = new SoftAssert();
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt2.assertTrue(true);
					logger.info("Test Passed! Next page move Successful!");
				}
				else
				{
					asrt2.assertTrue(false);
					logger.error("Test Failed! Next page failed!");
					captureScreen(driver,"Nextclick");
				}

				//click on First button on page
				p.SelectFirstbtn();
				logger.info("clicked on First button");
				
				//assertion to check First page button validation
			 	SoftAssert asrt3 = new SoftAssert();
	 
				if(driver.getTitle().equals("twoPLUGS - A plug for your Service and another for your Need"))
				{
					asrt3.assertTrue(true);
					logger.info("Test Passed! First page move Successful!");
				}
				else
				{
					asrt3.assertTrue(false);
					logger.error("Test Failed! last page failed!");
					captureScreen(driver,"Firstclick");
				}
				
				///===Pagination Validation on Transaction Page=====//
				
				TransHistoryPage thp= new TransHistoryPage(driver);
				thp.Clicktransactionbtn();
				logger.info("clicked on Transaction Page");
				
				thp.SelectNextTxn();
				logger.info("clicked on Next Page");
				thp.SelectLastTxn();
				logger.info("clicked on Last Page");
				thp.SelectPreviousTxn();
				logger.info("clicked on Previous Page");
				thp.SelectFirstTxn();
				logger.info("clicked on First Page");
				
				
				

          }
	
	
	// Data provider will always return String type of data
		// Two dimensional string type array
		@DataProvider(name="credentials")
		public String [][] getData() throws IOException 
		{		
			String path=System.getProperty("user.dir")+"/src/test/java/com/testData/LoginData.xlsx";
		
			//Read data 
			//no of rows  in the XL data sheet
			int rownum=XLUtils.getRowCount(path, "TP_TC_029");
			// no of columns in the XL data sheet
			int colcount=XLUtils.getCellCount(path,"TP_TC_029",1); 
			String data[][]=new String[rownum][colcount]; 
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colcount;j++)// Since the col values start from index 0
				{
					
					data[i-1][j]=XLUtils.getCellData(path,"TP_TC_029", i,j);// i is row and j is col
					
				}
				
       }
			return data;
		}
}