package com.class12;

public class StringManipulatoinDemo {

	public static void main(String[] args) {

		//There are two ways to create string objects
		
		//1
		//String Literal
		String name="John";
		System.out.println(name);
		System.out.println(name.length());
		//2
		//Creating String with new key word
		String name1=new String("john1");
		System.out.println(name1);
/*This method returns the length of this string
 * The length is equal to the number
 * of 16 bit unicode characters in the string
 */
	int name1Len=name.length();
	System.out.println(name1Len);
		
	System.out.println("The length of name2Len is= "+ name1Len);	
		
	String str1="Hello world";
	System.out.println("Before: "+str1);
		str1=str1.toLowerCase();
		System.out.println("after: "+str1);
		
		//duzenle!!!!!!!!!!!!!!!!
		//.equals()
	String str2="HelLo WoRld";
	boolean isEqual=str1.equals(str2);
	System.out.println(isEqual);
		//.equalsIsIgnoreCase();
	System.out.println(str2.equalsIgnoreCase(str2));
		/*tuUppurCase();
		 * this method coverts all of the characters in
		 * this string uppercase
		 */
	String str3="mohammed";
		System.out.println("Before :: "+str3);
		str3=str3.toUpperCase();
		System.out.println("Afte:: "+str3);
		
		
		
		
		
		
		
		
		
	}

}
