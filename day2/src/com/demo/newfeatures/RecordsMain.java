package com.demo.newfeatures;

public class RecordsMain {

	public static void main(String[] args) {
		MyEmp emp = new MyEmp(100, "Babu", "Kochi", 67000);
		MyEmp emp1 = new MyEmp(100, "Babu", "Kochi", 67000);
		
		System.out.println(emp==emp1);
		System.out.println(emp.equals(emp1));

	}

}
