package com.class36;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * Create a Map that will store Employee name and salary. 
		 * Write a logic to retrieve an employee who gets the
		 *  highest salary. Output should be in the below format
       John Smith=$100000
 */
		Map<String,Integer> emp=new TreeMap<>();
		
		emp.put("john smith",70000);
		emp.put("jack taylor",90000);
		emp.put("jimy hans",140000);
		emp.put("nike brown",180000);
		
		Set<Entry<String,Integer>>  setEmp=emp.entrySet();
		
		for(Entry<String,Integer> element:setEmp) {
			System.out.println(element.getKey()+" "+element.getValue());
			
			}
				
			
			
		}
		
	}


