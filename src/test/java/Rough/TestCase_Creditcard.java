package Rough;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.HomePage;
import com.pageObjects.InsufficientEedsPage;
import com.pageObjects.LoginPage;
import com.pageObjects.PlugsPage;
import com.pageObjects.ProfilePage;
import com.pageObjects.ServiceDetailPage;

public class TestCase_Creditcard extends BaseClass{

	@Test
	public void Creditcard() throws IOException, InterruptedException
	{

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
			//Enter Credit Card Number
		//	IP.EnterCardNumber("4242424242424242");
		//	logger.info("Enter Card Number");
			//Enter Date
		//	IP.EnterMMYY("04 25");
		//	logger.info("Enter Date in MMYY format");
		//Enter CVC number
		//	IP.EnterCVC("23289");
			//logger.info("Enter Card CVC Number");
			//Click on Pay Button
			IP.ClickPayBtn();
			logger.info("Click on Pay Button");
		}
}
