package com.class24;

public class  Student{

	/*1.Write program as a Student class   that has instance variables name and address.
	 *  Create a constructor that will initialize those variables. 
	 *  Print name & address of given  student by the displayInfo method.

   2.Write program as a Book class   that will have 2 Constructors. 
   While creating an object make sure:
	Instance variables are being initialized
	Both Constructors are being executed*/
	
	
	String name;
	String address;
	Student(String name,String address){
	 this.name=name;
	 this.address=address;
	}
	
	void displayInfo(){
		System.out.println("Student name is "+name+" "+"student address is "+address);
	}
	public static void main(String[] args) {
		
	
	Student obj=new Student("john","DC");
	obj.displayInfo();
}
	
}


