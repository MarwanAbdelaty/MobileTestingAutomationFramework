package tests.Profile;

import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import DBScripts.DBConnection;
import DBScripts.PersonalinfoScripts;
import DBScripts.ProfileScripts;
import io.appium.java_client.DriverMobileCommand;
import pages.Profile.PersonalInfo;
import utlility.BaseSetup;
import utlility.DataBase;
import utlility.ResultSetQuery;
import utlility.SwipeAndScroll;

public class personalinfo extends BaseSetup{
	
	
	@BeforeClass
	public void openConnection() throws ClassNotFoundException, SQLException {
		DBConnection DBC = new DBConnection();
		DBC.PHRCOnnection();

	}

	
	@Test(priority = 1)
	 public void personalinfo() throws InterruptedException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		pi.ClickOnPersonalInfoTab();
	}
		
		
		
	@Test(priority = 2)
	 public void CheckGender() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnGender();
		pi.ClickOnGender();
		
		System.out.println(pi.getList_DDL_Data().size());
		SA.assertEquals(RSQ.getDLL_Count(piscripts.Count_EN_Gender), pi.getList_DDL_Data().size());
		SA.assertAll();
	
		//
		SA.assertTrue(RSQ.assertionDDL(pi.getList_DDL_Data(), piscripts.Load_EN_Gender),
				"DDL [Gender] xx[Fail]xx ");

		SA.assertAll();
		
		pi.ClickOnCancel();
	}	
		
	@Test(priority = 3)
	 public void CheckBloodType() throws InterruptedException, ClassNotFoundException, SQLException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnBloodType();
		pi.ClickOnBloodType();
		
		SA.assertEquals(RSQ.getDLL_Count(piscripts.Count_EN_BloodType), pi.getList_DDL_Data().size());
		SA.assertAll();
		//
		SA.assertTrue(RSQ.assertionDDL(pi.getList_DDL_Data(), piscripts.Load_EN_BloodType),
				"DDL [Blood Type] xx[Fail]xx ");

		SA.assertAll();
		
		pi.ClickOnCancel();
	}	
	
	@Test(priority = 4)
	 public void CheckEmail() throws InterruptedException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);		
		pi.ClickOnEmail();
		pi.insertEmail("marwan.hemeda@andalusiagroup.net");
	}	
	
	@Test(priority = 5)
	 public void CheckMaritalStatus() throws InterruptedException, ClassNotFoundException, SQLException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		SwipeAndScroll swipeandroid = new SwipeAndScroll(androidDriver);
		swipeandroid.scrollDownOneScreen();
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnMaritalStatus();
		pi.ClickOnMaritalStatus();
		
		SA.assertEquals(RSQ.getDLL_Count(piscripts.Count_EN_MaritalStatus), pi.getList_DDL_Data().size());
		SA.assertAll();
		//
		SA.assertTrue(RSQ.assertionDDL(pi.getList_DDL_Data(), piscripts.Load_EN_MaritalStatus),
				"DDL [MaritalStatus] xx[Fail]xx ");
		SA.assertAll();
		
		pi.ClickOnCancel();
	}
		
		
	@Test(priority = 6)
	 public void CheckNumberofChildren() throws InterruptedException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		
		pi.ClickOnNumberofChildren();
		pi.ClickOnNumberofChildren();
		
		
		pi.ClickOnCancel();
	}	
		
	@Test(priority = 7)
	 public void CheckEducation() throws InterruptedException, ClassNotFoundException, SQLException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnEducation();
		pi.ClickOnEducation();
		
		SA.assertEquals(RSQ.getDLL_Count(piscripts.Count_EN_Education), pi.getList_DDL_Data().size());
		SA.assertAll();
		//
		SA.assertTrue(RSQ.assertionDDL(pi.getList_DDL_Data(), piscripts.Load_EN_Education),
				"DDL [Education] xx[Fail]xx ");
		SA.assertAll();
		
		pi.ClickOnCancel();
	}
		

	@AfterClass
	public void CloseConnection() throws ClassNotFoundException, SQLException {

		DataBase DB = new DataBase();
		DB.closeConnection();

	}	
		
		
	

}
