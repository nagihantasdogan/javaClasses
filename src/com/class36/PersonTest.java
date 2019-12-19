package com.class36;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
	
	Map<Integer,Person> person=new LinkedHashMap<>();
	 person.put(1,new Person("nagehan","tasdogan",34,180000));
	 person.put(2, new Person("john ","Smith",45,140000));
	 person.put(3,new Person("natalia","browski",39,150000));
	 person.put(4,new Person("tom","hanks",56,18000));
		
		Set<Entry<Integer,Person>> personSet=person.entrySet();
	}

}
