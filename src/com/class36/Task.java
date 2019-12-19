package com.class36;


import java.util.Map.Entry;
import java.util.*;

public class Task {

	public static void main(String[] args) {
	/*Create a Map from array of cities that will sort keys in alphabetical 
	 * order. As a key store the name of the city and as a value store
	 *  the length of the city 
	 *  (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
If any city name is more than 7 characters remove that city ( use Iterator ).
	 * 
	 */
		
		Map<Integer,String> city=new TreeMap<>();
		
		city.put(1,"DC");
		city.put(2,"London");
		city.put(3,"Istanbul");
		city.put(4,"Roma");
		city.put(5,"Paris");
		city.put(6,"Berlin");
		Set<Entry<Integer,String>> setCity=city.entrySet();
		
		for(Entry<Integer,String> element:setCity) {
			
		System.out.println(element.getKey()+"  "+element.getValue());	
		}
		Iterator<Entry<Integer,String>> ite=((Set<Entry<Integer, String>>) city).iterator();
		while(ite.hasNext()){
			Entry<Integer,String>  ent=ite.next();
			System.out.println(ent.getKey()+" "+ent.getValue());
			
		}
		

	}

}
