package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.LoginPage;
import com.pageObjects.SearchNeed;

public class Testcase_BuyNeed extends BaseClass{

	@Test
	public void BuyNeed() throws IOException, InterruptedException
	{	
	
	//--------Login with WIND user ----------
	
	// creating a object of LoginPage
	LoginPage loginnew = new LoginPage(driver);	
	loginnew.clickloginlandingbtn();
	logger.info("clicked on login In Button");
						
	loginnew.setUsername("wind@mailinator.com");
	logger.info("Enter userid");
	loginnew.setPassword("qatest2plugs");
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
	logger.info("Click on Send Button");
	
	
	}
	
}
