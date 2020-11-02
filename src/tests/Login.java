package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import utlility.BaseSetup;
import utlility.Config;

public class Login  extends BaseSetup{
	
	Config config = new Config();
	
	@Test
	public void LoginTest() {
			
		System.out.println("Login Page ");
	  
		  LoginPage loginpage = new LoginPage(androidDriver);
		  loginpage.LoginPageLoad();
		  loginpage.ClickOnLoginlabel();
		  loginpage.login(config.getProperty("User_name"),config.getProperty("Password"));

	}
	
	
}
