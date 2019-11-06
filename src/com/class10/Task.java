package com.class10;

public class Task {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

		char [] grades= {'A','B','C','D','E','F'};
		int a=2;
		
		
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		
		a+=2;//2+2
		System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		System.out.println("=====================================================");
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		
		
		for(int i=1; i<grades.length; i++ ) {
			System.out.println(grades[i]);
		}
		
		String[] animals= {"Cat","Dog","Cow","Snake","Elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			
			System.out.print(animals[i]+" ");
		}
		//create an array to store 5 double values print all in 1 line
		
	
		
		double [] nums =new double[4];
		double i=2;
		nums[0]=12.8;
		nums[1]=13.5;
		nums[2]=14.6;
		nums[3]=15.5;
		nums[4]=12.8;
		for(double i1=0; i1<size; i1++) {
			System.out.print(nums[(int) i1]+" ");
		}
	
		
		
		
		
		
		
		
	}

}
