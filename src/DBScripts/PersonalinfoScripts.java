package DBScripts;

import utlility.Config;
import utlility.DataBase;

public class PersonalinfoScripts {
	
DataBase database = new DataBase();
Config config = new Config();
	
	// Load DDL Data [Gender]   EN & AR 
	public  String Load_EN_Gender = "select Name_En from [dbo].[SKLP_Gender]";
	public  String Load_AR_Gender = "select Name_Ar from [dbo].[SKLP_Gender]";
	public  String Count_EN_Gender = "select count(Name_En) from [dbo].[SKLP_Gender]";
	public  String Count_AR_Gender = "select count(Name_Ar) from [dbo].[dbo].[SKLP_Gender]";
	
	// Load DDL Data [Blood Type]   EN & AR 
	public  String Load_EN_BloodType = "select Name_En from [dbo].[SKLP_BloodType]";
	public  String Load_AR_BloodType = "select Name_Ar from [dbo].[SKLP_BloodType]";
	public  String Count_EN_BloodType = "select count(Name_En) from [dbo].[SKLP_BloodType]";
	public  String Count_AR_BloodType = "select count(Name_Ar) from [dbo].[SKLP_BloodType]";
	
	
	// Load DDL Data [Marital Status]   EN & AR 
	public  String Load_EN_MaritalStatus = "select Name_En from [dbo].[SKLP_MaritalStatus]";
	public  String Load_AR_MaritalStatus = "select Name_Ar from [dbo].[SKLP_MaritalStatus]";
	public  String Count_EN_MaritalStatus = "select count(Name_En) from [dbo].[SKLP_MaritalStatus]";
	public  String Count_AR_MaritalStatus = "select count(Name_Ar) from [dbo].[SKLP_MaritalStatus]";
	
	// Load DDL Data [Number of Children]   EN & AR 
	
	/////////////////////////////////////////////////////
	
	// Load DDL Data [Education]   EN & AR 
	public  String Load_EN_Education = "select Name_En from [dbo].[SKLP_Education]";
	public  String Load_AR_Education = "select Name_Ar from [dbo].[SKLP_Education]";
	public  String Count_EN_Education = "select count(Name_En) from [dbo].[SKLP_Education]";
	public  String Count_AR_Education = "select count(Name_Ar) from [dbo].[SKLP_Education]";
	
	
	
	public String query_EN_Gender ="select Name_En  from [dbo].[SKLP_Gender] Gender Inner Join [dbo].[Users]  Users\r\n" + 
			"On Users.GenderID = Gender.ID\r\n" + 
			"where Users.ID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_BloodType ="select Name_En from SKLP_BloodType Inner Join [dbo].[UserProfile]\r\n" + 
			"On SKLP_BloodType.ID = UserProfile.SKLP_BloodTypeID\r\n" + 
			"where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_MaritalStatus ="select Name_En from SKLP_MaritalStatus Inner Join [dbo].[UserProfile]\r\n" + 
			"On SKLP_MaritalStatus.ID = [dbo].[UserProfile].SKLP_MaritalStatusID\r\n" + 
			"where [dbo].[UserProfile].UserID = '"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_Numberofchildren ="select Numberofchildren from [dbo].[UserProfile] where UserID ='"+config.getProperty("UserID")+"'"; 
	
	public String query_EN_Education ="select Name_En from SKLP_Education Inner Join [dbo].[UserProfile] \r\n" + 
			"On SKLP_Education.ID =  [dbo].[UserProfile].SKLP_EducationID\r\n" + 
			"where  [dbo].[UserProfile].UserID = '"+config.getProperty("UserID")+"'"; 

}
