package com.class2;

public class Task {
	public static void main(String[] args) {

		String studentname="michael";
		String lastName="Johnes";
		char studentGrade='B';
		String studentCity="Chantilly";
		String studentstate="VA";
		long studentPhoneNumber=12345456l;
		
		//String studentCity="Washington DC"// we do not need to declARE 
		//variable again
		studentCity="Washington DC";
		studentstate="DC";
		studentPhoneNumber=2345678l;
		studentGrade='A';
		 System.out.println(studentCity);
		 //My name is.......
		 //I live in city of........
		 //My phone number is......
		 
		 System.out.println("My name is "+ studentname);
		 System.out.println("I live in city of " +studentCity);
		 System.out.println("My phone number is "+studentPhoneNumber);
				
		
				
		
}
}