package com.demo.interfaces;

public class MySQLDB implements MyConnection{

	@Override
	public String getConnection() {
		
		return "MySQL DB Connected...";
	}
}
