package com.class18;

public class Task1 {

	public static void main(String[] args) {
		// Create a method that will take 2 parameters as a numbers and prints which number is larger.
		//2.Create a method that will take a number and prints whether the number is even or odd.
		//3.Create a method that will print whether given String is palindrome or not.

		Task1 task=new Task1();
		task.largerNumber(60,80);
		task.evenOrOdd(80);
		task.evenOrOdd(33);
		task.isPalindrome("Anna");
		task.isPalindrome("Star");
	}
	
	void largerNumber(int num1,int num2) {
		if(num1>num2) {
			System.out.println("Largest number is"+num1);
		}else {
			System.out.println("Largest number is"+num2);
		}
	}
	void evenOrOdd(int numOdd) {
		if(numOdd%2!=0) {
			System.out.println(numOdd+"is odd number");
		}else {
			System.out.println(numOdd+"is even number");
		}
	}
	
	void isPalindrome(String word) {
		
		for(int i=word.length()-1; i>=0; i--) {
			
			System.out.println();
		}
		
	}
	
	
	
	
	
	

}
