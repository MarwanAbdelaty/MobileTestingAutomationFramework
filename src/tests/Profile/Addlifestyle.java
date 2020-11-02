package tests.Profile;

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

public class Addlifestyle extends BaseSetup {

	@BeforeClass
	public void openConnection() throws ClassNotFoundException, SQLException {
		DBConnection DBC = new DBConnection();
		DBC.PHRCOnnection();

	}

	@Test(priority = 1)
	public void UseOfCaffeine() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		// Use Of Caffeine
		lf.ClickOnUseOfCaffeine();
		lf.getList_Use_Of_Caffeine();
		lf.ClickOnOCCASIONLY_ONLY(1);
		String text_UseOfCaffeine = lf.GetText(0);
		System.out.println(text_UseOfCaffeine);
		SA.assertEquals(lf.GetText(0), rsq.TextAssertion(ps.query_EN_UseofCaffeine),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}

	@Test(priority = 2)
	public void SmokingHebits() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();

		// Smoking Habits
		lf.ClickOnSmokingHebits();
		lf.ClickOnOCCASIONLY_ONLY(0);
		String text_SomkingHabits = lf.GetText(1);
		System.out.println(text_SomkingHabits);
//		rsq.TextAssertion(text_SomkingHabits, ps.query_EN_SomkingHabits);
		SA.assertEquals(lf.GetText(1), rsq.TextAssertion(ps.query_EN_SomkingHabits),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();

	}

	@Test(priority = 3)
	public void AlcoholConsumption() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		// Alcohol Consumption
		lf.ClickOnAlcoholConsumption();
		lf.ClickOnOCCASIONLY_ONLY(0);
		String text_AlcoholConsumption = lf.GetText(2);
		System.out.println(text_AlcoholConsumption);
//		rsq.TextAssertion(text_AlcoholConsumption, ps.query_EN_AlcoholConsumption);
		SA.assertEquals(lf.GetText(2), rsq.TextAssertion(ps.query_EN_AlcoholConsumption),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();

	}

	@Test(priority = 4)
	public void ActivityLevel() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		// Activity Level
		lf.ClickOnActivityLevel();
		lf.ClickOnOCCASIONLY_ONLY(1);
		String text_ActivityLevel = lf.GetText(3);
		System.out.println(text_ActivityLevel);
//		rsq.TextAssertion(text_ActivityLevel, ps.query_EN_ActivityLevel);	
		SA.assertEquals(lf.GetText(3), rsq.TextAssertion(ps.query_EN_ActivityLevel),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();

	}

	@Test(priority = 5)
	public void IllicitDrugUse() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		// Illicit DrugUse
		lf.ClickOnIllicitDrugUse();
		lf.ClickOnOCCASIONLY_ONLY(2);
		String text_IllicitDrugUse = lf.GetText(4);
		System.out.println(text_IllicitDrugUse);
//		rsq.TextAssertion(text_IllicitDrugUse, ps.query_EN_IllicitDrugUse);
		SA.assertEquals(lf.GetText(4), rsq.TextAssertion(ps.query_EN_IllicitDrugUse),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}

	@Test(priority = 6)
	public void DietaryType() throws InterruptedException, ClassNotFoundException, SQLException {
		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		// Dietary Type
		lf.ClickOnDietaryType();
		lf.ClickOnOCCASIONLY_ONLY(2);
		String text_DietaryType = lf.GetText(5);
		System.out.println(text_DietaryType);
//		rsq.TextAssertion(text_DietaryType, ps.query_EN_DietaryType);
		SA.assertEquals(lf.GetText(5), rsq.TextAssertion(ps.query_EN_DietaryType),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();
	}
	@Test(priority = 7)
	public void DoYouUseAWheelChair() throws InterruptedException, ClassNotFoundException, SQLException {

		Lifestyle lf = new Lifestyle(androidDriver);
		SwipeAndScroll swipeandroid = new SwipeAndScroll(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
		// Scroll Down
		swipeandroid.scrollDownOneScreen();
		// Do You Use AWheel Chair
		lf.ClickOnDoYouUseAWheelChair();
		lf.ClickOnOCCASIONLY_ONLY(1);
		String text_DoYouUseAWheelChair = lf.GetText(4);
		System.out.println(text_DoYouUseAWheelChair);
//		rsq.TextAssertion(text_DoYouUseAWheelChair, ps.query_EN_DoYouUseAWheelChair);
		SA.assertEquals(lf.GetText(4), rsq.TextAssertion(ps.query_EN_DoYouUseAWheelChair),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();

	}
	@Test(priority = 8)
	public void OrganDonor() throws InterruptedException, ClassNotFoundException, SQLException {

		Lifestyle lf = new Lifestyle(androidDriver);
		ProfileScripts ps = new ProfileScripts();
		ResultSetQuery rsq = new ResultSetQuery();
		SoftAssert SA = new SoftAssert();
	
		// Do You Use AWheel Chair
		lf.ClickOnOrganDonor();
		lf.ClickOnOCCASIONLY_ONLY(1);
		String text_DoYouUseAWheelChair = lf.GetText(5);
		System.out.println(text_DoYouUseAWheelChair);
//		rsq.TextAssertion(text_DoYouUseAWheelChair, ps.query_EN_DoYouUseAWheelChair);
		SA.assertEquals(lf.GetText(5), rsq.TextAssertion(ps.query_EN_OrganDonor),
				"Data displayed in DDl Not Match with data Saved in DB");
		SA.assertAll();

	}
	
	

	@AfterClass
	public void CloseConnection() throws ClassNotFoundException, SQLException {

		DataBase DB = new DataBase();
		DB.closeConnection();

	}

}
