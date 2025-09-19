package com.demo.collections;

import java.util.HashSet;
import java.util.Set;

public class EmpSetDemo {

	public static void main(String[] args) {
		Set<Emp> empSet=new HashSet<Emp>();
		
		empSet.add(new Emp(100, "Kiran", 80000));
		empSet.add(new Emp(101, "John", 70000));
		empSet.add(new Emp(102, "Ruby", 60000));
		empSet.add(new Emp(103, "Raju", 80000));
		empSet.add(new Emp(104, "Pritham", 90000));
		empSet.add(new Emp(105, "Jacob", 80000));
		
		//System.out.println(empSet);
		
		for(Emp e:empSet) {
			System.out.println(e);
		}
		
		

	}

}
