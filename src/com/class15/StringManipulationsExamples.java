package com.class15;

public class StringManipulationsExamples {

	public static void main(String[] args) {
	
//get a character at specific location
		String str="Syntax Technologies";
		char letter=str.charAt(5);
		
		System.out.println(letter);
		//length=19
		//System.out.println(str.charAt(str.length()));
		//string indexOutOfBounds
		
		System.out.println(str.charAt(str.length()-1));
		
		// get a substring from a string
		//Syntax
		String substr1=str.substring(0,6);
		System.out.println(substr1);
		//Technologies Inc
		
		String substr2=str.substring(7);
		System.out.println(substr2);///?????? inc cikmadi bak
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
