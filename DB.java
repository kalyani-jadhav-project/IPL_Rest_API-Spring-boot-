package com.kalyani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	public static Connection dbConnect() throws ClassNotFoundException, SQLException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     Connection c=  DriverManager.getConnection("jdbc:mysql://localhost:3306/kalyani","root","Kalyani@12345");
	   	return c;
	}

}
