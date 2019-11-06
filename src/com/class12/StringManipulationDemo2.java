package com.class12;

public class StringManipulationDemo2 {

	public static void main(String[] args) {
		
		//Contains();
		//This method searches the sequence of chracters in the string 
		//if the sequence of character are found
		//then it returns true otherwise returns false
     String sentence="It was raining";
				
	 System.out.println(sentence.contains("Was"));
				
		
	//if just char it will be true	
	 String sentence1="It was raining";
		
	 System.out.println(sentence1.contains("w"));
				
		//
	 String sentence2="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence2));
		
		//create two strings and initilaize them with some value
		//implement the following methods on those strings
		  /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
		String n="Today is  Java Classes ";
		String n2="Tomorrow is no classes";
		System.out.println(n.length());
		System.out.println(n2.length());
		
		System.out.println(n.equals(n2));
		System.out.println(n2.equalsIgnoreCase(n));

		System.out.println(n.contains("Java"));
		System.out.println(n2.contains("s"));
		
		System.out.println(n.toUpperCase());
		System.out.println(n2.toUpperCase());
		
		System.out.println(n.toLowerCase());
		System.out.println(n2.toLowerCase());
		
		System.out.println("******************************************");
		
		
		/* * This method tests if a string starts with the  
		 * * specified prefix beginning  */
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with="+str2.startsWith("It"));
		//System.out.println("Is this string starts with="+str2.startsWith("is", 3));
		System.out.println("****************");
		/* * This method tests if this string ends with  
		 * * the specified suffix. */
		System.out.println("Is this string ends with="+str2.endsWith("class"));
		
		
		
		
		
	}

}
