package com.class34;

import java.util.*;

public class Task2 {

	public static void main(String[] args) {
	/*Create  a  Set  of  cities  in  which  you  want  to
	 *  make sure that insertion order is maintained. 
	 * Using Iterator remove any city that starts with “A”;
	 * 
	 */
		
		Set<String> city=new LinkedHashSet<>();
		
		city.add("DC");
		city.add("London");
		city.add("Paris");
		city.add("Roma");
		city.add("Ankara");
		
		System.out.println(city);
		
		Iterator<String> it=city.iterator();
		while(it.hasNext()) {
			String cit=it.next();
			if(cit.startsWith("A")) {
				it.remove();
			}
		}
System.out.println(city);
	}

}
