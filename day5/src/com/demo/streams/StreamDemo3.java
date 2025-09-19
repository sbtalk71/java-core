package com.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("apple","orange","apple","banana","orange","orange","banana","mango");
		
		Map<String, Long> counts=fruits.stream().collect(Collectors.groupingBy(fruit->fruit,Collectors.counting()));
		
		//System.out.println(counts);
		
		
		List<Integer> numList=Arrays.asList(1,2,3,2,4,5,1,6,1,2);
		
		System.out.println( numList.stream()
		.collect(Collectors.groupingBy(num->num, Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));

	}

}
