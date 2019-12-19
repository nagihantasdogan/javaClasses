package com.class35;
import java.util.Map.Entry;
import java.util.*;
public class HMW {
public static void main(String[] args) {
	/*Create a map of Best Buy store. Place item id and item name into it. 
	 * Example (7664847 = Printer, 7879885= TV etc )
	 * ●Retrieve all keys and values from a Best Buy map using EntrySet. */
        Map<Integer,String> store=new HashMap<>();
		store.put(3567,"Modem");
		store.put(7899,"Phone");
		store.put(4678,"Router");
		store.put(5678,"TV");
		store.put(5678,"Drone");
		Set<Entry<Integer, String>> storeSet=store.entrySet();
	for(Entry<Integer,String> element:storeSet) {
		System.out.println("Item ID : "+element.getKey()+"   "+"Item Name : "+element.getValue());
	}
		System.out.println("----------------------------------------------");
		Iterator<Entry<Integer,String>> iterator=storeSet.iterator();
		while( iterator.hasNext()) {
			Entry<Integer,String> entry= iterator.next();
			
			System.out.println("Item ID :"+entry.getKey()+"   Item Name :"+entry.getValue());
		}
	}
}
