package tests;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import DBScripts.ProfileScripts;
import utlility.Config;
import utlility.DataBase;

public class TestDB {
	
	Config config = new Config();

	@BeforeClass
	public void setConntionToDB() throws ClassNotFoundException, SQLException {
		
		String Url = config.getProperty("PHR_URL");
		System.out.println(Url);
		DataBase db = new DataBase();
		String user_name = config.getProperty("PHR_DB_user");
		String password  = config.getProperty("PHR_DB_Pass");	
		db.setUpConnection(Url, user_name, password);
	}
	
	@Test
	public void getDataFromDataBase() throws ClassNotFoundException, SQLException {
		
     //   String query = "SELECT EnName FROM BusinessUnit WHERE(IsActive = 1)AND(ForSync = 1)ORDER BY CityID, EnName";
		 String query = "  select Count (Name_En) from [dbo].[SKLP_UseofCaffeine]";
        DataBase database = new DataBase();
        ResultSet data = database.getData(query);
      
    //    String datarow =  data.getString(1);
     //   int count = Integer.parseInt(datarow);
        
     //   System.out.println("Total number of records = " + count);
      //  System.out.println("-----------------------------");

        int i = 0; 
        while(data.next()) {
        	 String datarow =  data.getString(1);
        	 int count = Integer.parseInt(datarow);
            System.out.println("Total number of records = " + count);
            System.out.println("-----------------------------");
        	
       //	System.out.println("Clinics Name = ["+ i +" - " + data.getString(1)+"]");
        	i++;
        }
        System.out.println("Total number of records = " + i);
        
      
		/*
		ProfileScripts ps = new ProfileScripts();
		 System.out.println("------------------------------------------");
		 
		 System.out.println("Total   number return of records = " + ps.getCountEN_UseofCaffeine());
		 System.out.println("------------------------------------------");
		 */
	}
	
		

		
	@AfterClass
	public void closeConnection() {
		DataBase db = new DataBase();
		db.closeConnection();
	}

}
