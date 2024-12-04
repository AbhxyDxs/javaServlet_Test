package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	//Run this to create DB - for the 1st time
//	public static void main(String args[]) {
//		Connection CON = null;
//		try {
//			CON = getConnection();
//			System.out.println("DB Created Successfully!");
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("DB Creation Failed!");
//		}
//	}
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
    	//Configure DB path according to your project
    	final String DBPath = "D:\\Projects\\TCS\\[Java]\\Eclipse WS\\TraineeServlet\\Trainee_DB";
    	final String URL = "jdbc:derby:"+DBPath+";create=true";
        // Register Driver
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        return DriverManager.getConnection(URL);
    }

    public static void close(Connection con, PreparedStatement pst) throws SQLException {
        if (pst != null) pst.close();
        if (con != null) con.close();
    }
}