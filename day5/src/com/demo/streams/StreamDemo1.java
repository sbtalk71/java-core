package com.demo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		
		List<Integer> evensList=new ArrayList<Integer>();
		
		for(Integer x:numList) {
			if(x%2==0) evensList.add(x);
		}
		
		System.out.println(evensList);
		
		
		numList.stream().filter(t->t%2==0).forEach(x->System.out.println(x));
		List<Integer> evensList2=numList.stream().filter(t->t%2==0).collect(Collectors.toList());
		
		//ResultPrinter p= new ResultPrinter();
		//numList.stream().filter(t->t%2==0).map(n->n.intValue()+10).forEach(ResultPrinter::printData);
		//numList.stream().filter(t->t%2==0).map(n->n.intValue()+10).forEach(System.out::println);
		
		//System.out.println(numList.stream().mapToInt(x->x.intValue()).sum());
		
		System.out.println(numList.stream().mapToInt(x->x.intValue()).reduce((x,y)->x*y).getAsInt());

	}

}

class EvenSelector implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		if(t%2==0) return true;
		return false;
	}
}

class ResultPrinter{
	public static void printData(Object data) {
		System.out.println(data);
	}
}
