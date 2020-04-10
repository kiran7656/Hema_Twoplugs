package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pageObjects.CreateNeed;
import com.pageObjects.CreateService;
import com.pageObjects.HomePage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;

public class TP_TC_028 extends BaseClass{

	@Test
	public void Edit() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		login.setUsername("wave@mailinator.com");
		login.setPassword("qatest2plugs");
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
				
				//Enter title for Service
				service.txtTitleField1("Wash Car Without chemical");
				logger.info("Enter Title");
				
				//Enter Description for Service
				service.txtdescriptionField1("Wash Car with free oil servicing");
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
				service.txtPriceField("150");
				logger.info("Enter price");
				
				//click on create button
				service.btnSubmitServicePage();
				logger.info("Click on Create");
				
				HomePage h=new HomePage(driver);
				//click on Plugs button to move on Plugs page
				h.clickplugslanding();
				logger.info("click on Plugs");
				
				PlugsPage p=new PlugsPage(driver);
				//click on Car Wash already exist service
				p.Clickcarwash();
				logger.info("click on carwash");
				
				//Click on Edit button from that selected service
				p.ClickEdit();
				logger.info("Click on Edit");
				
				//Update Refund bar
				service.SilderBarMaxLimit();
				logger.info("update Refund limit");
			
				//update Refund Valid field
				service.refundValidField("20");
				logger.info("update refund days");
				
				//click on save button to save changes on edit page
				p.ClickSave();
				logger.info("Click on Save button");
		
	
				//Validate whether Service updated is successful
				SoftAssert softassert = new SoftAssert();
				//System.out.println(driver.getTitle());
				
				CreateService cs=new CreateService(driver);
				String msg = cs.validatemsg();
				if(msg.equals("Service has been updated"))
				{
					softassert.assertTrue(true);
					logger.info("Test Passed! Service Updation Successful!");
				}
				else
				{
					softassert.assertTrue(false);
					logger.error("Service Updation Failed on Edit Page");
					captureScreen(driver,"EditService");
				}
				softassert.assertAll();
				logger.info("Completed Service Updation");
				
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
						
				//===== Create New Need =======//
				
				// creating a object of CreateService Page
				CreateNeed cn = new CreateNeed(driver);  
				
				//click on create new button
				cn.clkbtnCreateNewneed();
				logger.info("Clicking on Create new tab");
				
				//click on Need
				cn.clkbtnNeed();
				logger.info("Click on Need option");
				
				//Enter title for Need
				
				cn.txtTitleField("New Car Wash");
				logger.info("Enter Title");
				
				//Enter Description for Need
				cn.txtdescriptionField("car Need on monday");
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
				
				cn.btnCreateNeedPage();
				logger.info("Click on Create button to submit need");
								
				//click on Plugs button to move on Plugs page
				cn.clickplugslanding1();
				logger.info("click on Plugs");
				
				PlugsPage p1=new PlugsPage(driver);
				//click on Car Wash already exist service
				cn.Clickcarwash1();
				logger.info("click on carwash");
				
				//Click on Edit button from that selected service
				cn.ClickEditNeed();
				logger.info("Click on Edit");
				

				//enter price for Need
				cn.txtPriceField("25");
				logger.info("Enter price");
				
				//cn.EnteryouTubeVideoURL("https://www.youtube.com/watch?v=yRaMz5z2rHI");
				//logger.info("Enter youtube url for car wash");
				
				//click on save button to save changes on edit page
				cn.ClickSaveNeed();
				logger.info("Click on Save button");
		
				//Validate whether Service updated is successful
				SoftAssert asrt = new SoftAssert();
				//System.out.println(driver.getTitle());
				
				CreateService cs1=new CreateService(driver);
				String msgnew = cs1.validatemsg();
				if(msgnew.equals("Need has been updated"))
				{
					asrt.assertTrue(true);
					logger.info("Test Passed! Need Updation Successful!");
				}
				else
				{
					asrt.assertTrue(false);
					logger.error("Need Updation Failed on Edit Page");
					captureScreen(driver,"EditNeed");
				}
				asrt.assertAll();
				logger.info("Completed Need Updation");
				
				 
		}
		
	}

