package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		
		//String class  comes in java lang package
		//2 ways to create a String
		
		//1. way String literal
		String str="Hello";
		//2. way using new keyword -creating a String object
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		
		int length =str.length();
		System.out.println(length);
		//case conversion methods/functions
		System.out.println(str.toLowerCase());//hello
		System.out.println(str);//Hello
		
		str=str.toLowerCase();//hello
		System.out.println(str);//hello
		
		str=str.toLowerCase().toUpperCase();//HELLO
		System.out.println(str);//HELLO
		
		//VERIFY IF THERE IS IF TE STRING IS EMPTY
		
		String myString="";//empty value
		
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null;//no value at all it is equal to 
		//String myString1
		//System.out.println(myString1.isEmpty());
		//null is not empty getting errror
		//how to verify existence of charcters in the string
		
		String a="Good Evening students";
		a.contains("students");
		boolean exist=a.contains("students");
		System.out.println(exist);
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("Good"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
