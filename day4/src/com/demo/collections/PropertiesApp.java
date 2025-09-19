package com.demo.collections;

import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) {
		Properties props= System.getProperties();
		//System.out.println(props);
		props.setProperty("userName", "Shantanu");
		System.out.println(props.getProperty("java.specification.version"));
		
		for(Object key:props.keySet()) {
			System.out.println(key+" : "+props.getProperty(key.toString()));
		}
		
		

	}

}
