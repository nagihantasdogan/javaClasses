package com.class4;

public class RelationalOperators {
	public static void main(String[] args) {
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("************");
		
		double d=1.99;
		double d1=2.99;
		 boolean b5=d>d1;
		 System.out.println(b5);
		 boolean b1=d<d1;
		 boolean b2=d==d1;
		 boolean b3=d!=d1;
	     System.out.println(b1); //true
		 System.out.println(b2);//false
		 System.out.println(b3);//true
		 System.out.println("########");
		 
		 int a=90;
		 int b=30;
		 //if number a is bigger than bumnber b
		 //I want to print a is larger than b
		 
		 if (a>b) {
			 System.out.println("a is larger than b");
		 }else
			 System.out.println("a is smaller b");
		 
		 int expectedHours=15;
		 int actualHours=2;
		 //if expected hours are more than actual -->>>you will succed
		 //otherwise please study more
		 if(actualHours>expectedHours) {
			 System.out.println("you wiil succed");
		 }else {
			 System.out.println("please study more");
		 }
		 
		 
		 double teaPrice=4.99;
		 double allowedPrice=5.99;
		 //if price is more that � can afford � will NOT buy
		 // if price is less or matches what � can afford then � will buy tea
		 
		 if(allowedPrice>=teaPrice) {
			 System.out.println("I will buy tea"); 
			 System.out.println("And I will enjoy my tea");
		 }else {
			 System.out.println("I can afford I need to study more");
			 System.out.println("I will go back tu study more");
		 }
		 System.out.println("I keep writing some code");
		 
		 boolean val=false;
		 if(val) {
		 System.out.println("hello");
		 }else{
		 System.out.println("bye");
		 }
		 
		 boolean isRain=false;
		 //if it is raining � will take umbrella,otherwise � go for a walk
		
		 if(isRain) {//isRain==true
			 System.out.println("I will take umbrella"); 
		 }else {
			 System.out.println("I go for a walk");
		 }
		 
		 
		 
		 
		 
		 
		 }
		 
		 
		 
		
	}


