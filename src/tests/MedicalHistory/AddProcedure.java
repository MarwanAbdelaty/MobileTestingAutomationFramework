package tests.MedicalHistory;

import org.testng.annotations.Test;

import pages.MedicalHistory.ManualAdd;
import pages.MedicalHistory.Operation;
import pages.MedicalHistory.Procedure;
import utlility.BaseSetup;

public class AddProcedure extends BaseSetup{
	
	 @Test(priority = 1)
	 public void OpenAddNewPage() throws InterruptedException {
		 
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonFloatingButton();
	 }
	 
	 @Test(priority = 2)
	 public void OpenLabPage() throws InterruptedException {
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonProcedure();
	 }
	 
	 
	 @Test(priority = 3)
	 public void addDataRadfields() throws InterruptedException {
		
		 Procedure procedure = new Procedure(androidDriver);
		 procedure.insertOperationName("Test Auto frist procedure");
		 procedure.insertDoctorName("Doctor Adel Alam");
		 procedure.ClickonSaveIcon();
	 }
	
	 

}
