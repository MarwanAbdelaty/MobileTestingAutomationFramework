package tests.MedicalHistory;

import org.testng.annotations.Test;

import pages.MedicalHistory.ManualAdd;
import utlility.BaseSetup;

public class manualAdd extends BaseSetup{
	
	 @Test
	 public void OpenMedicalCondtion() throws InterruptedException {
		 
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonFloatingButton();
		 
		 MA.ClickonLab();
		 MA.BackNavigation();
		 
		 MA.ClickonRad();
		 MA.BackNavigation();
		 
		 MA.ClickonOperation();
		 MA.BackNavigation();
		 
		 MA.ClickonProcedure();
		 MA.BackNavigation();
		 
		 MA.ClickonMedication();
		 MA.BackNavigation();
		 
			 
		 MA.ClickonMedicalCondition();
		 MA.BackNavigation();
		 
	
		 
		
		 
		
		 

		 

		 		 
		 
	 }

}
