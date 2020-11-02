package tests.MedicalHistory;

import org.testng.annotations.Test;

import pages.MedicalHistory.ManualAdd;
import pages.MedicalHistory.Rad;
import utlility.BaseSetup;

public class AddRad extends BaseSetup{
	
	 @Test(priority = 1)
	 public void OpenAddNewPage() throws InterruptedException {
		 
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonFloatingButton();
	 }
	 
	 @Test(priority = 2)
	 public void OpenLabPage() throws InterruptedException {
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonRad();
	 }
	 
	 @Test(priority = 3)
	 public void addDataRadfields() throws InterruptedException {
		// ManualAdd MA = new ManualAdd(androidDriver);
		 Rad rad = new Rad(androidDriver);
		 rad.insertRadName("Test Auto frist Rad");
		 rad.insertRadiologyName("Antoniadis Clinicis");
		// rad.ClickonCancelIcon();
		 rad.ClickonSaveIcon();
	 }
	

}
