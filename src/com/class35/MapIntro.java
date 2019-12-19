package com.class35;
import java.util.HashMap;


public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map=new HashMap<>();
		//to store key+value pair into map
		
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		 
		System.out.println(map);
		//how to verify if there any elements inside the map
		boolean flag=map.isEmpty();
		if(!flag) {
			int size=map.size();
			System.out.println(size);
		}
		
	//I want to add more entry Objects	
		
  //map.put("105","john");-->CE :key and value must be matched
//adding duplicate values -->OK
		
		map.put(105,"john");
		System.out.println(map);
//adding duplicate keys-->Overidde we cannot have duplicet keys
		map.put(102,"Hasan");
		System.out.println(map);
		
//how access a value	
	  String mapElement=map.get(105);	
		System.out.println(mapElement);

		//to replace or uptade the value
		map.replace(103, "Zeynep");
				System.out.println(map);
		//how to you remove?
		map.remove(101);
		System.out.println(map);
		
		
		//how to verify if certain key is exist/exist
		
		boolean flag1=map.containsKey(103);
		System.out.println(flag1);
		if(flag1) {
			map.replace(103, "seval");
		}else {
			map.put(103,"seval");
			}
		
	
		//how to verify if  certain value is exist
		boolean contains=map.containsValue("Seval");
	
		System.out.println(contains);
	}
	}	

