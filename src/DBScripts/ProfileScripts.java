package DBScripts;

import java.sql.ResultSet;
import java.sql.SQLException;

import utlility.Config;
import utlility.DataBase;

public class ProfileScripts {

	DataBase database = new DataBase();
	Config config = new Config();
	
	
	// Load DDL Data [UseofCaffeine]   EN & AR 
	public String Load_EN_UseofCaffeine = "select Name_En from [dbo].[SKLP_UseofCaffeine]";
	public String Load_AR_UseofCaffeine = "select Name_Ar from [dbo].[SKLP_UseofCaffeine]";
	public String Count_EN_UseofCaffeine = "select count (Name_En) from [dbo].[SKLP_UseofCaffeine]";
	public String Count_Ar_UseofCaffeine = "select count (Name_Ar) from [dbo].[SKLP_UseofCaffeine]";
	
	// Load DDL Data [SmokingHebits] EN & AR DDL
	public String Load_EN_SmokingHebits = "select Name_En from [dbo].[SKLP_SmokingHabit]";
	public String Load_Ar_SmokingHebits = "select Name_Ar from [dbo].[SKLP_SmokingHabit]";
	public String Count_EN_SmokingHebits = "select count(Name_En) from [dbo].[SKLP_SmokingHabit]";
	public String Count_Ar_SmokingHebits = "select count(Name_Ar) from [dbo].[SKLP_SmokingHabit]";
	
	// Load DDL Data [AlcoholConsumption] EN & AR DDL
	public  String Load_EN_AlcoholConsumption = "select Name_En from [dbo].[SKLP_AlcoholConsumption]";
	public  String Load_Ar_AlcoholConsumption = "select Name_Ar from [dbo].[SKLP_AlcoholConsumption]";
	public  String Count_EN_AlcoholConsumption = "select count(Name_En) from [dbo].[SKLP_AlcoholConsumption]";
	public  String Count_Ar_AlcoholConsumption = "select count(Name_Ar) from [dbo].[SKLP_AlcoholConsumption]";
	
	//  Load DDL Data [ActivityLevel] EN & AR DDL
	public String Load_EN_ActivityLevel = "select Name_En from  [dbo].[SKLP_ActivityLevel]";
	public String Load_Ar_ActivityLevel = "select Name_Ar from  [dbo].[SKLP_ActivityLevel]";
	public String Count_EN_ActivityLevel = "select count(Name_En) from  [dbo].[SKLP_ActivityLevel]";
	public String Count_Ar_ActivityLevel = "select count(Name_Ar) from  [dbo].[SKLP_ActivityLevel]";
	
	//  Load DDL Data [IllicitDrugUse] EN & AR DDL
	public  String Load_EN_IllicitDrugUse = "select Name_En from[dbo].[SKLP_IllicitDrugUse]";
	public  String Load_Ar_IllicitDrugUse = "select Name_Ar from[dbo].[SKLP_IllicitDrugUse]";
	public  String Count_EN_IllicitDrugUse = "select count(Name_En) from[dbo].[SKLP_IllicitDrugUse]";
	public  String Count_Ar_IllicitDrugUse = "select count(Name_Ar) from[dbo].[SKLP_IllicitDrugUse]";
	
	
	//Load DDL Data [DietaryType] EN & AR DDL
	public String Load_EN_DietaryType = "select Name_En from[dbo].[SKLP_DietaryHabits]";
	public String Load_Ar_DietaryType = "select Name_Ar from[dbo].[SKLP_DietaryHabits]";
	public String Count_EN_DietaryType = "select count(Name_En) from[dbo].[SKLP_DietaryHabits]";
	public String Count_Ar_DietaryType = "select count(Name_Ar) from[dbo].[SKLP_DietaryHabits]";
	
	//Load DDL Data [DoYouUseAWheelChair]  EN & AR DDL
	public  String Load_EN_DoYouUseAWheelChair = "select Name_En from[dbo].[SKLP_Wheelchair]";
	public  String Load_Ar_DoYouUseAWheelChair = "select Name_Ar from[dbo].[SKLP_Wheelchair]";
	public  String Count_EN_DoYouUseAWheelChair = "select count(Name_En) from[dbo].[SKLP_Wheelchair]";
	public  String Count_Ar_DoYouUseAWheelChair = "select count(Name_Ar) from[dbo].[SKLP_Wheelchair]";
	//Load DDL Data [OrganDonor]  EN & AR DDL
	public  String Load_EN_OrganDonor = "select Name_En from [dbo].[SKLP_OrganDonor]";
	public  String Load_Ar_OrganDonor = "select Name_Ar from [dbo].[SKLP_OrganDonor]";
	public  String Count_EN_OrganDonor = "select count(Name_En) from [dbo].[SKLP_OrganDonor]";
	public  String Count_Ar_OrganDonor = "select count(Name_Ar) from [dbo].[SKLP_OrganDonor]";
	
	
	public String query_EN_UseofCaffeine = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_UseofCaffeine  \r\n" + 
			"On UseofCaffeineID = SKLP_UseofCaffeine.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_SomkingHabits ="select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_SmokingHabit  \r\n" + 
			"On SmokingHabitID = SKLP_SmokingHabit.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_AlcoholConsumption ="select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_AlcoholConsumption  \r\n" + 
			"On AlcoholConsumptionID = SKLP_AlcoholConsumption.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_ActivityLevel = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_ActivityLevel  \r\n" + 
			"On ActivityLevelID = SKLP_ActivityLevel.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_IllicitDrugUse = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_IllicitDrugUse  \r\n" + 
			"On IllicitDrugID = SKLP_IllicitDrugUse.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_DietaryType = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join SKLP_DietaryHabits  \r\n" + 
			"On DietaryHabitsID = SKLP_DietaryHabits.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_DoYouUseAWheelChair = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join  [dbo].[SKLP_Wheelchair]\r\n" + 
			"On WheelchairID =SKLP_Wheelchair.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_OrganDonor = "select Name_En  from [dbo].[UserProfile]  \r\n" + 
			"Inner Join  [dbo].[SKLP_Wheelchair]\r\n" + 
			"On WheelchairID =SKLP_Wheelchair.ID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	

}
