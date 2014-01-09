package hdm.wi7.timetable.server.db;

import java.sql.*;

import com.google.appengine.api.rdbms.AppEngineDriver;

// @author Thies

public class DBConnection {

	private static Connection con = null;
	
	private static String url = "Platzhalter";
	
	public static Connection connection() {
		
		if ( con == null ) {
			try {
				
				DriverManager.registerDriver(new AppEngineDriver());
				con = DriverManager.getConnection(url);
			} 
			catch (SQLException e1) {
				con = null;
				e1.printStackTrace();
			}
		}
		return con;
	}
	
}

