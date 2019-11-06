package com.class5;

public class NestedRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   boolean isDisplayed=true;
   String buttonText="Sign in";
   
   if(isDisplayed) {
	 System.out.println("Button is displayed");
	 if(buttonText.equals("Sign in")) {
		 System.out.println("Test case pass");
	 }else {
		 System.out.println("Wrong text is displayed");
	 }
   }else {
	   System.out.println("Button is  not displayed");
   
		   
	}
		
	}

}
