package com.demo.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EmpVectorDemo {

	public static void main(String[] args) {
		Vector<Emp> empList= new Vector<Emp>();
		
		empList.add(new Emp(100, "Kiran", 80000));
		empList.add(new Emp(101, "John", 70000));
		empList.add(new Emp(102, "Ruby", 60000));
		empList.add(new Emp(103, "Raju", 80000));
		empList.add(new Emp(104, "Pritham", 90000));
		empList.add(new Emp(105, "Jacob", 80000));
		
		Enumeration<Emp> empEnum=empList.elements();
		
		while(empEnum.hasMoreElements()) {
			System.out.println(empEnum.nextElement());
		}
		

	}

}
