package com.demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsDemo2 {

	public static void main(String[] args) {
		
		List<Integer> numlist1=Arrays.asList(1,2,3);
		List<Integer> numlist2=Arrays.asList(4,5,6);
		List<Integer> numlist3=Arrays.asList(7,8,9);
		
		List<List<Integer>> list=Arrays.asList(numlist1, numlist2, numlist3);
		
		System.out.println(list);
		
		list.stream().flatMap(nums->nums.stream()).forEach(System.out::println);

	}

}
