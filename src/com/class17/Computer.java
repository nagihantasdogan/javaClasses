package com.class17;

public class Computer {
 String brand,name,monitor,mouse;
	boolean keyword;
	int screen ,memory,size,ram;
	//define  behavior ,actoins
	public String keyboard;
	
	
	void playGames() {
		//methpod body
		System.out.println("I can play on my"+name);
	}
	void javaCoding() {
		System.out.println("I can do java codig on my"+name);
	}
	void watchMovie() {
		System.out.println("I can wacth on my "+name);
	}
	////////////////////////////////////////////////
	//using main method for code execution
	public static void main(String[]args) {
		
		Computer comp1=new Computer();
		
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		
		comp1.javaCoding();
		comp1.watchMovie();
		System.out.println("____creating 2 object  type_____");
		Computer computer2=new Computer();
		computer2.brand="Dell";
		computer2.name="420";
		computer2.memory=125;
		
		computer2.javaCoding();
		computer2.watchMovie();
		computer2.playGames();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
