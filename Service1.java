package com.kalyani;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service1 {

    @Autowired
    Dao dao;

    public List<iplteam> getiplteam() throws ClassNotFoundException, SQLException {
      List<iplteam>list =dao.getiplteam();
			 
		 
        return list;
    }
}