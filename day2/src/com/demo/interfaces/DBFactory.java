package com.demo.interfaces;

import java.util.Optional;

public class DBFactory {

	public static Optional<MyConnection> getDB(String dbname) {
		if(dbname.equals("mysql")) {
			return Optional.of(new MySQLDB());
		}if(dbname.equals("oracle")) {
			return Optional.of(new OracleDB());
		}if(dbname.equals("postgres")) {
			return Optional.of(new PostGresDB());
		}else {
			return Optional.empty();
		}
	}
}
