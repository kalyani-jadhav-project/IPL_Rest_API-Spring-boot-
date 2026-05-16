package com.kalyani;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerr {
	@Autowired
	Service1 service;
	
	@GetMapping("/iplteams")
	public List<iplteam> iplteam() throws ClassNotFoundException, SQLException {
		 List<iplteam> iplteams =	service.getiplteam();
		
		
		 return iplteams;
		
	}
}
