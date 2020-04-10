package Rough;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.CreateService;
import com.pageObjects.LoginPage;
import com.pageObjects.MailPage;
import com.pageObjects.TransHistoryPage;

public class TP_TC_TransPage extends BaseClass{
	@Test
	public void BalanceUpdate() throws IOException, InterruptedException
	{
	
	LoginPage loginnew1 = new LoginPage(driver);	
	loginnew1.clickloginlandingbtn();
	logger.info("clicked on login In Button");
						
	loginnew1.setUsername("wind@mailinator.com");
	logger.info("Enter userid");
	loginnew1.setPassword("qatest2plugs");
	logger.info("Enter password");
	loginnew1.clickloginbtn1();
	logger.info("login with wind user");
	
	// ==== Click on Transaction Page=====//
	TransHistoryPage thp= new TransHistoryPage(driver);
	thp.Clicktransactionbtn();
	logger.info("clicked on Transaction Page");
	thp.ClickRefund();
	logger.info("clicked on Refund icon");
	//====click on I WANT REFUND====//
	
	thp.ClickiwntRfnd();
	logger.info("clicked on I WANT REFUND Tab");
	CreateService csn = new CreateService (driver);
	csn.clkdropDownLogoutwind1();
	logger.info("clicked on Hi wind to signout");
	//click on sign out for galaxy
	csn.clksignoutwind1();
	logger.info("clicked on Sign Out Button");
	
	
	//============Login with Wave to check refund get deducted==========
	
	LoginPage l= new LoginPage(driver);	// creating a object of LoginPage
	l.clickloginlandingbtn();
	logger.info("clicked on login In");
	l.setUsername("wave@mailinator.com");
	logger.info("Enter user id for Wave User");
	l.setPassword("qatest2plugs");
	logger.info("Enter password for Wave User");
	l.clickloginbtn1();
	logger.info("clicked on login In Button");
	MailPage mpn=new MailPage(driver);
	mpn.ClickMessage();
	logger.info("clicked on messages");
	mpn.SelectRefundMsg();
	logger.info("clicked on refund message");
	mpn.clickRefundbtn();
	logger.info("clicked on Refund Button inside mail/message");
	
	
	}
	
}
