package utlility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidElement;

public class ResultSetQuery {

	DataBase database = new DataBase();

	
	// change the return type to Boolean if DDL count == Query Count return true
	/*
	public int getDLL_Count(String query) throws ClassNotFoundException, SQLException {

		ResultSet data = database.getData(query);
		int count = 0;
		while (data.next()) {
			count++;
		}
		// assert count of query with DDL will be developed
		return count;
	}
*/
	public int getDLL_Count(String query) throws ClassNotFoundException, SQLException {

		ResultSet data = database.getData(query);
		int i = 0;
		int count = 0;
		while (data.next()) {
			
       	 String datarow =  data.getString(1);
       	  count = Integer.parseInt(datarow);
           System.out.println("Total number of records = " + count);
			i++;
		}
		
		return count;
	}

	public ResultSet getDLL_LoadingData(String query) throws ClassNotFoundException, SQLException {
		ResultSet data = database.getData(query);
		return data;
	}

	public boolean assertionDDL(List<AndroidElement> DDL, String query) throws ClassNotFoundException, SQLException {
		int x = 0;
		boolean b = true;
		ResultSet data = database.getData(query);
		while (data.next()) {

			if (!data.getString(1).equalsIgnoreCase(DDL.get(x).getText().toString())) {
				System.out.println(data.getString(1));
				System.out.println(DDL.get(x).getText().toString());
			}
			b = b && data.getString(1).equalsIgnoreCase(DDL.get(x).getText().toString());

			x++;
		}
		return b;

	}

	public String TextAssertion(String query) throws SQLException, ClassNotFoundException {

		String assertion = null;
		ResultSet data = database.getData(query);
		while (data.next()) {

			assertion = data.getString(1);

		}
		return assertion;
	}

	public String getqueryData(String query) throws SQLException, ClassNotFoundException {

		ResultSet data = database.getData(query);
		while (data.next()) {
			SoftAssert SA = new SoftAssert();
		}

		return query;

	}

}
