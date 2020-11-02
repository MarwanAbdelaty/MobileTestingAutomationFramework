package tests.MedicalHistory;

import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DBScripts.DBConnection;
import pages.MedicalHistory.Lab;
import pages.MedicalHistory.ManualAdd;
import utlility.BaseSetup;
import utlility.DataBase;

public class AddLab extends BaseSetup{
	/*
	@BeforeClass
	public void openConnection() throws ClassNotFoundException, SQLException {
		DBConnection DBC = new DBConnection();
		DBC.PHRCOnnection();

	}
	*/
	 @Test(priority = 1)
	 public void OpenAddNewPage() throws InterruptedException {
		 
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonFloatingButton();
	 }
	 
	 @Test(priority = 2)
	 public void OpenLabPage() throws InterruptedException {
		 ManualAdd MA = new ManualAdd(androidDriver);
		 MA.ClickonLab();
		// MA.BackNavigation();
	 }
	 
	 @Test(priority = 3)
	 public void addDataLabfields() throws InterruptedException {
		// ManualAdd MA = new ManualAdd(androidDriver);
		 Lab lab = new Lab(androidDriver);
		 lab.insertLabName("Test Auto frist Lab");
		// lab.insertdate("12/08/2020");
		 lab.insertLaboratoryName("Antoniadis Clinicis");

		// lab.ClickonCancelIcon();
		 lab.ClickonSaveIcon();
	 }
	
	
	

	
	
	/*
	@AfterClass
	public void CloseConnection() throws ClassNotFoundException, SQLException {

		DataBase DB = new DataBase();
		DB.closeConnection();

	}
	 */
}
