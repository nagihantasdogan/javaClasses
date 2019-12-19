package com.class17;

public class ObjectOfPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone iPhone=new Phone();
		
		iPhone.brand="Apple";
		iPhone.color="White";
		iPhone.size=9;
		iPhone.screen=8;
		
		Phone android=new Phone();
		 android.brand="Samsung";
		 android.color="Black";
		 android.size=10;
		 android.screen=9;
		 
		 
		 Phone nokia=new Phone();
		  nokia.brand="Nokia";
		  nokia.color="pink";
		  nokia.size=10;
		  nokia.screen=7;
		  
		System.out.println("I have "+iPhone.brand+" " +iPhone.color);  
		  

	}

}
