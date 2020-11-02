package tests.TabbedPage;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.TabbedPage;
import utlility.BaseSetup;

public class OpenProfilePage extends BaseSetup {
	
	
	 @Test
	 public void OpenProfilePage() {
		 
		 TabbedPage tabbedpage = new TabbedPage(androidDriver);				
		 tabbedpage.openMyProfilePage();	 
	 }

}
