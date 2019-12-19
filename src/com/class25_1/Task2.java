package com.class25_1;

public class Task2 {
	
	static void sum(int num1) {
		System.out.println(num1);
	}
	
	static void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	static void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	
	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.sum(4);
		obj.sum(4,8);
		obj.sum(4,8,12);
		
		
		
		
		
	}
	
	
	
}
