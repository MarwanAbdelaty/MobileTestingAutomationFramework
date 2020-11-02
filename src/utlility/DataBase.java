package utlility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	
	static Connection con=null;
	public Statement stmt;


	    public void  setUpConnection(String Url,String user_name,String password ) throws ClassNotFoundException, SQLException
	    {
	        if (con == null) 
	        {       
		            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		            			   
		            con=DriverManager.getConnection(Url,user_name,password);

	        } 
	    
	    }
	    
	
	    public Statement getStatement() throws SQLException, ClassNotFoundException {
	    	
				stmt = con.createStatement();
				return 	stmt;
	    }
	
	 // Insert  Data in DB
	  public void insertData (String query) throws ClassNotFoundException, SQLException {
			 
		  getStatement().executeQuery(query);	
		 }
	
	 // Get query Data 
	 public ResultSet getData(String query) throws ClassNotFoundException,SQLException {
		 ResultSet data = getStatement().executeQuery(query);
		 return data; 
	 }
	 
	 // Get query Data 
	 public ResultSet UpdateData(String query) throws ClassNotFoundException, SQLException {
		 ResultSet data = getStatement().executeQuery(query);
		 return data; 
	 }

	 
	 
	 public void closeConnection() {
		 
		 try {
			 if (con != null) 
			 con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	/*
	 public ResultSet Coun(String query) throws ClassNotFoundException, SQLException {
		 ResultSet data = getStatement().executeQuery(query);
		 return data; 
	 }
*/



}
