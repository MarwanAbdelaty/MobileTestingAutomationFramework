package tests.TabbedPage;

import org.testng.annotations.Test;

import pages.TabbedPage;
import utlility.BaseSetup;

public class OpenMedicalHisoryPage extends BaseSetup{
	
	
	 @Test
	 public void OpenMedicalHisoryPage() throws InterruptedException {
		 
		 TabbedPage tabbedpage = new TabbedPage(androidDriver);
		 Thread.sleep(4000);
		 tabbedpage.openMedicalHistoryPage();	 	 
	 }

}
