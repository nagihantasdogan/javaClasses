package com.class15;

public class StyringMethods {

	public static void main(String[] args) {
		
		
		String str="Java clases at Syntax are awesome";
		str=str.replace("awesome", "great");
		
		System.out.println(str);
		
		str=str.replace("Git","SDLC");//bunu ignore etti
		
		System.out.println(str);
		

		//str=str.replace("a","AA");
		
		//System.out.println(str);
		
		
       str=str.replace("a","12345  %^&*");///??????????sikinti var
		
		System.out.println(str);
		//replace----->specify regular expression
		//lets remove all special charaters
		
		//str=str.replaceAll("[^A-Za-z0-9]","");//tekrar bakkkkk
		System.out.println(str);
		
		
		//split
		
		String myString="Java clases at Syntax are awesome";
		String [] array=myString.split("a");
		System.out.println(array.length);
		
		
		
		  
		
		
		
		
		

	}

}
