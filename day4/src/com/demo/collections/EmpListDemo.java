package com.demo.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmpListDemo {

	public static void main(String[] args) {
		List<Emp> empList= new ArrayList<Emp>();
		
		empList.add(new Emp(100, "Kiran", 80000));
		empList.add(new Emp(101, "John", 70000));
		empList.add(new Emp(102, "Ruby", 60000));
		empList.add(new Emp(103, "Raju", 80000));
		empList.add(new Emp(104, "Pritham", 90000));
		empList.add(new Emp(105, "Jacob", 80000));
		
		Iterator<Emp> itr= empList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		ListIterator<Emp> listItr=empList.listIterator();
		
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		

		empList.sort(new EmpNameSorter());
		
		System.out.println(empList);
		
		
	}

}

class EmpNameSorter implements Comparator<Emp>{
	@Override
	public int compare(Emp e1, Emp e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
