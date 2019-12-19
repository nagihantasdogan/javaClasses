package com.class24;

public class Book {
	/*2.Write program as a Book class   that will have 2 Constructors. 
	   While creating an object make sure:
		Instance variables are being initialized
		Both Constructors are being executed*/
	
	
	String bookName;
	int bookPage;
	
	Book(String bookName){
		this.bookName=bookName;
	}
	Book(int bookPage){
		this.bookPage=bookPage;
	}
	
	void display() {
		System.out.println("Book name is "+bookName+" "+"book page is "+bookPage);
	}
	
	public static void main(String[] args) {
		
		Book obj=new Book("Harry Poter");
		Book obj1=new Book(600);
		obj.display(); 
		obj1.display(); 
		
		
		
	}
}
