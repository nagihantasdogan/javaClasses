package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		/*
		 * print only text and not number
		 */
		String str="1423Hel45645lo456456";//hello
         System.out.println(str.replaceAll("[^0-9]", ""));
		
         System.out.println(str.replaceAll("[0-9]", ""));//leave only text
		
         System.out.println(str.replaceAll("[0-9]", "u"));
		
         System.out.println(str.replaceAll("[a-zA-Z]", ""));//leave only number
		//remove everything except text and number
		String str2="Hi#$%&How$%^%$45678";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
	
		
		
		
		
		
		
		

	}

}
