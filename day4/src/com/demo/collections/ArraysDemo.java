package com.demo.collections;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//int[] nums=new int[10];
		
		int nums[]=new int[10];
		
		System.out.println(nums[2]);
		
		int[] evens= {2,4,6,8,10,12,14,16};
		
		String[] fruits= {"apple","pear","guava","orange","mango"};
		
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		Arrays.sort(fruits);
		
		for(String fruit:fruits) {
			System.out.println(fruit);
		}
		
		System.out.println(Arrays.equals(nums, evens));

	}

}
