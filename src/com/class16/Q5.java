


package com.class16;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="Welcome to the Java class";
		/*to reverse String
		 * split();
		 * Step1:split--->array of sprint
		 * Step2:use for loop and use decrement to print values
		 */
		String reversed="";
		String []str=given.split(" ");
		for(int j=str.length-1; j>=0; j--) {
			System.out.println(str[j]);
			reversed=reversed+str[j]+" ";
		}
		System.out.println(reversed);
		
	//Write a java program to reverse string		
	//toCharArray(); charAt();
		String given1="Today is java class";
		char[] charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>0; i--) {
			System.out.println(charArray[i]);
		}
		System.out.println("**************using to charAt**********");
		
		String word3="I love Java";
		for(int i=word3.length()-1; i>=0; i--) {
			System.out.print(word3.charAt(i));
		}
		
		
		//tekrr bk
		
		
		
		
		
		
	}

}
