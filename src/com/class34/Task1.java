package com.class34;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
	/*
	 * Create a Set collection in which you need to add  names  of  the  countries. 
	 *  In  this  set  we want all objects to be sorted in alphabetical order. 
	 *  Using  2  different  ways  retrieve  all elements from set.
	 */
		
		
		
		Set<String> countries=new TreeSet<>();
		countries.add("USA");
		countries.add("US");
		countries.add("ITALY");
		countries.add("GERMANY");
		System.out.println(countries);
		
		
		for(String element:countries) {
			System.out.println(element);
		}
		
		Iterator<String> it=countries.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
