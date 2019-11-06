package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		//i want to print all values from array
		//when value is dog ->i love dogs
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i].contentEquals("Dog")){
				
			System.out.println("I love dogs");
		}else {
			System.out.println(animals[i]);
		}
		}
		
	}
	}
		
		
		
		
		
		
		
		
		

	


