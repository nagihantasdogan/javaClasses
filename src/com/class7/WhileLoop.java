package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time=8;
		if(time<12){//condition is true
			System.out.println("Good morning");//code executes 1
		}
		System.out.println("************************");
		while(time<12){// if conditions is true
			System.out.println("Good morning");//this code executes infinitely--->infinite loop
			time++;
			
		}

		// I want to print GM 5 times
		
		int i=1;
		while(i<6) {
			System.out.println("Good afternoon");
			i++;
		}
		System.out.println("outside of while loop"
				+ ""
				+ "");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
