package com.kalyani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Dao {

   

    public ArrayList<iplteam>  getiplteam() throws ClassNotFoundException, SQLException {
    	ArrayList<iplteam> al = new ArrayList<>();
    	Connection c =DB.dbConnect();
       Statement s = c.createStatement();
     ResultSet rs = s.executeQuery("select * from iplteams");
      	
     while(rs.next()) {
    	String teamname= rs.getString("teamname");
    	int trophies = rs.getInt("trophies");
    	String ownername = rs.getString("ownername");
    	 String captain_name =rs.getString("captain_name");
     
    iplteam iplteams = new iplteam (teamname,trophies, ownername,captain_name);
    al.add(iplteams);
    
    }
	 return al;
}
}