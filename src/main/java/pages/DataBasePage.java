package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBasePage {
	String columnValue = null;
// 3 different interfaces we have to use and made it global se we can use them in different places
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset= null;
	
	public String getData(String columnName) {
		
	
		try {
			// setting properties for mySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlurl = "jbdc:mysql://localhost:3306/september2022";
		String sqlusername = "root";
		String sqlPassword = "root1234";
		String sqlQuery = "select * from users;";
		//create connection to the local database
			connection= DriverManager.getConnection(sqlurl, sqlusername, sqlPassword);
			
			//empower connection reference variable to execute queries
			statement = connection.createStatement();
			
			// deliver the query 
			resultset=statement.executeQuery(sqlQuery);
			
			while (resultset.next()) {
				columnValue = resultset.getString(columnName);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			
			if (resultset!=null) {
				try {
					resultset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return columnValue;
	}
}
