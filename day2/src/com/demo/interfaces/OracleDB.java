package com.demo.interfaces;

public class OracleDB implements MyConnection{

	@Override
	public String getConnection() {
		
		return "Oracle DB Connected...";
	}
}
