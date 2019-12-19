package com.class17;

public class Phone {
String brand,color;
	int size,screen;
	
	
	void speak() {
		System.out.println("I can speak my phone ");
	}
	void takePhoto() {
		System.out.println("I can take photo");
	}
	void recordVideo() {
		System.out.println("I can record video");	
	}
	
	public static void main(String[]args) {
		
		Phone iPhone=new Phone();
		
		iPhone.speak();
		iPhone.takePhoto();
		iPhone.recordVideo();
		
	}
}
