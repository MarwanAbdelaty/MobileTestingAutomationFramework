package tests.MedicalHistory;

import org.testng.annotations.Test;

import pages.MedicalHistory.ManualAdd;
import pages.MedicalHistory.Operation;
import pages.MedicalHistory.Rad;
import utlility.BaseSetup;

public class AddOperation extends BaseSetup{
	
	 @Test(priority = 1)
	 public void OpenAddNewPage() throws InterruptedException {
		 
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonFloatingButton();
	 }
	 
	 @Test(priority = 2)
	 public void OpenLabPage() throws InterruptedException {
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonOperation();
	 }
	 
	 @Test(priority = 3)
	 public void addDataRadfields() throws InterruptedException {
		
		 Operation operation = new Operation(androidDriver);
		 operation.insertOperationName("Test Auto frist operation");
		 operation.insertSurgeonName("Surgeon Nour Adel");
		 operation.ClickonSaveIcon();
	 }
	

}
