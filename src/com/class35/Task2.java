package com.class35;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		Map<String,String> countriesMap=new TreeMap<>();
		countriesMap.put("Turkey","Ankara");
		countriesMap.put("USA","DC");
		countriesMap.put("UK","London");
		countriesMap.put("France","Paris");
		countriesMap.put("Italy","Roma");
		System.out.println(countriesMap);
		
		
		
		Set<String> keys=countriesMap.keySet();
		for(String key:keys) {
			System.out.println(key+ ": "+countriesMap.get(key));
		}
	}		
}
