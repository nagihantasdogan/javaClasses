package com.class25_1;

public class Box {
	
	
	public void boxArea(int num1,int num2,int num3) {
		int areaBox=num1*num2*num3;
		System.out.println("Box are is "+areaBox);
	}
public static void main(String[] args) {
	Box obj=new Box();
	obj.boxArea(10,10,10);
}

}

