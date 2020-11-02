package tests.Profile;

import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import DBScripts.DBConnection;
import DBScripts.PersonalinfoScripts;
import pages.Profile.PersonalInfo;
import utlility.BaseSetup;
import utlility.DataBase;
import utlility.ResultSetQuery;
import utlility.SwipeAndScroll;

public class AddPersonalinfo extends BaseSetup {
	
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
	 public void addGender() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnGender();
		pi.ClickOnGender();
		pi.ClickOnDataInDDL(0);
		
		String text_Gender = pi.GetText(1);
		System.out.println(text_Gender);
		SA.assertEquals(pi.GetText(1), RSQ.TextAssertion(piscripts.query_EN_Gender),
		"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}
	
	@Test(priority = 3)
	 public void addBloodType() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnBloodType();
		pi.ClickOnBloodType();
		pi.ClickOnDataInDDL(2);
		
		String text_BloodType = pi.GetText(2);
		System.out.println(text_BloodType);
		SA.assertEquals(pi.GetText(2), RSQ.TextAssertion(piscripts.query_EN_BloodType),
		"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}	
	
	@Test(priority = 4)
	 public void CheckEmail() throws InterruptedException {
		
		
		PersonalInfo pi = new PersonalInfo(androidDriver);		
		pi.ClickOnEmail();
		pi.insertEmail("TestAuto@andalusiagroup.net");
	}	
	
	@Test(priority = 5)
	 public void addMaritalStatus() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		SwipeAndScroll swipeandroid = new SwipeAndScroll(androidDriver);
		swipeandroid.scrollDownOneScreen();
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnMaritalStatus();
		pi.ClickOnMaritalStatus();
		
		pi.ClickOnDataInDDL(0);
		
		String text_BloodType = pi.GetText(2);
		System.out.println(text_BloodType);
		SA.assertEquals(pi.GetText(2), RSQ.TextAssertion(piscripts.query_EN_MaritalStatus),
		"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}	
	
	@Test(priority = 6)
	 public void addNumberofChildren() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);
		SwipeAndScroll swipeandroid = new SwipeAndScroll(androidDriver);
		swipeandroid.scrollDownOneScreen();
		
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnNumberofChildren();
		pi.ClickOnNumberofChildren();
		
		pi.ClickOnDataInDDL(0);
		
		String text_NumberofChildren = pi.GetText(3);
		System.out.println(text_NumberofChildren);
		SA.assertEquals(pi.GetText(3), RSQ.TextAssertion(piscripts.query_EN_Numberofchildren),
		"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}	
	
	
	@Test(priority = 7)
	 public void addEducation() throws InterruptedException, ClassNotFoundException, SQLException {
		
		PersonalInfo pi = new PersonalInfo(androidDriver);	
		PersonalinfoScripts piscripts = new PersonalinfoScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		
		pi.ClickOnEducation();
		pi.ClickOnEducation();
		
		pi.ClickOnDataInDDL(0);
		
		String text_Education = pi.GetText(4);
		System.out.println(text_Education);
		SA.assertEquals(pi.GetText(4), RSQ.TextAssertion(piscripts.query_EN_Education),
		"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}	
	
	
	
	

	@AfterClass
	public void CloseConnection() throws ClassNotFoundException, SQLException {

		DataBase DB = new DataBase();
		DB.closeConnection();

	}

}
