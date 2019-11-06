package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		
		// REPLACE
		
		
		String str="your Syntax Tecnologies.is your place to study";
		System.out.println(str.replace('y', 'i'));//sadece ilk krktri degistirr,hepsi icin allreplace 
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println(str.replace("your", "my"));
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//REPLACE ALL
		
		//String str2="";
	//	System.out.println(str2.replaceAll(regex, replacement));!!!!!!yzzz
		
		String str3="3434576Hell689o@#$%^&";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^A-z]", ""));
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
		
	//	System.out.println(str2.replaceFirst(" ",""));
		
		
		
		

	}

}
