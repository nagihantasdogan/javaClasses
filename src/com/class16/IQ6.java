package com.class16;

public class IQ6 {

	public static void main(String[] args) {
		// palindrom for exp: mom,dad,madam,racecar,kayak,bob
//logic: 
//Step1:reverse the string
		//Step2:compare 2 string
		//if string are equal-->palindrome
		//else-->not palindrome
		
		String original="kayak";
		String reversed="";
		//5-1=4-1
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k+a=ka+k=
		}
		System.out.println(reversed);
		
		
		if(original.contentEquals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
		
		
		
		
		
		
		
		
	}

}
