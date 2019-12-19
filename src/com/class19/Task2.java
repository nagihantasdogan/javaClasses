package com.class19;

public class Task2 {
	//2.Write a method to return whether given number is prime or not?
	
	
	boolean isPrime(int num) {
		boolean prime=true;
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				prime=true;
				break;
			}
		}
	return prime;
	}
	public static void main(String[]args) {
		
		Task2 obj=new Task2();
		boolean prime=obj.isPrime(7);
		System.out.println(prime+"");
		
	}
}
