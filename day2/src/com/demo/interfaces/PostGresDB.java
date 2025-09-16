package com.demo.interfaces;

public class PostGresDB implements MyConnection{

	@Override
	public String getConnection() {
		
		return "Oracle DB Connected...";
	}
	
	@Override
	public String getDBVersion() {
				return "16.0.1";
	}
	
	
}
