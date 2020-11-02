package tests.TabbedPage;

import org.testng.annotations.Test;

import pages.TabbedPage;
import utlility.BaseSetup;

public class OpenHomePage extends BaseSetup{
	
	 @Test
	 public void OpenHomePage() {
		 
		 TabbedPage tabbedpage = new TabbedPage(androidDriver);
		  tabbedpage.openHomePage();	 
	 }

}
