package com.class31;

public class ShapeTest {

	public static void main(String[] args) {
	
   Shape circle=new Circle(6);
   Shape square=new Square(4);
   double d=circle.calculateArea();
   double d1=circle.calculatePerimiter();
   double d2=square.calculateArea();
   double d3=square.calculatePerimiter();
   System.out.println("Circle Area is : "+d);
   System.out.println("Circle Perimiter is: "+d1);
   System.out.println("Square Area is: "+d2);
   System.out.println("Square Perimeter is: "+d3);
	}

}
