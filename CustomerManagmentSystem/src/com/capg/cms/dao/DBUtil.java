package com.capg.cms.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection conn=null;
	public static Connection getDBConnection() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver. OracleDriver());
			conn	=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
