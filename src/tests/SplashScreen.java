package tests;


import org.testng.annotations.Test;

import pages.splashPage;
import utlility.BaseSetup;
import utlility.Config;

public class SplashScreen extends BaseSetup {
		
	Config config = new Config();

	 @Test
	 public void splachScreen() { 
     
		splashPage splashpage = new splashPage(androidDriver);
		splashpage.openCountryDDL();
	    String Countryselected = config.getProperty("Country") ; 
	     System.out.println("Countryselected ="+Countryselected );
	     
		if (Countryselected.equalsIgnoreCase("Egypt") )
		{
		splashpage.selectEgyptCountry();

		}
		splashpage.clickOk();
		splashpage.clickNext();
					 
	 }
	 
}
