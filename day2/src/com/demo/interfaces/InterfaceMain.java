package com.demo.interfaces;

import java.util.Optional;

public class InterfaceMain {

	public static void main(String[] args) {
		
		Optional<MyConnection> conn=DBFactory.getDB("oracles");
		
		if(conn.isPresent()) {
		System.out.println(conn.get().getClass().getName());
		
		System.out.println(conn.get().getConnection());
		
		System.out.println(MyConnection.mystaticMethod());
		}

	}

}
