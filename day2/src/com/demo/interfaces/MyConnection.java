package com.demo.interfaces;

public interface MyConnection {

	String releaseVersion="1.0";
	
	 String getConnection();
	 default String getDBVersion() {
		 throw new IllegalStateException();
	 };
	 
	 default String getDBMetaData() {
		 return myPrivateMethod();
	 };
	 
	 public static String mystaticMethod() {
			return "static method";
		}
	 
	 private String myPrivateMethod() {
		 return "private method";
	 }
}
