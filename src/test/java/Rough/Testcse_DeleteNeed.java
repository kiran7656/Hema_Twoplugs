package Rough;

import java.io.IOException;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.DeleteNeed;
import com.pageObjects.LoginPage;
import com.pageObjects.ProfilePage;

public class Testcse_DeleteNeed extends BaseClass{
	@Test
	public void Need() throws IOException, InterruptedException
	{
		LoginPage login = new LoginPage(driver);	// creating a object of LoginPage
		login.clickloginlandingbtn();
		logger.info("clicked on login In Button");
		login.setUsername("wave@mailinator.com");
		logger.info("Enter Wave User id");
		login.setPassword("qatest2plugs");
		logger.info("Enter password for Wave");
		login.clickloginbtn1();
		logger.info("login In as Wave User");
	
		ProfilePage p1=new ProfilePage(driver);
		p1.clkdropDownLogoutWave();
		logger.info("click on Hi wave drop down");
		p1.clkbtnProfilewave();
		logger.info("click on profile");
		
		DeleteNeed dn=new DeleteNeed(driver);
		dn.ClickDelete();
		logger.info("click on delete option");
		dn.clickIWntDeletebtn();
		logger.info("click on I want To Delete Button");
		
	
	
	}
}
