package com.demo.collections;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws Exception {
		Properties props= new Properties();
		FileInputStream fis= new FileInputStream("config.properties");
		
		props.load(fis);
		
		for(Object key:props.keySet()) {
			System.out.println(key+" : "+props.getProperty(key.toString()));
		}

	}

}
