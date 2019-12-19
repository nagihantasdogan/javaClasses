package com.class23;

public class Test {
//Write a program that will have a constructor:
//one with parameters and second without any parameters. 
//Create a separate Test class where you will execute both of the constructors.
	Test(String str){
		System.out.println("My class name is Java"+str);
	}
	Test(){
		System.out.println(" Hello");
	}
	public static void main(String[] args) {
		
		Test obj=new Test();
		obj.Test();
		Test obj1=new Test();
		
	}
	private void Test() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
