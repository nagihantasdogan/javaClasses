package com.class11;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a 2D array that first row will contain 4 names and second row will contain grades. 
		//Then you program should print name of the students that has as an A and B grade
		 String [][] students= {
				 {"Meghan","Kate","Jack","Sam"},
				 {"B","A","B","A"},
		 };
		 for(int i=0; i<students.length; i++) {
			 if(students[i].equals("Meghan")) {
				 System.out.println("B");
			 }else if(students[i].equals("Kate")) {
				 System.out.println("A");
			 
			 }else if(students[i].equals("Jack")) {
				 System.out.println("B");
			 }else if(students[i].equals("Sam")) {
				 System.out.println("A");
			 }
			 }
		 }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


