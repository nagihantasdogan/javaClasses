package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		
		System.out.println("I am non argument consructor");
	}
	

	ThisWithConstructor(String str){
		this();//used to call current class consructor
		System.out.println("I am  consructor with 1 string parameter");
		}
	
	ThisWithConstructor(String str,String srtr1){
		this(str);//this("hello");//always MUST BE 1.STATEMNENT
		//this();in this case it is scecond statement-->compliler error
		System.out.println("I am constructor with 2 parameter");
		
	}
	
	
	public static void main(String[] args) {
		
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		//can we execute 2 consructor when creating on Object
		//yes -it can be achived using this()
		//this type of constructor calls is known as CONSRUCTOR CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("Hello","Bye");
		
		
	}

}
