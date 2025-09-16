package com.demo.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		
		MyConnection conn=new OracleDB();
		
		System.out.println(conn.getClass().getName());
		
		System.out.println(conn.getConnection());
		
		System.out.println(MyConnection.mystaticMethod());

	}

}
