package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if(!traffic) {
			System.out.println("hello");
		}else {
			System.out.println("Bye");
		}
     boolean isRain=false;
      if(!isRain) {

     System.out.println("Take an umbrella");
      }else {
    	  System.out.println("not umbrella");
      }
		
      boolean traffic1=true;
      if(!traffic1) {
    	  System.out.println("on time");
      }else {
    	  System.out.println("be late");
      }
      //let s compare 2 number using not operator
      
      int num1=10;
      int num2=11;
      if(num1==num2) {
    	  System.out.println("number are equal");
      }else {
    	  System.out.println("numbers are not equal");
      }
      
      if(!(num1==num2)) {
    	  System.out.println("numbers are not equal");  
      }else {
    	  System.out.println("numbers are equal");
      }
      
     // if name is not marry or not anna you are not my sister 
      String name="Mary";
      String name2="Anna";
      if(!(name.equals("Mary") || name.equals("Anna"))) {
    	  System.out.println("You are not my sister");
      }else {
    	  System.out.println("you are my sister");
      }
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
