package tests.TabbedPage;

import org.testng.annotations.Test;

import pages.TabbedPage;
import utlility.BaseSetup;

public class OpenBookingPage extends BaseSetup{

	
	 @Test
	 public void OpenBookingPage() {
		 
		 TabbedPage tabbedpage = new TabbedPage(androidDriver);
		 tabbedpage.openBookingPage();
	 }
}
