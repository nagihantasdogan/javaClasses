package com.class11;

public class Task1 {
	public static void main(String[]args) {
		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		 String [] car= {"audi","volvo","tesla","kia","nissan","bmw"};
		 for(int i=1; i<car.length; i++) {
			 System.out.println(car[i]);
		 }
		
		
		 String [] car1= {"audi","volvo","tesla","kia","nissan","bmw"};
		
		for(String list:car1) {
			System.out.println(list);
		}
		
		
		
	}

}
