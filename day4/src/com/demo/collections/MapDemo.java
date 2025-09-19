package com.demo.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		//Map<Integer, String> namesMap=new HashMap<Integer, String>();
		Map<Integer, String> namesMap= new Hashtable<Integer, String>();
		
		namesMap.put(1, "Shantanu");
		namesMap.put(2, "Niharika");
		namesMap.put(3, "Preetham");
		namesMap.put(4, "Raja");
		namesMap.put(4, "Kiran");
		
		System.out.println(namesMap.get(4));
		
		System.out.println(namesMap.containsKey(4));
		
		System.out.println(namesMap);
		
		Set<Integer> keys=namesMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" : "+namesMap.get(key));
		}
		
		Collection<String> names=namesMap.values();
		
		for(String name:names) {
			System.out.println(name);
		}

		Set<Map.Entry<Integer, String>> entries=namesMap.entrySet();
		
		for(Map.Entry<Integer, String> entry:entries) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
