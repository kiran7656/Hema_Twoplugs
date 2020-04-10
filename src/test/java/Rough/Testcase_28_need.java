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

public class Testcase_28_need extends BaseClass{

	@Test
	public void Need() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		login.setUsername("wave@mailinator.com");
		login.setPassword("qatest2plugs");
		login.clickloginbtn1();
			
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
				
				cn.txtTitleField("New Car Wash");
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
				cn.txtPriceField("150");
				logger.info("Enter price");
				
				cn.btnCreateNeedPage();
				logger.info("Click on Create button");
								
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
				
				
				//click on save button to save changes on edit page
				p.ClickSave();
				logger.info("Click on Save button");
		
		}
}

