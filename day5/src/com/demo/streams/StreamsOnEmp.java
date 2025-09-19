package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsOnEmp {

	public static void main(String[] args) {
		List<Emp> empList = Arrays.asList(
				new Emp(100, "Kiran", 80000),
				new Emp(101, "John", 70000),
				new Emp(102, "Ruby", 60000), 
				new Emp(103, "Raju", 80000), 
				new Emp(104, "Pritham", 90000),
				new Emp(105, "Jacob", 80000));

		//Sort all emps by their name
		
		//empList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		
		//List all the employees who's salary is >70000
		//empList.stream().filter(e->e.getSalary()>70000).forEach(System.out::println);
		
		//give a raise of 5000 for emp with salary < 80000
		
		empList.stream().filter(e->e.getSalary()<80000).map(e->{e.setSalary(e.getSalary()+5000);return e;}).forEach(System.out::println);
		
		
	}

}
