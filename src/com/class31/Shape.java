package com.class31;

public interface Shape {
	/*Create an Interface ‘Shape’ with undefined
	 *  methods as calculateArea and calculatePerimiter . 
	 * Create 2 child classes: Circle & Square that should have an 
	 * implementation of area and perimeter calculation. Test your code.
	 * 
	 */
	
	double calculateArea ();
	double  calculatePerimiter();
}
class Circle implements Shape{
	int radius;
	double pi=3.14;
	public  Circle (int radius){
		this.radius=radius;
	}
	
	public double calculateArea () {
		return pi*radius*radius;
	}
	 public double calculatePerimiter() {
		return 2*pi*radius;
	}
	
}
class Square implements Shape{
	int side;
	
	public  Square (int side){
		this.side=side;
	}
	@Override
public 	double  calculateArea () {
		return side*side;
	}
public double  calculatePerimiter() {
		return 4*side;
	}
}
