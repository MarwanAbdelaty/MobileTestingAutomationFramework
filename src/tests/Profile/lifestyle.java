package tests.Profile;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import DBScripts.DBConnection;
import DBScripts.ProfileScripts;
import pages.Profile.Lifestyle;
import utlility.BaseSetup;
import utlility.DataBase;
import utlility.ResultSetQuery;
import utlility.SwipeAndScroll;

public class lifestyle extends BaseSetup {

	@BeforeClass
	public void openConnection() throws ClassNotFoundException, SQLException {
		DBConnection DBC = new DBConnection();
		DBC.PHRCOnnection();

	}

	@Test(priority = 1)
	public void UseOfCaffeine() throws InterruptedException, ClassNotFoundException, SQLException {

		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();

		SoftAssert SA = new SoftAssert();

		lf.ClickOnUseOfCaffeine();
		lf.getList_Use_Of_Caffeine();
		//
		SA.assertEquals(RSQ.getDLL_Count(ps.Count_EN_UseofCaffeine), lf.getList_Use_Of_Caffeine().size());
		SA.assertAll();
		//
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_UseofCaffeine),
				"DDL [Use Of Caffeine] xx[Fail]xx ");

		SA.assertAll();
		// lf.ClickOnOCCASIONLY_ONLY(1);
		lf.ClickOnCancel();
	}

	/////////////////////////////////////////////////////////
	@Test(priority = 2)
	public void SmokingHebits() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnSmokingHebits();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_SmokingHebits),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();
		lf.ClickOnCancel();
	}

	@Test(priority = 3)
	public void AlcoholConsumption() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnAlcoholConsumption();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_AlcoholConsumption),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();

		lf.ClickOnCancel();
	}

	@Test(priority = 4)
	public void ActivityLevel() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnActivityLevel();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_ActivityLevel),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();

		lf.ClickOnCancel();
	}

	@Test(priority = 5)
	public void IllicitDrugUse() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnIllicitDrugUse();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_IllicitDrugUse),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();

		lf.ClickOnCancel();
	}

	@Test(priority = 6)
	public void DietaryType() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnDietaryType();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_DietaryType),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();

		lf.ClickOnCancel();
	}

	@Test(priority = 7)
	public void DoYouUseAWheelChair() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		SwipeAndScroll swipeandroid = new SwipeAndScroll(androidDriver);
		swipeandroid.scrollDownOneScreen();

		lf.ClickOnDoYouUseAWheelChair();
		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_DoYouUseAWheelChair),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();
		lf.ClickOnCancel();
	}

	@Test(priority = 8)
	public void OrganDonor() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery RSQ = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		lf.ClickOnOrganDonor();

		SA.assertTrue(RSQ.assertionDDL(lf.getList_Use_Of_Caffeine(), ps.Load_EN_OrganDonor),
				"DDL [Smoking Hebits] xx[Fail]xx ");
		SA.assertAll();

		lf.ClickOnCancel();

	}

	@AfterClass
	public void CloseConnection() throws ClassNotFoundException, SQLException {

		DataBase DB = new DataBase();
		DB.closeConnection();

	}

}
