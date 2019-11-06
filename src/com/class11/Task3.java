package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country. (use 2 different loops).
		String [] countries= {"india","canada","usa"};
		for(String getCountry:countries) {
			if(getCountry.contentEquals("usa")) {
				System.out.println("the capital of usa dc");
			}
			
		}
		
		for(int i=0; i<countries.length; i++) {
			if(countries[i].contentEquals("usa")) {
				System.out.println("the capital of usa dc");
			}
		}
		
	}

}
