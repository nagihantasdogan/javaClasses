package com.class13;

public class Recap2 {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="Hello";
		
		String str3=new String("Bye");
		String str4=new String("Bye");
		
		
		System.out.println(str1.contentEquals(str2)); //true//=====>interview questionss n case str3==str4   --> false = because pointing to different places in memory, despite the fact they have the same content?
		System.out.println(str1==str2);
		
		System.out.println(str3.equals(str4));//true
		System.out.println(str3==str4);
		System.out.println("==============");
		System.out.println(str1.contains("zz"));
		

		
		System.out.println("=============StarsWith And EndsWith=====================");
		
		String str5="Today is Saturday";
		System.out.println(str5.startsWith("Today"));
		System.out.println(str5.endsWith("day"));
		
		System.out.println("=============concat=============");
		
		
		System.out.println(str5.concat(" and ve have java class"));
		
		
		System.out.println("================trime===============");
		
		String str6="       it is sunny";
		System.out.println("Before triming: " +str6);
		System.out.println(str6.trim());
		
		System.out.println("===========Index Of and CharAt=============");
		
		String str7="Tomorrow we will be done with String Manipulation";
		System.out.println(str7.indexOf('e'));
		System.out.println(str7.indexOf('e',11));
		System.out.println(str7.indexOf("we"));
		
		System.out.println(str7.charAt(10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
