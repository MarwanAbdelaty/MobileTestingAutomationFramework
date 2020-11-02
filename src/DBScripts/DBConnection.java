package DBScripts;

import java.sql.SQLException;

import utlility.Config;
import utlility.DataBase;

public class DBConnection {

	Config config = new Config();

	public void PHRCOnnection() throws ClassNotFoundException, SQLException {
		String Url = config.getProperty("PHR_URL");
		System.out.println(Url);

		DataBase db = new DataBase();
		String user_name = config.getProperty("PHR_DB_user");
		String password = config.getProperty("PHR_DB_Pass");
		db.setUpConnection(Url, user_name, password);

	}
	
	/*
	public void OnlineBookingCOnnection() throws ClassNotFoundException, SQLException {
		String Url = config.getProperty("PHR_URL");
		System.out.println(Url);

		DataBase db = new DataBase();
		String user_name = config.getProperty("PHR_DB_user");
		String password = config.getProperty("PHR_DB_Pass");
		db.setUpConnection(Url, user_name, password);

	}
	
	public void HMISCOnnection() throws ClassNotFoundException, SQLException {
		String Url = config.getProperty("PHR_URL");
		System.out.println(Url);

		DataBase db = new DataBase();
		String user_name = config.getProperty("PHR_DB_user");
		String password = config.getProperty("PHR_DB_Pass");
		db.setUpConnection(Url, user_name, password);

	}
	*/
	
	/*
	 String query = "select Name_En from [dbo].[SKLP_UseofCaffeine]";
		DataBase database = new DataBase();
		ResultSet data = database.getData(query);

		int i = 0;

		while (data.next()) {
			i++;
			System.out.println("Use of Caffeine = [" + i + " - " + data.getString(1) + "]");

		}
		System.out.println("Total number of records = " + i);
	 
	 */

}
