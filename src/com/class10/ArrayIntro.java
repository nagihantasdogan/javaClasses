package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		int a;
		a=10;
		
		
		int a1=10;
		//1 way
		int[] b;//declare an array-->prefered way
		int c[];
		
		
		b=new int[4];//initialize
		//2 way-->all in 1 line (declaration & initialization)
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//acces value from array
		
		System.out.println(array[2]);
		int p=10;
		//lets create an array that will store classes
		String[] classes=new String[4];
		classes [0]="Java";
		classes [1]="Sdlc";
		classes [2]="Manual Testing";
		classes [3]="Git";
		//today we have java class
		System.out.println("Today we have "+classes[0]+"class");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);//100+3
		
		String[] names=new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="Olga"; during run time we will get an exception 
		//arrayIndexOutOfBoundsException
		//System.out.println(names[3]);
		
		//we are less elements inside
		//-->compiler will give default values
		
		int [] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
