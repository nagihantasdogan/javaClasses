package com.class14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str="Today is Java Classes";
		System.out.println(str.replaceAll(" ",""));
		
		System.out.println("******************************");	
		
		String str2="123456hel2345lo!@#$%";
		System.out.println(str2.replaceAll("[^a-zA-Z]",""));
		System.out.println(str2.length());	
		
		System.out.println("******************************");		
		
		String str3="Is it Saturday?Is it raining?Do we have a Java Class today?";
	String [] array=str3.split("\\?");
			System.out.println(array.length);	
		
		
		
		
		
	}

}
